/*
 *      CodeAPI - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
 *
 *         The MIT License (MIT)
 *
 *      Copyright (c) 2016 TheRealBuggy/JonathanxD (https://github.com/JonathanxD/ & https://github.com/TheRealBuggy/) <jonathan.scripter@programmer.net>
 *      Copyright (c) contributors
 *
 *
 *      Permission is hereby granted, free of charge, to any person obtaining a copy
 *      of this software and associated documentation files (the "Software"), to deal
 *      in the Software without restriction, including without limitation the rights
 *      to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *      copies of the Software, and to permit persons to whom the Software is
 *      furnished to do so, subject to the following conditions:
 *
 *      The above copyright notice and this permission notice shall be included in
 *      all copies or substantial portions of the Software.
 *
 *      THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *      IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *      FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *      AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *      LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *      OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *      THE SOFTWARE.
 */
package com.github.jonathanxd.codeapi;

import com.github.jonathanxd.codeapi.common.CodeArgument;
import com.github.jonathanxd.codeapi.common.CodeModifier;
import com.github.jonathanxd.codeapi.common.CodeParameter;
import com.github.jonathanxd.codeapi.common.FullInvokeSpec;
import com.github.jonathanxd.codeapi.common.FullMethodSpec;
import com.github.jonathanxd.codeapi.common.InvokeDynamic;
import com.github.jonathanxd.codeapi.common.InvokeType;
import com.github.jonathanxd.codeapi.common.IterationType;
import com.github.jonathanxd.codeapi.common.IterationTypes;
import com.github.jonathanxd.codeapi.common.MethodType;
import com.github.jonathanxd.codeapi.common.Scope;
import com.github.jonathanxd.codeapi.common.TypeSpec;
import com.github.jonathanxd.codeapi.generic.GenericSignature;
import com.github.jonathanxd.codeapi.helper.ArrayConstructorEx;
import com.github.jonathanxd.codeapi.helper.ArrayLengthEx;
import com.github.jonathanxd.codeapi.helper.ArrayLoadEx;
import com.github.jonathanxd.codeapi.helper.ArrayStoreEx;
import com.github.jonathanxd.codeapi.helper.Helper;
import com.github.jonathanxd.codeapi.helper.MethodSpec;
import com.github.jonathanxd.codeapi.impl.AnnotationImpl;
import com.github.jonathanxd.codeapi.impl.CodeClass;
import com.github.jonathanxd.codeapi.impl.CodeConstructor;
import com.github.jonathanxd.codeapi.impl.CodeField;
import com.github.jonathanxd.codeapi.impl.CodeInterface;
import com.github.jonathanxd.codeapi.impl.CodeMethod;
import com.github.jonathanxd.codeapi.impl.EnumValueImpl;
import com.github.jonathanxd.codeapi.interfaces.Annotation;
import com.github.jonathanxd.codeapi.interfaces.ArrayConstructor;
import com.github.jonathanxd.codeapi.interfaces.ArrayLength;
import com.github.jonathanxd.codeapi.interfaces.ArrayLoad;
import com.github.jonathanxd.codeapi.interfaces.ArrayStore;
import com.github.jonathanxd.codeapi.interfaces.Casted;
import com.github.jonathanxd.codeapi.interfaces.CatchBlock;
import com.github.jonathanxd.codeapi.interfaces.DoWhileBlock;
import com.github.jonathanxd.codeapi.interfaces.ElseBlock;
import com.github.jonathanxd.codeapi.interfaces.EnumValue;
import com.github.jonathanxd.codeapi.interfaces.FieldDeclaration;
import com.github.jonathanxd.codeapi.interfaces.ForBlock;
import com.github.jonathanxd.codeapi.interfaces.ForEachBlock;
import com.github.jonathanxd.codeapi.interfaces.IfBlock;
import com.github.jonathanxd.codeapi.interfaces.IfExpr;
import com.github.jonathanxd.codeapi.interfaces.MethodFragment;
import com.github.jonathanxd.codeapi.interfaces.MethodInvocation;
import com.github.jonathanxd.codeapi.interfaces.Return;
import com.github.jonathanxd.codeapi.interfaces.ThrowException;
import com.github.jonathanxd.codeapi.interfaces.TryBlock;
import com.github.jonathanxd.codeapi.interfaces.TryWithResources;
import com.github.jonathanxd.codeapi.interfaces.VariableAccess;
import com.github.jonathanxd.codeapi.interfaces.VariableDeclaration;
import com.github.jonathanxd.codeapi.interfaces.VariableOperate;
import com.github.jonathanxd.codeapi.interfaces.WhileBlock;
import com.github.jonathanxd.codeapi.operators.Operator;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.types.GenericType;
import com.github.jonathanxd.codeapi.util.ArrayToList;
import com.github.jonathanxd.codeapi.util.BiMultiVal;
import com.github.jonathanxd.iutils.optional.Require;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by jonathan on 01/05/16.
 */
public class CodeAPI {

    private static final Annotation[] EMPTY_ANNOTATIONS = {};

    // =========================================================
    //          Interfaces
    // =========================================================

    public static CodeInterface anInterface(int modifiers, String qualifiedName) {
        return anInterface__factory(modifiers, qualifiedName, null, null);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, GenericSignature<GenericType> signature) {
        return anInterface__factory(modifiers, qualifiedName, signature, null);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, CodeType... extensions) {
        return anInterface__factory(modifiers, qualifiedName, null, null, extensions);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, CodeType... extensions) {
        return anInterface__factory(modifiers, qualifiedName, signature, null, extensions);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, Class<?>... extensions) {
        return anInterface__factory(modifiers, qualifiedName, null, null, toCodeType(extensions));
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Class<?>... extensions) {
        return anInterface__factory(modifiers, qualifiedName, signature, null, toCodeType(extensions));
    }

    // ** Source **

    public static CodeInterface anInterface(int modifiers, String qualifiedName, Function<CodeInterface, CodeSource> source) {
        return anInterface__factory(modifiers, qualifiedName, null, source);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Function<CodeInterface, CodeSource> source) {
        return anInterface__factory(modifiers, qualifiedName, signature, source);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, CodeType[] extensions, Function<CodeInterface, CodeSource> source) {
        return anInterface__factory(modifiers, qualifiedName, null, source, extensions);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, CodeType[] extensions, Function<CodeInterface, CodeSource> source) {
        return anInterface__factory(modifiers, qualifiedName, signature, source, extensions);
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, Class<?>[] extensions, Function<CodeInterface, CodeSource> source) {
        return anInterface__factory(modifiers, qualifiedName, null, source, toCodeType(extensions));
    }

    public static CodeInterface anInterface(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Class<?>[] extensions, Function<CodeInterface, CodeSource> source) {
        return anInterface__factory(modifiers, qualifiedName, signature, source, toCodeType(extensions));
    }

    // Factory

    private static CodeInterface anInterface__factory(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Function<CodeInterface, CodeSource> source, CodeType... extensions) {
        CodeInterface codeInterface = new CodeInterface(qualifiedName, CodeModifier.extractModifiers(modifiers), ArrayToList.toList(extensions), signature, new CodeSource());

        if (source != null)
            Require.require(codeInterface.getBody()).addAll(source.apply(codeInterface));

        return codeInterface;
    }

    // =========================================================
    //          Classes
    // =========================================================

    public static CodeClass aClass(int modifiers, String qualifiedName) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, null, null);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, null, null);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, signature, null);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, signature, null);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, CodeType... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, null, null, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, CodeType... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, null, null, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, CodeType... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, signature, null, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, CodeType... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, signature, null, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, Class<?>... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, null, null, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, Class<?>... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, null, null, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Class<?>... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, signature, null, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, Class<?>... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, signature, null, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, CodeType superType, CodeType... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, superType, null, null, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, CodeType superType, CodeType... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, superType, null, null, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, CodeType superType, CodeType... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, superType, signature, null, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, CodeType superType, CodeType... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, superType, signature, null, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, Class<?> superType, Class<?>... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, Helper.getJavaType(superType), null, null, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, Class<?> superType, Class<?>... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, Helper.getJavaType(superType), null, null, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Class<?> superType, Class<?>... implementations) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, Helper.getJavaType(superType), signature, null, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, Class<?> superType, Class<?>... implementations) {
        return aClass__factory(modifiers, annotations, qualifiedName, Helper.getJavaType(superType), signature, null, toCodeType(implementations));
    }

    // ** Source **

    public static CodeClass aClass(int modifiers, String qualifiedName, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, null, source);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, null, source);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, signature, source);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, signature, source);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, null, source, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, null, source, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, signature, source, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, signature, source, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, null, source, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, null, source, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, null, signature, source, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, null, signature, source, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, CodeType superType, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, superType, null, source, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, CodeType superType, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, superType, null, source, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, CodeType superType, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, superType, signature, source, implementations);
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, CodeType superType, CodeType[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, superType, signature, source, implementations);
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, Class<?> superType, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, Helper.getJavaType(superType), null, source, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, Class<?> superType, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, Helper.getJavaType(superType), null, source, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, String qualifiedName, GenericSignature<GenericType> signature, Class<?> superType, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, EMPTY_ANNOTATIONS, qualifiedName, Helper.getJavaType(superType), signature, source, toCodeType(implementations));
    }

    public static CodeClass aClass(int modifiers, Annotation[] annotations, String qualifiedName, GenericSignature<GenericType> signature, Class<?> superType, Class<?>[] implementations, Function<CodeClass, CodeSource> source) {
        return aClass__factory(modifiers, annotations, qualifiedName, Helper.getJavaType(superType), signature, source, toCodeType(implementations));
    }

    // Factory

    private static CodeClass aClass__factory(int modifiers, Annotation[] annotations, String qualifiedName, CodeType superType, GenericSignature<GenericType> signature, Function<CodeClass, CodeSource> source, CodeType... implementations) {
        CodeClass codeClass = new CodeClass(qualifiedName, CodeModifier.extractModifiers(modifiers), superType, ArrayToList.toList(implementations), signature, Arrays.asList(annotations), new CodeSource());

        if (source != null)
            Require.require(codeClass.getBody()).addAll(source.apply(codeClass));

        return codeClass;
    }

    // =========================================================
    //          Methods
    // =========================================================

    public static CodeMethod method(int modifiers, String name, CodeType returnType, CodeParameter... parameters) {
        return method__factory(modifiers, null, name, returnType, null, parameters);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, CodeType returnType, CodeParameter... parameters) {
        return method__factory(modifiers, signature, name, returnType, null, parameters);
    }

    public static CodeMethod method(int modifiers, String name, CodeType returnType) {
        return method__factory(modifiers, null, name, returnType, null);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, CodeType returnType) {
        return method__factory(modifiers, signature, name, returnType, null);
    }

    public static CodeMethod method(String name, CodeType returnType, CodeParameter... parameters) {
        return method__factory(0, null, name, returnType, null, parameters);
    }

    public static CodeMethod method(GenericSignature<GenericType> signature, String name, CodeType returnType, CodeParameter... parameters) {
        return method__factory(0, signature, name, returnType, null, parameters);
    }

    public static CodeMethod method(String name, CodeType returnType) {
        return method__factory(0, null, name, returnType, null);
    }

    public static CodeMethod method(GenericSignature<GenericType> signature, String name, CodeType returnType) {
        return method__factory(0, signature, name, returnType, null);
    }

    /// Class

    public static CodeMethod method(int modifiers, String name, Class<?> returnType, CodeParameter... parameters) {
        return method__factory(modifiers, null, name, Helper.getJavaType(returnType), null, parameters);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, Class<?> returnType, CodeParameter... parameters) {
        return method__factory(modifiers, signature, name, Helper.getJavaType(returnType), null, parameters);
    }

    public static CodeMethod method(int modifiers, String name, Class<?> returnType) {
        return method__factory(modifiers, null, name, Helper.getJavaType(returnType), null);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, Class<?> returnType) {
        return method__factory(modifiers, signature, name, Helper.getJavaType(returnType), null);
    }

    public static CodeMethod method(String name, Class<?> returnType, CodeParameter... parameters) {
        return method__factory(0, null, name, Helper.getJavaType(returnType), null, parameters);
    }

    public static CodeMethod method(GenericSignature<GenericType> signature, String name, Class<?> returnType, CodeParameter... parameters) {
        return method__factory(0, signature, name, Helper.getJavaType(returnType), null, parameters);
    }

    public static CodeMethod method(String name, Class<?> returnType) {
        return method__factory(0, null, name, Helper.getJavaType(returnType), null);
    }

    public static CodeMethod method(GenericSignature<GenericType> signature, String name, Class<?> returnType) {
        return method__factory(0, signature, name, Helper.getJavaType(returnType), null);
    }

    // ** Source **

    public static CodeMethod method(int modifiers, String name, CodeType returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, null, name, returnType, source, parameters);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, CodeType returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, signature, name, returnType, source, parameters);
    }

    public static CodeMethod method(int modifiers, String name, CodeType returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, null, name, returnType, source);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, CodeType returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, signature, name, returnType, source);
    }

    public static CodeMethod method(String name, CodeType returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, null, name, returnType, source, parameters);
    }

    public static CodeMethod method(GenericSignature<GenericType> signature, String name, CodeType returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, signature, name, returnType, source, parameters);
    }

    public static CodeMethod method(String name, CodeType returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, null, name, returnType, source);
    }

    public static CodeMethod method(GenericSignature<GenericType> signature, String name, CodeType returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, signature, name, returnType, source);
    }

    /// Class

    public static CodeMethod method(int modifiers, String name, Class<?> returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, null, name, Helper.getJavaType(returnType), source, parameters);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, Class<?> returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, signature, name, Helper.getJavaType(returnType), source, parameters);
    }

    public static CodeMethod method(int modifiers, String name, Class<?> returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, null, name, Helper.getJavaType(returnType), source);
    }

    public static CodeMethod method(int modifiers, GenericSignature<GenericType> signature, String name, Class<?> returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(modifiers, signature, name, Helper.getJavaType(returnType), source);
    }

    public static CodeMethod method(String name, Class<?> returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, null, name, Helper.getJavaType(returnType), source, parameters);
    }

    public static CodeMethod method(String name, GenericSignature<GenericType> signature, Class<?> returnType, CodeParameter[] parameters, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, signature, name, Helper.getJavaType(returnType), source, parameters);
    }

    public static CodeMethod method(String name, Class<?> returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, null, name, Helper.getJavaType(returnType), source);
    }

    public static CodeMethod method(String name, GenericSignature<GenericType> signature, Class<?> returnType, Function<CodeMethod, CodeSource> source) {
        return method__factory(0, signature, name, Helper.getJavaType(returnType), source);
    }

    // Factory

    private static CodeMethod method__factory(int modifiers, GenericSignature<GenericType> signature, String name, CodeType returnType, Function<CodeMethod, CodeSource> source, CodeParameter... parameters) {
        CodeMethod method = new CodeMethod(name, CodeModifier.extractModifiers(modifiers), ArrayToList.toList(parameters), returnType, signature, new CodeSource());

        if (source != null)
            Require.require(method.getBody()).addAll(source.apply(method));

        return method;
    }

    // =========================================================
    //          Constructors
    // =========================================================

    public static CodeConstructor constructor(int modifiers, CodeType declaringClass, CodeParameter... parameters) {
        return constructor__factory(modifiers, declaringClass, null, parameters);
    }

    public static CodeConstructor constructor(int modifiers, CodeType declaringClass) {
        return constructor__factory(modifiers, declaringClass, null);
    }


    /// Class

    public static CodeConstructor constructor(int modifiers, Class<?> declaringClass, CodeParameter... parameters) {
        return constructor__factory(modifiers, Helper.getJavaType(declaringClass), null, parameters);
    }

    public static CodeConstructor constructor(int modifiers, Class<?> declaringClass) {
        return constructor__factory(modifiers, Helper.getJavaType(declaringClass), null);
    }

    // ** Source **

    public static CodeConstructor constructor(int modifiers, CodeType declaringClass, CodeParameter[] parameters, Function<CodeConstructor, CodeSource> source) {
        return constructor__factory(modifiers, declaringClass, source, parameters);
    }

    public static CodeConstructor constructor(int modifiers, CodeType declaringClass, Function<CodeConstructor, CodeSource> source) {
        return constructor__factory(modifiers, declaringClass, source);
    }


    /// Class

    public static CodeConstructor constructor(int modifiers, Class<?> declaringClass, CodeParameter[] parameters, Function<CodeConstructor, CodeSource> source) {
        return constructor__factory(modifiers, Helper.getJavaType(declaringClass), source, parameters);
    }

    public static CodeConstructor constructor(int modifiers, Class<?> declaringClass, Function<CodeConstructor, CodeSource> source) {
        return constructor__factory(modifiers, Helper.getJavaType(declaringClass), source);
    }

    // Factory
    private static CodeConstructor constructor__factory(int modifiers, CodeType declaringClass, Function<CodeConstructor, CodeSource> source, CodeParameter... parameters) {
        CodeConstructor codeConstructor = new CodeConstructor(declaringClass, CodeModifier.extractModifiers(modifiers), ArrayToList.toList(parameters), new CodeSource());

        if (source != null)
            Require.require(codeConstructor.getBody()).addAll(source.apply(codeConstructor));

        return codeConstructor;
    }

    // =========================================================
    //          Fields
    // =========================================================

    // ** Source **
    public static CodeField field(int modifiers, CodeType type, String name, CodePart value) {
        return field__factory(modifiers, type, name, value);
    }

    public static CodeField field(int modifiers, CodeType type, String name) {
        return field__factory(modifiers, type, name, null);
    }

    public static CodeField field(CodeType type, String name, CodePart value) {
        return field__factory(0, type, name, value);
    }

    public static CodeField field(CodeType type, String name) {
        return field__factory(0, type, name, null);
    }

    /// Class
    public static CodeField field(int modifiers, Class<?> type, String name, CodePart value) {
        return field__factory(modifiers, Helper.getJavaType(type), name, value);
    }

    public static CodeField field(int modifiers, Class<?> type, String name) {
        return field__factory(modifiers, Helper.getJavaType(type), name, null);
    }

    public static CodeField field(Class<?> type, String name, CodePart value) {
        return field__factory(0, Helper.getJavaType(type), name, value);
    }

    public static CodeField field(Class<?> type, String name) {
        return field__factory(0, Helper.getJavaType(type), name, null);
    }

    // Factory
    private static CodeField field__factory(int modifiers, CodeType type, String name, CodePart value) {
        return new CodeField(name, type, value, CodeModifier.extractModifiers(modifiers));
    }


    // =========================================================
    //          Array Constructors
    // =========================================================

    public static ArrayConstructor arrayConstruct(CodeType arrayType, CodePart[] dimensions, CodeArgument... arguments) {
        return arrayConstruct__factory(arrayType, dimensions, arguments);
    }

    public static ArrayConstructor arrayConstruct(CodeType arrayType, CodePart[] dimensions) {
        return arrayConstruct__factory(arrayType, dimensions);
    }

    // Class

    public static ArrayConstructor arrayConstruct(Class<?> arrayType, CodePart[] dimensions) {
        return arrayConstruct__factory(Helper.getJavaType(arrayType), dimensions);
    }

    public static ArrayConstructor arrayConstruct(Class<?> arrayType, CodePart[] dimensions, CodeArgument... arguments) {
        return arrayConstruct__factory(Helper.getJavaType(arrayType), dimensions, arguments);
    }

    // Factory

    private static ArrayConstructor arrayConstruct__factory(CodeType arrayType, CodePart[] dimensions, CodeArgument... arguments) {
        return new ArrayConstructorEx(arrayType, dimensions, ArrayToList.toList(arguments));
    }

    // =========================================================
    //          Array Manipulate
    // =========================================================

    public static ArrayLength getArrayLength(VariableAccess access) {
        return getArrayLength__factory(access);
    }

    public static ArrayLoad getArrayValue(CodeType arrayType, VariableAccess access, CodePart index) {
        return getArrayValue__factory(index, access, arrayType);
    }

    public static ArrayStore setArrayValue(CodeType arrayType, VariableAccess access, CodePart index, CodePart value) {
        return setArrayValue__factory(index, access, arrayType, value);
    }

    // Class

    public static ArrayLoad getArrayValue(Class<?> arrayType, VariableAccess access, CodePart index) {
        return getArrayValue__factory(index, access, Helper.getJavaType(arrayType));
    }

    public static ArrayStore setArrayValue(Class<?> arrayType, VariableAccess access, CodePart index, CodePart value) {
        return setArrayValue__factory(index, access, Helper.getJavaType(arrayType), value);
    }

    // Factory

    private static ArrayLength getArrayLength__factory(VariableAccess access) {
        return new ArrayLengthEx(access);
    }

    private static ArrayLoad getArrayValue__factory(CodePart index, VariableAccess access, CodeType arrayType) {
        return new ArrayLoadEx(index, access, arrayType);
    }

    private static ArrayStore setArrayValue__factory(CodePart index, VariableAccess access, CodeType arrayType, CodePart value) {
        return new ArrayStoreEx(index, access, arrayType, value);
    }


    // =========================================================
    //          Source
    // =========================================================

    public static CodeSource emptySource(CodePart... codeParts) {
        return new CodeSource();
    }

    public static CodeSource sourceOfParts(CodePart... codeParts) {
        return new CodeSource(codeParts);
    }

    public static <T> Function<T, CodeSource> source(CodePart... codeParts) {
        return (t) -> new CodeSource(codeParts);
    }

    public static <T> Function<T, CodeSource> source(Function<T, CodeSource> sourceFunction) {
        return sourceFunction;
    }

    // =========================================================
    //          Return
    // =========================================================

    public static Return returnValue(CodeType valueType, CodePart value) {
        return Helper.returnValue(valueType, value);
    }

    public static Return returnValue(Class<?> valueType, CodePart value) {
        return Helper.returnValue(Helper.getJavaType(valueType), value);
    }

    public static Return returnLocalVariable(CodeType fieldType, String fieldName) {
        return Helper.returnValue(fieldType, Helper.accessLocalVariable(fieldName, fieldType));
    }

    public static Return returnLocalVariable(Class<?> fieldType, String fieldName) {
        return Helper.returnValue(Helper.getJavaType(fieldType), Helper.accessLocalVariable(fieldName, Helper.getJavaType(fieldType)));
    }

    public static Return returnThisField(CodeType fieldType, String fieldName) {
        return Helper.returnValue(fieldType, Helper.accessVariable(null, Helper.accessThis(), fieldName, fieldType));
    }

    public static Return returnThisField(Class<?> fieldType, String fieldName) {
        return Helper.returnValue(Helper.getJavaType(fieldType), Helper.accessVariable(null, Helper.accessThis(), fieldName, Helper.getJavaType(fieldType)));
    }

    public static Return returnField(CodeType localization, Class<?> fieldType, String fieldName) {
        return Helper.returnValue(Helper.getJavaType(fieldType), Helper.accessVariable(localization, fieldName, Helper.getJavaType(fieldType)));
    }

    public static Return returnField(Class<?> localization, Class<?> fieldType, String fieldName) {
        return Helper.returnValue(Helper.getJavaType(fieldType), Helper.accessVariable(Helper.getJavaType(localization), fieldName, Helper.getJavaType(fieldType)));
    }


    // =========================================================
    //          Parameters
    // =========================================================

    public static CodeParameter parameter(CodeType type, String name) {
        return new CodeParameter(name, type);
    }

    public static CodeParameter parameter(Class<?> type, String name) {
        return new CodeParameter(name, Helper.getJavaType(type));
    }

    // =========================================================
    //          Arguments
    // =========================================================

    public static CodeArgument argument(CodePart value) {
        return new CodeArgument(value);
    }

    public static CodeArgument argument(CodePart value, CodeType type) {
        return new CodeArgument(value, type);
    }

    public static CodeArgument argument(CodePart value, Class<?> type) {
        return new CodeArgument(value, Helper.getJavaType(type));
    }

    // =========================================================
    //          Invoke
    // =========================================================

    public static MethodInvocation invokeConstructor(CodeType type) {
        return invokeConstructor__factory(type);
    }

    public static MethodInvocation invokeConstructor(CodeType type, CodeArgument... arguments) {
        return invokeConstructor__factory(type, arguments);
    }

    public static MethodInvocation invokeStatic(CodeType localization, String methodName, TypeSpec methodDescription, CodeArgument... arguments) {
        return invoke__factory(InvokeType.INVOKE_STATIC, localization, localization,
                spec__factory(methodName, methodDescription, MethodType.METHOD, arguments));
    }

    public static MethodInvocation invokeVirtual(CodeType localization, CodePart target, String methodName, TypeSpec methodDescription, CodeArgument... arguments) {
        return invoke__factory(InvokeType.INVOKE_VIRTUAL, localization, target,
                spec__factory(methodName, methodDescription, MethodType.METHOD, arguments));
    }

    public static MethodInvocation invokeInterface(CodeType localization, CodePart target, String methodName, TypeSpec methodDescription, CodeArgument... arguments) {
        return invoke__factory(InvokeType.INVOKE_INTERFACE, localization, target,
                spec__factory(methodName, methodDescription, MethodType.METHOD, arguments));
    }

    public static MethodInvocation invokeDynamic(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
        return invokedynamic__factory(invokeDynamic, methodInvocation);
    }

    public static MethodInvocation invokeDynamicFragment(InvokeDynamic.LambdaFragment fragment) {
        return invokedynamic__factory(fragment);
    }

    // Class

    public static MethodInvocation invokeConstructor(Class<?> type) {
        return invokeConstructor__factory(Helper.getJavaType(type));
    }

    public static MethodInvocation invokeConstructor(Class<?> type, CodeArgument... arguments) {
        return invokeConstructor__factory(Helper.getJavaType(type), arguments);
    }

    public static MethodInvocation invokeStatic(Class<?> localization, String methodName, TypeSpec methodDescription, CodeArgument... arguments) {
        return invoke__factory(InvokeType.INVOKE_STATIC, Helper.getJavaType(localization), Helper.getJavaType(localization),
                spec__factory(methodName, methodDescription, MethodType.METHOD, arguments));
    }

    public static MethodInvocation invokeVirtual(Class<?> localization, CodePart target, String methodName, TypeSpec methodDescription, CodeArgument... arguments) {
        return invoke__factory(InvokeType.INVOKE_VIRTUAL, Helper.getJavaType(localization), target,
                spec__factory(methodName, methodDescription, MethodType.METHOD, arguments));
    }

    public static MethodInvocation invokeInterface(Class<?> localization, CodePart target, String methodName, TypeSpec methodDescription, CodeArgument... arguments) {
        return invoke__factory(InvokeType.INVOKE_INTERFACE, Helper.getJavaType(localization), target,
                spec__factory(methodName, methodDescription, MethodType.METHOD, arguments));
    }

    // Factory

    private static MethodSpec spec__factory(String methodName, TypeSpec methodDescription, MethodType methodType, CodeArgument... arguments) {
        return new MethodSpec(methodName, ArrayToList.toList(arguments), methodDescription, methodType);
    }

    private static MethodInvocation invoke__factory(InvokeType invokeType, CodeType localization, CodePart target, MethodSpec methodSpec) {
        return Helper.invoke(invokeType, localization, target, methodSpec);
    }

    private static MethodInvocation invokedynamic__factory(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
        return Helper.invokeDynamic(invokeDynamic, methodInvocation);
    }

    private static MethodInvocation invokedynamic__factory(InvokeDynamic.LambdaFragment fragment) {
        return Helper.invokeDynamicFragment(fragment);
    }

    private static MethodInvocation invokeConstructor__factory(CodeType type, CodeArgument... arguments) {
        return Helper.invokeConstructor(type, arguments);
    }

    // =========================================================
    //          Access Variables & Fields
    // =========================================================

    public static VariableAccess accessDeclaration(VariableDeclaration declaration) {
        return accessField__Factory(declaration.getLocalization(), declaration.getAt(), declaration.getVariableType(), declaration.getName());
    }

    public static VariableAccess accessStaticThisField(CodeType fieldType, String name) {
        return accessField__Factory(null, Helper.accessThis(), fieldType, name);
    }

    public static VariableAccess accessStaticField(CodeType localization, CodeType fieldType, String name) {
        return accessField__Factory(localization, null, fieldType, name);
    }

    public static VariableAccess accessField(CodeType localization, CodePart at, CodeType fieldType, String name) {
        return accessField__Factory(localization, at, fieldType, name);
    }

    public static VariableAccess accessThisField(CodeType fieldType, String name) {
        return accessField__Factory(null, Helper.accessThis(), fieldType, name);
    }

    public static VariableAccess accessLocalVariable(CodeType variableType, String name) {
        return accessField__Factory(null, Helper.accessLocal(), variableType, name);
    }

    // Class

    public static VariableAccess accessStaticThisField(Class<?> fieldType, String name) {
        return accessField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name);
    }

    public static VariableAccess accessStaticField(Class<?> localization, Class<?> fieldType, String name) {
        return accessField__Factory(Helper.getJavaType(localization), null, Helper.getJavaType(fieldType), name);
    }

    public static VariableAccess accessField(Class<?> localization, CodePart at, Class<?> fieldType, String name) {
        return accessField__Factory(Helper.getJavaType(localization), at, Helper.getJavaType(fieldType), name);
    }

    public static VariableAccess accessThisField(Class<?> fieldType, String name) {
        return accessField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name);
    }

    public static VariableAccess accessLocalVariable(Class<?> variableType, String name) {
        return accessField__Factory(null, Helper.accessLocal(), Helper.getJavaType(variableType), name);
    }

    // Factory

    private static VariableAccess accessField__Factory(CodeType localization, CodePart at, CodeType type, String name) {
        return Helper.accessVariable(localization, at, name, type);
    }

    // =========================================================
    //          Set Variables & Fields
    // =========================================================


    public static VariableDeclaration setDeclarationValue(VariableDeclaration declaration, CodePart value) {
        return setField__Factory(declaration.getLocalization(), declaration.getAt(), declaration.getVariableType(), declaration.getName(), value);
    }

    public static VariableDeclaration setStaticThisField(CodeType fieldType, String name, CodePart value) {
        return setField__Factory(null, Helper.accessThis(), fieldType, name, value);
    }

    public static VariableDeclaration setStaticField(CodeType localization, CodeType fieldType, String name, CodePart value) {
        return setField__Factory(localization, null, fieldType, name, value);
    }

    public static VariableDeclaration setField(CodeType localization, CodePart at, CodeType fieldType, String name, CodePart value) {
        return setField__Factory(localization, at, fieldType, name, value);
    }

    public static VariableDeclaration setThisField(CodeType fieldType, String name, CodePart value) {
        return setField__Factory(null, Helper.accessThis(), fieldType, name, value);
    }

    public static VariableDeclaration setLocalVariable(CodeType variableType, String name, CodePart value) {
        return setField__Factory(null, Helper.accessLocal(), variableType, name, value);
    }

    // Class

    public static VariableDeclaration setStaticThisField(Class<?> fieldType, String name, CodePart value) {
        return setField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name, value);
    }

    public static VariableDeclaration setStaticField(Class<?> localization, Class<?> fieldType, String name, CodePart value) {
        return setField__Factory(Helper.getJavaType(localization), null, Helper.getJavaType(fieldType), name, value);
    }

    public static VariableDeclaration setField(Class<?> localization, CodePart at, Class<?> fieldType, String name, CodePart value) {
        return setField__Factory(Helper.getJavaType(localization), at, Helper.getJavaType(fieldType), name, value);
    }

    public static VariableDeclaration setThisField(Class<?> fieldType, String name, CodePart value) {
        return setField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name, value);
    }

    public static VariableDeclaration setLocalVariable(Class<?> variableType, String name, CodePart value) {
        return setField__Factory(null, Helper.accessLocal(), Helper.getJavaType(variableType), name, value);
    }

    // Factory
    private static VariableDeclaration setField__Factory(CodeType localization, CodePart at, CodeType type, String name, CodePart value) {
        return Helper.setVariable(localization, at, name, type, value);
    }

    // =========================================================
    //          Operate Variables & Fields
    // =========================================================

    public static VariableOperate operateDeclarationValue(VariableDeclaration declaration, Operator operation, CodePart value) {
        return operateField__Factory(declaration.getLocalization(), declaration.getAt(), declaration.getVariableType(), declaration.getName(), operation, value);
    }

    public static VariableOperate operateDeclarationValue(VariableDeclaration declaration, Operator operation) {
        return operateField__Factory(declaration.getLocalization(), declaration.getAt(), declaration.getVariableType(), declaration.getName(), operation, null);
    }

    public static VariableOperate operateStaticThisField(CodeType fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(null, Helper.accessThis(), fieldType, name, operation, value);
    }

    public static VariableOperate operateStaticThisField(CodeType fieldType, String name, Operator operation) {
        return operateField__Factory(null, Helper.accessThis(), fieldType, name, operation, null);
    }

    public static VariableOperate operateStaticField(CodeType localization, CodeType fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(localization, null, fieldType, name, operation, value);
    }

    public static VariableOperate operateStaticField(CodeType localization, CodeType fieldType, String name, Operator operation) {
        return operateField__Factory(localization, null, fieldType, name, operation, null);
    }

    public static VariableOperate operateField(CodeType localization, CodePart at, CodeType fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(localization, at, fieldType, name, operation, value);
    }

    public static VariableOperate operateField(CodeType localization, CodePart at, CodeType fieldType, String name, Operator operation) {
        return operateField__Factory(localization, at, fieldType, name, operation, null);
    }

    public static VariableOperate operateThisField(CodeType fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(null, Helper.accessThis(), fieldType, name, operation, value);
    }

    public static VariableOperate operateThisField(CodeType fieldType, String name, Operator operation) {
        return operateField__Factory(null, Helper.accessThis(), fieldType, name, operation, null);
    }

    public static VariableOperate operateLocalVariable(CodeType variableType, String name, Operator operation, CodePart value) {
        return operateField__Factory(null, Helper.accessLocal(), variableType, name, operation, value);
    }

    public static VariableOperate operateLocalVariable(CodeType variableType, String name, Operator operation) {
        return operateField__Factory(null, Helper.accessLocal(), variableType, name, operation, null);
    }

    // Class

    public static VariableOperate operateStaticThisField(Class<?> fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name, operation, value);
    }

    public static VariableOperate operateStaticThisField(Class<?> fieldType, String name, Operator operation) {
        return operateField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name, operation, null);
    }

    public static VariableOperate operateStaticField(Class<?> localization, Class<?> fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(Helper.getJavaType(localization), null, Helper.getJavaType(fieldType), name, operation, value);
    }

    public static VariableOperate operateStaticField(Class<?> localization, Class<?> fieldType, String name, Operator operation) {
        return operateField__Factory(Helper.getJavaType(localization), null, Helper.getJavaType(fieldType), name, operation, null);
    }

    public static VariableOperate operateField(Class<?> localization, CodePart at, Class<?> fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(Helper.getJavaType(localization), at, Helper.getJavaType(fieldType), name, operation, value);
    }

    public static VariableOperate operateField(Class<?> localization, CodePart at, Class<?> fieldType, String name, Operator operation) {
        return operateField__Factory(Helper.getJavaType(localization), at, Helper.getJavaType(fieldType), name, operation, null);
    }

    public static VariableOperate operateThisField(Class<?> fieldType, String name, Operator operation, CodePart value) {
        return operateField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name, operation, value);
    }

    public static VariableOperate operateThisField(Class<?> fieldType, String name, Operator operation) {
        return operateField__Factory(null, Helper.accessThis(), Helper.getJavaType(fieldType), name, operation, null);
    }

    public static VariableOperate operateLocalVariable(Class<?> variableType, String name, Operator operation, CodePart value) {
        return operateField__Factory(null, Helper.accessLocal(), Helper.getJavaType(variableType), name, operation, value);
    }

    public static VariableOperate operateLocalVariable(Class<?> variableType, String name, Operator operation) {
        return operateField__Factory(null, Helper.accessLocal(), Helper.getJavaType(variableType), name, operation, null);
    }

    // Factory
    private static VariableOperate operateField__Factory(CodeType localization, CodePart at, CodeType type, String name, Operator operation, CodePart value) {
        return Helper.operateVariable(localization, at, name, type, operation, value);
    }

    // =========================================================
    //          Throw Exceptions
    // =========================================================

    public static ThrowException throwException(CodePart partToThrow) {
        return throwException__Factory(partToThrow);
    }

    public static ThrowException throwException(CodeType exceptionType, CodeArgument... arguments) {
        return throwException__Factory(exceptionType, arguments);
    }

    //Class
    public static ThrowException throwException(Class<?> exceptionType, CodeArgument... arguments) {
        return throwException__Factory(toCodeType(exceptionType), arguments);
    }

    // Factory

    private static ThrowException throwException__Factory(CodePart partToThrow) {
        return Helper.throwException(partToThrow);
    }

    private static ThrowException throwException__Factory(CodeType exceptionType, CodeArgument... arguments) {
        MethodInvocation invoke = Helper.invoke(InvokeType.INVOKE_SPECIAL, exceptionType, exceptionType, new MethodSpec((String) null, Arrays.asList(arguments), (CodeType) null, MethodType.CONSTRUCTOR));
        return throwException__Factory(invoke);
    }

    // =========================================================
    //          Annotations
    // =========================================================

    // CodeType

    /**
     * Create an annotation that is not visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(CodeType annotationType) {
        return annotation__Factory(false, annotationType, Collections.emptyMap());
    }

    /**
     * Create an annotation.
     *
     * @param annotationType Type of annotation
     * @param isVisible      Is annotation visible at runtime (only affects bytecode generation).
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(boolean isVisible, CodeType annotationType) {
        return annotation__Factory(isVisible, annotationType, Collections.emptyMap());
    }

    /**
     * Create an annotation that is visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @return A visible annotation
     */
    public static Annotation visibleAnnotation(CodeType annotationType) {
        return annotation__Factory(true, annotationType, Collections.emptyMap());
    }

    /**
     * Create an annotation that is not visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link CodeType}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(CodeType annotationType, Map<String, Object> values) {
        return annotation__Factory(false, annotationType, values);
    }

    /**
     * Create an annotation that is visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link CodeType}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A visible annotation
     */
    public static Annotation visibleAnnotation(CodeType annotationType, Map<String, Object> values) {
        return annotation__Factory(true, annotationType, values);
    }

    /**
     * Create an annotation.
     *
     * @param annotationType Type of annotation
     * @param isVisible      Is annotation visible at runtime (only affects bytecode generation).
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link CodeType}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(boolean isVisible, CodeType annotationType, Map<String, Object> values) {
        return annotation__Factory(isVisible, annotationType, values);
    }

    // Class

    /**
     * Create an annotation that is not visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(Class<?> annotationType) {
        return annotation__Factory(false, CodeAPI.toCodeType(annotationType), Collections.emptyMap());
    }

    /**
     * Create an annotation.
     *
     * @param annotationType Type of annotation
     * @param isVisible      Is annotation visible at runtime (only affects bytecode generation).
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(boolean isVisible, Class<?> annotationType) {
        return annotation__Factory(isVisible, CodeAPI.toCodeType(annotationType), Collections.emptyMap());
    }

    /**
     * Create an annotation that is visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @return A visible annotation
     */
    public static Annotation visibleAnnotation(Class<?> annotationType) {
        return annotation__Factory(true, CodeAPI.toCodeType(annotationType), Collections.emptyMap());
    }

    /**
     * Create an annotation that is not visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link CodeType}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(Class<?> annotationType, Map<String, Object> values) {
        return annotation__Factory(false, CodeAPI.toCodeType(annotationType), values);
    }

    /**
     * Create an annotation that is visible at runtime (only affects bytecode generation).
     *
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link CodeType}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A visible annotation
     */
    public static Annotation visibleAnnotation(Class<?> annotationType, Map<String, Object> values) {
        return annotation__Factory(true, CodeAPI.toCodeType(annotationType), values);
    }

    /**
     * Create an annotation.
     *
     * @param annotationType Type of annotation
     * @param isVisible      Is annotation visible at runtime (only affects bytecode generation).
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link CodeType}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return A runtime invisible annotation.
     */
    public static Annotation annotation(boolean isVisible, Class<?> annotationType, Map<String, Object> values) {
        return annotation__Factory(isVisible, CodeAPI.toCodeType(annotationType), values);
    }

    // Factory

    /**
     * Create an Annotation
     *
     * @param isVisible      Is annotation visible at runtime.
     * @param annotationType Type of annotation
     * @param values         The Annotation values must be: {@link Byte}, {@link Boolean}, {@link
     *                       Character}, {@link Short}, {@link Integer}, {@link Long}, {@link
     *                       Float}, {@link Double}, {@link String}, {@link CodeType}, OBJECT,
     *                       ARRAY, {@link EnumValue} or other {@link Annotation}.
     * @return Annotation
     */
    private static Annotation annotation__Factory(boolean isVisible, CodeType annotationType, Map<String, Object> values) {
        return new AnnotationImpl(annotationType, isVisible, values);
    }

    // =========================================================
    //          Annotations Enum Values
    // =========================================================

    /**
     * EnumValue of an Annotation property.
     *
     * @param enumType Type of enum
     * @param entry    Enum entry (aka Field)
     * @return Enum value
     */
    public static EnumValue enumValue(Class<?> enumType, String entry) {
        return enumValue__factory(CodeAPI.toCodeType(enumType), entry);
    }

    /**
     * EnumValue of an Annotation property.
     *
     * @param enumType Type of enum
     * @param entry    Enum entry (aka Field)
     * @return Enum value
     */
    public static EnumValue enumValue(CodeType enumType, String entry) {
        return enumValue__factory(enumType, entry);
    }

    // Factory

    private static EnumValue enumValue__factory(CodeType enumType, String entry) {
        return new EnumValueImpl(enumType, entry);
    }

    // =========================================================
    //          TypeSpec
    // =========================================================

    public static TypeSpec typeSpec(CodeType returnType) {
        return typeSpec__factory(returnType, new CodeType[]{});
    }

    public static TypeSpec typeSpec(CodeType returnType, CodeType... parameterTypes) {
        return typeSpec__factory(returnType, parameterTypes);
    }

    // Class

    public static TypeSpec typeSpec(Class<?> returnType) {
        return typeSpec__factory(toCodeType(returnType), new CodeType[]{});
    }

    public static TypeSpec typeSpec(Class<?> returnType, Class<?>... parameterTypes) {
        return typeSpec__factory(toCodeType(returnType), toCodeType(parameterTypes));
    }

    // Factory

    private static TypeSpec typeSpec__factory(CodeType returnType, CodeType[] parameterTypes) {
        return new TypeSpec(returnType, parameterTypes);
    }

    // =========================================================
    //          Cast
    // =========================================================

    public static Casted cast(CodeType fromType, CodeType toType, CodePart partToCast) {
        return cast__Factory(fromType, toType, partToCast);
    }

    // Class
    public static Casted cast(Class<?> fromType, Class<?> toType, CodePart partToCast) {
        return cast__Factory(toCodeType(fromType), toCodeType(toType), partToCast);
    }

    // Factory
    private static Casted cast__Factory(CodeType fromType, CodeType toType, CodePart partToCast) {
        return Helper.cast(fromType, toType, partToCast);
    }

    // =========================================================
    //          If block
    // =========================================================

    public static IfBlock ifBlock(BiMultiVal<CodePart, IfExpr, Operator> groups, CodeSource body, ElseBlock elseBlock) {
        return ifBlock__Factory(groups, body, elseBlock);
    }

    public static IfBlock ifBlock(BiMultiVal<CodePart, IfExpr, Operator> groups, CodeSource body) {
        return ifBlock__Factory(groups, body, null);
    }

    // Factory
    private static IfBlock ifBlock__Factory(BiMultiVal<CodePart, IfExpr, Operator> groups, CodeSource body, ElseBlock elseBlock) {
        return Helper.ifExpression(groups, body, elseBlock);
    }

    // =========================================================
    //          If Checks
    // =========================================================

    public static IfExpr checkNotNull(CodePart part) {
        return Helper.checkNotNull(part);
    }

    public static IfExpr checkNull(CodePart part) {
        return Helper.checkNull(part);
    }

    public static IfExpr check(CodePart part1, Operator operator, CodePart part2) {
        return Helper.check(part1, operator, part2);
    }

    // =========================================================
    //          Try block
    // =========================================================

    public static TryBlock tryBlock(CodeSource toSurround, List<CatchBlock> catchBlocks, CodeSource finallySource) {
        return tryBlock__Factory(toSurround, catchBlocks, finallySource);
    }

    public static TryBlock tryBlock(CodeSource toSurround, CatchBlock catchBlocks, CodeSource finallySource) {
        return tryBlock__Factory(toSurround, Collections.singletonList(catchBlocks), finallySource);
    }

    public static TryBlock tryBlock(CodeSource toSurround, List<CatchBlock> catchBlocks) {
        return tryBlock__Factory(toSurround, catchBlocks, null);
    }

    public static TryBlock tryBlock(CodeSource toSurround, CatchBlock catchBlocks) {
        return tryBlock__Factory(toSurround, Collections.singletonList(catchBlocks), null);
    }

    // Factory
    private static TryBlock tryBlock__Factory(CodeSource toSurround, List<CatchBlock> catchBlocks, CodeSource finallySource) {
        return Helper.surround(toSurround, catchBlocks, finallySource);
    }

    // =========================================================
    //          Try With resources block
    // =========================================================

    public static TryBlock tryWithResources(VariableDeclaration variable, CodeSource toSurround, List<CatchBlock> catchBlocks, CodeSource finallySource) {
        return tryWithResources__Factory(variable, toSurround, catchBlocks, finallySource);
    }

    public static TryBlock tryWithResources(VariableDeclaration variable, CodeSource toSurround, CatchBlock catchBlocks, CodeSource finallySource) {
        return tryWithResources__Factory(variable, toSurround, Collections.singletonList(catchBlocks), finallySource);
    }

    public static TryBlock tryWithResources(VariableDeclaration variable, CodeSource toSurround, CodeSource finallySource) {
        return tryWithResources__Factory(variable, toSurround, Collections.emptyList(), finallySource);
    }

    public static TryBlock tryWithResources(VariableDeclaration variable, CodeSource toSurround, List<CatchBlock> catchBlocks) {
        return tryWithResources__Factory(variable, toSurround, catchBlocks, null);
    }

    public static TryBlock tryWithResources(VariableDeclaration variable, CodeSource toSurround, CatchBlock catchBlocks) {
        return tryWithResources__Factory(variable, toSurround, Collections.singletonList(catchBlocks), null);
    }

    public static TryBlock tryWithResources(VariableDeclaration variable, CodeSource toSurround) {
        return tryWithResources__Factory(variable, toSurround, Collections.emptyList(), null);
    }

    // Factory
    private static TryWithResources tryWithResources__Factory(VariableDeclaration variable, CodeSource toSurround, List<CatchBlock> catchBlocks, CodeSource finallySource) {
        return Helper.tryWithResources(variable, toSurround, catchBlocks, finallySource);
    }

    // =========================================================
    //          WhileBlock
    // =========================================================

    public static WhileBlock whileBlock(BiMultiVal<CodePart, IfExpr, Operator> parts, CodeSource source) {
        return whileBlock__Factory(parts, source);
    }

    // Factory
    private static WhileBlock whileBlock__Factory(BiMultiVal<CodePart, IfExpr, Operator> parts, CodeSource source) {
        return Helper.createWhile(parts, source);
    }

    // =========================================================
    //          DoWhileBlock
    // =========================================================

    public static DoWhileBlock doWhileBlock(BiMultiVal<CodePart, IfExpr, Operator> parts, CodeSource source) {
        return doWhileBlock__Factory(source, parts);
    }

    // Factory
    private static DoWhileBlock doWhileBlock__Factory(CodeSource source, BiMultiVal<CodePart, IfExpr, Operator> parts) {
        return Helper.createDoWhile(source, parts);
    }

    // =========================================================
    //          ForBlock
    // =========================================================

    public static ForBlock forBlock(CodePart initialization, BiMultiVal<CodePart, IfExpr, Operator> condition, CodePart update, CodeSource body) {
        return forBlock__Factory(initialization, condition, update, body);
    }

    // Factory
    private static ForBlock forBlock__Factory(CodePart initialization, BiMultiVal<CodePart, IfExpr, Operator> condition, CodePart update, CodeSource body) {
        return Helper.createFor(initialization, condition, update, body);
    }

    // =========================================================
    //          ForeachBlock
    // =========================================================

    public static ForEachBlock forEachBlock(FieldDeclaration field, IterationType iterationType, CodePart expression, CodeSource body) {
        return forEachBlock__Factory(field, iterationType, expression, body);
    }

    public static ForEachBlock forEachArray(FieldDeclaration field, CodePart expression, CodeSource body) {
        return forEachBlock__Factory(field, IterationTypes.ARRAY, expression, body);
    }

    public static ForEachBlock forEachIterable(FieldDeclaration field, CodePart expression, CodeSource body) {
        return forEachBlock__Factory(field, IterationTypes.ITERABLE_ELEMENT, expression, body);
    }

    // Factory
    private static ForEachBlock forEachBlock__Factory(FieldDeclaration field, IterationType iterationType, CodePart expression, CodeSource body) {
        return Helper.createForEach(field, iterationType, expression, body);
    }

    // =========================================================
    //          Method Spec
    // =========================================================

    public static FullMethodSpec fullMethodSpec(CodeType location, CodeType returnType, String methodName, CodeType... parameterTypes) {
        return fullMethodSpec__factory(location, returnType, methodName, parameterTypes);
    }

    public static FullMethodSpec fullMethodSpec(Class<?> location, Class<?> returnType, String methodName, Class<?>... parameterTypes) {
        return fullMethodSpec__factory(toCodeType(location), toCodeType(returnType), methodName, toCodeType(parameterTypes));
    }

    // Factory
    private static FullMethodSpec fullMethodSpec__factory(CodeType location, CodeType returnType, String methodName, CodeType... parameterTypes) {
        return new FullMethodSpec(location, returnType, methodName, parameterTypes);
    }

    // =========================================================
    //          Invoke Spec
    // =========================================================

    public static FullInvokeSpec fullInvokeSpec(InvokeType invokeType, CodeType location, CodeType returnType, String methodName, CodeType... parameterTypes) {
        return fullInvokeSpec__factory(invokeType, location, returnType, methodName, parameterTypes);
    }

    public static FullInvokeSpec fullInvokeSpec(InvokeType invokeType, Class<?> location, Class<?> returnType, String methodName, Class<?>... parameterTypes) {
        return fullInvokeSpec__factory(invokeType, toCodeType(location), toCodeType(returnType), methodName, toCodeType(parameterTypes));
    }

    // Factory
    private static FullInvokeSpec fullInvokeSpec__factory(InvokeType invokeType, CodeType location, CodeType returnType, String methodName, CodeType... parameterTypes) {
        return new FullInvokeSpec(invokeType, location, returnType, methodName, parameterTypes);
    }

    // =========================================================
    //          Method fragment
    // =========================================================

    public static MethodFragment fragment(CodeInterface codeInterface, Scope scope, CodeType returnType, CodeParameter[] parameters, CodeArgument[] arguments, CodeSource body) {
        return fragment__factory(codeInterface, scope, returnType, parameters, arguments, body);
    }

    public static MethodFragment fragment(CodeInterface codeInterface, Scope scope, CodeType returnType, CodeParameter[] parameters, CodeArgument[] arguments, Function<MethodFragment, CodeSource> source) {
        MethodFragment methodFragment = fragment__factory(codeInterface, scope, returnType, parameters, arguments, new CodeSource());

        Require.require(methodFragment.getMethod().getBody()).addAll(source.apply(methodFragment));

        return methodFragment;
    }

    public static MethodFragment fragmentStatic(CodeInterface codeInterface, CodeType returnType, CodeParameter[] parameters, CodeArgument[] arguments, CodeSource body) {
        return fragment__factory(codeInterface, Scope.STATIC, returnType, parameters, arguments, body);
    }

    public static MethodFragment fragmentStatic(CodeInterface codeInterface, CodeType returnType, CodeParameter[] parameters, CodeArgument[] arguments, Function<MethodFragment, CodeSource> source) {
        MethodFragment methodFragment = fragment__factory(codeInterface, Scope.STATIC, returnType, parameters, arguments, new CodeSource());

        Require.require(methodFragment.getMethod().getBody()).addAll(source.apply(methodFragment));

        return methodFragment;
    }

    public static MethodFragment fragmentInstance(CodeInterface codeInterface, CodeType returnType, CodeParameter[] parameters, CodeArgument[] arguments, CodeSource body) {
        return fragment__factory(codeInterface, Scope.INSTANCE, returnType, parameters, arguments, body);
    }

    public static MethodFragment fragmentInstance(CodeInterface codeInterface, CodeType returnType, CodeParameter[] parameters, CodeArgument[] arguments, Function<MethodFragment, CodeSource> source) {
        MethodFragment methodFragment = fragment__factory(codeInterface, Scope.INSTANCE, returnType, parameters, arguments, new CodeSource());

        Require.require(methodFragment.getMethod().getBody()).addAll(source.apply(methodFragment));

        return methodFragment;
    }

    // Class
    public static MethodFragment fragment(CodeInterface codeInterface, Scope scope, Class<?> returnType, CodeParameter[] parameters, CodeArgument[] arguments, CodeSource body) {
        return fragment__factory(codeInterface, scope, toCodeType(returnType), parameters, arguments, body);
    }

    public static MethodFragment fragment(CodeInterface codeInterface, Scope scope, Class<?> returnType, CodeParameter[] parameters, CodeArgument[] arguments, Function<MethodFragment, CodeSource> source) {
        MethodFragment methodFragment = fragment__factory(codeInterface, scope, toCodeType(returnType), parameters, arguments, new CodeSource());

        Require.require(methodFragment.getMethod().getBody()).addAll(source.apply(methodFragment));

        return methodFragment;
    }

    public static MethodFragment fragmentStatic(CodeInterface codeInterface, Class<?> returnType, CodeParameter[] parameters, CodeArgument[] arguments, CodeSource body) {
        return fragment__factory(codeInterface, Scope.STATIC, toCodeType(returnType), parameters, arguments, body);
    }

    public static MethodFragment fragmentStatic(CodeInterface codeInterface, Class<?> returnType, CodeParameter[] parameters, CodeArgument[] arguments, Function<MethodFragment, CodeSource> source) {
        MethodFragment methodFragment = fragment__factory(codeInterface, Scope.STATIC, toCodeType(returnType), parameters, arguments, new CodeSource());

        Require.require(methodFragment.getMethod().getBody()).addAll(source.apply(methodFragment));

        return methodFragment;
    }

    public static MethodFragment fragmentInstance(CodeInterface codeInterface, Class<?> returnType, CodeParameter[] parameters, CodeArgument[] arguments, CodeSource body) {
        return fragment__factory(codeInterface, Scope.INSTANCE, toCodeType(returnType), parameters, arguments, body);
    }

    public static MethodFragment fragmentInstance(CodeInterface codeInterface, Class<?> returnType, CodeParameter[] parameters, CodeArgument[] arguments, Function<MethodFragment, CodeSource> source) {
        MethodFragment methodFragment = fragment__factory(codeInterface, Scope.INSTANCE, toCodeType(returnType), parameters, arguments, new CodeSource());

        Require.require(methodFragment.getMethod().getBody()).addAll(source.apply(methodFragment));

        return methodFragment;
    }

    // Factory
    private static MethodFragment fragment__factory(CodeInterface codeInterface, Scope scope, CodeType returnType, CodeParameter[] parameters, CodeArgument[] arguments, CodeSource body) {
        return Helper.methodFragment(codeInterface, scope, returnType, parameters, arguments, body);
    }

    // =========================================================
    //          Utils
    // =========================================================

    private static CodeType toCodeType(Class<?> aClass) {
        return Helper.getJavaType(aClass);
    }

    private static CodeType[] toCodeType(Class<?>[] aClass) {
        return Arrays.stream(aClass).map(Helper::getJavaType).toArray(CodeType[]::new);
    }

    private static Collection<CodeType> toCodeTypeCollection(Class<?>[] aClass) {
        return Arrays.stream(aClass).map(Helper::getJavaType).collect(Collectors.toList());
    }

    public static BiMultiVal<CodePart, IfExpr, Operator> ifExprs(Object... objects) {
        BiMultiVal.Adder<CodePart, IfExpr, Operator> adder = CodeAPI.ifExprs();

        for (Object object : objects) {
            if(object instanceof IfExpr) {
                adder.add1((IfExpr) object);
            } else if(object instanceof Operator) {
                adder.add2((Operator) object);
            } else {
                throw new IllegalArgumentException("Illegal input object: '"+object+"'.");
            }
        }

        return adder.make();
    }

    public static BiMultiVal.Adder<CodePart, IfExpr, Operator> ifExprs() {
        return BiMultiVal.create(CodePart.class, IfExpr.class, Operator.class);
    }

    public static Annotation[] annotations(Annotation... annotations) {
        return annotations;
    }

    public static CodeArgument[] arguments(CodeArgument... arguments) {
        return arguments;
    }

    public static CodeParameter[] parameters(CodeParameter... parameters) {
        return parameters;
    }

    public static CodeType[] types(CodeType... types) {
        return types;
    }

    public static Class<?>[] types(Class<?>... types) {
        return types;
    }

    public static Map<String, Object> values(Object... objects) {
        Map<String, Object> map = new HashMap<>();

        if(objects.length % 2 != 0) {
            throw new IllegalArgumentException("Input must be odd (Pair of String and Object)");
        }

        for (int i = 0; i < objects.length; i+=2) {
            map.put((String) objects[i], objects[i+1]);
        }

        return map;
    }



    /**
     * Generator Specific features
     *
     * Not supported by Java Source Code generation. ({@link com.github.jonathanxd.codeapi.gen.common.PlainSourceGenerator}).
     */
    public static class Specific {
        // =========================================================
        //          Invoke Dynamic
        // =========================================================

        public static MethodInvocation invokeDynamic(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
            return Specific.invokedynamic__factory(invokeDynamic, methodInvocation);
        }

        public static MethodInvocation invokeDynamicFragment(InvokeDynamic.LambdaFragment fragment) {
            return Specific.invokedynamic__factory(fragment);
        }

        // Factory
        private static MethodInvocation invokedynamic__factory(InvokeDynamic invokeDynamic, MethodInvocation methodInvocation) {
            return Helper.invokeDynamic(invokeDynamic, methodInvocation);
        }

        private static MethodInvocation invokedynamic__factory(InvokeDynamic.LambdaFragment fragment) {
            return Helper.invokeDynamicFragment(fragment);
        }

        private static MethodInvocation invokeConstructor__factory(CodeType type, CodeArgument... arguments) {
            return Helper.invokeConstructor(type, arguments);
        }

        // Utils

        /**
         * Invoke Bootstrap methods with bsm parameters
         *
         * @param invokeType     Type
         * @param fullMethodSpec Bootstrap method
         * @param args           BSM Arguments, must be an {@link String}, {@link Integer}, {@link
         *                       Long}, {@link Float}, {@link Double}, {@link CodeType}, or {@link
         *                       FullInvokeSpec}.
         */
        public static InvokeDynamic.Bootstrap bootstrap(InvokeType invokeType, FullMethodSpec fullMethodSpec, Object... args) {
            return InvokeDynamic.invokeDynamicBootstrap(invokeType, fullMethodSpec, args);
        }

        public static InvokeDynamic.Bootstrap bootstrap(InvokeType invokeType, FullMethodSpec fullMethodSpec) {
            return InvokeDynamic.invokeDynamicBootstrap(invokeType, fullMethodSpec);
        }

        public static InvokeDynamic.LambdaMethodReference lambda(FullMethodSpec fullMethodSpec, TypeSpec expectedTypes) {
            return InvokeDynamic.invokeDynamicLambda(fullMethodSpec, expectedTypes);
        }

        public static InvokeDynamic.LambdaMethodReference code(FullMethodSpec fullMethodSpec, TypeSpec expectedTypes, MethodFragment methodFragment) {
            return InvokeDynamic.invokeDynamicLambdaFragment(fullMethodSpec, expectedTypes, methodFragment);
        }

    }

}
