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
package com.github.jonathanxd.codeapi.base

import com.github.jonathanxd.codeapi.common.SwitchType
import com.github.jonathanxd.codeapi.type.CodeType

/**
 * Switch statement, this switch can switch numeric values and object values (like Enum, String or other
 * objects).
 *
 * If the [SwitchType.isUnique] returns false, the CodeAPI will automatically generate a
 * [Any.equals] verification.
 *
 * For example, if you switch a String like that:
 *
 * ```java
 * switch(str) {
 *     case "A": println(": A");
 *     case "B": println(": B");
 * }
 * ```
 *
 * CodeAPI will convert it to:
 *
 * ```java
 * switch(str) {
 *     case "A": if(str.equals("A")) println(": A");
 *     case "B": if(str.equals("B")) println(": B");
 * }
 * ```
 *
 * CodeAPI will not generate two "switches" like Javac do.
 *
 * You could also switch objects, but make sure that the object implements [Any.hashCode]
 * and [Any.equals] methods.
 *
 */
interface SwitchStatement : ValueHolder, Typed {

    /**
     * Value to switch
     */
    override val value: Typed

    /**
     * Switch types
     */
    val switchType: SwitchType

    /**
     * Case handlers
     */
    val cases: List<Case>

    override val type: CodeType?
        get() = this.value.type
}