

### All Types

| Name | Summary |
|---|---|
| [com.github.jonathanxd.codeapi.base.Access](../com.github.jonathanxd.codeapi.base/-access/index.md) | Access to a scope. Example, access to static scope of [String](#). |
| [com.github.jonathanxd.codeapi.base.Accessor](../com.github.jonathanxd.codeapi.base/-accessor/index.md) | Accessor of an element. Example: field access/definition, method invocation
and executable code. |
| [com.github.jonathanxd.codeapi.util.Alias](../com.github.jonathanxd.codeapi.util/-alias/index.md) | Aliases, only use alias in supported contexts. |
| [com.github.jonathanxd.codeapi.base.Annotable](../com.github.jonathanxd.codeapi.base/-annotable/index.md) | An part that hold annotations. |
| [com.github.jonathanxd.codeapi.base.Annotation](../com.github.jonathanxd.codeapi.base/-annotation/index.md) | An annotation, an annotation is composed by a pair of property name and property value. |
| [com.github.jonathanxd.codeapi.base.AnnotationDeclaration](../com.github.jonathanxd.codeapi.base/-annotation-declaration/index.md) | Annotation declaration. |
| [com.github.jonathanxd.codeapi.base.AnnotationProperty](../com.github.jonathanxd.codeapi.base/-annotation-property/index.md) | Annotation property, this is part of [AnnotationDeclaration](../com.github.jonathanxd.codeapi.base/-annotation-declaration/index.md). |
| [com.github.jonathanxd.codeapi.base.AnonymousClass](../com.github.jonathanxd.codeapi.base/-anonymous-class/index.md) | Anonymous class, in Bytecode, anonymous class can have implementations,
in other languages it depends on specification. (Official Java generator may comment implementations). |
| [kotlin.Any](../com.github.jonathanxd.codeapi.util/kotlin.-any/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [kotlin.Any](../com.github.jonathanxd.codeapi.util.conversion/kotlin.-any/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.ArgumentHolder](../com.github.jonathanxd.codeapi.base/-argument-holder/index.md) | Hold arguments. |
| [kotlin.Array](../com.github.jonathanxd.codeapi.util/kotlin.-array/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [com.github.jonathanxd.codeapi.base.ArrayAccess](../com.github.jonathanxd.codeapi.base/-array-access/index.md) | Access to an array. |
| [com.github.jonathanxd.codeapi.ArrayCodeSource](../com.github.jonathanxd.codeapi/-array-code-source/index.md) | CodeSource is an iterable of [CodeInstructions](../com.github.jonathanxd.codeapi/-code-instruction.md). |
| [com.github.jonathanxd.codeapi.base.ArrayConstructor](../com.github.jonathanxd.codeapi.base/-array-constructor/index.md) | Constructs an array of type [arrayType](../com.github.jonathanxd.codeapi.base/-array-constructor/array-type.md) with dimensions [dimensions](../com.github.jonathanxd.codeapi.base/-array-constructor/dimensions.md). Example: |
| [com.github.jonathanxd.codeapi.base.ArrayLength](../com.github.jonathanxd.codeapi.base/-array-length/index.md) | Access length of array [target](../com.github.jonathanxd.codeapi.base/-array-length/target.md) of type [arrayType](../com.github.jonathanxd.codeapi.base/-array-length/array-type.md). |
| [com.github.jonathanxd.codeapi.base.ArrayLoad](../com.github.jonathanxd.codeapi.base/-array-load/index.md) | Loads a value of type [valueType](../com.github.jonathanxd.codeapi.base/-array-load/value-type.md) at [index](../com.github.jonathanxd.codeapi.base/-array-load/--index--.md) from array [target](../com.github.jonathanxd.codeapi.base/-array-load/target.md) of type [arrayType](../com.github.jonathanxd.codeapi.base/-array-load/array-type.md). |
| [com.github.jonathanxd.codeapi.base.ArrayStore](../com.github.jonathanxd.codeapi.base/-array-store/index.md) | Stores [value](../com.github.jonathanxd.codeapi.base/-array-store/value-to-store.md) of type [valueType](../com.github.jonathanxd.codeapi.base/-array-store/value-type.md) in array [target](../com.github.jonathanxd.codeapi.base/-array-store/target.md) of type [arrayType](../com.github.jonathanxd.codeapi.base/-array-store/array-type.md) at [index](../com.github.jonathanxd.codeapi.base/-array-store/--index--.md). |
| [com.github.jonathanxd.codeapi.base.BodyHolder](../com.github.jonathanxd.codeapi.base/-body-holder/index.md) | Holds a body. Example: method declarations, type declarations, static block, constructors... |
| [com.github.jonathanxd.codeapi.builder.Builder](../com.github.jonathanxd.codeapi.builder/-builder/index.md) | Builder pattern. |
| [com.github.jonathanxd.codeapi.base.Case](../com.github.jonathanxd.codeapi.base/-case/index.md) | Case statement of [SwitchStatement](../com.github.jonathanxd.codeapi.base/-switch-statement/index.md). |
| [com.github.jonathanxd.codeapi.base.Cast](../com.github.jonathanxd.codeapi.base/-cast/index.md) | Value cast. Cast [castedPart](../com.github.jonathanxd.codeapi.base/-cast/casted-part.md) of type [originalType](../com.github.jonathanxd.codeapi.base/-cast/original-type.md) (null if unknown) to [targetType](../com.github.jonathanxd.codeapi.base/-cast/target-type.md). Official
BytecodeGenerator uses the [originalType](../com.github.jonathanxd.codeapi.base/-cast/original-type.md) to auto-box and auto-unbox the value. |
| [com.github.jonathanxd.codeapi.base.CatchStatement](../com.github.jonathanxd.codeapi.base/-catch-statement/index.md) | Catch statement of a try block. Catch [exceptionTypes](../com.github.jonathanxd.codeapi.base/-catch-statement/exception-types.md) and store caught exception in [variable](../com.github.jonathanxd.codeapi.base/-catch-statement/variable.md). |
| [java.lang.Class](../com.github.jonathanxd.codeapi.util/java.lang.-class/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [java.lang.Class](../com.github.jonathanxd.codeapi.util.conversion/java.lang.-class/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.ClassDeclaration](../com.github.jonathanxd.codeapi.base/-class-declaration/index.md) | Declaration of a class. |
| [com.github.jonathanxd.codeapi.base.comment.Code](../com.github.jonathanxd.codeapi.base.comment/-code/index.md) | Code comment |
| [com.github.jonathanxd.codeapi.CodeAPI](../com.github.jonathanxd.codeapi/-code-a-p-i/index.md) | CodeAPI-Base is the base module of CodeAPI which contains base classes of CodeAPI. |
| [com.github.jonathanxd.codeapi.base.CodeAnnotation](../com.github.jonathanxd.codeapi.base/-code-annotation.md) |  |
| [com.github.jonathanxd.codeapi.CodeElement](../com.github.jonathanxd.codeapi/-code-element.md) | Code elements like Field, Methods and static block. |
| [com.github.jonathanxd.codeapi.CodeInstruction](../com.github.jonathanxd.codeapi/-code-instruction.md) | A source instruction. |
| [com.github.jonathanxd.codeapi.base.CodeModifier](../com.github.jonathanxd.codeapi.base/-code-modifier/index.md) | Modifiers enum. |
| [com.github.jonathanxd.codeapi.base.CodeParameter](../com.github.jonathanxd.codeapi.base/-code-parameter/index.md) | Parameter part. |
| [com.github.jonathanxd.codeapi.CodePart](../com.github.jonathanxd.codeapi/-code-part/index.md) | A CodePart is an element that can exists in the source code. |
| [com.github.jonathanxd.codeapi.processor.CodeProcessor](../com.github.jonathanxd.codeapi.processor/-code-processor/index.md) | CodeProcessor transforms [Any](#) into [R](#). |
| [com.github.jonathanxd.codeapi.CodeSource](../com.github.jonathanxd.codeapi/-code-source/index.md) | Abstract [CodeInstruction](../com.github.jonathanxd.codeapi/-code-instruction.md) iterable. |
| [com.github.jonathanxd.codeapi.CodeSourceView](../com.github.jonathanxd.codeapi/-code-source-view/index.md) |  |
| [com.github.jonathanxd.codeapi.type.CodeType](../com.github.jonathanxd.codeapi.type/-code-type/index.md) | A type representation, like: |
| [com.github.jonathanxd.codeapi.type.CodeTypeResolver](../com.github.jonathanxd.codeapi.type/-code-type-resolver/index.md) | Type resolver |
| [com.github.jonathanxd.codeapi.util.CodeTypeResolver](../com.github.jonathanxd.codeapi.util/-code-type-resolver/index.md) |  |
| [com.github.jonathanxd.codeapi.processor.CodeValidator](../com.github.jonathanxd.codeapi.processor/-code-validator/index.md) | Validation and Validation manager. Validates and manage custom validators. |
| [com.github.jonathanxd.codeapi.base.comment.Comment](../com.github.jonathanxd.codeapi.base.comment/-comment/index.md) | Comment |
| [com.github.jonathanxd.codeapi.base.comment.CommentHolder](../com.github.jonathanxd.codeapi.base.comment/-comment-holder/index.md) | Hold comments and documentation. |
| [com.github.jonathanxd.codeapi.base.comment.Comments](../com.github.jonathanxd.codeapi.base.comment/-comments/index.md) | Hold a list of comments. |
| [com.github.jonathanxd.codeapi.base.Concat](../com.github.jonathanxd.codeapi.base/-concat/index.md) | String concatenation. The result depends on generator, in official BytecodeGenerator a [StringBuilder](http://docs.oracle.com/javase/6/docs/api/java/lang/StringBuilder.html) will be
used to concat values (in a future patch it will be changed to use Java 9 dynamic concatenation), in official
JavaSourceGenerator this will be translated into string concatenation. |
| [com.github.jonathanxd.codeapi.helper.ConcatHelper](../com.github.jonathanxd.codeapi.helper/-concat-helper/index.md) | Concatenation helper. |
| [java.lang.reflect.Constructor](../com.github.jonathanxd.codeapi.util.conversion/java.lang.reflect.-constructor/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.ConstructorDeclaration](../com.github.jonathanxd.codeapi.base/-constructor-declaration/index.md) | Instance constructor declaration. |
| [com.github.jonathanxd.codeapi.processor.ContextedValidationMessage](../com.github.jonathanxd.codeapi.processor/-contexted-validation-message/index.md) | Validation message with a [context](../com.github.jonathanxd.codeapi.processor/-contexted-validation-message/context.md). |
| [com.github.jonathanxd.codeapi.base.ControlFlow](../com.github.jonathanxd.codeapi.base/-control-flow/index.md) | Control the flow of a statement. |
| [com.github.jonathanxd.codeapi.Defaults](../com.github.jonathanxd.codeapi/-defaults/index.md) | Common default constant base values |
| [com.github.jonathanxd.codeapi.util.DescriptionHelper](../com.github.jonathanxd.codeapi.util/-description-helper/index.md) | Description utilities |
| [com.github.jonathanxd.codeapi.base.ElementsHolder](../com.github.jonathanxd.codeapi.base/-elements-holder/index.md) |  |
| [com.github.jonathanxd.codeapi.base.EntryHolder](../com.github.jonathanxd.codeapi.base/-entry-holder/index.md) | Enum entry holder |
| [com.github.jonathanxd.codeapi.base.EnumDeclaration](../com.github.jonathanxd.codeapi.base/-enum-declaration/index.md) | Enum declaration. |
| [com.github.jonathanxd.codeapi.base.EnumEntry](../com.github.jonathanxd.codeapi.base/-enum-entry/index.md) | Enumeration entry. |
| [com.github.jonathanxd.codeapi.util.EnumTypeUtil](../com.github.jonathanxd.codeapi.util/-enum-type-util/index.md) | Enum type utility |
| [com.github.jonathanxd.codeapi.base.EnumValue](../com.github.jonathanxd.codeapi.base/-enum-value/index.md) | Enum value. |
| [java.lang.reflect.Executable](../com.github.jonathanxd.codeapi.util.conversion/java.lang.reflect.-executable/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [javax.lang.model.element.ExecutableElement](../com.github.jonathanxd.codeapi.util.conversion/javax.lang.model.element.-executable-element/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.Export](../com.github.jonathanxd.codeapi.base/-export/index.md) | Exports [module](../com.github.jonathanxd.codeapi.base/-export/module.md) to modules [to](../com.github.jonathanxd.codeapi.base/-export/to.md). |
| [java.lang.reflect.Field](../com.github.jonathanxd.codeapi.util.conversion/java.lang.reflect.-field/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.FieldAccess](../com.github.jonathanxd.codeapi.base/-field-access/index.md) | Access a field of type [type](../com.github.jonathanxd.codeapi.base/-field-access/type.md), name [name](../com.github.jonathanxd.codeapi.base/-field-access/name.md) in type [localization](../com.github.jonathanxd.codeapi.base/-field-access/localization.md) using [target](../com.github.jonathanxd.codeapi.base/-field-access/target.md) as instance (Use a [Access.Type.STATIC](#) to
static accesses). |
| [com.github.jonathanxd.codeapi.base.FieldBase](../com.github.jonathanxd.codeapi.base/-field-base/index.md) | Base field (access and definition common class) |
| [com.github.jonathanxd.codeapi.base.FieldDeclaration](../com.github.jonathanxd.codeapi.base/-field-declaration/index.md) | Declaration of a field. |
| [com.github.jonathanxd.codeapi.base.FieldDefinition](../com.github.jonathanxd.codeapi.base/-field-definition/index.md) | Defines the value of a field of type [type](../com.github.jonathanxd.codeapi.base/-field-definition/type.md), name [name](../com.github.jonathanxd.codeapi.base/-field-definition/name.md) in type [localization](../com.github.jonathanxd.codeapi.base/-field-definition/localization.md) to [value](../com.github.jonathanxd.codeapi.base/-field-definition/value.md), and use [target](../com.github.jonathanxd.codeapi.base/-field-definition/target.md) as instance to access
([Access.Type.STATIC](#) for static accesses). |
| [com.github.jonathanxd.codeapi.common.FieldRef](../com.github.jonathanxd.codeapi.common/-field-ref/index.md) | Field reference, this class must never appear in CodeSource. |
| [com.github.jonathanxd.codeapi.base.ForEachStatement](../com.github.jonathanxd.codeapi.base/-for-each-statement/index.md) | For each statement. |
| [com.github.jonathanxd.codeapi.base.ForStatement](../com.github.jonathanxd.codeapi.base/-for-statement/index.md) | For statement. |
| [com.github.jonathanxd.codeapi.type.Generic](../com.github.jonathanxd.codeapi.type/-generic/index.md) | A generic type. |
| [com.github.jonathanxd.codeapi.generic.GenericSignature](../com.github.jonathanxd.codeapi.generic/-generic-signature/index.md) | Hold information about generic signatures. |
| [com.github.jonathanxd.codeapi.base.GenericSignatureHolder](../com.github.jonathanxd.codeapi.base/-generic-signature-holder/index.md) | An element that supports [GenericSignature](../com.github.jonathanxd.codeapi.generic/-generic-signature/index.md). |
| [com.github.jonathanxd.codeapi.type.GenericType](../com.github.jonathanxd.codeapi.type/-generic-type/index.md) | Generic type. |
| [com.github.jonathanxd.codeapi.type.GenericTypeBuilder](../com.github.jonathanxd.codeapi.type/-generic-type-builder/index.md) | Builder of a [GenericType](../com.github.jonathanxd.codeapi.type/-generic-type/index.md). |
| [com.github.jonathanxd.codeapi.type.GenericTypeImpl](../com.github.jonathanxd.codeapi.type/-generic-type-impl/index.md) | Generic type implementation. |
| [com.github.jonathanxd.codeapi.util.GenericTypeVariable](../com.github.jonathanxd.codeapi.util/-generic-type-variable/index.md) | Wrapper of [CodeType](../com.github.jonathanxd.codeapi.type/-code-type/index.md) to [TypeVariable](http://docs.oracle.com/javase/6/docs/api/java/lang/reflect/TypeVariable.html). This class is a little complex and is not intended to be used by
external sources. |
| [com.github.jonathanxd.codeapi.base.IfExpr](../com.github.jonathanxd.codeapi.base/-if-expr/index.md) | Condition evaluation. |
| [com.github.jonathanxd.codeapi.helper.IfExpressionHelper](../com.github.jonathanxd.codeapi.helper/-if-expression-helper/index.md) | If expression helper. |
| [com.github.jonathanxd.codeapi.base.IfExpressionHolder](../com.github.jonathanxd.codeapi.base/-if-expression-holder/index.md) | A element that holds [IfExpressions](../com.github.jonathanxd.codeapi.base/-if-expr/index.md) and [Operations](../com.github.jonathanxd.codeapi.operator/-operators/index.md). |
| [com.github.jonathanxd.codeapi.base.IfGroup](../com.github.jonathanxd.codeapi.base/-if-group/index.md) | Group of if expressions. |
| [com.github.jonathanxd.codeapi.base.IfStatement](../com.github.jonathanxd.codeapi.base/-if-statement/index.md) | If statement. |
| [com.github.jonathanxd.codeapi.base.ImplementationHolder](../com.github.jonathanxd.codeapi.base/-implementation-holder/index.md) | An implementation holder |
| [com.github.jonathanxd.codeapi.type.InheritanceProvider](../com.github.jonathanxd.codeapi.type/-inheritance-provider/index.md) | Mixin interface, marks the element as a provider of superclass and superinterfaces for [CodeTypeResolvers](../com.github.jonathanxd.codeapi.type/-code-type-resolver/index.md). |
| [com.github.jonathanxd.codeapi.base.InnerTypesHolder](../com.github.jonathanxd.codeapi.base/-inner-types-holder/index.md) | A holder of inner types |
| [com.github.jonathanxd.codeapi.base.InstanceOfCheck](../com.github.jonathanxd.codeapi.base/-instance-of-check/index.md) | Checks if [part](../com.github.jonathanxd.codeapi.base/-instance-of-check/part.md) is `instanceof` [checkType](../com.github.jonathanxd.codeapi.base/-instance-of-check/check-type.md). |
| [com.github.jonathanxd.codeapi.base.InterfaceDeclaration](../com.github.jonathanxd.codeapi.base/-interface-declaration/index.md) | Interface declaration. |
| [com.github.jonathanxd.codeapi.util.Internal](../com.github.jonathanxd.codeapi.util/-internal/index.md) |  |
| [com.github.jonathanxd.codeapi.base.InvokeDynamic](../com.github.jonathanxd.codeapi.base/-invoke-dynamic/index.md) |  |
| [com.github.jonathanxd.codeapi.base.InvokeType](../com.github.jonathanxd.codeapi.base/-invoke-type/index.md) | Type of the invocation. In JVM, the invocation type depends on where the element is declared and
which modifiers it has. [INVOKE_VIRTUAL](../com.github.jonathanxd.codeapi.base/-invoke-type/-i-n-v-o-k-e_-v-i-r-t-u-a-l.md) is used to invoke instance methods in `class`es, [INVOKE_INTERFACE](../com.github.jonathanxd.codeapi.base/-invoke-type/-i-n-v-o-k-e_-i-n-t-e-r-f-a-c-e.md)
is used to invoke interface methods in `interface`s, a special opcode is required for methods declared
in `interface` because JVM needs to resolve the position of the method in the method table. [INVOKE_STATIC](../com.github.jonathanxd.codeapi.base/-invoke-type/-i-n-v-o-k-e_-s-t-a-t-i-c.md) is used
for invocation of static methods, does not matter where it is declared or if it is private. [INVOKE_SPECIAL](../com.github.jonathanxd.codeapi.base/-invoke-type/-i-n-v-o-k-e_-s-p-e-c-i-a-l.md) is used to invoke
constructors, super constructors and for private methods, for private methods,
[INVOKE_SPECIAL](../com.github.jonathanxd.codeapi.base/-invoke-type/-i-n-v-o-k-e_-s-p-e-c-i-a-l.md) is required because [INVOKE_VIRTUAL](../com.github.jonathanxd.codeapi.base/-invoke-type/-i-n-v-o-k-e_-v-i-r-t-u-a-l.md) will always call the method of `current class`, which
is bad for private methods, because class inheritance can hide the private method and can cause a unexpected
behavior. |
| [kotlin.collections.Iterable](../com.github.jonathanxd.codeapi.util.conversion/kotlin.collections.-iterable/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.IterationType](../com.github.jonathanxd.codeapi.base/-iteration-type/index.md) | Iteration type used to generate bytecode and source code iterations. |
| [com.github.jonathanxd.codeapi.type.JavaType](../com.github.jonathanxd.codeapi.type/-java-type/index.md) | Java class [CodeType](../com.github.jonathanxd.codeapi.type/-code-type/index.md). |
| [kotlin.reflect.KClass](../com.github.jonathanxd.codeapi.util/kotlin.reflect.-k-class/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [kotlin.reflect.KParameter](../com.github.jonathanxd.codeapi.util.conversion/kotlin.reflect.-k-parameter/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.Label](../com.github.jonathanxd.codeapi.base/-label/index.md) | Label. |
| [com.github.jonathanxd.codeapi.base.comment.Link](../com.github.jonathanxd.codeapi.base.comment/-link/index.md) | Link comment: comment linking to an element or a url |
| [kotlin.collections.List](../com.github.jonathanxd.codeapi.processor/kotlin.collections.-list/index.md) (extensions in package com.github.jonathanxd.codeapi.processor) |  |
| [kotlin.collections.List](../com.github.jonathanxd.codeapi.util/kotlin.collections.-list/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [kotlin.collections.List](../com.github.jonathanxd.codeapi.util.conversion/kotlin.collections.-list/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.ListCodeSource](../com.github.jonathanxd.codeapi/-list-code-source/index.md) | A [MutableCodeSource](../com.github.jonathanxd.codeapi/-mutable-code-source/index.md) backing to a [ArrayList](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html). |
| [com.github.jonathanxd.codeapi.literal.Literal](../com.github.jonathanxd.codeapi.literal/-literal/index.md) | A JVM Literal. |
| [com.github.jonathanxd.codeapi.literal.Literals](../com.github.jonathanxd.codeapi.literal/-literals/index.md) | [Literals](../com.github.jonathanxd.codeapi.literal/-literal/index.md) constants. |
| [com.github.jonathanxd.codeapi.type.LoadedCodeType](../com.github.jonathanxd.codeapi.type/-loaded-code-type/index.md) | A [CodeType](../com.github.jonathanxd.codeapi.type/-code-type/index.md) backing to a loaded [Class](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html) ([loadedType](../com.github.jonathanxd.codeapi.type/-loaded-code-type/loaded-type.md)). |
| [com.github.jonathanxd.codeapi.base.LocalCode](../com.github.jonathanxd.codeapi.base/-local-code/index.md) | A local code (or local method). This code may be inlined or declared as method of current
type or translated to a lambda (for [InvokeDynamic.LambdaLocalCode](../com.github.jonathanxd.codeapi.base/-invoke-dynamic/-lambda-local-code/index.md)). |
| [com.github.jonathanxd.codeapi.util.Location](../com.github.jonathanxd.codeapi.util/-location/index.md) | Location to insert element. |
| [java.lang.reflect.Method](../com.github.jonathanxd.codeapi.util.conversion/java.lang.reflect.-method/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.MethodDeclaration](../com.github.jonathanxd.codeapi.base/-method-declaration/index.md) | Method declaration |
| [com.github.jonathanxd.codeapi.base.MethodDeclarationBase](../com.github.jonathanxd.codeapi.base/-method-declaration-base/index.md) | Method declaration |
| [com.github.jonathanxd.codeapi.base.MethodInvocation](../com.github.jonathanxd.codeapi.base/-method-invocation/index.md) | Invokes a method. |
| [com.github.jonathanxd.codeapi.common.MethodInvokeSpec](../com.github.jonathanxd.codeapi.common/-method-invoke-spec/index.md) |  |
| [com.github.jonathanxd.codeapi.common.MethodTypeSpec](../com.github.jonathanxd.codeapi.common/-method-type-spec/index.md) |  |
| [com.github.jonathanxd.codeapi.base.ModifierType](../com.github.jonathanxd.codeapi.base/-modifier-type/index.md) | Modifier type enum. |
| [com.github.jonathanxd.codeapi.base.ModifiersHolder](../com.github.jonathanxd.codeapi.base/-modifiers-holder/index.md) | A element that have modifiers. |
| [com.github.jonathanxd.codeapi.base.ModuleDeclaration](../com.github.jonathanxd.codeapi.base/-module-declaration/index.md) | Declaration of a module. |
| [com.github.jonathanxd.codeapi.base.ModuleReference](../com.github.jonathanxd.codeapi.base/-module-reference/index.md) | Reference to a module. |
| [com.github.jonathanxd.codeapi.MutableCodeSource](../com.github.jonathanxd.codeapi/-mutable-code-source/index.md) | A mutable [CodeSource](../com.github.jonathanxd.codeapi/-code-source/index.md) backing to a [ArrayList](http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html) instead of to an [Array](#). |
| [com.github.jonathanxd.codeapi.base.Named](../com.github.jonathanxd.codeapi.base/-named/index.md) | A element that have a name. |
| [com.github.jonathanxd.codeapi.base.New](../com.github.jonathanxd.codeapi.base/-new/index.md) | Represents the construction of type, used to invoke constructor methods. (not `super` constructor or `this` constructor). |
| [com.github.jonathanxd.codeapi.type.NullType](../com.github.jonathanxd.codeapi.type/-null-type/index.md) | Null code type. |
| [com.github.jonathanxd.codeapi.base.Operate](../com.github.jonathanxd.codeapi.base/-operate/index.md) | Operate a value and return result of operation. |
| [com.github.jonathanxd.codeapi.helper.OperateHelper](../com.github.jonathanxd.codeapi.helper/-operate-helper/index.md) | Operator helper. |
| [com.github.jonathanxd.codeapi.operator.Operator](../com.github.jonathanxd.codeapi.operator/-operator/index.md) | Operator. |
| [com.github.jonathanxd.codeapi.operator.Operators](../com.github.jonathanxd.codeapi.operator/-operators/index.md) | [Operators](../com.github.jonathanxd.codeapi.operator/-operator/index.md) constants. |
| [java.lang.reflect.Parameter](../com.github.jonathanxd.codeapi.util.conversion/java.lang.reflect.-parameter/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.base.ParametersHolder](../com.github.jonathanxd.codeapi.base/-parameters-holder/index.md) | Parameter holder |
| [com.github.jonathanxd.codeapi.util.Parent](../com.github.jonathanxd.codeapi.util/-parent/index.md) | Parent utility. |
| [com.github.jonathanxd.codeapi.modify.visit.PartVisitor](../com.github.jonathanxd.codeapi.modify.visit/-part-visitor/index.md) | Visitor that transforms part [U](#). |
| [com.github.jonathanxd.codeapi.base.comment.Plain](../com.github.jonathanxd.codeapi.base.comment/-plain/index.md) | Plain comment (like texts) |
| [com.github.jonathanxd.codeapi.type.PlainCodeType](../com.github.jonathanxd.codeapi.type/-plain-code-type/index.md) | Plain string code type. |
| [com.github.jonathanxd.codeapi.processor.Processor](../com.github.jonathanxd.codeapi.processor/-processor/index.md) |  |
| [com.github.jonathanxd.codeapi.base.Provide](../com.github.jonathanxd.codeapi.base/-provide/index.md) | Provides [with](../com.github.jonathanxd.codeapi.base/-provide/with.md) to service [service](../com.github.jonathanxd.codeapi.base/-provide/service.md). |
| [com.github.jonathanxd.codeapi.base.QualifiedNamed](../com.github.jonathanxd.codeapi.base/-qualified-named/index.md) | A part that have a qualified name. |
| [com.github.jonathanxd.codeapi.base.Require](../com.github.jonathanxd.codeapi.base/-require/index.md) | Module requires statement |
| [com.github.jonathanxd.codeapi.base.Return](../com.github.jonathanxd.codeapi.base/-return/index.md) | Return value. |
| [com.github.jonathanxd.codeapi.base.ReturnTypeHolder](../com.github.jonathanxd.codeapi.base/-return-type-holder/index.md) | Return type holder part |
| [com.github.jonathanxd.codeapi.util.SimpleResolver](../com.github.jonathanxd.codeapi.util/-simple-resolver/index.md) | Simple type resolver |
| [com.github.jonathanxd.codeapi.inspect.SourceInspect](../com.github.jonathanxd.codeapi.inspect/-source-inspect/index.md) | Utility to inspect [CodeSource](../com.github.jonathanxd.codeapi/-code-source/index.md). |
| [com.github.jonathanxd.codeapi.inspect.SourceInspectBuilder](../com.github.jonathanxd.codeapi.inspect/-source-inspect-builder/index.md) |  |
| [com.github.jonathanxd.codeapi.util.Stack](../com.github.jonathanxd.codeapi.util/-stack.md) | Use JVM Stack value (is supported by `BytecodeGenerators`). |
| [com.github.jonathanxd.codeapi.base.StaticBlock](../com.github.jonathanxd.codeapi.base/-static-block/index.md) | Static block (aka class constructors/class initializers). |
| [kotlin.String](../com.github.jonathanxd.codeapi.util/kotlin.-string/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [com.github.jonathanxd.codeapi.sugar.SugarSyntaxProcessor](../com.github.jonathanxd.codeapi.sugar/-sugar-syntax-processor/index.md) | Sugar syntax processor. CodeAPI provides a way to register a sugar syntax processor, a sugar
syntax processor transforms a value of type [T](#) into a [CodePart](../com.github.jonathanxd.codeapi/-code-part/index.md). |
| [com.github.jonathanxd.codeapi.base.SuperClassHolder](../com.github.jonathanxd.codeapi.base/-super-class-holder/index.md) | Super class holder |
| [com.github.jonathanxd.codeapi.base.SwitchStatement](../com.github.jonathanxd.codeapi.base/-switch-statement/index.md) | Switch statement, this switch can switch numeric values and object values (like Enum, String or other
objects). |
| [com.github.jonathanxd.codeapi.base.SwitchType](../com.github.jonathanxd.codeapi.base/-switch-type/index.md) | Switch types |
| [com.github.jonathanxd.codeapi.base.Synchronized](../com.github.jonathanxd.codeapi.base/-synchronized/index.md) | Synchronized statement. Locks resources to thread access. |
| [com.github.jonathanxd.codeapi.base.ThrowException](../com.github.jonathanxd.codeapi.base/-throw-exception/index.md) | Throws [partToThrow](../com.github.jonathanxd.codeapi.base/-throw-exception/part-to-throw.md). |
| [com.github.jonathanxd.codeapi.base.TryStatement](../com.github.jonathanxd.codeapi.base/-try-statement/index.md) | Try-catch-finally statement. |
| [com.github.jonathanxd.codeapi.base.TryWithResources](../com.github.jonathanxd.codeapi.base/-try-with-resources/index.md) | Try-with-resources |
| [java.lang.reflect.Type](../com.github.jonathanxd.codeapi.util/java.lang.reflect.-type/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [com.github.jonathanxd.codeapi.base.TypeDeclaration](../com.github.jonathanxd.codeapi.base/-type-declaration/index.md) | Base class of all [TypeDeclaration](../com.github.jonathanxd.codeapi.base/-type-declaration/index.md)s like classes, interfaces and enums, and inner classes. |
| [javax.lang.model.element.TypeElement](../com.github.jonathanxd.codeapi.util/javax.lang.model.element.-type-element/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [javax.lang.model.type.TypeMirror](../com.github.jonathanxd.codeapi.util/javax.lang.model.type.-type-mirror/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [com.github.jonathanxd.codeapi.type.TypeRef](../com.github.jonathanxd.codeapi.type/-type-ref/index.md) | Reference to a type, this is only intended to be used to inform outer types. |
| [com.github.jonathanxd.codeapi.util.TypeResolver](../com.github.jonathanxd.codeapi.util/-type-resolver/index.md) | Resolves a class name which may vary to a [CodeType](../com.github.jonathanxd.codeapi.type/-code-type/index.md) and cache the resolved type. |
| [com.github.jonathanxd.codeapi.base.TypeSpec](../com.github.jonathanxd.codeapi.base/-type-spec/index.md) | Type Signature representation. |
| [com.github.jonathanxd.codeapi.base.Typed](../com.github.jonathanxd.codeapi.base/-typed/index.md) | A element that can have a type. |
| [com.github.jonathanxd.iutils.data.TypedData](../com.github.jonathanxd.codeapi.util/com.github.jonathanxd.iutils.data.-typed-data/index.md) (extensions in package com.github.jonathanxd.codeapi.util) |  |
| [com.github.jonathanxd.codeapi.Types](../com.github.jonathanxd.codeapi/-types/index.md) |  |
| [com.github.jonathanxd.codeapi.processor.UnexpectedInspectionContext](../com.github.jonathanxd.codeapi.processor/-unexpected-inspection-context/index.md) | Occurs when a unexpected inspection context is found. |
| [com.github.jonathanxd.codeapi.processor.ValidationEnvironment](../com.github.jonathanxd.codeapi.processor/-validation-environment/index.md) | Validation environment to index [ValidationMessages](../com.github.jonathanxd.codeapi.processor/-validation-message/index.md). |
| [com.github.jonathanxd.codeapi.exception.ValidationException](../com.github.jonathanxd.codeapi.exception/-validation-exception/index.md) | Occurs when validation fails. |
| [com.github.jonathanxd.codeapi.processor.ValidationMessage](../com.github.jonathanxd.codeapi.processor/-validation-message/index.md) | Validation message. |
| [com.github.jonathanxd.codeapi.processor.Validator](../com.github.jonathanxd.codeapi.processor/-validator/index.md) | Custom validator |
| [com.github.jonathanxd.codeapi.base.ValueHolder](../com.github.jonathanxd.codeapi.base/-value-holder/index.md) | Value holder part |
| [com.github.jonathanxd.codeapi.base.VariableAccess](../com.github.jonathanxd.codeapi.base/-variable-access/index.md) | Access to a variable in local scope. |
| [com.github.jonathanxd.codeapi.base.VariableBase](../com.github.jonathanxd.codeapi.base/-variable-base/index.md) | Base variable manipulation. |
| [com.github.jonathanxd.codeapi.base.VariableDeclaration](../com.github.jonathanxd.codeapi.base/-variable-declaration/index.md) | Declares a variable of type [variableType](../com.github.jonathanxd.codeapi.base/-variable-declaration/variable-type.md) and name [name](../com.github.jonathanxd.codeapi.base/-variable-declaration/name.md) with default value [value](../com.github.jonathanxd.codeapi.base/-variable-declaration/value.md) (null does not
mean that you declared a variable with null value, it means that you declared a variable without a default value,
for null values use `Literals.NULL`). |
| [com.github.jonathanxd.codeapi.base.VariableDefinition](../com.github.jonathanxd.codeapi.base/-variable-definition/index.md) | Defines the value of variable of type [type](../com.github.jonathanxd.codeapi.base/-variable-definition/type.md) and name [name](../com.github.jonathanxd.codeapi.base/-variable-definition/name.md) to [value](../com.github.jonathanxd.codeapi.base/-variable-definition/value.md). |
| [javax.lang.model.element.VariableElement](../com.github.jonathanxd.codeapi.util.conversion/javax.lang.model.element.-variable-element/index.md) (extensions in package com.github.jonathanxd.codeapi.util.conversion) |  |
| [com.github.jonathanxd.codeapi.common.VariableRef](../com.github.jonathanxd.codeapi.common/-variable-ref/index.md) | Reference to a Variable, this class must never appear in CodeSource. |
| [com.github.jonathanxd.codeapi.modify.visit.VisitManager](../com.github.jonathanxd.codeapi.modify.visit/-visit-manager/index.md) | Manager of visitor of part [T](#). |
| [com.github.jonathanxd.codeapi.common.Void](../com.github.jonathanxd.codeapi.common/-void/index.md) | Void instance for void returns |
| [com.github.jonathanxd.codeapi.processor.VoidValidator](../com.github.jonathanxd.codeapi.processor/-void-validator/index.md) | **Only a void implementation**, this class does not validate, does not register validators,
this class does nothing, literally. |
| [com.github.jonathanxd.codeapi.base.WhileStatement](../com.github.jonathanxd.codeapi.base/-while-statement/index.md) | While statement |