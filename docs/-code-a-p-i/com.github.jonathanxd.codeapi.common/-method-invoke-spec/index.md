[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.common](../index.md) / [MethodInvokeSpec](.)

# MethodInvokeSpec

`data class MethodInvokeSpec : `[`Typed`](../../com.github.jonathanxd.codeapi.base/-typed/index.md)`, `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<MethodInvokeSpec>`

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `class Builder : `[`Builder`](../../com.github.jonathanxd.codeapi.base/-typed/-builder/index.md)`<MethodInvokeSpec, `[`Builder`](-builder/index.md)`>` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MethodInvokeSpec(invokeType: `[`InvokeType`](../../com.github.jonathanxd.codeapi.base/-invoke-type/index.md)`, methodTypeSpec: `[`MethodTypeSpec`](../-method-type-spec/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [invokeType](invoke-type.md) | `val invokeType: `[`InvokeType`](../../com.github.jonathanxd.codeapi.base/-invoke-type/index.md) |
| [methodTypeSpec](method-type-spec.md) | `val methodTypeSpec: `[`MethodTypeSpec`](../-method-type-spec/index.md) |
| [type](type.md) | `val type: Type`<br>Element type |

### Functions

| Name | Summary |
|---|---|
| [builder](builder.md) | `fun builder(): `[`Builder`](-builder/index.md)<br>This builder may or may not accept null values, it depends on implementation. |
| [compareTo](compare-to.md) | `fun compareTo(other: MethodInvokeSpec): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [invoke](invoke.md) | `operator fun invoke(target: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): `[`MethodInvocation`](../../com.github.jonathanxd.codeapi.base/-method-invocation/index.md)<br>Invokes this method in [target](invoke.md#com.github.jonathanxd.codeapi.common.MethodInvokeSpec$invoke(com.github.jonathanxd.codeapi.CodeInstruction)/target).`operator fun invoke(target: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`, arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`>): `[`MethodInvocation`](../../com.github.jonathanxd.codeapi.base/-method-invocation/index.md)<br>Invokes this method in [target](invoke.md#com.github.jonathanxd.codeapi.common.MethodInvokeSpec$invoke(com.github.jonathanxd.codeapi.CodeInstruction, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/target) with [arguments](invoke.md#com.github.jonathanxd.codeapi.common.MethodInvokeSpec$invoke(com.github.jonathanxd.codeapi.CodeInstruction, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/arguments). |
| [toInvocationString](to-invocation-string.md) | `fun toInvocationString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Human readable method invocation string. |

### Extension Properties

| Name | Summary |
|---|---|
| [isPrimitive](../../com.github.jonathanxd.codeapi/is-primitive.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.isPrimitive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns true if the type of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) is primitive |
| [type](../../com.github.jonathanxd.codeapi/type.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.type: Type`<br>Gets the type of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [typeOrNull](../../com.github.jonathanxd.codeapi/type-or-null.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.typeOrNull: Type?`<br>Gets the type of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) or null if receiver is not a [Typed](../../com.github.jonathanxd.codeapi.base/-typed/index.md) instance. |

### Extension Functions

| Name | Summary |
|---|---|
| [annotationValue](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/annotation-value.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.annotationValue(rType: Class<*>): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.asString(simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [toInvocation](../../com.github.jonathanxd.codeapi.util.conversion/to-invocation.md) | `fun MethodInvokeSpec.toInvocation(target: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`, arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`>): `[`MethodInvocation`](../../com.github.jonathanxd.codeapi.base/-method-invocation/index.md)<br>Create [MethodInvocation](../../com.github.jonathanxd.codeapi.base/-method-invocation/index.md) from MethodInvokeSpec |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)<br>Convert this value to a literal |
| [toLiteralOrNull](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal-or-null.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteralOrNull(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |