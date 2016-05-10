/*
 *      ${expr} - Framework to generate Java code and Bytecode code. <https://github.com/JonathanxD/CodeAPI>
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

import com.github.jonathanxd.codeapi.CodeElement;
import com.github.jonathanxd.codeapi.CodeRoot;
import com.github.jonathanxd.codeapi.CodeSource;
import com.github.jonathanxd.codeapi.abs.AbstractBodiable;
import com.github.jonathanxd.codeapi.annotation.Store;
import com.github.jonathanxd.codeapi.interfaces.Implementer;
import com.github.jonathanxd.codeapi.interfaces.Modifierable;
import com.github.jonathanxd.codeapi.interfaces.QualifiedNamed;
import com.github.jonathanxd.codeapi.keywords.Keyword;
import com.github.jonathanxd.codeapi.keywords.Keywords;
import com.github.jonathanxd.codeapi.types.CodeType;
import com.github.jonathanxd.codeapi.util.CodeModifier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by jonathan on 09/05/16.
 */
public class CodeInterface extends AbstractBodiable implements Modifierable, CodeRoot, CodeType, QualifiedNamed, Implementer {

    private final String name;
    private final String qualifiedName;
    @Store(value = CodeType.class)
    private final Collection<CodeType> implementations = new ArrayList<>();
    @Store(CodeModifier.class)
    private final Collection<CodeModifier> modifiers = new ArrayList<>();

    public CodeInterface(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        this.name = qualifiedName.substring(qualifiedName.lastIndexOf('.') + 1, qualifiedName.length());
    }

    public Keyword getKeyword() {
        return Keywords.INTERFACE;
    }

    @Override
    public String getType() {
        return this.qualifiedName;
    }

    public String getName() {
        return name;
    }

    @Override
    public Collection<CodeType> getImplementations() {
        return implementations;
    }

    @Override
    public Collection<CodeModifier> getModifiers() {
        return modifiers;
    }

    @Override
    public String getQualifiedName() {
        return qualifiedName;
    }

    @Override
    public Collection<CodeElement> getAllElements() {
        Collection<CodeSource> sources = getBodies();
        return sources.stream().flatMap(Collection::stream).filter(part -> part instanceof CodeElement).map(part -> (CodeElement) part).collect(Collectors.toList());
    }

    @Override
    public void addImplementation(CodeType implementation) {
        this.implementations.add(implementation);
    }

    @Override
    public void clearImplementations() {
        this.implementations.clear();
    }

    @Override
    public void addModifier(CodeModifier modifier) {
        this.modifiers.add(modifier);
    }

    @Override
    public void clearModifiers() {
        this.modifiers.clear();
    }

}
