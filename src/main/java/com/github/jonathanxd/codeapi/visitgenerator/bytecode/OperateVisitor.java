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
import com.github.jonathanxd.codeapi.interfaces.AccessLocal;
import com.github.jonathanxd.codeapi.interfaces.VariableAccess;
import com.github.jonathanxd.codeapi.interfaces.VariableOperate;
import com.github.jonathanxd.codeapi.literals.Literal;
import com.github.jonathanxd.codeapi.operators.Operator;
import com.github.jonathanxd.codeapi.operators.Operators;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.util.Data;
import com.github.jonathanxd.codeapi.common.MVData;
import com.github.jonathanxd.codeapi.util.Variable;
import com.github.jonathanxd.iutils.iterator.Navigator;

import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.util.Optional;

/**
 * Created by jonathan on 03/06/16.
 */
public class OperateVisitor implements Visitor<VariableOperate, Byte, MVData>, Opcodes {

    public static final OperateVisitor INSTANCE = new OperateVisitor();

    @Override
    public Byte[] visit(VariableOperate variableOperate,
                        Data extraData,
                        Navigator<CodePart> navigator,
                        VisitorGenerator<Byte> visitorGenerator,
                        MVData mvData) {

        MethodVisitor mv = mvData.getMethodVisitor();

        CodePart at = variableOperate.getAt();

        CodeType localization = variableOperate.getLocalization();

        Operator operation = variableOperate.getOperation().get();

        CodePart value = variableOperate.getValue().orElse(null);

        boolean constantVal = true;

        int constant = 1;

        if(value != null && (!(value instanceof Literal) || !((Literal) value).getType().get().getJavaSpecName().equals("I"))) {
            constantVal = false;
        } else if(value != null) {
            constant = Integer.valueOf(((Literal) value).getName());
        }

/*
        if(at == null && localization == null) {
            mv.visitVarInsn(ALOAD, 0); // Legacy
        } else if(at != null) {
            visitorGenerator.generateTo(at.getClass(), at, extraData, navigator, null, mvData);
        }
*/
        Optional<Variable> var = mvData.getVar(variableOperate.getName(), variableOperate.getVariableType());


        if(!var.isPresent())
            throw new RuntimeException("Variable '"+variableOperate.getName()+"' Type: '"+variableOperate.getVariableType().getJavaSpecName()+"' Not found in local variables map");

        Variable variable = var.get();

        int i = mvData.getVarPos(variable);

        if(at instanceof AccessLocal) {
            if (operation == Operators.INCREMENT) {
                mv.visitIincInsn(i, 1);
            }else
            if (operation == Operators.DECREMENT) {
                mv.visitIincInsn(i, -1);
            }else
            if (constantVal) {
                if (operation == Operators.ADD) {
                    mv.visitIincInsn(i, constant);
                }
                if (operation == Operators.SUBTRACT) {
                    mv.visitIincInsn(i, -constant);
                }

                return new Byte[0];
            }

            visitorGenerator.generateTo(VariableAccess.class, variableOperate, extraData, navigator, null, mvData);

            operateVisit(variableOperate, operation, extraData, navigator, null, mvData);

            OpcodeStoreVariableVisitor.visit(variableOperate, extraData, navigator, visitorGenerator, mvData);
        } else {
            visitorGenerator.generateTo(VariableAccess.class, variableOperate, extraData, navigator, null, mvData);

            operateVisit(variableOperate, operation, extraData, navigator, null, mvData);

            OpcodeStoreVariableVisitor.visit(variableOperate, extraData, navigator, visitorGenerator, mvData);

        }


        return new Byte[0];
    }

    private void operateVisit(VariableOperate variableOperate, Operator operation, Data extraData, Navigator<CodePart> navigator, Object o, MVData mvData) {
        CodeType variableType = variableOperate.getVariableType();

        Type type = Type.getType(variableType.getJavaSpecName());

        int opcode = -1;

        if(operation == Operators.ADD) {
            opcode = type.getOpcode(IADD);
        } else if(operation == Operators.SUBTRACT) {
            opcode = type.getOpcode(ISUB);
        } else if(operation == Operators.MULTIPLY) {
            opcode = type.getOpcode(IMUL);
        } else if(operation == Operators.DIVISION) {
            opcode = type.getOpcode(IDIV);
        } else if(operation == Operators.REMAINDER) {
            opcode = type.getOpcode(IREM);
        }

        if(opcode != -1)
            mvData.getMethodVisitor().visitInsn(opcode);



    }

    @Override
    public void endVisit(Byte[] r,
                         VariableOperate operate,
                         Data extraData,
                         Navigator<CodePart> navigator,
                         VisitorGenerator<Byte> visitorGenerator,
                         MVData mvData) {

    }
}