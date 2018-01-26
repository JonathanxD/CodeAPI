[CodeAPI](../index.md) / [com.github.jonathanxd.codeapi.factory](index.md) / [invoke](.)

# invoke

`fun invoke(invokeType: `[`InvokeType`](../com.github.jonathanxd.codeapi.base/-invoke-type/index.md)`, localization: Type, target: `[`CodeInstruction`](../com.github.jonathanxd.codeapi/-code-instruction.md)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, spec: `[`TypeSpec`](../com.github.jonathanxd.codeapi.base/-type-spec/index.md)`, arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../com.github.jonathanxd.codeapi/-code-instruction.md)`>): `[`MethodInvocation`](../com.github.jonathanxd.codeapi.base/-method-invocation/index.md)

Invoke a method with signature [spec](invoke.md#com.github.jonathanxd.codeapi.factory$invoke(com.github.jonathanxd.codeapi.base.InvokeType, java.lang.reflect.Type, com.github.jonathanxd.codeapi.CodeInstruction, kotlin.String, com.github.jonathanxd.codeapi.base.TypeSpec, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/spec) and [name](invoke.md#com.github.jonathanxd.codeapi.factory$invoke(com.github.jonathanxd.codeapi.base.InvokeType, java.lang.reflect.Type, com.github.jonathanxd.codeapi.CodeInstruction, kotlin.String, com.github.jonathanxd.codeapi.base.TypeSpec, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/name) of class [localization](invoke.md#com.github.jonathanxd.codeapi.factory$invoke(com.github.jonathanxd.codeapi.base.InvokeType, java.lang.reflect.Type, com.github.jonathanxd.codeapi.CodeInstruction, kotlin.String, com.github.jonathanxd.codeapi.base.TypeSpec, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/localization) using instance [target](invoke.md#com.github.jonathanxd.codeapi.factory$invoke(com.github.jonathanxd.codeapi.base.InvokeType, java.lang.reflect.Type, com.github.jonathanxd.codeapi.CodeInstruction, kotlin.String, com.github.jonathanxd.codeapi.base.TypeSpec, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/target) with
[arguments](invoke.md#com.github.jonathanxd.codeapi.factory$invoke(com.github.jonathanxd.codeapi.base.InvokeType, java.lang.reflect.Type, com.github.jonathanxd.codeapi.CodeInstruction, kotlin.String, com.github.jonathanxd.codeapi.base.TypeSpec, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/arguments).

**See Also**

[InvokeType](../com.github.jonathanxd.codeapi.base/-invoke-type/index.md)

[MethodInvocation](../com.github.jonathanxd.codeapi.base/-method-invocation/index.md)

`fun `[`CodeInstruction`](../com.github.jonathanxd.codeapi/-code-instruction.md)`.invoke(invokeType: `[`InvokeType`](../com.github.jonathanxd.codeapi.base/-invoke-type/index.md)`, localization: Type, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, spec: `[`TypeSpec`](../com.github.jonathanxd.codeapi.base/-type-spec/index.md)`, arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../com.github.jonathanxd.codeapi/-code-instruction.md)`>): `[`MethodInvocation`](../com.github.jonathanxd.codeapi.base/-method-invocation/index.md)

Invokes method on [receiver](../com.github.jonathanxd.codeapi/-code-instruction.md).
