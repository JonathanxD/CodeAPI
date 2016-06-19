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
import com.github.jonathanxd.codeapi.visitgenerator.Visitor;
import com.github.jonathanxd.codeapi.visitgenerator.VisitorGenerator;
import com.github.jonathanxd.codeapi.helper.AccessLocalEx;
import com.github.jonathanxd.codeapi.impl.CodeInterface;
import com.github.jonathanxd.codeapi.interfaces.AccessThis;
import com.github.jonathanxd.codeapi.interfaces.VariableAccess;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.util.Data;
import com.github.jonathanxd.codeapi.common.MVData;
import com.github.jonathanxd.codeapi.util.Variable;
import com.github.jonathanxd.iutils.iterator.Navigator;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.util.Optional;

/**
 * Created by jonathan on 03/06/16.
 */
public class VariableAccessVisitor implements Visitor<VariableAccess, Byte, MVData>, Opcodes {

    public static final VariableAccessVisitor INSTANCE = new VariableAccessVisitor();

    @Override
    public Byte[] visit(VariableAccess variableAccess,
                        Data extraData,
                        Navigator<CodePart> navigator,
                        VisitorGenerator<Byte> visitorGenerator,
                        MVData mvData) {

        MethodVisitor additional = mvData.getMethodVisitor();


        CodeInterface codeInterface = extraData.getRequired(InterfaceVisitor.CODE_INTERFACE_REPRESENTATION);
        ClassWriter required = extraData.getRequired(InterfaceVisitor.CLASS_WRITER_REPRESENTATION);


        CodeType localization = variableAccess.getLocalization();

        // AT PODE SER: AccessThis, AccessSuper ou null -> AccessLocal | AccessStatic
        CodePart at = variableAccess.getAt();


        if(at == null && localization == null) {
            additional.visitVarInsn(ALOAD, 0); // Legacy
        } else if(at != null) {
            visitorGenerator.generateTo(at.getClass(), at, extraData, navigator, null, mvData);
        }

        // IF AT == NULL && LOCALIZATION == NULL ? I'AM VISITING A LOCAL VARIABEL
        // IF AT != NULL IAM
        if(at == null) {
            if(localization != null) {
                additional.visitFieldInsn(GETSTATIC, Common.codeTypeToSimpleAsm(localization), variableAccess.getName(), Common.codeTypeToFullAsm(variableAccess.getVariableType()));
            }else{
                // THIS
                additional.visitFieldInsn(GETFIELD, Common.codeTypeToSimpleAsm(codeInterface), variableAccess.getName(), Common.codeTypeToFullAsm(variableAccess.getVariableType()));
            }
        } else {
            if(at instanceof AccessLocalEx) {

                Optional<Variable> var = mvData.getVar(variableAccess.getName(), variableAccess.getVariableType());


                if(!var.isPresent())
                    throw new RuntimeException("Variable '"+variableAccess.getName()+"' Type: '"+variableAccess.getVariableType().getJavaSpecName()+"' Not found in local variables map");

                Variable variable = var.get();

                int i = mvData.getVarPos(variable);

                Type type = Type.getType(variable.getType().getJavaSpecName());

                int opcode = type.getOpcode(ILOAD); // ALOAD

                additional.visitVarInsn(opcode, i);

                //additional.visitLocalVariable();
                //additional.visitFieldInsn(GETFIELD, Common.codeTypeToSimpleAsm(localization), variableAccess.getName(), Common.codeTypeToFullAsm(variableAccess.getVariableType()));*/
            }else if(at instanceof AccessThis) {
                // THIS
                additional.visitFieldInsn(GETFIELD, Common.codeTypeToSimpleAsm(codeInterface), variableAccess.getName(), Common.codeTypeToFullAsm(variableAccess.getVariableType()));
            } else {
                additional.visitFieldInsn(GETFIELD, Common.codeTypeToSimpleAsm(localization), variableAccess.getName(), Common.codeTypeToFullAsm(variableAccess.getVariableType()));
            }


        }

        //additional.visitVarInsn(ALOAD, 0);

        return new Byte[0];
    }

    @Override
    public void endVisit(Byte[] r,
                         VariableAccess variableAccess,
                         Data extraData,
                         Navigator<CodePart> navigator,
                         VisitorGenerator<Byte> visitorGenerator,
                         MVData mvData) {

    }
}