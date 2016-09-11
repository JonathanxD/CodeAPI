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
package com.github.jonathanxd.codeapi.visitgenerator.bytecode;

import com.github.jonathanxd.codeapi.common.MVData;
import com.github.jonathanxd.codeapi.interfaces.IfBlock;
import com.github.jonathanxd.codeapi.interfaces.IfExpr;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.visitgenerator.Visitor;
import com.github.jonathanxd.codeapi.visitgenerator.VisitorGenerator;
import com.github.jonathanxd.iutils.data.MapData;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import static com.github.jonathanxd.codeapi.CodeAPI.elseBlock;
import static com.github.jonathanxd.codeapi.CodeAPI.ifBlock;
import static com.github.jonathanxd.codeapi.CodeAPI.ifExprs;
import static com.github.jonathanxd.codeapi.CodeAPI.sourceOfParts;

/**
 * Assignment if expression visitor
 */
public class IfExprVisitor implements Visitor<IfExpr, Byte, MVData>, Opcodes {

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public Byte[] visit(IfExpr ifExpr,
                        MapData extraData,
                        VisitorGenerator<Byte> visitorGenerator,
                        MVData mvData) {

        MethodVisitor visitor = mvData.getMethodVisitor();

        IfBlock ifBlock = ifBlock(
                ifExprs(ifExpr),
                sourceOfParts(
                        Literals.BOOLEAN(true)
                ),
                elseBlock(
                        Literals.BOOLEAN(false)
                ));

        visitorGenerator.generateTo(IfBlock.class, ifBlock, extraData, mvData);

        return new Byte[0];
    }

    @Override
    public void endVisit(Byte[] r,
                         IfExpr ifExpr,
                         MapData extraData,
                         VisitorGenerator<Byte> visitorGenerator,
                         MVData mvData) {

    }
}
