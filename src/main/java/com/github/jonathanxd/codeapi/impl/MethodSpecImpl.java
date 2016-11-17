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
package com.github.jonathanxd.codeapi.impl;

import com.github.jonathanxd.codeapi.annotation.GenerateTo;
import com.github.jonathanxd.codeapi.common.CodeArgument;
import com.github.jonathanxd.codeapi.common.MethodType;
import com.github.jonathanxd.codeapi.common.TypeSpec;
import com.github.jonathanxd.codeapi.helper.Helper;
import com.github.jonathanxd.codeapi.interfaces.MethodSpecification;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.util.ToStringBuilder;
import com.github.jonathanxd.codeapi.util.gen.TypeSpecUtil;

import java.util.Collections;
import java.util.List;

/**
 * Created by jonathan on 10/05/16.
 */
@GenerateTo(MethodSpecification.class)
public class MethodSpecImpl implements MethodSpecification {

    private final List<CodeArgument> arguments;
    private final String methodName;
    private final TypeSpec methodDescription;
    private final MethodType methodType;

    public MethodSpecImpl(String methodName, List<CodeArgument> arguments) {
        this(methodName, arguments, (CodeType) null, MethodType.METHOD);
    }

    public MethodSpecImpl(String methodName, CodeType returnType, List<CodeArgument> arguments) {
        this(methodName, arguments, returnType, MethodType.METHOD);
    }

    public MethodSpecImpl(String methodName, Class<?> returnType, List<CodeArgument> arguments) {
        this(methodName, arguments, Helper.getJavaType(returnType), MethodType.METHOD);
    }

    public MethodSpecImpl(String methodName, CodeType returnType, List<CodeArgument> arguments, MethodType methodType) {
        this(methodName, arguments, returnType, methodType);
    }

    public MethodSpecImpl(String methodName, Class<?> returnType, List<CodeArgument> arguments, MethodType methodType) {
        this(methodName, arguments, Helper.getJavaType(returnType), methodType);
    }

    public MethodSpecImpl(String methodName, TypeSpec methodDescription, List<CodeArgument> arguments) {
        this(methodName, methodDescription, arguments, methodName != null && methodName.equals("<init>") ? MethodType.CONSTRUCTOR : MethodType.METHOD);
    }

    public MethodSpecImpl(String methodName, List<CodeArgument> arguments, CodeType returnType, MethodType methodType) {
        if(methodName == null && methodType == null)
            throw new IllegalArgumentException("Only one of these arguments can be null: methodName or methodType.");

        this.arguments = arguments == null ? Collections.emptyList() : Collections.unmodifiableList(arguments);
        this.methodName = methodName != null ? methodName : methodType == MethodType.CONSTRUCTOR ? "<init>" : null;
        this.methodDescription = TypeSpecUtil.specFromLegacy(returnType, arguments);
        this.methodType = methodType == null ? (this.methodName.equals("<init>") ? MethodType.CONSTRUCTOR : MethodType.METHOD) : methodType;
    }

    public MethodSpecImpl(String methodName, TypeSpec methodDescription, List<CodeArgument> arguments, MethodType methodType) {
        if(methodName == null && methodType == null)
            throw new IllegalArgumentException("Only one of these arguments can be null: methodName or methodType.");

        this.arguments = arguments == null ? Collections.emptyList() : Collections.unmodifiableList(arguments);
        this.methodName = methodName != null ? methodName : methodType == MethodType.CONSTRUCTOR ? "<init>" : null;
        this.methodDescription = methodDescription;
        this.methodType = methodType == null ? (this.methodName.equals("<init>") ? MethodType.CONSTRUCTOR : MethodType.METHOD) : methodType;
    }

    @Override
    public String getMethodName() {
        return methodName;
    }

    @Override
    public MethodSpecImpl setMethodName(String name) {
        return new MethodSpecImpl(name, this.getMethodDescription(), this.getArguments(), this.getMethodType());
    }

    @Override
    public TypeSpec getMethodDescription() {
        return methodDescription;
    }

    @Override
    public MethodSpecImpl setMethodDescription(TypeSpec desc) {
        return new MethodSpecImpl(this.getMethodName(), desc, this.getArguments(), this.getMethodType());
    }

    @Override
    public List<CodeArgument> getArguments() {
        return this.arguments;
    }

    @Override
    public MethodSpecImpl setArguments(List<CodeArgument> codeArgumentList) {
        return new MethodSpecImpl(this.getMethodName(), this.getMethodDescription(), codeArgumentList, this.getMethodType());
    }

    @Override
    public boolean isArray() {
        return false;
    }

    @Override
    public MethodType getMethodType() {
        return methodType;
    }

    @Override
    public MethodSpecImpl setMethodType(MethodType type) {
        return new MethodSpecImpl(this.getMethodName(), this.getMethodDescription(), this.getArguments(), type);
    }

    @Override
    public String toString() {
        return ToStringBuilder.builder(this.getClass())
                .add("type", this.getMethodType())
                .add("methodName", this.getMethodName())
                .add("description", this.getMethodDescription())
                .add("arguments", this.getArguments())
                .toString();
    }
}
