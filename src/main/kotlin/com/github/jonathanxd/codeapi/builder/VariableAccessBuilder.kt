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

import com.github.jonathanxd.codeapi.base.VariableAccess
import com.github.jonathanxd.codeapi.base.impl.VariableAccessImpl

// Generated by BuilderGen
open class VariableAccessBuilder() : VariableAccess.Builder<VariableAccess, VariableAccessBuilder> {

    /**
     * See [VariableAccess.name]
     */
    lateinit var name: kotlin.String

    /**
     * See [VariableAccess.variableType]
     */
    lateinit var variableType: com.github.jonathanxd.codeapi.type.CodeType

    constructor(defaults: VariableAccess) : this() {
        this.name = defaults.name
        this.variableType = defaults.variableType
    }


    /**
     * See [VariableAccess.name]
     */
    override fun withName(value: kotlin.String): VariableAccessBuilder {
        this.name = value
        return this
    }


    /**
     * See [VariableAccess.variableType]
     */
    override fun withVariableType(value: com.github.jonathanxd.codeapi.type.CodeType): VariableAccessBuilder {
        this.variableType = value
        return this
    }

    override fun build(): VariableAccess = VariableAccessImpl(
            name = this.name,
            variableType = this.variableType
    )


    companion object {
        @JvmStatic
        fun builder() = VariableAccessBuilder()
    }
}