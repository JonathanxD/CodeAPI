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
package com.github.jonathanxd.codeapi.read.bytecode.asm;

import com.github.jonathanxd.codeapi.MutableCodeSource;
import com.github.jonathanxd.codeapi.common.CodeModifier;
import com.github.jonathanxd.codeapi.common.Environment;
import com.github.jonathanxd.codeapi.common.Signature;
import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.impl.CodeClass;
import com.github.jonathanxd.codeapi.impl.CodeInterface;
import com.github.jonathanxd.codeapi.interfaces.TypeDeclaration;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.types.GenericType;
import com.github.jonathanxd.codeapi.util.gen.GenericUtil;
import com.github.jonathanxd.codeapi.util.gen.ModifierUtil;

import org.objectweb.asm.Opcodes;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import jdk.internal.org.objectweb.asm.tree.ClassNode;

public class ClassAnalyzer {

    public static TypeDeclaration analyze(ClassNode classNode) {
        final Environment environment = new Environment();

        Collection<CodeModifier> modifiers = ModifierUtil.fromAccess(classNode.access);

        boolean isInterface = (classNode.access & Opcodes.ACC_INTERFACE) != 0;

        CodeType type = environment.getTypeResolver().resolve(classNode.name, isInterface);

        CodeType superClass = environment.resolveUnknown(classNode.superName);
        List<CodeType> interfaces = classNode.interfaces.stream().map(environment::resolveUnknown).collect(Collectors.toList());

        Signature signature = GenericUtil.Read.parseFull(environment.getTypeResolver(), classNode.signature);

        GenericSignature<GenericType> genericSignature = signature.getSignature();

        if(signature.getSuperType() != null)
            superClass = signature.getSuperType();

        if(signature.getInterfaces().length > 0)
            interfaces = Arrays.asList(signature.getInterfaces());

        TypeDeclaration declaration;

        if (isInterface) {
            declaration = new CodeInterface(null, type.getCanonicalName(), modifiers, interfaces, genericSignature, new MutableCodeSource());
        } else {
            declaration = new CodeClass(null, type.getCanonicalName(), modifiers, superClass, interfaces, genericSignature, new MutableCodeSource());
        }

        ClassAnalyzer.checkSignature(classNode.signature, declaration, superClass, interfaces);


        return declaration;
    }

    private static void checkSignature(String signature, TypeDeclaration declaration, CodeType superClass, List<CodeType> interfaces) {
        boolean superClassIsGeneric = superClass instanceof GenericType;
        boolean anyInterfaceIsGeneric = interfaces.stream().anyMatch(codeType0 -> codeType0 instanceof GenericType);

        String sign = GenericUtil.genericTypesToAsmString(declaration, superClass, interfaces, superClassIsGeneric, anyInterfaceIsGeneric);

        if (!signature.equals(sign)) {
            throw new IllegalStateException("Signature parsed incorrectly: expected: " + signature + ". current: " + sign);
        }
    }

}