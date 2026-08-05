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

## 📐 Practical Examples

### Calculating Area of a Rectangle
```java
int length = 100;
int width = 50;
int area = length * width;
System.out.println("Area of rectangle: " + area);
```
