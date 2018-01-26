[CodeAPI](../index.md) / [com.github.jonathanxd.codeapi.util](index.md) / [createCasted](.)

# createCasted

`fun createCasted(expected: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Type>, passed: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../com.github.jonathanxd.codeapi/-code-instruction.md)`>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../com.github.jonathanxd.codeapi/-code-instruction.md)`>`

Create a casted argument list. This function casts [passed](create-casted.md#com.github.jonathanxd.codeapi.util$createCasted(kotlin.collections.List((java.lang.reflect.Type)), kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/passed) to types of [expected](create-casted.md#com.github.jonathanxd.codeapi.util$createCasted(kotlin.collections.List((java.lang.reflect.Type)), kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)))/expected).

### Parameters

`expected` - Expected arguments.

`passed` - Provided arguments

**Return**
List with casted arguments.
