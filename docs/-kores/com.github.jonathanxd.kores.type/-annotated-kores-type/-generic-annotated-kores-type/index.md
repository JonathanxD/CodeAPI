//[Kores](../../../index.md)/[com.github.jonathanxd.kores.type](../../index.md)/[AnnotatedKoresType](../index.md)/[GenericAnnotatedKoresType](index.md)



# GenericAnnotatedKoresType  
 [jvm] class [GenericAnnotatedKoresType](index.md)(**annotatedType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **annotations**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../../com.github.jonathanxd.kores.base/-annotation/index.md)>) : [AnnotatedKoresType.Abstract](../-abstract/index.md)<[AnnotatedKoresType.GenericAnnotatedKoresType](index.md)> , [GenericType](../../-generic-type/index.md)   


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType.GenericBuilder///PointingToDeclaration/"></a>[GenericBuilder](-generic-builder/index.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType.GenericBuilder///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>class [GenericBuilder](-generic-builder/index.md)(**origin**: [GenericType](../../-generic-type/index.md)) : [AnnotatedKoresType.Builder](../-builder/index.md)<[AnnotatedKoresType.GenericAnnotatedKoresType](index.md), [AnnotatedKoresType.GenericAnnotatedKoresType.GenericBuilder](-generic-builder/index.md)> , [GenericType.Builder](../../-generic-type/-builder/index.md)<[AnnotatedKoresType.GenericAnnotatedKoresType](index.md), [AnnotatedKoresType.GenericAnnotatedKoresType.GenericBuilder](-generic-builder/index.md)>   <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/builder/#/PointingToDeclaration/"></a>[builder](builder.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/builder/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [builder](builder.md)(): [AnnotatedKoresType.GenericAnnotatedKoresType.GenericBuilder](-generic-builder/index.md)  <br>More info  <br>This builder may or may not accept null values, it depends on implementation.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/compareTo/#com.github.jonathanxd.kores.type.KoresType/PointingToDeclaration/"></a>[compareTo](compare-to.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/compareTo/#com.github.jonathanxd.kores.type.KoresType/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [compareTo](compare-to.md)(other: [KoresType](../../-kores-type/index.md)): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Compare two identifications  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-abstract/equals.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [equals](../-abstract/equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/getTypeName/#/PointingToDeclaration/"></a>[getTypeName](../../-kores-type/get-type-name.md)| <a name="com.github.jonathanxd.kores.type/KoresType/getTypeName/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [getTypeName](../../-kores-type/get-type-name.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-abstract/hash-code.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [hashCode](../-abstract/hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/is/#com.github.jonathanxd.kores.type.KoresType?/PointingToDeclaration/"></a>[is](is.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/is/#com.github.jonathanxd.kores.type.KoresType?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [is](is.md)(other: [KoresType](../../-kores-type/index.md)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Returns true if this [KoresType](../../-kores-type/index.md) is equals to other [KoresType](../../-kores-type/index.md).  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/isAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[isAssignableFrom](../../-kores-type/is-assignable-from.md)| <a name="com.github.jonathanxd.kores.type/KoresType/isAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [isAssignableFrom](../../-kores-type/is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>open override fun [isAssignableFrom](../../-kores-type/is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), resolverProvider: ([Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)) -> [KoresTypeResolver](../../-kores-type-resolver/index.md)<*>): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/isConcreteIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[isConcreteIdEq](../../-kores-type/is-concrete-id-eq.md)| <a name="com.github.jonathanxd.kores.type/KoresType/isConcreteIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [isConcreteIdEq](../../-kores-type/is-concrete-id-eq.md)(other: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/isIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[isIdEq](../../-kores-type/is-id-eq.md)| <a name="com.github.jonathanxd.kores.type/KoresType/isIdEq/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [isIdEq](../../-kores-type/is-id-eq.md)(other: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/safeIsAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[safeIsAssignableFrom](../../-kores-type/safe-is-assignable-from.md)| <a name="com.github.jonathanxd.kores.type/KoresType/safeIsAssignableFrom/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [safeIsAssignableFrom](../../-kores-type/safe-is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): EitherObjBoolean<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)>  <br>open override fun [safeIsAssignableFrom](../../-kores-type/safe-is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), resolverProvider: ([Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)) -> [KoresTypeResolver](../../-kores-type-resolver/index.md)<*>): EitherObjBoolean<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)>  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresType/toArray/#kotlin.Int/PointingToDeclaration/"></a>[toArray](../../-kores-type/to-array.md)| <a name="com.github.jonathanxd.kores.type/KoresType/toArray/#kotlin.Int/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toArray](../../-kores-type/to-array.md)(dimensions: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [GenericType](../../-generic-type/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract/toString/#/PointingToDeclaration/"></a>[toString](../-abstract/to-string.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.Abstract/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](../-abstract/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/annotatedType/#/PointingToDeclaration/"></a>[annotatedType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FannotatedType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/annotatedType/#/PointingToDeclaration/"></a> [jvm] open override val [annotatedType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FannotatedType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)The type that is annotated with [annotations](../-abstract/annotations.md).   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/annotations/#/PointingToDeclaration/"></a>[annotations](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Fannotations%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/annotations/#/PointingToDeclaration/"></a> [jvm] open override val [annotations](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Fannotations%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Annotation](../../../com.github.jonathanxd.kores.base/-annotation/index.md)>Annotations of the type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/arrayBaseComponent/#/PointingToDeclaration/"></a>[arrayBaseComponent](array-base-component.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/arrayBaseComponent/#/PointingToDeclaration/"></a> [jvm] open override val [arrayBaseComponent](array-base-component.md): [KoresType](../../-kores-type/index.md)Array base component.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/arrayComponent/#/PointingToDeclaration/"></a>[arrayComponent](array-component.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/arrayComponent/#/PointingToDeclaration/"></a> [jvm] open override val [arrayComponent](array-component.md): [KoresType](../../-kores-type/index.md)Array component.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/arrayDimension/#/PointingToDeclaration/"></a>[arrayDimension](array-dimension.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/arrayDimension/#/PointingToDeclaration/"></a> [jvm] open override val [arrayDimension](array-dimension.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Array dimension, 0 if this type is not an array.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/binaryName/#/PointingToDeclaration/"></a>[binaryName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FbinaryName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/binaryName/#/PointingToDeclaration/"></a> [jvm] open override val [binaryName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FbinaryName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/bindedDefaultResolver/#/PointingToDeclaration/"></a>[bindedDefaultResolver](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FbindedDefaultResolver%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/bindedDefaultResolver/#/PointingToDeclaration/"></a> [jvm] open override val [bindedDefaultResolver](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FbindedDefaultResolver%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [BindedTypeResolver](../../-binded-type-resolver/index.md)<*>   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/bounds/#/PointingToDeclaration/"></a>[bounds](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Fbounds%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/bounds/#/PointingToDeclaration/"></a> [jvm] open override val [bounds](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Fbounds%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)<[GenericType.Bound](../../-generic-type/-bound/index.md)>Bounds of the generic type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/canonicalName/#/PointingToDeclaration/"></a>[canonicalName](canonical-name.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/canonicalName/#/PointingToDeclaration/"></a> [jvm] open override val [canonicalName](canonical-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Canonical nameQualified name:[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = java.lang.String.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/defaultResolver/#/PointingToDeclaration/"></a>[defaultResolver](default-resolver.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/defaultResolver/#/PointingToDeclaration/"></a> [jvm] open override val [defaultResolver](default-resolver.md): [KoresTypeResolver](../../-kores-type-resolver/index.md)<*>Default resolver.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/identification/#/PointingToDeclaration/"></a>[identification](identification.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/identification/#/PointingToDeclaration/"></a> [jvm] open override val [identification](identification.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Unique string identification, this property may be used for equality comparison, normal types, array types and generic types have different identifications, if a generic type represent a single [KoresType](../../-kores-type/index.md) without any bound, then the identification will be the same as the single [KoresType](../../-kores-type/index.md).   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/interfaces/#/PointingToDeclaration/"></a>[interfaces](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Finterfaces%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/interfaces/#/PointingToDeclaration/"></a> [jvm] open override val [interfaces](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Finterfaces%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)>   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/internalName/#/PointingToDeclaration/"></a>[internalName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FinternalName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/internalName/#/PointingToDeclaration/"></a> [jvm] open override val [internalName](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FinternalName%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isArray/#/PointingToDeclaration/"></a>[isArray](is-array.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isArray/#/PointingToDeclaration/"></a> [jvm] open override val [isArray](is-array.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this [KoresType](../../-kores-type/index.md) is an array type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isInterface/#/PointingToDeclaration/"></a>[isInterface](is-interface.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isInterface/#/PointingToDeclaration/"></a> [jvm] open override val [isInterface](is-interface.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this [KoresType](../../-kores-type/index.md) is a interface type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isPrimitive/#/PointingToDeclaration/"></a>[isPrimitive](is-primitive.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isPrimitive/#/PointingToDeclaration/"></a> [jvm] open override val [isPrimitive](is-primitive.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this [KoresType](../../-kores-type/index.md) is a primitive type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isType/#/PointingToDeclaration/"></a>[isType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FisType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isType/#/PointingToDeclaration/"></a> [jvm] open override val [isType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FisType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this is a Type generic type, false if is a Type Variable generic type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isVirtual/#/PointingToDeclaration/"></a>[isVirtual](is-virtual.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isVirtual/#/PointingToDeclaration/"></a> [jvm] open override val [isVirtual](is-virtual.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if is a Virtual Type (Virtual Types = Types that were not loaded by JVM)   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isWildcard/#/PointingToDeclaration/"></a>[isWildcard](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FisWildcard%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/isWildcard/#/PointingToDeclaration/"></a> [jvm] open override val [isWildcard](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FisWildcard%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)True if this is a wildcard generic type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/javaSpecName/#/PointingToDeclaration/"></a>[javaSpecName](java-spec-name.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/javaSpecName/#/PointingToDeclaration/"></a> [jvm] open override val [javaSpecName](java-spec-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)JVM Spec class name.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/name/#/PointingToDeclaration/"></a> [jvm] open override val [name](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Name of the generic type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/packageName/#/PointingToDeclaration/"></a>[packageName](package-name.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/packageName/#/PointingToDeclaration/"></a> [jvm] open override val [packageName](package-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Package name   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/primitiveType/#/PointingToDeclaration/"></a>[primitiveType](primitive-type.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/primitiveType/#/PointingToDeclaration/"></a> [jvm] open override val [primitiveType](primitive-type.md): [KoresType](../../-kores-type/index.md)?Only determine the Primitive type if:isKoresType && bounds.isEmptyBecauseInteger<T> is invalid and List<T> has no primitive types because List is not a wrapper type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/resolvedType/#/PointingToDeclaration/"></a>[resolvedType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FresolvedType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/resolvedType/#/PointingToDeclaration/"></a> [jvm] open override val [resolvedType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FresolvedType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [KoresType](../../-kores-type/index.md)Resolved code type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/simpleName/#/PointingToDeclaration/"></a>[simpleName](simple-name.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/simpleName/#/PointingToDeclaration/"></a> [jvm] open override val [simpleName](simple-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Simple name.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/superType/#/PointingToDeclaration/"></a>[superType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FsuperType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/superType/#/PointingToDeclaration/"></a> [jvm] open override val [superType](index.md#%5Bcom.github.jonathanxd.kores.type%2FAnnotatedKoresType.GenericAnnotatedKoresType%2FsuperType%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-1211764316): [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)?   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/type/#/PointingToDeclaration/"></a>[type](type.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/type/#/PointingToDeclaration/"></a> [jvm] open override val [type](type.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Type name, examples:[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = java.lang.String.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/wrapped/#/PointingToDeclaration/"></a>[wrapped](wrapped.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/wrapped/#/PointingToDeclaration/"></a> [jvm] open override val [wrapped](wrapped.md): [KoresType](../../-kores-type/index.md)Wrapped code type.   <br>
| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/wrapperType/#/PointingToDeclaration/"></a>[wrapperType](wrapper-type.md)| <a name="com.github.jonathanxd.kores.type/AnnotatedKoresType.GenericAnnotatedKoresType/wrapperType/#/PointingToDeclaration/"></a> [jvm] open override val [wrapperType](wrapper-type.md): [KoresType](../../-kores-type/index.md)?Only determine the Wrapper type if:isKoresType && bounds.isEmptyBecause int<T> is invalid.   <br>

