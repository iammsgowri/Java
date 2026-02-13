# Interface

## Interface Definition

```java
"INTERFACE" is a "INSTANCE" of "CLASS"
```

## Interface Syntax

```java
public interface InterfaceName {

	returntype methodName();
	returntype methodName(parameters); 

}
```

```java
"INTERFACE METHODS" are "PUBLIC, "STATIC" by default
```

```java
public interface InterfaceName {

	public static returntype methodName();
	public static returntype methodName(parameters); 

}
```


```java
"INTERFACE" contains "IMPLEMENTED METHODS" 
```

```java
public interface InterfaceName {

	public static returntype methodName(){
	}

	public static returntype methodName(){
	}
}
```

```java
"INTERFACE" contains "UNIMPLEMENTED METHODS" which are "IMPLEMENTED" using "implements" keyword in "CLASS"
```

```java
public interface InterfaceName {

	public static returntype methodName(parameter);
	public static returntype methodName(parameter);
}
```

```java
public class ClassName implements InterfaceName {

	@Override
	public static returntype methodName(parameter) {
	
	}
	
	@Override
	public static returntype methodName(parameter) {
	
	}
	

}

```


