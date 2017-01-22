/*
 *      CodeAPI - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2017 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/ & https://github.com/TheRealBuggy/) <jonathan.scripter@programmer.net>
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
package com.github.jonathanxd.codeapi.util;

import com.github.jonathanxd.codeapi.type.CodeType;

import java.lang.invoke.MethodHandles;

public class CodeTypeUtil {
    private static final MethodHandles.Lookup lookup = MethodHandles.lookup();

    private static String resolveQualified(String qualifiedName, CodeType outer, boolean isInternal) {
        if (outer != null) {
            String packageName = outer.getPackageName();

            // Prevent duplication of the name
            if (!packageName.isEmpty() && !qualifiedName.startsWith(packageName)) {
                if(isInternal) {
                    return CodeTypeUtil.getInternalNameStr(qualifiedName, outer);
                } else {
                    return CodeTypeUtil.getRealNameStr(qualifiedName, outer);
                }
            }
        }

        return qualifiedName;

    }

    public static String resolveInternalQualified(String qualifiedName, CodeType outer) {
        return resolveQualified(qualifiedName, outer, true);
    }

    public static String resolveRealQualified(String qualifiedName, CodeType outer) {
        return resolveQualified(qualifiedName, outer, false);
    }

    private static String getRealNameStr(String qualified, CodeType outer) {
        return outer.getCanonicalName() + "." + qualified;
    }

    private static String getInternalNameStr(String qualified, CodeType outer) {
        return outer.getType() + "$" + qualified;
    }

    public static String codeTypeToFullAsm(CodeType type) {
        return type.isPrimitive()
                ? CodeTypeUtil.primitiveCodeTypeToAsm(type)
                : type.getJavaSpecName();//"L" + type.getType().replace('.', '/') + ";";
    }

    public static String primitiveCodeTypeToAsm(CodeType type) {
        return type.getJavaSpecName();
    }

    public static String codeTypeToTypeDesc(CodeType codeType) {
        return codeTypeToTypeDesc(codeType, codeType.getType());
    }

    public static String codeTypeToTypeDesc(CodeType codeType, String type) {

        String name;

        if (codeType.isArray()) {
            name = codeType.getArrayBaseComponent().getJavaSpecName();
        } else if(codeType.isPrimitive()) {
            return type.replace(".", "/");
        } else {
            return "L" + type.replace('.', '/') + ";";
        }

        StringBuilder sb = new StringBuilder();

        int arrayDimension = codeType.getArrayDimension();

        for (int x = 0; x < arrayDimension; ++x)
            sb.append('[');

        return sb.toString() + name;
    }

}
