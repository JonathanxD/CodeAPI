[CodeAPI](../../../index.md) / [com.github.jonathanxd.codeapi.base](../../index.md) / [IfExpressionHolder](../index.md) / [Builder](.)

# Builder

`interface Builder<out T : `[`IfExpressionHolder`](../index.md)`, S : Builder<T, S>> : `[`Builder`](../../../com.github.jonathanxd.codeapi.builder/-builder/index.md)`<T, S>`

### Functions

| Name | Summary |
|---|---|
| [expressions](expressions.md) | `abstract fun expressions(value: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../../../com.github.jonathanxd.codeapi/-code-instruction.md)`>): S`<br>`open fun expressions(vararg values: `[`CodeInstruction`](../../../com.github.jonathanxd.codeapi/-code-instruction.md)`): S`<br>See [T.expressions](expressions.md) |

### Inherited Functions

| Name | Summary |
|---|---|
| [build](../../../com.github.jonathanxd.codeapi.builder/-builder/build.md) | `abstract fun build(): T`<br>Build the object of type [T](#). |

### Inheritors

| Name | Summary |
|---|---|
| [Builder](../../-for-statement/-builder/index.md) | `class Builder : Builder<`[`ForStatement`](../../-for-statement/index.md)`, `[`Builder`](../../-for-statement/-builder/index.md)`>, `[`Builder`](../../-body-holder/-builder/index.md)`<`[`ForStatement`](../../-for-statement/index.md)`, `[`Builder`](../../-for-statement/-builder/index.md)`>` |
| [Builder](../../-if-group/-builder/index.md) | `class Builder : Builder<`[`IfGroup`](../../-if-group/index.md)`, `[`Builder`](../../-if-group/-builder/index.md)`>` |
| [Builder](../../-if-statement/-builder/index.md) | `class Builder : Builder<`[`IfStatement`](../../-if-statement/index.md)`, `[`Builder`](../../-if-statement/-builder/index.md)`>, `[`Builder`](../../-body-holder/-builder/index.md)`<`[`IfStatement`](../../-if-statement/index.md)`, `[`Builder`](../../-if-statement/-builder/index.md)`>` |
| [Builder](../../-while-statement/-builder/index.md) | `class Builder : Builder<`[`WhileStatement`](../../-while-statement/index.md)`, `[`Builder`](../../-while-statement/-builder/index.md)`>, `[`Builder`](../../-body-holder/-builder/index.md)`<`[`WhileStatement`](../../-while-statement/index.md)`, `[`Builder`](../../-while-statement/-builder/index.md)`>` |