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
package com.github.jonathanxd.codeapi.test;

import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.common.CodeArgument;
import com.github.jonathanxd.codeapi.common.CodeParameter;
import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.helper.Helper;
import com.github.jonathanxd.codeapi.helper.Predefined;
import com.github.jonathanxd.codeapi.helper.PredefinedTypes;
import com.github.jonathanxd.codeapi.impl.CodeClass;
import com.github.jonathanxd.codeapi.impl.CodeField;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.types.Generic;
import com.github.jonathanxd.iutils.annotations.Named;
import com.github.jonathanxd.iutils.object.Bi;

import org.junit.Assert;

import java.util.List;

import static com.github.jonathanxd.codeapi.CodeAPI.aClass;
import static com.github.jonathanxd.codeapi.CodeAPI.constructor;
import static com.github.jonathanxd.codeapi.CodeAPI.field;
import static com.github.jonathanxd.codeapi.CodeAPI.method;
import static com.github.jonathanxd.codeapi.CodeAPI.sourceOfParts;
import static java.lang.reflect.Modifier.PUBLIC;
import static java.lang.reflect.Modifier.STATIC;

/**
 * Created by jonathan on 07/07/16.
 */
public class ForEach_ {

    public static Bi<@Named("Main class") CodeClass, @Named("Source") CodeSource> $() {

        Assert.assertEquals(Generic.type(PredefinedTypes.LIST).of(PredefinedTypes.STRING).hashCode(), Generic.type(PredefinedTypes.LIST).of(PredefinedTypes.STRING).hashCode());
        Assert.assertEquals(Generic.type(PredefinedTypes.LIST).of(PredefinedTypes.STRING), Generic.type(PredefinedTypes.LIST).of(PredefinedTypes.STRING));

        CodeClass codeClass = aClass(PUBLIC, "com.ForEach", codeClass1 -> sourceOfParts(
                constructor(PUBLIC, codeClass1, new CodeParameter[]{new CodeParameter("strList", Generic.type(PredefinedTypes.LIST).of(PredefinedTypes.STRING))},
                        codeConstructor -> sourceOfParts(
                                Helper.createForEach(new CodeField("str", PredefinedTypes.STRING),
                                        Helper.expression(Helper.accessLocalVariable("strList",
                                                Generic.type(PredefinedTypes.LIST).of(PredefinedTypes.STRING))), Helper.sourceOf(
                                                Predefined.invokePrintln(new CodeArgument(Helper.accessLocalVariable("str", String.class), String.class))
                                        ))
                        ))
        ));

        return new Bi<>(codeClass, sourceOfParts(codeClass));
    }

}