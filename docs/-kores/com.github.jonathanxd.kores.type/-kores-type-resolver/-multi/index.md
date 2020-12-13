//[Kores](../../../index.md)/[com.github.jonathanxd.kores.type](../../index.md)/[KoresTypeResolver](../index.md)/[Multi](index.md)



# Multi  
 [jvm] class [Multi](index.md)<[T](index.md)> : [KoresTypeResolver](../index.md)<[T](index.md)?> 

This is a resolver which support multiple resolvers. This resolver always returns first **valid resolved value** for each operation.



A valid resolved value depends on operations, see documentation.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/Multi/#/PointingToDeclaration/"></a>[Multi](-multi.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/Multi/#/PointingToDeclaration/"></a> [jvm] fun [Multi](-multi.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/addResolver/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[addResolver](add-resolver.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/addResolver/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [addResolver](add-resolver.md)(resolver: [KoresTypeResolver](../index.md)<[T](index.md)?>)  <br>More info  <br>Adds a resolver  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator fun [equals](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/getInterfaces/#java.lang.reflect.Type/PointingToDeclaration/"></a>[getInterfaces](get-interfaces.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/getInterfaces/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [getInterfaces](get-interfaces.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): Either<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)>>  <br>More info  <br>First bigger list is returned.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/getSuperclass/#java.lang.reflect.Type/PointingToDeclaration/"></a>[getSuperclass](get-superclass.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/getSuperclass/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [getSuperclass](get-superclass.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): Either<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)?>  <br>More info  <br>First non-null and [non-nothing](../../../com.github.jonathanxd.kores.common/index.md#%5Bcom.github.jonathanxd.kores.common%2FKoresNothing%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F-427383591) value is returned, or null if no valid value was found.  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [hashCode](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/isAssignableFrom/#java.lang.reflect.Type#java.lang.reflect.Type/PointingToDeclaration/"></a>[isAssignableFrom](../is-assignable-from.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/isAssignableFrom/#java.lang.reflect.Type#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [isAssignableFrom](../is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), from: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): EitherObjBoolean<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)>  <br>More info  <br>Checks if type is assignable from from using default resolvers.  <br><br><br>[jvm]  <br>Content  <br>open override fun [isAssignableFrom](is-assignable-from.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), from: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), resolverProvider: ([Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)) -> [KoresTypeResolver](../index.md)<*>): EitherObjBoolean<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html)>  <br>More info  <br>Returns true if any resolver returns true for this operation.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/minusAssign/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[minusAssign](minus-assign.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/minusAssign/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [minusAssign](minus-assign.md)(resolver: [KoresTypeResolver](../index.md)<[T](index.md)?>)  <br>More info  <br>Removes a resolver  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/plusAssign/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[plusAssign](plus-assign.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/plusAssign/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [plusAssign](plus-assign.md)(resolver: [KoresTypeResolver](../index.md)<[T](index.md)?>)  <br>More info  <br>Adds a resolver  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/removeResolver/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[removeResolver](remove-resolver.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/removeResolver/#com.github.jonathanxd.kores.type.KoresTypeResolver[TypeParam(bounds=[kotlin.Any?])?]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [removeResolver](remove-resolver.md)(resolver: [KoresTypeResolver](../index.md)<[T](index.md)?>)  <br>More info  <br>Removes a resolver  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/resolve/#java.lang.reflect.Type/PointingToDeclaration/"></a>[resolve](resolve.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/resolve/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [resolve](resolve.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): Either<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), out [T](index.md)?>  <br>More info  <br>First non-null and [non-nothing](../../../com.github.jonathanxd.kores.common/index.md#%5Bcom.github.jonathanxd.kores.common%2FKoresNothing%2F%2F%2FPointingToDeclaration%2F%5D%2FClasslikes%2F-427383591) value is returned, or null if no valid value was found.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/resolveConstructors/#java.lang.reflect.Type/PointingToDeclaration/"></a>[resolveConstructors](../resolve-constructors.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/resolveConstructors/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [resolveConstructors](../resolve-constructors.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): Either<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[ConstructorDeclaration](../../../com.github.jonathanxd.kores.base/-constructor-declaration/index.md)>>  <br>More info  <br>Resolves or create a list of all [ConstructorDeclaration](../../../com.github.jonathanxd.kores.base/-constructor-declaration/index.md) present in type.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/resolveFields/#java.lang.reflect.Type/PointingToDeclaration/"></a>[resolveFields](../resolve-fields.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/resolveFields/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [resolveFields](../resolve-fields.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): Either<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[FieldDeclaration](../../../com.github.jonathanxd.kores.base/-field-declaration/index.md)>>  <br>More info  <br>Resolves or create a list of all [FieldDeclaration](../../../com.github.jonathanxd.kores.base/-field-declaration/index.md) present in type.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/resolveMethods/#java.lang.reflect.Type/PointingToDeclaration/"></a>[resolveMethods](../resolve-methods.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver/resolveMethods/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [resolveMethods](../resolve-methods.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): Either<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[MethodDeclaration](../../../com.github.jonathanxd.kores.base/-method-declaration/index.md)>>  <br>More info  <br>Resolves or create a list of all [MethodDeclaration](../../../com.github.jonathanxd.kores.base/-method-declaration/index.md) present in type.  <br><br><br>
| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/resolveTypeDeclaration/#java.lang.reflect.Type/PointingToDeclaration/"></a>[resolveTypeDeclaration](resolve-type-declaration.md)| <a name="com.github.jonathanxd.kores.type/KoresTypeResolver.Multi/resolveTypeDeclaration/#java.lang.reflect.Type/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [resolveTypeDeclaration](resolve-type-declaration.md)(type: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)): Either<[Exception](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-exception/index.html), [TypeDeclaration](../../../com.github.jonathanxd.kores.base/-type-declaration/index.md)>  <br>More info  <br>Resolves or create [TypeDeclaration](../../../com.github.jonathanxd.kores.base/-type-declaration/index.md) from type structure and elements.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open fun [toString](../../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
