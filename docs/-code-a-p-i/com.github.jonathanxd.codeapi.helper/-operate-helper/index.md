[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.helper](../index.md) / [OperateHelper](.)

# OperateHelper

`class OperateHelper`

Operator helper.

### Functions

| Name | Summary |
|---|---|
| [build](build.md) | `fun build(): `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md) |
| [divide](divide.md) | `fun divide(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Multiply (/) |
| [leftShift](left-shift.md) | `fun leftShift(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Bitwise left shift (&lt;&lt;). |
| [logicalShiftRight](logical-shift-right.md) | `fun logicalShiftRight(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Bitwise logical shift right (&gt;&gt;&gt;). |
| [multiply](multiply.md) | `fun multiply(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Multiply (*) |
| [neg](neg.md) | `fun neg(): OperateHelper`<br>Negate value. |
| [not](not.md) | `fun not(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Bitwise not (~). |
| [or](or.md) | `fun or(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Inclusive or (&amp;). |
| [plus](plus.md) | `operator fun plus(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Plus (+). |
| [remainder](remainder.md) | `fun remainder(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Remainder (%) |
| [shiftRight](shift-right.md) | `fun shiftRight(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Bitwise shift right (&gt;&gt;). |
| [subtract](subtract.md) | `fun subtract(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Subtract (-). |
| [xor](xor.md) | `fun xor(value: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper`<br>Exclusive or (&#94;). |

### Companion Object Functions

| Name | Summary |
|---|---|
| [builder](builder.md) | `fun builder(part: `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`): OperateHelper` |

### Extension Functions

| Name | Summary |
|---|---|
| [annotationValue](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/annotation-value.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.annotationValue(rType: Class<*>): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.asString(simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)<br>Convert this value to a literal |
| [toLiteralOrNull](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal-or-null.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteralOrNull(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |