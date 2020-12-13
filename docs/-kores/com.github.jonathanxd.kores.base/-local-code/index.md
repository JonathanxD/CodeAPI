//[Kores](../../index.md)/[com.github.jonathanxd.kores.base](../index.md)/[LocalCode](index.md)



# LocalCode  
 [jvm] data class [LocalCode](index.md)(**declaringType**: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), **invokeType**: [InvokeType](../-invoke-type/index.md), **declaration**: [MethodDeclaration](../-method-declaration/index.md), **innerTypes**: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TypeDeclaration](../-type-declaration/index.md)>) : [KoresElement](../../com.github.jonathanxd.kores/-kores-element/index.md), [KoresPart](../../com.github.jonathanxd.kores/-kores-part/index.md), [Instruction](../../com.github.jonathanxd.kores/-instruction/index.md), [InnerTypesHolder](../-inner-types-holder/index.md)

A local code (or local method). This code may be inlined or declared as method of current type or translated to a lambda (for [InvokeDynamic.LambdaLocalCode](../-invoke-dynamic/-lambda-local-code/index.md)).

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/LocalCode/LocalCode/#com.github.jonathanxd.kores.type.KoresType#com.github.jonathanxd.kores.base.MethodDeclaration#kotlin.collections.List[com.github.jonathanxd.kores.base.TypeDeclaration]/PointingToDeclaration/"></a>[LocalCode](-local-code.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/LocalCode/#com.github.jonathanxd.kores.type.KoresType#com.github.jonathanxd.kores.base.MethodDeclaration#kotlin.collections.List[com.github.jonathanxd.kores.base.TypeDeclaration]/PointingToDeclaration/"></a> [jvm] fun [LocalCode](-local-code.md)(declaringType: [KoresType](../../com.github.jonathanxd.kores.type/-kores-type/index.md), declaration: [MethodDeclaration](../-method-declaration/index.md), innerTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TypeDeclaration](../-type-declaration/index.md)>)Local code execution constructor, this constructor resolves [invokeType](invoke-type.md) based on [declaration](declaration.md) and [declaringType](declaring-type.md).   <br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/LocalCode/#java.lang.reflect.Type#com.github.jonathanxd.kores.base.InvokeType#com.github.jonathanxd.kores.base.MethodDeclaration#kotlin.collections.List[com.github.jonathanxd.kores.base.TypeDeclaration]/PointingToDeclaration/"></a>[LocalCode](-local-code.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/LocalCode/#java.lang.reflect.Type#com.github.jonathanxd.kores.base.InvokeType#com.github.jonathanxd.kores.base.MethodDeclaration#kotlin.collections.List[com.github.jonathanxd.kores.base.TypeDeclaration]/PointingToDeclaration/"></a> [jvm] fun [LocalCode](-local-code.md)(declaringType: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), invokeType: [InvokeType](../-invoke-type/index.md), declaration: [MethodDeclaration](../-method-declaration/index.md), innerTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TypeDeclaration](../-type-declaration/index.md)>)   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/LocalCode.Builder///PointingToDeclaration/"></a>[Builder](-builder/index.md)| <a name="com.github.jonathanxd.kores.base/LocalCode.Builder///PointingToDeclaration/"></a>[jvm]  <br>Content  <br>class [Builder](-builder/index.md) : [Builder](../../com.github.jonathanxd.kores.builder/-builder/index.md)<[LocalCode](index.md), [LocalCode.Builder](-builder/index.md)> , [InnerTypesHolder.Builder](../-inner-types-holder/-builder/index.md)<[LocalCode](index.md), [LocalCode.Builder](-builder/index.md)>   <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/LocalCode/builder/#/PointingToDeclaration/"></a>[builder](builder.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/builder/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [builder](builder.md)(): [LocalCode.Builder](-builder/index.md)  <br>More info  <br>This builder may or may not accept null values, it depends on implementation.  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/component1/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [component1](component1.md)(): [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/component2/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [component2](component2.md)(): [InvokeType](../-invoke-type/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/component3/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [component3](component3.md)(): [MethodDeclaration](../-method-declaration/index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/component4/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>operator fun [component4](component4.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TypeDeclaration](../-type-declaration/index.md)>  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/copy/#java.lang.reflect.Type#com.github.jonathanxd.kores.base.InvokeType#com.github.jonathanxd.kores.base.MethodDeclaration#kotlin.collections.List[com.github.jonathanxd.kores.base.TypeDeclaration]/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/copy/#java.lang.reflect.Type#com.github.jonathanxd.kores.base.InvokeType#com.github.jonathanxd.kores.base.MethodDeclaration#kotlin.collections.List[com.github.jonathanxd.kores.base.TypeDeclaration]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [copy](copy.md)(declaringType: [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html), invokeType: [InvokeType](../-invoke-type/index.md), declaration: [MethodDeclaration](../-method-declaration/index.md), innerTypes: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TypeDeclaration](../-type-declaration/index.md)>): [LocalCode](index.md)  <br><br><br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/createInvocation/#kotlin.collections.List[com.github.jonathanxd.kores.Instruction]/PointingToDeclaration/"></a>[createInvocation](create-invocation.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/createInvocation/#kotlin.collections.List[com.github.jonathanxd.kores.Instruction]/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>fun [createInvocation](create-invocation.md)(arguments: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Instruction](../../com.github.jonathanxd.kores/-instruction/index.md)>): [MethodInvocation](../-method-invocation/index.md)  <br>More info  <br>Creates a invocation of this [LocalCode](index.md) with arguments.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open operator override fun [equals](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [hashCode](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[jvm]  <br>Content  <br>open override fun [toString](../../com.github.jonathanxd.kores.util/-simple-resolver/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F-427383591)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| <a name="com.github.jonathanxd.kores.base/LocalCode/body/#/PointingToDeclaration/"></a>[body](body.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/body/#/PointingToDeclaration/"></a> [jvm] val [body](body.md): [Instructions](../../com.github.jonathanxd.kores/-instructions/index.md)Method body   <br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/declaration/#/PointingToDeclaration/"></a>[declaration](declaration.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/declaration/#/PointingToDeclaration/"></a> [jvm] val [declaration](declaration.md): [MethodDeclaration](../-method-declaration/index.md)Method declaration of the code.   <br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/declaringType/#/PointingToDeclaration/"></a>[declaringType](declaring-type.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/declaringType/#/PointingToDeclaration/"></a> [jvm] val [declaringType](declaring-type.md): [Type](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Type.html)Declaring type of [declaration](declaration.md) ([Alias](../-alias/index.md) is supported)   <br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/description/#/PointingToDeclaration/"></a>[description](description.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/description/#/PointingToDeclaration/"></a> [jvm] val [description](description.md): [TypeSpec](../-type-spec/index.md)Method description   <br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/innerTypes/#/PointingToDeclaration/"></a>[innerTypes](inner-types.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/innerTypes/#/PointingToDeclaration/"></a> [jvm] open override val [innerTypes](inner-types.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[TypeDeclaration](../-type-declaration/index.md)>Inner types   <br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/invokeType/#/PointingToDeclaration/"></a>[invokeType](invoke-type.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/invokeType/#/PointingToDeclaration/"></a> [jvm] val [invokeType](invoke-type.md): [InvokeType](../-invoke-type/index.md)Invocation type (static, virtual or interface) this depends on where [declaration](declaration.md) is declared and which are the modifiers, if [declaration](declaration.md) is a instance method and declared in an interface, this must be [InvokeType.INVOKE_INTERFACE](../-invoke-type/-i-n-v-o-k-e_-i-n-t-e-r-f-a-c-e/index.md), if [declaration](declaration.md) is static, this must be [InvokeType.INVOKE_STATIC](../-invoke-type/-i-n-v-o-k-e_-s-t-a-t-i-c/index.md) does not matter if is declared in an interface or a class, if is not static and is declared in a class, this must be [InvokeType.INVOKE_VIRTUAL](../-invoke-type/-i-n-v-o-k-e_-v-i-r-t-u-a-l/index.md).   <br>
| <a name="com.github.jonathanxd.kores.base/LocalCode/parameters/#/PointingToDeclaration/"></a>[parameters](parameters.md)| <a name="com.github.jonathanxd.kores.base/LocalCode/parameters/#/PointingToDeclaration/"></a> [jvm] val [parameters](parameters.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[KoresParameter](../-kores-parameter/index.md)>Parameters   <br>
