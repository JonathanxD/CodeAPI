[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.base.comment](../index.md) / [CommentHolder](.)

# CommentHolder

`interface CommentHolder : `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)

Hold comments and documentation.

### Types

| Name | Summary |
|---|---|
| [Builder](-builder/index.md) | `interface Builder<out T : CommentHolder, S : `[`Builder`](-builder/index.md)`<T, S>> : `[`Builder`](../../com.github.jonathanxd.codeapi.builder/-builder/index.md)`<T, S>` |

### Properties

| Name | Summary |
|---|---|
| [comments](comments.md) | `abstract val comments: `[`Comments`](../-comments/index.md)<br>All comments of this element. |

### Inherited Functions

| Name | Summary |
|---|---|
| [builder](../../com.github.jonathanxd.codeapi/-code-part/builder.md) | `open fun builder(): `[`Builder`](../../com.github.jonathanxd.codeapi.builder/-builder/index.md)`<`[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`, *>`<br>This builder may or may not accept null values, it depends on implementation. |

### Extension Properties

| Name | Summary |
|---|---|
| [isPrimitive](../../com.github.jonathanxd.codeapi/is-primitive.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.isPrimitive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns true if the type of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) is primitive |
| [type](../../com.github.jonathanxd.codeapi/type.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.type: Type`<br>Gets the type of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [typeOrNull](../../com.github.jonathanxd.codeapi/type-or-null.md) | `val `[`CodePart`](../../com.github.jonathanxd.codeapi/-code-part/index.md)`.typeOrNull: Type?`<br>Gets the type of [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) or null if receiver is not a [Typed](../../com.github.jonathanxd.codeapi.base/-typed/index.md) instance. |

### Extension Functions

| Name | Summary |
|---|---|
| [annotationValue](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/annotation-value.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.annotationValue(rType: Class<*>): `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html) |
| [asString](../../com.github.jonathanxd.codeapi.util/kotlin.-any/as-string.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?.asString(simple: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)` = true): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Create a String representation of the part of this [CodePart](../../com.github.jonathanxd.codeapi/-code-part/index.md) |
| [toLiteral](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteral(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)<br>Convert this value to a literal |
| [toLiteralOrNull](../../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/to-literal-or-null.md) | `fun `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`.toLiteralOrNull(): `[`Literal`](../../com.github.jonathanxd.codeapi.literal/-literal/index.md)`?`<br>Convert this value to a literal |

### Inheritors

| Name | Summary |
|---|---|
| [AnnotationProperty](../../com.github.jonathanxd.codeapi.base/-annotation-property/index.md) | `data class AnnotationProperty : `[`Named`](../../com.github.jonathanxd.codeapi.base/-named/index.md)`, `[`Typed`](../../com.github.jonathanxd.codeapi.base/-typed/index.md)`, `[`Annotable`](../../com.github.jonathanxd.codeapi.base/-annotable/index.md)`, `[`ReturnTypeHolder`](../../com.github.jonathanxd.codeapi.base/-return-type-holder/index.md)`, CommentHolder`<br>Annotation property, this is part of [AnnotationDeclaration](../../com.github.jonathanxd.codeapi.base/-annotation-declaration/index.md). |
| [FieldDeclaration](../../com.github.jonathanxd.codeapi.base/-field-declaration/index.md) | `data class FieldDeclaration : `[`CodeElement`](../../com.github.jonathanxd.codeapi/-code-element.md)`, `[`FieldBase`](../../com.github.jonathanxd.codeapi.base/-field-base/index.md)`, `[`Named`](../../com.github.jonathanxd.codeapi.base/-named/index.md)`, `[`Typed`](../../com.github.jonathanxd.codeapi.base/-typed/index.md)`, `[`ValueHolder`](../../com.github.jonathanxd.codeapi.base/-value-holder/index.md)`, `[`ModifiersHolder`](../../com.github.jonathanxd.codeapi.base/-modifiers-holder/index.md)`, `[`Annotable`](../../com.github.jonathanxd.codeapi.base/-annotable/index.md)`, CommentHolder, `[`InnerTypesHolder`](../../com.github.jonathanxd.codeapi.base/-inner-types-holder/index.md)<br>Declaration of a field. |
| [MethodDeclarationBase](../../com.github.jonathanxd.codeapi.base/-method-declaration-base/index.md) | `interface MethodDeclarationBase : `[`CodeElement`](../../com.github.jonathanxd.codeapi/-code-element.md)`, `[`ModifiersHolder`](../../com.github.jonathanxd.codeapi.base/-modifiers-holder/index.md)`, `[`ReturnTypeHolder`](../../com.github.jonathanxd.codeapi.base/-return-type-holder/index.md)`, `[`ParametersHolder`](../../com.github.jonathanxd.codeapi.base/-parameters-holder/index.md)`, `[`GenericSignatureHolder`](../../com.github.jonathanxd.codeapi.base/-generic-signature-holder/index.md)`, `[`Annotable`](../../com.github.jonathanxd.codeapi.base/-annotable/index.md)`, `[`Named`](../../com.github.jonathanxd.codeapi.base/-named/index.md)`, `[`Typed`](../../com.github.jonathanxd.codeapi.base/-typed/index.md)`, CommentHolder, `[`BodyHolder`](../../com.github.jonathanxd.codeapi.base/-body-holder/index.md)`, `[`InnerTypesHolder`](../../com.github.jonathanxd.codeapi.base/-inner-types-holder/index.md)`, `[`ThrowsHolder`](../../com.github.jonathanxd.codeapi.base/-throws-holder/index.md)<br>Method declaration |
| [TypeDeclaration](../../com.github.jonathanxd.codeapi.base/-type-declaration/index.md) | `interface TypeDeclaration : `[`ModifiersHolder`](../../com.github.jonathanxd.codeapi.base/-modifiers-holder/index.md)`, `[`CodeType`](../../com.github.jonathanxd.codeapi.type/-code-type/index.md)`, `[`QualifiedNamed`](../../com.github.jonathanxd.codeapi.base/-qualified-named/index.md)`, `[`GenericSignatureHolder`](../../com.github.jonathanxd.codeapi.base/-generic-signature-holder/index.md)`, `[`Annotable`](../../com.github.jonathanxd.codeapi.base/-annotable/index.md)`, CommentHolder, `[`InnerTypesHolder`](../../com.github.jonathanxd.codeapi.base/-inner-types-holder/index.md)`, `[`ElementsHolder`](../../com.github.jonathanxd.codeapi.base/-elements-holder/index.md)<br>Base class of all [TypeDeclaration](../../com.github.jonathanxd.codeapi.base/-type-declaration/index.md)s like classes, interfaces and enums, and inner classes. |