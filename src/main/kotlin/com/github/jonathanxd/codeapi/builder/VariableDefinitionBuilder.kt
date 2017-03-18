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

import com.github.jonathanxd.codeapi.base.VariableDefinition
import com.github.jonathanxd.codeapi.base.impl.VariableDefinitionImpl

// Generated by BuilderGen
open class VariableDefinitionBuilder() : VariableDefinition.Builder<VariableDefinition, VariableDefinitionBuilder> {

    /**
     * See [VariableDefinition.type]
     */
    lateinit var type: com.github.jonathanxd.codeapi.type.CodeType

    /**
     * See [VariableDefinition.name]
     */
    lateinit var name: kotlin.String

    /**
     * See [VariableDefinition.value]
     */
    lateinit var value: com.github.jonathanxd.codeapi.CodePart

    constructor(defaults: VariableDefinition) : this() {
        this.type = defaults.type
        this.name = defaults.name
        this.value = defaults.value
    }


    /**
     * See [VariableDefinition.type]
     */
    override fun withType(value: com.github.jonathanxd.codeapi.type.CodeType): VariableDefinitionBuilder {
        this.type = value
        return this
    }


    /**
     * See [VariableDefinition.name]
     */
    override fun withName(value: kotlin.String): VariableDefinitionBuilder {
        this.name = value
        return this
    }


    /**
     * See [VariableDefinition.value]
     */
    override fun withValue(value: com.github.jonathanxd.codeapi.CodePart?): VariableDefinitionBuilder {
        this.value = value!!
        return this
    }

    override fun build(): VariableDefinition = VariableDefinitionImpl(
            type = this.type,
            name = this.name,
            value = this.value
    )


    companion object {
        @JvmStatic
        fun builder() = VariableDefinitionBuilder()
    }
}