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
@file:JvmName("CodeTypeUtil")

package com.github.jonathanxd.codeapi.util

import com.github.jonathanxd.codeapi.base.TypeSpec
import com.github.jonathanxd.codeapi.type.CodeType
import com.github.jonathanxd.codeapi.type.GenericType
import java.lang.reflect.Type

/**
 * Resolves the inner name based on [qualifiedName] and [outer] type.
 *
 * @param isTypeName True to return type name, false to return qualified name.
 */
private fun resolveInnerName(qualifiedName: String, outer: Type?, isTypeName: Boolean): String {
    if (outer != null) {
        outer.codeType.let { outer ->
            val packageName = outer.packageName

            // Prevent duplication of the name
            if (!packageName.isEmpty() && !qualifiedName.startsWith(packageName)) {
                if (isTypeName) {
                    return getTypeNameStr(qualifiedName, outer)
                } else {
                    return getQualifiedNameStr(qualifiedName, outer)
                }
            }
        }
    }

    return qualifiedName

}

/**
 * Resolves the type name based on [qualifiedName] and [outer] type.
 */
fun resolveTypeName(qualifiedName: String, outer: Type?): String {
    return resolveInnerName(qualifiedName, outer, true)
}

/**
 * Resolves the qualified name based on [qualifiedName] and [outer] type.
 */
fun resolveQualifiedName(qualifiedName: String, outer: Type?): String {
    return resolveInnerName(qualifiedName, outer, false)
}

/**
 * Create qualified name from [qualified] and [outer] name.
 */
private fun getQualifiedNameStr(qualified: String, outer: Type): String {
    return outer.codeType.canonicalName + "." + qualified
}

/**
 * Create type name from [qualified] and [outer] name.
 */
private fun getTypeNameStr(qualified: String, outer: Type): String {
    return outer.codeType.type + "$" + qualified
}

val Type.typeDesc get() = this.getTypeDesc()

/**
 * Convert `this` [name][typeStr] to type description.
 *
 * All calls to [CodeType.javaSpecName] is delegated to this function.
 *
 * @param typeStr String to transform in type description (should be `this` name).
 */
fun Type.getTypeDesc(typeStr: String = this.codeType.type): String {

    val name: String

    val codeType = this.codeType

    if (codeType.isArray) {
        name = codeType.arrayBaseComponent.javaSpecName
    } else if (codeType.isPrimitive) {
        val transform = when (typeStr) {
            "byte" -> "B"
            "short" -> "S"
            "int" -> "I"
            "char" -> "C"
            "double" -> "D"
            "float" -> "F"
            "long" -> "J"
            "boolean" -> "Z"
            "void" -> "V"
            else -> typeStr.replace(".", "/") // Should I throw an exception or only replace?
        }

        return transform
    } else {
        return "L" + typeStr.replace('.', '/') + ";"
    }

    val sb = StringBuilder()

    val arrayDimension = codeType.arrayDimension

    for (x in 0..arrayDimension - 1)
        sb.append('[')

    return sb.toString() + name
}

/**
 * Convert iterable of types to string description
 */
val Iterable<Type>.typeDesc get() = this.joinToString(separator = "") { it.typeDesc }

/**
 * Convert [TypeSpec] string description
 */
val TypeSpec.typeDesc get() = "(${this.parameterTypes.typeDesc})${this.returnType.typeDesc}"

/**
 * Converts `this` type to type descriptor.
 *
 * A type descriptor is formatted as:
 *
 * - `TYPE_JAVA_SPEC` (specified by [CodeType.javaSpecName]) when receiver [Type] is not a [GenericType]
 * - `TYPE_NAME` when receiver is a [GenericType], does not have bounds and is a wildcard (and not a type).
 * - `(T)(TYPE_NAME);` when receiver is a [GenericType], does not have bounds and is neither a wildcard and a type.
 * - `TYPE_NAME;` when receiver is a [GenericType], and is a type.
 * - `TYPE_NAME<BOUNDS>;` when receiver is a [GenericType], have bounds and the receiver is not a wildcard.
 *
 * Note: `()` is only used to make the format more readable and will not be generated in descriptors.
 */
val Type.descriptor: String get() {
    val codeType = this.codeType

    if (codeType is GenericType) {

        val name = codeType.name

        val bounds = codeType.bounds

        if (bounds.isEmpty()) {
            if (!codeType.isType) {
                if (codeType.isWildcard) {
                    return fixResult(name)
                } else {
                    return fixResult("T$name;")
                }
            } else {
                return name + ";"
            }
        } else {
            return fixResult(if (!codeType.isWildcard)
                name + "<" + bounds(codeType.isWildcard, bounds) + ">;"
            else
                bounds(codeType.isWildcard, bounds) + ";")
        }

    } else {
        return fixResult(codeType.javaSpecName)
    }
}

/**
 * Creates type description from
 */
fun parametersTypeAndReturnToDesc(parameterTypes: Collection<Type>, returnType: Type): String {
    return "(${parameterTypes.typeDesc})${returnType.typeDesc}"
}