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
import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.annotation.Concrete
import com.github.jonathanxd.codeapi.builder.invoke
import com.github.jonathanxd.codeapi.operator.Operators

/**
 * For block statement
 *
 * for(forInit; forExpression; forUpdate)
 */
@Concrete
interface ForStatement : IfExpressionHolder, BodyHolder {

    override val expressions: List<CodePart>
        get() = this.forExpression

    /**
     * For initialization
     */
    val forInit: CodePart?

    /**
     * For expression.
     *
     * See [IfExpressionHolder.expressions]
     */
    val forExpression: List<CodePart>

    /**
     * For update
     */
    val forUpdate: CodePart?

    override fun builder(): Builder<ForStatement, *> = CodeAPI.getBuilderProvider()(this)

    interface Builder<out T : ForStatement, S : Builder<T, S>> :
            IfExpressionHolder.Builder<T, S>,
            BodyHolder.Builder<T, S> {

        override fun withExpressions(value: List<CodePart>): S = this.withForExpression(value)

        override fun withExpressions(vararg values: CodePart): S = this.withForExpression(values.toList())

        /**
         * See [T.forInit]
         */
        fun withForInit(value: CodePart?): S

        /**
         * See [T.forExpression]
         */
        fun withForExpression(value: List<CodePart>): S

        /**
         * See [T.forExpression]
         */
        fun withForExpression(vararg values: CodePart): S = withForExpression(values.toList())

        /**
         * See [T.forUpdate]
         */
        fun withForUpdate(value: CodePart?): S

        companion object {
            fun builder(): Builder<ForStatement, *> = CodeAPI.getBuilderProvider().invoke()
            fun builder(defaults: ForStatement): Builder<ForStatement, *> = CodeAPI.getBuilderProvider().invoke(defaults)
        }

    }

}