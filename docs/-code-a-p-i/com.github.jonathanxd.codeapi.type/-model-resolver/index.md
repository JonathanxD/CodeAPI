[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.type](../index.md) / [ModelResolver](.)

# ModelResolver

`class ModelResolver : `[`GenericResolver`](../../com.github.jonathanxd.codeapi.util/-generic-resolver/index.md)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ModelResolver(elements: Elements)` |

### Properties

| Name | Summary |
|---|---|
| [elements](elements.md) | `val elements: Elements` |

### Functions

| Name | Summary |
|---|---|
| [resolveGenericTypeImplementation](resolve-generic-type-implementation.md) | `fun resolveGenericTypeImplementation(superType: Type, implemented: Type, codeTypeResolver: `[`CodeTypeResolver`](../-code-type-resolver/index.md)`<*>): `[`GenericType`](../-generic-type/index.md)<br>Resolves [GenericType](../-generic-type/index.md) of [implemented](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.type.ModelResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/implemented) type, which was implemented in [superType](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.type.ModelResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/superType). This generic type should be the [implemented](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.type.ModelResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/implemented) belong with type parameters provided by [superType](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.type.ModelResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/superType). |
| [resolveTypeWithParameters](resolve-type-with-parameters.md) | `fun resolveTypeWithParameters(type: Type, codeTypeResolver: `[`CodeTypeResolver`](../-code-type-resolver/index.md)`<*>): `[`GenericType`](../-generic-type/index.md)<br>Resolves the [GenericType](../-generic-type/index.md) of [type](resolve-type-with-parameters.md#com.github.jonathanxd.codeapi.type.ModelResolver$resolveTypeWithParameters(java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/type). This generic type should be the [type](resolve-type-with-parameters.md#com.github.jonathanxd.codeapi.type.ModelResolver$resolveTypeWithParameters(java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/type) belong with their type parameters. |

### Extension Functions

| Name | Summary |
|---|---|
| [annotationValue](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/annotation-value.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.annotationValue(rType: Class<*>): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.asString(simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)<br>Convert this value to a literal |
| [toLiteralOrNull](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal-or-null.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteralOrNull(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |