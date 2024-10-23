# Lesson 1: Introduction to programming.

## Types of Languages

1. Procedural
    - Series of well sructured steps
    - systematic order of statements, functions and commands to complete a task

2. Functional
    - use of pure functions to write programs. 
    - Used in situations where lots of different opeartions are performed on the same data.

3. Object Oriented
    - Uses objec

## Static vs Dynamic languages

  | Static                                | Dynamic                                                    |
  |---------------------------------------|------------------------------------------------------------|
  | Perform type checking at compile time | Perform type checking at runtime                           |
  | More control                          | Error might not show till program is run                   |
  | Errors will show at compilt time      | No nedd to declare datatype of variables                   |
  | Declare datatype before you use it    | Saves time in writing code but might give error at runtime |
  | Example: Java, C , CPP                | Example: JavaScript, Python                                |

## Stack and Heap memory

 - When writing code the variable is stored in the stack memory and the value is stored in the heap since it's an object.
 - Whenever we call the variable it will point to the value that is stored in the heap.

### Garbage collection: 

- Any unreferenced object will be collected as garbage.

---

# Lesson 2: Introduction to Java - Architecture

## Execution of java code: 

1. Source code 
2. Compiler will compile the source code and produce a .class file. This file will hold the byte code. the byte code is the machine
    language for the JVM.
3. Interpreter will go through the byte code line by line and convert it to machine code, which will then be executed.

> [!NOTE]
> Java code never runs directly on the system, it runs on JVM(more on it later). This is the reason why Java is platform independent.

## Architecture of Java

- JDK  = JRE + Development tools
    - JRE = JVM + Library Classes 
        - JVM 
            - JIT


### JDK

- Stands for Java Development Kit
- Provides environment to develop and run java programs.
- Includes: 
    - development tools 
    - JRE to execute programs 
    - a compiler : javac 
    - archiver : jar 
    - docs generator : javadoc 
    - interpreter/ loader

### JRE 

- Stands for Java Runtime Environment. 
- Includes: 
    - Deployment technologies 
    - User interface toolkits 
    - Integration libraries 
    - Base libraries 
    - JVM 
- Handles the operations that are performed after the .class file is generated.
    - Class loader loads class file
    - JVM sends code to byte code verifier to check the format of the code.

### JVM 

**Working:** 

- Source code is compiled and .class file is generated.
    - Class loader then performs the following operations: 
        - Loading: 
            - Reads .class file and generate binary data.
            - an object of this class is created in heap.
        - Linking: 
            - JVM verifies the .class file
            - allocates memory for class variables
            - replace symbolic referenced from the type with direct references.
        - Initialization: All static variables are assigned with their values. 
---

# Lesson 3: Making our first Java program

## The 'Hello World Application':

```java 
class HelloWorldApp{
    public static void main(String[] args){
        System.out.println("Hello World!"); // Display the string.
    }
}
```

### Closer look at the "Hello World!" Application 

`class HelloWorldApp`: 
- This is the class definition, it consists of the `class` keyword. This instantiates a new class called `HelloWorldApp` and uses the curly braces to open and close the block for the class.
- Every file in java begins with a class definition.

`public static void main(String[] args)`:
- This is the main method. In Java every application must contain a main method.
- `public`, `static` are called *modifiers*.
- `args` is an array variable of `String` data type that will contain command line arguements.

`System.out.println("Hello World!);`: 
- `System` is another class which belongs to the core library. This will print the provided arguements to the standard output. 

