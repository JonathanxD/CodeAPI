[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.exception](../index.md) / [ValidationException](.)

# ValidationException

`class ValidationException : `[`RuntimeException`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-runtime-exception/index.html)

Occurs when validation fails.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `ValidationException()`<br>`ValidationException(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`)`<br>`ValidationException(cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`ValidationException(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`ValidationException(message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, enableSuppression: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, writableStackTrace: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>`ValidationException(message: `[`ValidationMessage`](../../com.github.jonathanxd.codeapi.processor/-validation-message/index.md)`)`<br>`ValidationException(message: `[`ValidationMessage`](../../com.github.jonathanxd.codeapi.processor/-validation-message/index.md)`, cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`ValidationException(message: `[`ValidationMessage`](../../com.github.jonathanxd.codeapi.processor/-validation-message/index.md)`, cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, enableSuppression: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, writableStackTrace: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)`<br>`ValidationException(message: `[`ContextedValidationMessage`](../../com.github.jonathanxd.codeapi.processor/-contexted-validation-message/index.md)`)`<br>`ValidationException(message: `[`ContextedValidationMessage`](../../com.github.jonathanxd.codeapi.processor/-contexted-validation-message/index.md)`, cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`)`<br>`ValidationException(message: `[`ContextedValidationMessage`](../../com.github.jonathanxd.codeapi.processor/-contexted-validation-message/index.md)`, cause: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, enableSuppression: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, writableStackTrace: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`)` |

### Extension Functions

| Name | Summary |
|---|---|
| [annotationValue](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/annotation-value.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.annotationValue(rType: Class<*>): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.asString(simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)<br>Convert this value to a literal |
| [toLiteralOrNull](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal-or-null.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteralOrNull(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |