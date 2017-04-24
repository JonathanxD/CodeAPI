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

import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.literal.Literals
import com.github.jonathanxd.codeapi.util.CodePartUtil
import com.github.jonathanxd.codeapi.util.Stack
import com.github.jonathanxd.codeapi.util.codeType
import com.github.jonathanxd.codeapi.util.self
import java.lang.reflect.Type

/**
 * Constructs an array of type [arrayType] with dimensions [dimensions].
 */
data class ArrayConstructor(val arrayType: Type,
                            val dimensions: List<CodePart>,
                            override val arguments: List<CodePart>) : ArgumentHolder, Typed {

    override val type: Type
        get() = this.arrayType

    override val array: Boolean
        get() = true

    override val types: List<Type>
        get() = ArrayList<Type>(this.arguments.size).apply {
            (0..arguments.size).forEach {
                add(arrayType.codeType.arrayComponent)
            }
        }

    /**
     * Array values
     */
    val arrayValues: List<ArrayStore>
        get() {
            val arguments = this.arguments
            val arrayStores = mutableListOf<ArrayStore>()

            for (i in arguments.indices) {
                val argument = arguments[i]

                arrayStores.add(
                        ArrayStore.Builder.builder()
                                .withArrayType(this@ArrayConstructor.arrayType)//this@ArrayConstructor.arrayType.toArray(this@ArrayConstructor.dimensions.size)
                                .withTarget(Stack)
                                .withIndex(Literals.INT(i))
                                .withValueType(CodePartUtil.getType(argument))
                                .withValueToStore(argument)
                                .build()
                )
            }

            return arrayStores
        }

    override fun builder(): Builder = Builder()

    class Builder() :
            ArgumentHolder.Builder<ArrayConstructor, Builder>,
            Typed.Builder<ArrayConstructor, Builder> {

        lateinit var arrayType: Type
        var dimensions: List<CodePart> = emptyList()
        var arguments: List<CodePart> = emptyList()

        constructor(defaults: ArrayConstructor) : this() {
            this.arrayType = defaults.arrayType
            this.dimensions = defaults.dimensions
            this.arguments = defaults.arguments
        }

        override fun withType(value: Type): Builder = this.withArrayType(value)

        @Suppress("UNCHECKED_CAST")
        override fun withArray(value: Boolean): Builder = self()

        /**
         * See [ArrayConstructor.arrayType]
         */
        fun withArrayType(value: Type): Builder {
            this.arrayType = value
            return this
        }

        /**
         * See [ArrayConstructor.dimensions]
         */
        fun withDimensions(value: List<CodePart>): Builder {
            this.dimensions = value
            return this
        }

        /**
         * See [ArrayConstructor.dimensions]
         */
        fun withDimensions(vararg values: CodePart): Builder = withDimensions(values.toList())

        override fun withArguments(value: List<CodePart>): Builder {
            this.arguments = value
            return this
        }

        override fun build(): ArrayConstructor = ArrayConstructor(this.arrayType, this.dimensions, this.arguments)

        companion object {
            @JvmStatic
            fun builder(): Builder = Builder()

            @JvmStatic
            fun builder(defaults: ArrayConstructor): Builder = Builder(defaults)
        }

    }

}
