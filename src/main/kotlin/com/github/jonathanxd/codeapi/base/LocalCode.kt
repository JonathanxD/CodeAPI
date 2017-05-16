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

import com.github.jonathanxd.codeapi.CodeElement
import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.CodeSource
import com.github.jonathanxd.codeapi.Defaults
import com.github.jonathanxd.codeapi.common.*
import com.github.jonathanxd.codeapi.type.CodeType
import com.github.jonathanxd.codeapi.util.Alias
import java.lang.reflect.Type

/**
 * A local code (or local method). This code may be inlined or declared as method of current
 * type or translated to a lambda (for [InvokeDynamic.LambdaLocalCode]).
 *
 * @property declaringType Declaring type of [declaration] ([Alias] is supported)
 * @property invokeType Invocation type (static, virtual or interface) this depends on where [declaration]
 * is declared and which are the modifiers, if [declaration] is a instance method and declared in
 * an interface, this must be [InvokeType.INVOKE_INTERFACE], if [declaration] is `static`, this must be
 * [InvokeType.INVOKE_STATIC] does not matter if is declared in an interface or a class, if is not `static`
 * and is declared in a `class`, this must be [InvokeType.INVOKE_VIRTUAL]. Read [InvokeType] for more information.
 * @property declaration Method declaration of the code.
 */
data class LocalCode(val declaringType: Type,
                     val invokeType: InvokeType,
                     val declaration: MethodDeclaration) : CodeElement, CodePart {

    /**
     * Local code execution constructor, this constructor resolves [invokeType] based on [declaration] and
     * [declaringType].
     */
    constructor(declaringType: CodeType, declaration: MethodDeclaration) :
            this(declaringType,
                    if (declaration.modifiers.contains(CodeModifier.STATIC)) InvokeType.INVOKE_STATIC
                    else if (declaration.modifiers.contains(CodeModifier.PRIVATE)) InvokeType.INVOKE_VIRTUAL
                    else if (declaringType.isInterface) InvokeType.INVOKE_INTERFACE
                    else InvokeType.INVOKE_VIRTUAL,
                    declaration)

    /**
     * Creates a invocation of this [LocalCode] with [arguments].
     */
    fun createInvocation(arguments: List<CodePart>): MethodInvocation {
        return MethodInvocation(invokeType = invokeType,
                target = if (this.invokeType == InvokeType.INVOKE_STATIC) Defaults.ACCESS_STATIC else Defaults.ACCESS_THIS,
                arguments = arguments,
                spec = MethodTypeSpec(this.declaringType, this.declaration.name, this.declaration.typeSpec))
    }

    /**
     * Parameters
     */
    val parameters: List<CodeParameter>
        get() = this.declaration.parameters

    /**
     * Method description
     */
    val description: TypeSpec = TypeSpec(this.declaration.returnType, this.declaration.parameters.map(CodeParameter::type))

    /**
     * Method body
     */
    val body: CodeSource
        get() = this.declaration.body

    override fun builder(): Builder = Builder(this)

    class Builder() : com.github.jonathanxd.codeapi.builder.Builder<LocalCode, Builder> {

        lateinit var declaringType: Type
        var invokeType: InvokeType? = null
        lateinit var declaration: MethodDeclaration

        constructor(defaults: LocalCode) : this() {
            this.declaringType = defaults.declaringType
            this.invokeType = defaults.invokeType
            this.declaration = defaults.declaration
        }

        /**
         * See [LocalCode.invokeType]
         */
        fun withInvokeType(value: InvokeType): Builder {
            this.invokeType = value

            return this
        }

        /**
         * See [LocalCode.declaration]
         */
        fun withDeclaration(value: MethodDeclaration): Builder {
            this.declaration = value
            return this
        }

        /**
         * See [LocalCode.declaringType]
         */
        fun withDeclaringType(value: Type): Builder {
            this.declaringType = value
            return this
        }

        override fun build(): LocalCode {
            return (this.declaringType as? CodeType)?.let {
                LocalCode(it, this.declaration)
            } ?: LocalCode(this.declaringType, this.invokeType!!, this.declaration)
        }

        companion object {
            @JvmStatic
            fun builder(): Builder = Builder()

            @JvmStatic
            fun builder(defaults: LocalCode): Builder = Builder(defaults)
        }

    }
}