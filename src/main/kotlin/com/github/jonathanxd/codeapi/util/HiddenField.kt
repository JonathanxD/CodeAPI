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
package com.github.jonathanxd.codeapi.util

import com.github.jonathanxd.codeapi.CodePart
import com.github.jonathanxd.codeapi.annotation.GenerateTo
import com.github.jonathanxd.codeapi.base.FieldDeclaration
import com.github.jonathanxd.codeapi.base.impl.FieldDeclarationImpl
import com.github.jonathanxd.codeapi.common.CodeModifier
import com.github.jonathanxd.codeapi.base.Annotation
import com.github.jonathanxd.codeapi.type.CodeType

/**
 * This class denotes a hidden field.
 *
 * In source code, this field will be obfuscated
 *
 * In bytecode, the LocalVariableTable will not contain this field.
 */
@GenerateTo(FieldDeclaration::class)
data class HiddenField(override val name: String, override val variableType: CodeType, override val value: CodePart?, override val modifiers: Set<CodeModifier>, override val annotations: List<Annotation>) : FieldDeclaration {


    constructor(name: String, type: CodeType, modifiers: Set<CodeModifier>, annotations: List<Annotation>)
            : this(name, type, null, modifiers, annotations)

    constructor(name: String, type: CodeType, modifiers: Set<CodeModifier>)
            : this(name, type, null, modifiers, emptyList())

    constructor(name: String, type: CodeType)
            : this(name, type, null, emptySet(), emptyList())

    constructor(name: String, type: CodeType, value: CodePart, modifiers: Set<CodeModifier>)
            : this(name, type, value, modifiers, emptyList())

    constructor(name: String, type: CodeType, value: CodePart)
            : this(name, type, value, emptySet(), emptyList())
}