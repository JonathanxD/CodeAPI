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

import com.github.jonathanxd.codeapi.gen.visit.Visitor;
import com.github.jonathanxd.codeapi.gen.visit.VoidVisitor;
import com.github.jonathanxd.iutils.type.TypeInfo;

public final class VisitorTypeUtil {
    private VisitorTypeUtil() {

    }

    @SuppressWarnings("unchecked")
    public static <T> Class<?> getType(VoidVisitor<?, T, ?> instance, int pos) {
        Class<? extends VoidVisitor> aClass = instance.getClass();
        TypeInfo<?> resolve = com.github.jonathanxd.iutils.type.TypeUtil.resolve(aClass, VoidVisitor.class);
        TypeInfo[] related = resolve.getRelated();

        if (pos >= related.length)
            return null;

        return related[pos].getAClass();
    }


    @SuppressWarnings("unchecked")
    public static <T> Class<?> getType(Visitor<?, T, ?> instance, int pos) {
        Class<? extends Visitor> aClass = instance.getClass();
        TypeInfo<?> resolve = com.github.jonathanxd.iutils.type.TypeUtil.resolve(aClass, Visitor.class);
        TypeInfo[] related = resolve.getRelated();

        if (pos >= related.length)
            return null;

        return related[pos].getAClass();
    }

}