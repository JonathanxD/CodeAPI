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

import com.github.jonathanxd.codeapi.CodeElement
import com.github.jonathanxd.codeapi.CodeSource
import com.github.jonathanxd.codeapi.base.FieldDeclaration
import com.github.jonathanxd.codeapi.base.MethodDeclaration
import com.github.jonathanxd.codeapi.base.ModifiersHolder
import com.github.jonathanxd.codeapi.base.TypeDeclaration
import com.github.jonathanxd.codeapi.common.CodeModifier
import com.github.jonathanxd.codeapi.common.MemberInfo
import com.github.jonathanxd.codeapi.common.MemberInfos
import com.github.jonathanxd.codeapi.inspect.SourceInspect

object MemberInfosUtil {
    @JvmStatic
    fun createMemberInfos(typeDeclaration: TypeDeclaration): MemberInfos {
        val body = typeDeclaration.body ?: CodeSource.empty()

        val elements = SourceInspect.find { codePart -> codePart is MethodDeclaration || codePart is FieldDeclaration }
                .include { bodied -> bodied is CodeSource }
                .mapTo { codePart -> codePart as CodeElement }
                .inspect(body)

        val memberInfos = MemberInfos(typeDeclaration)

        for (element in elements) {
            if (element is ModifiersHolder) {
                memberInfos.put(MemberInfo.of(element, !element.modifiers.contains(CodeModifier.PRIVATE)))
            }
        }

        return memberInfos
    }
}