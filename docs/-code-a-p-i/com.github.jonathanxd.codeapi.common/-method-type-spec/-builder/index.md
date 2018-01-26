[CodeAPI](../../../index.md) / [com.github.jonathanxd.codeapi.common](../../index.md) / [MethodTypeSpec](../index.md) / [Builder](.)

# Builder

`class Builder : `[`Builder`](../../../com.github.jonathanxd.codeapi.base/-typed/-builder/index.md)`<`[`MethodTypeSpec`](../index.md)`, Builder>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Builder(defaults: `[`MethodTypeSpec`](../index.md)`)`<br>`Builder()` |

### Properties

| Name | Summary |
|---|---|
| [localization](localization.md) | `lateinit var localization: Type` |
| [methodName](method-name.md) | `lateinit var methodName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [typeSpec](type-spec.md) | `lateinit var typeSpec: `[`TypeSpec`](../../../com.github.jonathanxd.codeapi.base/-type-spec/index.md) |

### Functions

| Name | Summary |
|---|---|
| [build](build.md) | `fun build(): `[`MethodTypeSpec`](../index.md)<br>Build the object of type [T](#). |
| [type](type.md) | `fun type(value: Type): Builder`<br>See [T.type](#) |
| [withLocalization](with-localization.md) | `fun withLocalization(value: `[`CodeType`](../../../com.github.jonathanxd.codeapi.type/-code-type/index.md)`): Builder` |
| [withMethodName](with-method-name.md) | `fun withMethodName(value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): Builder` |
| [withTypeSpec](with-type-spec.md) | `fun withTypeSpec(value: `[`TypeSpec`](../../../com.github.jonathanxd.codeapi.base/-type-spec/index.md)`): Builder` |