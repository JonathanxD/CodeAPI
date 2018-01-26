[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.base](../index.md) / [CodeModifier](.)

# CodeModifier

`enum class CodeModifier : `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)

Modifiers enum.

### Types

| Name | Summary |
|---|---|
| [Internal](-internal/index.md) | `object Internal` |

### Enum Values

| Name | Summary |
|---|---|
| [PUBLIC](-p-u-b-l-i-c.md) |  |
| [PROTECTED](-p-r-o-t-e-c-t-e-d.md) |  |
| [PRIVATE](-p-r-i-v-a-t-e.md) |  |
| [PACKAGE_PRIVATE](-p-a-c-k-a-g-e_-p-r-i-v-a-t-e.md) |  |
| [ABSTRACT](-a-b-s-t-r-a-c-t.md) |  |
| [DEFAULT](-d-e-f-a-u-l-t.md) |  |
| [STATIC](-s-t-a-t-i-c.md) |  |
| [FINAL](-f-i-n-a-l.md) |  |
| [TRANSIENT](-t-r-a-n-s-i-e-n-t.md) |  |
| [VOLATILE](-v-o-l-a-t-i-l-e.md) |  |
| [SYNCHRONIZED](-s-y-n-c-h-r-o-n-i-z-e-d.md) |  |
| [NATIVE](-n-a-t-i-v-e.md) |  |
| [STRICTFP](-s-t-r-i-c-t-f-p.md) |  |
| [BRIDGE](-b-r-i-d-g-e.md) |  |
| [VARARGS](-v-a-r-a-r-g-s.md) |  |
| [SYNTHETIC](-s-y-n-t-h-e-t-i-c.md) |  |
| [ANNOTATION](-a-n-n-o-t-a-t-i-o-n.md) |  |
| [ENUM](-e-n-u-m.md) |  |
| [MANDATED](-m-a-n-d-a-t-e-d.md) |  |
| [OPEN](-o-p-e-n.md) |  |
| [TRANSITIVE](-t-r-a-n-s-i-t-i-v-e.md) |  |
| [STATIC_PHASE](-s-t-a-t-i-c_-p-h-a-s-e.md) |  |

### Properties

| Name | Summary |
|---|---|
| [expr](expr.md) | `val expr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Modifier name. |
| [modifierType](modifier-type.md) | `val modifierType: `[`ModifierType`](../-modifier-type/index.md)<br>Type of modifier. |

### Inherited Functions

| Name | Summary |
|---|---|
| [builder](../../com.github.jonathanxd.codeapi/-code-part/builder.md) | `open fun builder(): `[`Builder`](../../com.github.jonathanxd.codeapi.builder/-builder/index.md)`<`[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`, *>`<br>This builder may or may not accept null values, it depends on implementation. |

### Companion Object Functions

| Name | Summary |
|---|---|
| [fromJavaModifiers](from-java-modifiers.md) | `fun fromJavaModifiers(modifiers: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<CodeModifier>`<br>Extract modifiers from Java modifiers flags ([Modifier](#)). |
| [fromJavaxModifiers](from-javax-modifiers.md) | `fun fromJavaxModifiers(modifiers: `[`Iterable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html)`<JavaxModifier>): `[`MutableSet`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/index.html)`<CodeModifier>`<br>Extract modifiers from Javax model modifiers ([Modifier](#)). |
| [fromMember](from-member.md) | `fun fromMember(member: Member): `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<CodeModifier>`<br>Extract modifiers from a [Member](#) |
| [toJavaModifier](to-java-modifier.md) | `fun toJavaModifier(modifiers: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<CodeModifier>): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Convert CodeModifiers to Java Modifiers flags.`fun toJavaModifier(codeModifier: CodeModifier): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Convert a CodeModifier to Java Modifiers flags. |
| [toString](to-string.md) | `fun toString(collection: `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<CodeModifier>?): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Modifiers to String |

### Extension Properties

| Name | Summary |
|---|---|
| [isPrimitive](../../com.github.jonathanxd.codeapi/is-primitive.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.isPrimitive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns true if the type of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) is primitive |
| [type](../../com.github.jonathanxd.codeapi/type.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.type: Type`<br>Gets the type of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [typeOrNull](../../com.github.jonathanxd.codeapi/type-or-null.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.typeOrNull: Type?`<br>Gets the type of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) or null if receiver is not a [Typed](../-typed/index.md) instance. |

### Extension Functions

| Name | Summary |
|---|---|
| [annotationValue](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/annotation-value.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.annotationValue(rType: Class<*>): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.asString(simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)<br>Convert this value to a literal |
| [toLiteralOrNull](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal-or-null.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteralOrNull(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |