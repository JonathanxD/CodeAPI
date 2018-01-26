[CodeAPI](../../../index.md) / [com.github.jonathanxd.codeapi.base](../../index.md) / [InvokeDynamicBase](../index.md) / [LambdaLocalCodeBase](.)

# LambdaLocalCodeBase

`interface LambdaLocalCodeBase : `[`LambdaMethodRefBase`](../-lambda-method-ref-base/index.md)`, `[`ArgumentsHolder`](../../-arguments-holder/index.md)

Invocation of lambda function.

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `interface Builder<out T : LambdaLocalCodeBase, S : `[`Builder`](-builder/index.md)`<T, S>> : `[`Builder`](../-lambda-method-ref-base/-builder/index.md)`<T, S>, `[`Builder`](../../-arguments-holder/-builder/index.md)`<T, S>` |

### Properties

| Name | Summary |
|---|---|
| [arguments](arguments.md) | `abstract val arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../../../com.github.jonathanxd.codeapi/-code-instruction.md)`>`<br>Argument to capture from current context and pass to [localCode](local-code.md) |
| [array](array.md) | `open val array: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Array arguments |
| [expectedTypes](expected-types.md) | `open val expectedTypes: `[`TypeSpec`](../../-type-spec/index.md)<br>Types expected by the caller of lambda SAM. |
| [localCode](local-code.md) | `abstract val localCode: `[`LocalCode`](../../-local-code/index.md)<br>Local method to invoke |
| [methodRef](method-ref.md) | `open val methodRef: `[`MethodInvokeSpec`](../../../com.github.jonathanxd.codeapi.common/-method-invoke-spec/index.md)<br>Method reference to invoke |

### Inherited Properties

| Name | Summary |
|---|---|
| [baseSam](../-lambda-method-ref-base/base-sam.md) | `abstract val baseSam: `[`MethodTypeSpec`](../../../com.github.jonathanxd.codeapi.common/-method-type-spec/index.md)<br>Description of base SAM method, example, if the target functional interface is [Supplier](#), then the base SAM method is the [Supplier.get](#). |
| [bootstrap](../-lambda-method-ref-base/bootstrap.md) | `open val bootstrap: `[`MethodInvokeSpec`](../../../com.github.jonathanxd.codeapi.common/-method-invoke-spec/index.md)<br>Bootstrap method invocation specification. |
| [bootstrapArgs](../-lambda-method-ref-base/bootstrap-args.md) | `open val bootstrapArgs: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`>`<br>Bootstrap method Arguments, must be an [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), [CodeType](../../../com.github.jonathanxd.codeapi.type/-code-type/index.md) or [MethodInvokeSpec](../../../com.github.jonathanxd.codeapi.common/-method-invoke-spec/index.md). |
| [currentTypes](../-lambda-method-ref-base/current-types.md) | `open val currentTypes: `[`TypeSpec`](../../-type-spec/index.md)<br>Current types of lambda sam. |
| [dynamicMethod](../-lambda-method-ref-base/dynamic-method.md) | `open val dynamicMethod: `[`DynamicMethodSpec`](../../../com.github.jonathanxd.codeapi.common/-dynamic-method-spec/index.md)<br>Specification of dynamic method. |
| [target](../-lambda-method-ref-base/target.md) | `abstract val target: `[`CodeInstruction`](../../../com.github.jonathanxd.codeapi/-code-instruction.md)<br>Target of method ref invocation |
| [type](../-lambda-method-ref-base/type.md) | `open val type: Type`<br>Return type of dynamic invocation |
| [types](../-lambda-method-ref-base/types.md) | `open val types: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Type>`<br>Expected types of each argument |

### Functions

| Name | Summary |
|---|---|
| [builder](builder.md) | `abstract fun builder(): `[`Builder`](-builder/index.md)`<LambdaLocalCodeBase, *>`<br>This builder may or may not accept null values, it depends on implementation. |

### Inheritors

| Name | Summary |
|---|---|
| [LambdaLocalCode](../../-invoke-dynamic/-lambda-local-code/index.md) | `data class LambdaLocalCode : LambdaLocalCodeBase` |