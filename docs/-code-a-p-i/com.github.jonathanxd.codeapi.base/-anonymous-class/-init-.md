[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.base](../index.md) / [AnonymousClass](index.md) / [&lt;init&gt;](.)

# &lt;init&gt;

`AnonymousClass(comments: `[`Comments`](../../com.github.jonathanxd.codeapi.base.comment/-comments/index.md)`, outerType: Type?, annotations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Annotation`](../-annotation/index.md)`>, specifiedName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, superClass: Type, implementations: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Type>, constructorSpec: `[`TypeSpec`](../-type-spec/index.md)`, arguments: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`CodeInstruction`](../../com.github.jonathanxd.codeapi/-code-instruction.md)`>, constructorBody: `[`CodeSource`](../../com.github.jonathanxd.codeapi/-code-source/index.md)`, staticBlock: `[`StaticBlock`](../-static-block/index.md)`, fields: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`FieldDeclaration`](../-field-declaration/index.md)`>, constructors: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ConstructorDeclaration`](../-constructor-declaration/index.md)`>, methods: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MethodDeclaration`](../-method-declaration/index.md)`>, innerTypes: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TypeDeclaration`](../-type-declaration/index.md)`>)`

Anonymous class, they can be defined like all other classes, but some generators may not
support all definitions (like multiple [implementations](-init-.md#com.github.jonathanxd.codeapi.base.AnonymousClass$<init>(com.github.jonathanxd.codeapi.base.comment.Comments, java.lang.reflect.Type, kotlin.collections.List((com.github.jonathanxd.codeapi.base.Annotation)), kotlin.String, java.lang.reflect.Type, kotlin.collections.List((java.lang.reflect.Type)), com.github.jonathanxd.codeapi.base.TypeSpec, kotlin.collections.List((com.github.jonathanxd.codeapi.CodeInstruction)), com.github.jonathanxd.codeapi.CodeSource, com.github.jonathanxd.codeapi.base.StaticBlock, kotlin.collections.List((com.github.jonathanxd.codeapi.base.FieldDeclaration)), kotlin.collections.List((com.github.jonathanxd.codeapi.base.ConstructorDeclaration)), kotlin.collections.List((com.github.jonathanxd.codeapi.base.MethodDeclaration)), kotlin.collections.List((com.github.jonathanxd.codeapi.base.TypeDeclaration)))/implementations)).

The invocation of the constructor of the anonymous class is inlined after the anonymous class definition.
