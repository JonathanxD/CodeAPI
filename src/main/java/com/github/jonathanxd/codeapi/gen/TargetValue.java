/*
 *      ${expr} - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
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
package com.github.jonathanxd.codeapi.gen;

import com.github.jonathanxd.codeapi.util.Parent;

import java.util.List;

/**
 * Created by jonathan on 09/05/16.
 */
public class TargetValue<V, TARGET, C extends AbstractGenerator<TARGET, C>> extends TargetClassValue<TARGET, C> {

    private final V val;

    TargetValue(Class<?> value, V val, Parent<Generator<?, TARGET, C>> parents) {
        super(value, parents);
        this.val = val;
    }

    public static <V, TARGET, C extends AbstractGenerator<TARGET, C>> GenValue<Class<?>, TARGET, C> create(Class<?> targetClass, V val, Parent<Generator<?, TARGET, C>> parents) {
        return new TargetValue<Object, TARGET, C>(targetClass, val, parents);
    }

    @Override
    public void apply(TARGET value, C abstractGenerator, Appender<TARGET> appender) {

        List<GenValue<?, TARGET, C>> to = abstractGenerator.generateTo(this.getValue(), this.getVal(), this.getParents());
        to.forEach(d -> d.apply(value, abstractGenerator, appender));
    }

    public V getVal() {
        return val;
    }
}
