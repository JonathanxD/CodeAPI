/*
 *      CodeAPI - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2016 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/ & https://github.com/TheRealBuggy/) <jonathan.scripter@programmer.net>
 *      Copyright (c) contributors
 *
 *
 *      Permission is hereby granted, free of charge, to any person obtaining a copy
 *      of this software and associated documentation files (the "Software"), to deal
 *      in the Software without restriction, including without limitation the rights
 *      to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *      copies of the Software, and to permit persons to whom the Software is
 *      furnished to do so, subject to the following conditions:
 *
 *      The above copyright notice and this permission notice shall be included in
 *      all copies or substantial portions of the Software.
 *
 *      THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *      IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *      FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *      AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *      LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *      OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *      THE SOFTWARE.
 */
package com.github.jonathanxd.codeapi.generatorv2.bytecode;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.generatorv2.Visitor;
import com.github.jonathanxd.codeapi.generatorv2.VisitorGenerator;
import com.github.jonathanxd.codeapi.impl.CodeField;
import com.github.jonathanxd.codeapi.interfaces.ElseBlock;
import com.github.jonathanxd.codeapi.interfaces.IfBlock;
import com.github.jonathanxd.codeapi.interfaces.IfExpr;
import com.github.jonathanxd.codeapi.literals.Literal;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.operators.Operators;
import com.github.jonathanxd.codeapi.util.Data;
import com.github.jonathanxd.codeapi.util.MVData;
import com.github.jonathanxd.iutils.collection.ListSafeBackableIterator;
import com.github.jonathanxd.iutils.iterator.Navigator;
import com.github.jonathanxd.iutils.iterator.SafeBackableIterator;
import com.github.jonathanxd.iutils.object.GenericRepresentation;
import com.github.jonathanxd.iutils.string.JString;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

/**
 * Created by jonathan on 03/06/16.
 */
public class IfBlockVisitor implements Visitor<IfBlock, Byte, MVData>, Opcodes {

    public static final IfBlockVisitor INSTANCE = new IfBlockVisitor();

    @Override
    public Byte[] visit(IfBlock ifBlock,
                        Data extraData,
                        Navigator<CodePart> navigator,
                        VisitorGenerator<Byte> visitorGenerator,
                        MVData mvData) {

        MethodVisitor additional = mvData.getMethodVisitor();

        List<CodePart> ifExpression = new ArrayList<>(ifBlock.getIfExprsAndOps());

        ListIterator<CodePart> listIterator = ifExpression.listIterator();

        Optional<ElseBlock> elseBlock = ifBlock.getElseBlock();

        Label inIfLabel = new Label();

        Label elseLabel = elseBlock.isPresent() ? new Label() : null;

        Label outOfIfLabel = new Label();

        while(listIterator.hasNext()) {

            CodePart current = listIterator.next();

            CodePart previous = null;

            CodePart next = null;

            if(listIterator.hasPrevious()) {
                previous = listIterator.previous();
                listIterator.next();
            }

            if(listIterator.hasNext()) {
                next = listIterator.next();
                listIterator.previous();
            }

            if(current instanceof IfExpr) {
                IfExpr ifExpr = (IfExpr) current;

                boolean isInverse = next == null || next != Operators.OR;

                CodePart expr1 = ifExpr.getExpr1();
                CodePart expr2 = ifExpr.getExpr2();

                boolean expr1Primitive = Common.isPrimitive(expr1);
                boolean expr2Primitive = Common.isPrimitive(expr2);

                if(expr1Primitive != expr2Primitive) {
                    throw new RuntimeException(JString.of("Boxing and Unboxing not supported yet! Expr1 Primitive: $primitive1. Expr2 Primitive: $primitive1",
                            "primitive1", expr1Primitive, "primitive2", expr2Primitive).toString());
                }

                visitorGenerator.generateTo(expr1.getClass(), expr1, extraData, navigator, null, mvData);

                Label lbl = !isInverse ? inIfLabel : (elseLabel == null ? outOfIfLabel : elseLabel); // Jump to else if exists

                // Se a expressao 2 for null, vai verificar o Operation (== ou !=)
                if(expr2 == Literals.NULL) {
                    additional.visitJumpInsn(Operators.nullCheckToAsm(ifExpr.getOperation(), isInverse), lbl);
                } else if(Common.isPrimitive(expr1) && Common.isPrimitive(expr2)) {
                    visitorGenerator.generateTo(expr2.getClass(), expr2, extraData, navigator, null, mvData);

                    additional.visitJumpInsn(Operators.primitiveToAsm(ifExpr.getOperation(), isInverse), lbl);
                } else {
                    visitorGenerator.generateTo(expr2.getClass(), expr2, extraData, navigator, null, mvData);

                    additional.visitJumpInsn(Operators.referenceToAsm(ifExpr.getOperation(), isInverse), lbl);
                }
            }

        }
        additional.visitLabel(inIfLabel);

        CodeSource body = ifBlock.getBody().orElseThrow(RuntimeException::new);

        visitorGenerator.generateTo(CodeSource.class, body, extraData, navigator, null, mvData);

        if(elseLabel != null) {
            additional.visitJumpInsn(GOTO, outOfIfLabel);
        }


        if(elseLabel != null) {
            additional.visitLabel(elseLabel);

            ElseBlock elseBlock_ = elseBlock.get();

            Optional<CodeSource> elseBodyOpt = elseBlock_.getBody();

            if(elseBodyOpt.isPresent()) {
                CodeSource elseBody = elseBodyOpt.get();

                visitorGenerator.generateTo(CodeSource.class, elseBody, extraData, navigator, null, mvData);
            }
        }


        additional.visitLabel(outOfIfLabel);

        return new Byte[0];
    }

    @Override
    public void endVisit(Byte[] r,
                         IfBlock ifBlock,
                         Data extraData,
                         Navigator<CodePart> navigator,
                         VisitorGenerator<Byte> visitorGenerator,
                         MVData mvData) {

    }
}