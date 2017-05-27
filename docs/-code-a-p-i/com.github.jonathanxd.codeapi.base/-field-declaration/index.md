[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.base](../index.md) / [FieldDeclaration](.)

# FieldDeclaration

`data class FieldDeclaration : `[`CodeElement`](../../com.github.jonathanxd.codeapi/-code-element.md)`, `[`FieldBase`](../-field-base/index.md)`, `[`Named`](../-named/index.md)`, `[`Typed`](../-typed/index.md)`, `[`ValueHolder`](../-value-holder/index.md)`, `[`ModifiersHolder`](../-modifiers-holder/index.md)`, `[`Annotable`](../-annotable/index.md)`, `[`CommentHolder`](../../com.github.jonathanxd.codeapi.base.comment/-comment-holder/index.md)`, `[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`, `[`InnerTypesHolder`](../-inner-types-holder/index.md)

Declaration of a field.

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `class Builder : `[`Builder`](../-field-base/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>, `[`Builder`](../-named/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>, `[`Builder`](../-typed/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>, `[`Builder`](../-value-holder/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>, `[`Builder`](../-modifiers-holder/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>, `[`Builder`](../-annotable/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>, `[`Builder`](../../com.github.jonathanxd.codeapi.base.comment/-comment-holder/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>, `[`Builder`](../-inner-types-holder/-builder/index.md)`<FieldDeclaration, `[`Builder`](-builder/index.md)`>` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `FieldDeclaration(comments: `[`Comments`](../../com.github.jonathanxd.codeapi.base.comment/-comments/index.md)`, annotations: List<`[`Annotation`](../-annotation/index.md)`>, modifiers: Set<`[`CodeModifier`](../-code-modifier/index.md)`>, type: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`, name: String, innerTypes: List<`[`TypeDeclaration`](../-type-declaration/index.md)`>, value: `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`?)`<br>Declaration of a field. |

### Properties

| Name | Summary |
|---|---|
| [annotations](annotations.md) | `val annotations: List<`[`Annotation`](../-annotation/index.md)`>`<br>Annotations |
| [comments](comments.md) | `val comments: `[`Comments`](../../com.github.jonathanxd.codeapi.base.comment/-comments/index.md)<br>All comments inside this holder. |
| [innerTypes](inner-types.md) | `val innerTypes: List<`[`TypeDeclaration`](../-type-declaration/index.md)`>`<br>Inner types |
| [localization](localization.md) | `val localization: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)<br>Field localization. |
| [modifiers](modifiers.md) | `val modifiers: Set<`[`CodeModifier`](../-code-modifier/index.md)`>`<br>Modifiers. Empty modifier set is the same as public. For package private, an explicit
[CodeModifier.PACKAGE_PRIVATE](../-code-modifier/-p-a-c-k-a-g-e_-p-r-i-v-a-t-e.md) is required. |
| [name](name.md) | `val name: String`<br>Name |
| [target](target.md) | `val target: `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)<br>Target of the access |
| [type](type.md) | `val type: `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)<br>Element type |
| [value](value.md) | `val value: `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`?`<br>Value |

### Inherited Properties

| Name | Summary |
|---|---|
| [isPublic](../-modifiers-holder/is-public.md) | `open val isPublic: Boolean`<br>Returns true if is public. |

### Functions

| Name | Summary |
|---|---|
| [builder](builder.md) | `fun builder(): `[`Builder`](-builder/index.md)<br>This builder may or may not accept null values, it depends on implementation. |

### Extension Functions

| Name | Summary |
|---|---|
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun Any?.asString(simple: Boolean = true): String`<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [getPartType](../../com.github.jonathanxd.codeapi.util/get-part-type.md) | `fun `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.getPartType(): `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)<br>Returns the [Type](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html) of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) or throws [IllegalStateException](http://docs.oracle.com/javase/6/docs/api/java/lang/IllegalStateException.html) if [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) is not instance of [Typed](../-typed/index.md) |
| [getPartTypeOrNull](../../com.github.jonathanxd.codeapi.util/get-part-type-or-null.md) | `fun `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.getPartTypeOrNull(): `[`Type`](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html)`?`<br>Returns the [Type](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/Type.html) of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) or `null` if [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) is not instance of [Typed](../-typed/index.md). |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun Any.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |