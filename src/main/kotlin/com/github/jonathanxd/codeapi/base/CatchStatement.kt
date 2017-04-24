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

import com.github.jonathanxd.codeapi.CodeAPI
import com.github.jonathanxd.codeapi.CodeSource
import com.github.jonathanxd.codeapi.annotation.Concrete
import com.github.jonathanxd.codeapi.builder.invoke
import com.github.jonathanxd.codeapi.util.self
import java.lang.reflect.Type

/**
 * Catch statement of a try block. Catch [exceptionTypes] and store caught exception in [variable].
 *
 * @property exceptionTypes Exception type to catch
 * @property variable Variable to store exception
 */
data class CatchStatement(val exceptionTypes: List<Type>,
                          val variable: VariableDeclaration,
                          override val body: CodeSource) : BodyHolder, Typed {

    override val type: Type
        get() = this.variable.type

    init {
        BodyHolder.checkBody(this)
    }

    override fun builder(): Builder = CodeAPI.getBuilderProvider()(this)

    interface Builder :
            BodyHolder.Builder<CatchStatement, Builder>,
            Typed.Builder<CatchStatement, Builder> {

        @Suppress("UNCHECKED_CAST")
        override fun withType(value: Type): Builder = self()

        /**
         * See [CatchStatement.exceptionTypes]
         */
        fun withExceptionTypes(value: List<Type>): Builder

        /**
         * See [CatchStatement.variable]
         */
        fun withExceptionTypes(vararg values: Type): Builder = withExceptionTypes(values.toList())

        /**
         * See [CatchStatement.variable]
         */
        fun withVariable(value: VariableDeclaration): Builder

        companion object {
            fun builder(): Builder = CodeAPI.getBuilderProvider().invoke()
            fun builder(defaults: CatchStatement): Builder = CodeAPI.getBuilderProvider().invoke(defaults)
        }

    }
}

