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
package com.github.jonathanxd.codeapi.builder

import com.github.jonathanxd.codeapi.base.impl.ForStatementImpl
import com.github.jonathanxd.codeapi.base.ForStatement

// Generated by BuilderGen
class ForStatementBuilder(): Builder<ForStatement, ForStatementBuilder>() {

    /**
     * See [ForStatement.forInit]
     */
    var forInit: com.github.jonathanxd.codeapi.CodePart? = null

    /**
     * See [ForStatement.forExpression]
     */
    var forExpression: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart> = emptyList()

    /**
     * See [ForStatement.forUpdate]
     */
    var forUpdate: com.github.jonathanxd.codeapi.CodePart? = null

    /**
     * See [ForStatement.body]
     */
    var body: com.github.jonathanxd.codeapi.CodeSource? = null

    constructor(defaults: ForStatement) : this() {
        this.forInit = defaults.forInit
        this.forExpression = defaults.forExpression
        this.forUpdate = defaults.forUpdate
        this.body = defaults.body
    }


    /**
     * See [ForStatement.forInit]
     */
    fun withForInit(value: com.github.jonathanxd.codeapi.CodePart?): ForStatementBuilder {
        this.forInit = value
        return this
    }


    /**
     * See [ForStatement.forExpression]
     */
    fun withForExpression(value: kotlin.collections.List<com.github.jonathanxd.codeapi.CodePart>): ForStatementBuilder {
        this.forExpression = value
        return this
    }


    /**
     * See [ForStatement.forExpression]
     */
    fun withForExpression(vararg values: com.github.jonathanxd.codeapi.CodePart): ForStatementBuilder {
        this.forExpression = values.toList()
        return this
    }


    /**
     * See [ForStatement.forUpdate]
     */
    fun withForUpdate(value: com.github.jonathanxd.codeapi.CodePart?): ForStatementBuilder {
        this.forUpdate = value
        return this
    }


    /**
     * See [ForStatement.body]
     */
    fun withBody(value: com.github.jonathanxd.codeapi.CodeSource?): ForStatementBuilder {
        this.body = value
        return this
    }

    override fun build(): ForStatement = ForStatementImpl(
            forInit = this.forInit,
            forExpression = this.forExpression,
            forUpdate = this.forUpdate,
            body = this.body
    )


    companion object {
        @JvmStatic
        fun builder() = ForStatementBuilder()
    }
}