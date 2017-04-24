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
@file:JvmName("MethodFactory")

package com.github.jonathanxd.codeapi.factory

import com.github.jonathanxd.codeapi.CodeSource
import com.github.jonathanxd.codeapi.Types
import com.github.jonathanxd.codeapi.base.Annotation
import com.github.jonathanxd.codeapi.base.MethodDeclaration
import com.github.jonathanxd.codeapi.base.MethodDeclarationBase
import com.github.jonathanxd.codeapi.base.comment.Comments
import com.github.jonathanxd.codeapi.common.CodeModifier
import com.github.jonathanxd.codeapi.common.CodeParameter
import com.github.jonathanxd.codeapi.generic.GenericSignature
import com.github.jonathanxd.codeapi.type.CodeType
import com.github.jonathanxd.codeapi.util.ArrayToList
import com.github.jonathanxd.codeapi.util.emptyEnumSet
import java.lang.reflect.Type
import java.util.*

// Short methods

fun method(genericSignature: GenericSignature = GenericSignature.empty(),
           modifiers: EnumSet<CodeModifier> = emptyEnumSet(),
           name: String,
           returnType: Type = Types.VOID,
           parameters: Array<CodeParameter> = emptyArray(),
           source: CodeSource = CodeSource.empty()): MethodDeclarationBase {

    // Select correct method
    return method(
            annotations = emptyArray(),
            genericSignature = genericSignature,
            modifiers = modifiers,
            name = name,
            returnType = returnType,
            parameters = parameters,
            source = source
    )
}

fun method(modifiers: EnumSet<CodeModifier> = emptyEnumSet(),
           name: String,
           returnType: Type = Types.VOID,
           parameters: Array<CodeParameter> = emptyArray(),
           source: CodeSource = CodeSource.empty()): MethodDeclarationBase {

    // Select correct method
    return method(
            annotations = emptyArray(),
            modifiers = modifiers,
            name = name,
            returnType = returnType,
            parameters = parameters,
            source = source
    )
}

fun method(modifiers: EnumSet<CodeModifier> = emptyEnumSet(),
           name: String,
           returnType: Type = Types.VOID,
           source: CodeSource = CodeSource.empty()): MethodDeclarationBase {

    // Select correct method
    return method(
            annotations = emptyArray(),
            modifiers = modifiers,
            name = name,
            returnType = returnType,
            source = source
    )
}

// /Short methods

@JvmOverloads
fun method(annotations: Array<Annotation> = emptyArray(),
           genericSignature: GenericSignature = GenericSignature.empty(),
           modifiers: EnumSet<CodeModifier> = emptyEnumSet(),
           name: String,
           returnType: Type = Types.VOID,
           parameters: Array<CodeParameter> = emptyArray(),
           source: CodeSource = CodeSource.empty(),
           comments: Comments = Comments.Absent): MethodDeclaration {
    return MethodDeclaration(
            parameters = ArrayToList.toList(parameters),
            name = name,
            annotations = ArrayToList.toList(annotations),
            body = source,
            returnType = returnType,
            modifiers = modifiers,
            genericSignature = genericSignature,
            comments = comments
    )
}

fun method(comments: Comments,
           annotations: Array<Annotation> = emptyArray(),
           genericSignature: GenericSignature = GenericSignature.empty(),
           modifiers: EnumSet<CodeModifier> = emptyEnumSet(),
           name: String,
           returnType: Type = Types.VOID,
           parameters: Array<CodeParameter> = emptyArray(),
           source: CodeSource = CodeSource.empty()): MethodDeclaration {
    return MethodDeclaration(
            parameters = ArrayToList.toList(parameters),
            name = name,
            annotations = ArrayToList.toList(annotations),
            body = source,
            returnType = returnType,
            modifiers = modifiers,
            genericSignature = genericSignature,
            comments = comments
    )
}

