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
package com.github.jonathanxd.codeapi.test.other;

import com.github.jonathanxd.codeapi.CodeAPI;
import com.github.jonathanxd.codeapi.Types;
import com.github.jonathanxd.codeapi.type.CodeType;
import com.github.jonathanxd.codeapi.type.Generic;
import com.github.jonathanxd.codeapi.util.CodeTypes;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GenTest {

    public static final Map<String, List<? super Map<Integer, String>>> ms = null;


    public Map<String, List<? super Map<Integer, String>>> myMethod() {
        return null;
    }

    @Test
    public void test() throws Exception {
        Type genericType = GenTest.class.getDeclaredField("ms").getGenericType();
        Type genericReturnType = GenTest.class.getDeclaredMethod("myMethod").getGenericReturnType();

        CodeType codeType = CodeTypes.getCodeType(genericType);
        CodeType returnCodeType = CodeTypes.getCodeType(genericReturnType);

        Assert.assertEquals(codeType.toString(), "java.util.Map<java.lang.String, java.util.List<? super java.util.Map<java.lang.Integer, java.lang.String>>>");

        Assert.assertEquals(codeType.toString(), returnCodeType.toString());


        Assert.assertTrue(returnCodeType.is(codeType));
        Assert.assertTrue(returnCodeType.is(
                Generic.type(CodeAPI.getJavaType(Map.class)).of(Types.STRING).of(Generic.type(Generic.type(CodeAPI.getJavaType(List.class))).of(
                        Generic.wildcard().super$(Generic.type(CodeAPI.getJavaType(Map.class)).of(Types.INTEGER_WRAPPER, Types.STRING))
                ))
        ));


        CodeType mType = CodeTypes.getCodeType(M.class.getTypeParameters()[0]);
        CodeType iter = CodeTypes.getCodeType(M.class.getDeclaredMethod("iter").getGenericReturnType());

        Assert.assertTrue(Generic.type("T").is(mType));
        Assert.assertTrue(Generic.type(Types.ITERATOR).of("T").is(iter));

        CodeType type = CodeTypes.applyType(iter, "T", Types.STRING);

        Assert.assertTrue(Generic.type(Types.ITERATOR).of(Types.STRING).is(type));

        CodeType generic = Generic.wildcard().extends$(Generic.type(Types.LIST).of(Generic.wildcard().super$("T")));
        CodeType typeGeneric = CodeTypes.applyType(generic, "T", Types.STRING);
        CodeType typed = Generic.wildcard().extends$(Generic.type(Types.LIST).of(Generic.wildcard().super$(Types.STRING)));

        Assert.assertTrue(typed.is(typeGeneric));


        CodeType t = CodeTypes.getType(generic, "T", typed);

        System.out.println(t);
    }


    public static class M<T> {
        public Iterator<T> iter() {
            return null;
        }
    }

}
