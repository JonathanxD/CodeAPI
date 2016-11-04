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
package com.github.jonathanxd.codeapi.util.gen;

import com.github.jonathanxd.codeapi.CodePart;
import com.github.jonathanxd.codeapi.interfaces.Typed;
import com.github.jonathanxd.codeapi.literals.Literal;
import com.github.jonathanxd.codeapi.literals.Literals;
import com.github.jonathanxd.codeapi.types.CodeType;

public class CodePartUtil {
    public static boolean isPrimitive(CodePart codePart) {
        if (codePart instanceof Literal) {
            return Literals.isPrimitive((Literal) codePart);
        } else if (codePart instanceof Typed) {
            Typed typed = (Typed) codePart;

            return typed.getType().orElseThrow(() -> new RuntimeException("Cannot determine type of '" + codePart + "'")).isPrimitive();
        } else {
            throw new RuntimeException("Cannot determine type of part '" + codePart + "'!");
        }

    }

    public static CodeType getTypeOrNull(CodePart codePart) {
        if (codePart instanceof Literal) {
            return ((Literal) codePart).getType().orElseThrow(NullPointerException::new);
        } else if (codePart instanceof Typed) {
            Typed typed = (Typed) codePart;

            return typed.getType().orElseThrow(() -> new RuntimeException("Cannot determine type of '" + codePart + "'"));
        } else {
            return null;
        }
    }

    public static CodeType getType(CodePart codePart) {
        CodeType type = CodePartUtil.getTypeOrNull(codePart);

        if(type == null)
            throw new RuntimeException("Cannot determine type of part '" + codePart + "'!");

        return type;
    }

    public static boolean isBoolean(CodePart part) {
        return part instanceof Literals.BoolLiteral;
    }

    public static boolean getBooleanValue(CodePart part) {
        return ((Literals.BoolLiteral) part).getValue();
    }

    public static final class Conversion {

        private Conversion() {
            throw new IllegalStateException();
        }

        public static boolean isLiteral(Object o) {
            return o instanceof Byte
                    || o instanceof Short
                    || o instanceof Integer
                    || o instanceof Double
                    || o instanceof Float
                    || o instanceof Long
                    || o instanceof String;
        }

        public static Literal toLiteral(Object o) {
            if (o instanceof Byte) {
                return Literals.BYTE((byte) o);
            } else if (o instanceof Short) {
                return Literals.SHORT((short) o);
            } else if (o instanceof Integer) {
                return Literals.INT((int) o);
            } else if (o instanceof Double) {
                return Literals.DOUBLE((double) o);
            } else if (o instanceof Float) {
                return Literals.FLOAT((float) o);
            } else if (o instanceof Long) {
                return Literals.LONG((long) o);
            } else if (o instanceof String) {
                return Literals.STRING((String) o);
            } else {
                throw new IllegalArgumentException("Cannot convert '" + o + "' to Literal.");
            }
        }

    }
}