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
package com.github.jonathanxd.codeapi.gen.visit.bytecode.visitor;

import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.common.Flow;
import com.github.jonathanxd.codeapi.common.MVData;
import com.github.jonathanxd.codeapi.gen.BytecodeClass;
import com.github.jonathanxd.codeapi.impl.IfBlockImpl;
import com.github.jonathanxd.codeapi.interfaces.DoWhileBlock;
import com.github.jonathanxd.codeapi.interfaces.IfBlock;
import com.github.jonathanxd.codeapi.gen.visit.VisitorGenerator;
import com.github.jonathanxd.codeapi.gen.visit.VoidVisitor;
import com.github.jonathanxd.iutils.data.MapData;

import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by jonathan on 03/06/16.
 */
public class DoWhileVisitor implements VoidVisitor<DoWhileBlock, BytecodeClass, MVData>, Opcodes {

    public static final DoWhileVisitor INSTANCE = new DoWhileVisitor();

    @Override
    public void voidVisit(DoWhileBlock whileBlock,
                        MapData extraData,
                        VisitorGenerator<BytecodeClass> visitorGenerator,
                        MVData mvData) {

        MethodVisitor mv = mvData.getMethodVisitor();

        Label whileStart = new Label();
        Label outOfIf = new Label();
        Label insideStart = new Label();
        Label insideEnd = new Label();
        Label outsideEnd = new Label();

        CodeSource source = CodeSource.empty();

        IfBlock ifBlock = IfBlockImpl.instance(whileBlock, source);

        mv.visitLabel(whileStart);


        mv.visitLabel(insideStart);

        Flow flow = new Flow(whileStart, insideStart, insideEnd, outsideEnd);

        extraData.registerData(ConstantDatas.FLOW_TYPE_INFO, flow);

        visitorGenerator.generateTo(IfBlock.class, ifBlock, extraData, null, mvData);

        whileBlock.getBody().ifPresent(body -> visitorGenerator.generateTo(CodeSource.class, body, extraData, null, mvData));

        mv.visitLabel(insideEnd);

        BytecodeIfBlockVisitor.visit(ifBlock, whileStart, outOfIf, true, true, extraData, visitorGenerator, mvData);

        extraData.unregisterData(ConstantDatas.FLOW_TYPE_INFO, flow);

        mv.visitLabel(outsideEnd);

    }
}