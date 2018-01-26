[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.processor](../index.md) / [ProcessorManager](.)

# ProcessorManager

`interface ProcessorManager<out R>`

ProcessorManager manages all processors required to transform [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) into [R](#).

Supported types depends on implementation.

### Properties

| Name | Summary |
|---|---|
| [options](options.md) | `abstract val options: Options`<br>Options of generator |
| [validatorManager](validator-manager.md) | `abstract val validatorManager: `[`ValidatorManager`](../-validator-manager/index.md)<br>Validator. |

### Functions

| Name | Summary |
|---|---|
| [createData](create-data.md) | `abstract fun createData(): TypedData`<br>Creates [TypedData](#) object. |
| [process](process.md) | `open fun process(part: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`): R`<br>`open fun <T> process(type: Class<T>, part: T): R`<br>Process [part](process.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$process(kotlin.Any)/part) and returns a value of type [R](#).`open fun process(part: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`, data: TypedData): R`<br>Process [part](process.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$process(kotlin.Any, com.github.jonathanxd.iutils.data.TypedData)/part) with [data](process.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$process(kotlin.Any, com.github.jonathanxd.iutils.data.TypedData)/data) and returns a value of type [R](#).`abstract fun <T> process(type: Class<out T>, part: T, data: TypedData): R`<br>Process [part](process.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$process(java.lang.Class((com.github.jonathanxd.codeapi.processor.ProcessorManager.process.T)), com.github.jonathanxd.codeapi.processor.ProcessorManager.process.T, com.github.jonathanxd.iutils.data.TypedData)/part) of type [type](process.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$process(java.lang.Class((com.github.jonathanxd.codeapi.processor.ProcessorManager.process.T)), com.github.jonathanxd.codeapi.processor.ProcessorManager.process.T, com.github.jonathanxd.iutils.data.TypedData)/type) with [data](process.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$process(java.lang.Class((com.github.jonathanxd.codeapi.processor.ProcessorManager.process.T)), com.github.jonathanxd.codeapi.processor.ProcessorManager.process.T, com.github.jonathanxd.iutils.data.TypedData)/data) and returns a value of type [R](#). |
| [registerProcessor](register-processor.md) | `abstract fun <T> registerProcessor(processor: `[`Processor`](../-processor/index.md)`<T>, type: Class<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Registers [processor](register-processor.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$registerProcessor(com.github.jonathanxd.codeapi.processor.Processor((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerProcessor.T)), java.lang.Class((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerProcessor.T)))/processor) of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) of type: [type](register-processor.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$registerProcessor(com.github.jonathanxd.codeapi.processor.Processor((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerProcessor.T)), java.lang.Class((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerProcessor.T)))/type). |
| [registerSugarSyntaxProcessor](register-sugar-syntax-processor.md) | `abstract fun <T> registerSugarSyntaxProcessor(sugarSyntaxProcessor: `[`SugarSyntaxProcessor`](../../com.github.jonathanxd.codeapi.sugar/-sugar-syntax-processor/index.md)`<T>, type: Class<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Registers a [sugarSyntaxProcessor](register-sugar-syntax-processor.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$registerSugarSyntaxProcessor(com.github.jonathanxd.codeapi.sugar.SugarSyntaxProcessor((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerSugarSyntaxProcessor.T)), java.lang.Class((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerSugarSyntaxProcessor.T)))/sugarSyntaxProcessor) of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) of type: [type](register-sugar-syntax-processor.md#com.github.jonathanxd.codeapi.processor.ProcessorManager$registerSugarSyntaxProcessor(com.github.jonathanxd.codeapi.sugar.SugarSyntaxProcessor((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerSugarSyntaxProcessor.T)), java.lang.Class((com.github.jonathanxd.codeapi.processor.ProcessorManager.registerSugarSyntaxProcessor.T)))/type). |

### Extension Functions

| Name | Summary |
|---|---|
| [annotationValue](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/annotation-value.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.annotationValue(rType: Class<*>): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.asString(simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [processAs](../process-as.md) | `fun <T> ProcessorManager<*>.processAs(part: T, data: TypedData): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?`<br>Process [part](../process-as.md#com.github.jonathanxd.codeapi.processor$processAs(com.github.jonathanxd.codeapi.processor.ProcessorManager((kotlin.Any)), com.github.jonathanxd.codeapi.processor.processAs.T, com.github.jonathanxd.iutils.data.TypedData)/part) as of reified type [T](#). This function is inlined, this means that type passed to [ProcessorManager.process](process.md) will be the inferred type and not the the [part](../process-as.md#com.github.jonathanxd.codeapi.processor$processAs(com.github.jonathanxd.codeapi.processor.ProcessorManager((kotlin.Any)), com.github.jonathanxd.codeapi.processor.processAs.T, com.github.jonathanxd.iutils.data.TypedData)/part) type. This is useful when you want to call a specific processor instead of exact processor. |
| [registerProcessor](../register-processor.md) | `fun <R, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> ProcessorManager<R>.registerProcessor(processor: `[`Processor`](../-processor/index.md)`<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Registers [processor](../register-processor.md#com.github.jonathanxd.codeapi.processor$registerProcessor(com.github.jonathanxd.codeapi.processor.ProcessorManager((com.github.jonathanxd.codeapi.processor.registerProcessor.R)), com.github.jonathanxd.codeapi.processor.Processor((com.github.jonathanxd.codeapi.processor.registerProcessor.T)))/processor) of [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) of type: [T](#). |
| [registerSugarSyntaxProcessor](../register-sugar-syntax-processor.md) | `fun <R, T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> ProcessorManager<R>.registerSugarSyntaxProcessor(sugarSyntaxProcessor: `[`SugarSyntaxProcessor`](../../com.github.jonathanxd.codeapi.sugar/-sugar-syntax-processor/index.md)`<T>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Registers a [sugarSyntaxProcessor](../register-sugar-syntax-processor.md#com.github.jonathanxd.codeapi.processor$registerSugarSyntaxProcessor(com.github.jonathanxd.codeapi.processor.ProcessorManager((com.github.jonathanxd.codeapi.processor.registerSugarSyntaxProcessor.R)), com.github.jonathanxd.codeapi.sugar.SugarSyntaxProcessor((com.github.jonathanxd.codeapi.processor.registerSugarSyntaxProcessor.T)))/sugarSyntaxProcessor) of [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) of type: [T](#). |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)<br>Convert this value to a literal |
| [toLiteralOrNull](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal-or-null.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteralOrNull(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |

### Inheritors

| Name | Summary |
|---|---|
| [AbstractProcessorManager](../-abstract-processor-manager/index.md) | `abstract class AbstractProcessorManager<out R> : ProcessorManager<R>`<br>An abstract manager backed by a [MutableMap](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-map/index.html). |