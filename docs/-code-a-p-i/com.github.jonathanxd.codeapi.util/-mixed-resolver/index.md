[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.util](../index.md) / [MixedResolver](.)

# MixedResolver

`class MixedResolver : `[`GenericResolver`](../-generic-resolver/index.md)

Mixes [JavaResolver](../-java-resolver/index.md) with [ModelResolver](../-model-resolver/index.md) and [CodeAPIResolver](../-code-a-p-i-resolver/index.md) in one resolver.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MixedResolver(elements: `[`Elements`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/util/Elements.html)`?)`<br>Mixes [JavaResolver](../-java-resolver/index.md) with [ModelResolver](../-model-resolver/index.md) and [CodeAPIResolver](../-code-a-p-i-resolver/index.md) in one resolver. |

### Properties

| Name | Summary |
|---|---|
| [elements](elements.md) | `val elements: `[`Elements`](http://docs.oracle.com/javase/6/docs/api/javax/lang/model/util/Elements.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [resolveGenericTypeImplementation](resolve-generic-type-implementation.md) | `fun resolveGenericTypeImplementation(superType: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`, implemented: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`, codeTypeResolver: `[`CodeTypeResolver`](../../com.github.jonathanxd.codeapi.type/-code-type-resolver/index.md)`<*>): `[`GenericType`](../../com.github.jonathanxd.codeapi.type/-generic-type/index.md)<br>Resolves [GenericType](../../com.github.jonathanxd.codeapi.type/-generic-type/index.md) of [implemented](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.util.MixedResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/implemented) type, which was implemented in [superType](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.util.MixedResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/superType). This generic type
should be the [implemented](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.util.MixedResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/implemented) belong with type parameters provided by [superType](resolve-generic-type-implementation.md#com.github.jonathanxd.codeapi.util.MixedResolver$resolveGenericTypeImplementation(java.lang.reflect.Type, java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/superType). |
| [resolveTypeWithParameters](resolve-type-with-parameters.md) | `fun resolveTypeWithParameters(type: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`, codeTypeResolver: `[`CodeTypeResolver`](../../com.github.jonathanxd.codeapi.type/-code-type-resolver/index.md)`<*>): `[`GenericType`](../../com.github.jonathanxd.codeapi.type/-generic-type/index.md)<br>Resolves the [GenericType](../../com.github.jonathanxd.codeapi.type/-generic-type/index.md) of [type](resolve-type-with-parameters.md#com.github.jonathanxd.codeapi.util.MixedResolver$resolveTypeWithParameters(java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/type). This generic type should be the [type](resolve-type-with-parameters.md#com.github.jonathanxd.codeapi.util.MixedResolver$resolveTypeWithParameters(java.lang.reflect.Type, com.github.jonathanxd.codeapi.type.CodeTypeResolver((kotlin.Any)))/type) belong with their type parameters. |

### Extension Functions

| Name | Summary |
|---|---|
| [asString](../kotlin.-any/as-string.md) | `fun Any?.asString(simple: Boolean = true): String`<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun Any.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |