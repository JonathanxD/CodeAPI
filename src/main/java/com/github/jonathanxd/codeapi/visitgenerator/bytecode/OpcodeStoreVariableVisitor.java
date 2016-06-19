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

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.visitgenerator.VisitorGenerator;
import com.github.jonathanxd.codeapi.helper.AccessLocalEx;
import com.github.jonathanxd.codeapi.impl.CodeInterface;
import com.github.jonathanxd.codeapi.interfaces.AccessThis;
import com.github.jonathanxd.codeapi.interfaces.VariableStore;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.util.Data;
import com.github.jonathanxd.codeapi.common.MVData;
import com.github.jonathanxd.iutils.iterator.Navigator;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

/**
 * Created by jonathan on 03/06/16.
 */
public class OpcodeStoreVariableVisitor implements Opcodes {

    public static final OpcodeStoreVariableVisitor INSTANCE = new OpcodeStoreVariableVisitor();

    public static void visit(VariableStore variableStore,
                        Data extraData,
                        Navigator<CodePart> navigator,
                        VisitorGenerator<Byte> visitorGenerator,
                        MVData mvData) {

        MethodVisitor additional = mvData.getMethodVisitor();

        CodeInterface codeInterface = extraData.getRequired(InterfaceVisitor.CODE_INTERFACE_REPRESENTATION);

        CodeType localization = variableStore.getLocalization();


        CodePart at = variableStore.getAt();

        if(at == null && localization == null) {
            additional.visitVarInsn(ALOAD, 0); // Legacy
        } else if(at != null) {
            visitorGenerator.generateTo(at.getClass(), at, extraData, navigator, null, mvData);
        }

        if(at == null) {
            if(localization != null) {
                additional.visitFieldInsn(PUTSTATIC, Common.codeTypeToSimpleAsm(localization), variableStore.getName(), Common.codeTypeToFullAsm(variableStore.getVariableType()));
            }else{
                // THIS
                //
                additional.visitFieldInsn(PUTFIELD, Common.codeTypeToSimpleAsm(codeInterface), variableStore.getName(), Common.codeTypeToFullAsm(variableStore.getVariableType()));
            }
        } else {
            if(at instanceof AccessLocalEx) {

                int i = mvData.storeVar(variableStore.getName(), variableStore.getVariableType());

                Type type = Type.getType(variableStore.getVariableType().getJavaSpecName());

                int opcode = type.getOpcode(ISTORE); // ALOAD

                additional.visitVarInsn(opcode, i);

            }else if(at instanceof AccessThis) {
                // THIS
                additional.visitFieldInsn(PUTFIELD, Common.codeTypeToSimpleAsm(codeInterface), variableStore.getName(), Common.codeTypeToFullAsm(variableStore.getVariableType()));
            } else {
                additional.visitFieldInsn(PUTFIELD, Common.codeTypeToSimpleAsm(localization), variableStore.getName(), Common.codeTypeToFullAsm(variableStore.getVariableType()));
            }


        }

    }

}