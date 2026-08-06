# Java Fundamentals & Basics

This repository contains essential Java concepts and code examples documented in [`Main.java`](file:///Users/syamsundarboppana/Desktop/JAVA/Main.java).

---

## 📌 Table of Contents
- [How to Run](#how-to-run)
- [Key Java Rules & Conventions](#key-java-rules--conventions)
- [Comments in Java](#comments-in-java)
- [Variables & Data Types](#variables--data-types)
- [Constants (`final` Keyword)](#constants-final-keyword)
- [Type Casting](#type-casting)
- [Operators](#operators)
- [Java Strings](#java-strings)
- [Practical Examples](#practical-examples)

---

## 🚀 How to Run

### 1. Compile the Java Code
```bash
javac Main.java
```

### 2. Execute the Compiled Code
```bash
java Main
```

> **Note:** Java is case-sensitive! Running `java main` instead of `java Main` will result in an error.

---

## 🔑 Key Java Rules & Conventions
* **File & Class Naming:** The Java source file name must match the public class name (`Main.java` for `public class Main`). Java uses the class name to find and execute code.
* **Statements:** Every statement in Java must end with a semicolon `;`.
* **String Literals:** Text values must be enclosed in double quotation marks `""`.

---

## 💬 Comments in Java

Comments are ignored by the compiler and are used to document code.

* **Single-line Comment:** Starts with `//`
  ```java
  // Prints "Hello, World" to the terminal window
  ```
* **Multi-line Comment:** Enclosed between `/*` and `*/`
  ```java
  /* The code below will print the words Hello World
     to the screen, and it is amazing */
  ```

---

## 📊 Variables & Data Types

Java is a strongly-typed language. Every variable must have a declared data type.

| Data Type | Description | Example |
| :--- | :--- | :--- |
| `String` | Stores text values | `"Syam Sundar"` |
| `int` | Stores integer values (whole numbers) | `1` |
| `float` | Stores floating-point numbers (requires `f` suffix) | `99.9f` |
| `boolean` | Stores truth values (`true` or `false`) | `true` |
| `char` | Stores single characters (in single quotes) | `'A'` |

### Code Example
```java
String name = "Syam Sundar";
int rank = 1;
float percentage = 99.9f;
boolean isPassed = true;
char grade = 'A';

// Printing combined variable values (String Concatenation)
System.out.println(name + " has secured rank " + rank + " with percentage " + percentage + " and has passed: " + isPassed + " with grade " + grade);
```

---

## 🔒 Constants (`final` Keyword)

Use the `final` keyword when you want a variable's value to remain unchangeable (read-only).

```java
final double PI = 3.14159;
System.out.println("Value of PI: " + PI);
```

---

## 🔄 Type Casting

Type casting is assigning a value of one primitive data type to another type.

### 1. Widening Casting (Automatic)
Converting a smaller type to a larger type size (`int` to `double`).

```java
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double
```

### 2. Narrowing Casting (Manual)
Converting a larger type to a smaller type size (`double` to `int`).

```java
double myDoubles = 9.78d;
int myInts = (int) myDoubles; // Manual casting: double to int
```

---

## ➗ Operators

### 1. Arithmetic Operators
Used to perform common mathematical operations.

| Operator | Description | Example |
| :--- | :--- | :--- |
| `+` | Addition | `a + b` |
| `-` | Subtraction | `a - b` |
| `*` | Multiplication | `a * b` |
| `/` | Division | `a / b` |
| `%` | Modulus (remainder) | `a % b` |
| `++` | Increment (increase by 1) | `++a` |
| `--` | Decrement (decrease by 1) | `--b` |

```java
int a = 20;
int b = 10;
System.out.println("a + b: " + (a + b));  // 30
System.out.println("a - b: " + (a - b));  // 10
System.out.println("a * b: " + (a * b));  // 200
System.out.println("a / b: " + (a / b));  // 2
System.out.println("a % b: " + (a % b));  // 0
System.out.println("a++: " + (++a));      // 21
System.out.println("b--: " + (--b));      // 9
```

### 2. Comparison Operators
Used to compare two values.

| Operator | Description | Example |
| :--- | :--- | :--- |
| `==` | Equal to | `a == b` |
| `!=` | Not equal | `a != b` |
| `<` | Less than | `a < b` |
| `>` | Greater than | `a > b` |
| `<=` | Less than or equal to | `a <= b` |
| `>=` | Greater than or equal to | `a >= b` |

```java
System.out.println("a == b: " + (a == b));
System.out.println("a != b: " + (a != b));
System.out.println("a < b: " + (a < b));
System.out.println("a > b: " + (a > b));
System.out.println("a <= b: " + (a <= b));
System.out.println("a >= b: " + (a >= b));
```

### 3. Logical Operators
Used to determine the logic between variables or values.

| Operator | Description | Example |
| :--- | :--- | :--- |
| `&&` | Logical AND (true if both are true) | `c && d` |
| `\|\|` | Logical OR (true if at least one is true) | `c \|\| d` |
| `!` | Logical NOT (reverses the result) | `!c` |

```java
boolean c = true;
boolean d = false;
System.out.println("c && d: " + (c && d));  // false
System.out.println("c || d: " + (c || d));  // true
System.out.println("!c: " + (!c));          // false
```

### 4. Operator Precedence
Some common operators, from highest to lowest priority:

| Priority | Operators |
| :--- | :--- |
| 1 (Highest) | `()` - Parentheses |
| 2 | `*`, `/`, `%` - Multiplication, Division, Modulus |
| 3 | `+`, `-` - Addition, Subtraction |
| 4 | `>`, `<`, `>=`, `<=` - Comparison |
| 5 | `==`, `!=` - Equality |
| 6 | `&&` - Logical AND |
| 7 | `\|\|` - Logical OR |
| 8 (Lowest) | `=` - Assignment |

```java
int result1 = 10 - 2 + 5;      // (10 - 2) + 5 = 13
int result2 = 10 - (2 + 5);    // 10 - 7 = 3
```

---

## 📝 Java Strings

A `String` in Java is actually an **object**, which means it contains methods that can perform certain operations on strings.

### 1. String Length (`.length()`)
Finds the number of characters in a string.

```java
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());  // 26
```

### 2. Uppercase & Lowercase (`.toUpperCase()` / `.toLowerCase()`)
Converts a string to uppercase or lowercase.

```java
String text1 = "Hello World";
System.out.println(text1.toUpperCase());  // "HELLO WORLD"
System.out.println(text1.toLowerCase());  // "hello world"
```

### 3. Find Index of Substring (`.indexOf()`)
Finds the first occurrence of a substring within a string.

```java
String text2 = "Please locate where 'locate' occurs!";
System.out.println(text2.indexOf("locate"));  // 7
```

### 4. Character at Index (`.charAt()`)
Returns the character at a specified index (0-based).

```java
String text3 = "Hello";
System.out.println(text3.charAt(0));  // H
System.out.println(text3.charAt(4));  // o
```

---

## 📐 Practical Examples

### Calculating Area of a Rectangle
```java
int length = 100;
int width = 50;
int area = length * width;
System.out.println("Area of rectangle: " + area);
```
