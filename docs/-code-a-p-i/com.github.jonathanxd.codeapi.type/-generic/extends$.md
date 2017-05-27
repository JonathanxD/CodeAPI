[CodeAPI](../../index.md) / [com.github.jonathanxd.codeapi.type](../index.md) / [Generic](index.md) / [extends$](.)

# extends$

`fun extends$(s: String): `[`Generic`](index.md)

Generic type that extends type variable `s`.

### Parameters

`s` - Type name.

**Return**
New instance of generic type.

`fun extends$(vararg ss: String): `[`Generic`](index.md)

Generic type that extends type variables `ss`.

### Parameters

`ss` - Types names.

**Return**
New instance of generic type.

`fun extends$(type: `[`CodeType`](../-code-type/index.md)`): `[`Generic`](index.md)
`fun extends$(type: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<*>): `[`Generic`](index.md)

Generic type that extends type `type`.

### Parameters

`type` - Type.

**Return**
New instance of generic type.

`fun extends$(vararg types: `[`CodeType`](../-code-type/index.md)`): `[`Generic`](index.md)
`fun extends$(vararg types: `[`Class`](http://docs.oracle.com/javase/6/docs/api/java/lang/Class.html)`<*>): `[`Generic`](index.md)

Generic type that extends types `types`.

### Parameters

`types` - Types.

**Return**
New instance of generic type.
