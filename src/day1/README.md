Day 1: Introduction to Java & Environment Setup

This log documents the initial setup of the Java development environment on Day 1.

Today's Goals

Get a brief introduction to the Java programming language.

Install the Java Development Kit (JDK).

Configure system environment variables for Java.

Set up a simple Java project in Visual Studio Code.

Create, compile, and run our first programs.

1. Java Introduction

Today, we were introduced to Java, a high-level, class-based, object-oriented programming language. The goal is to write code that can "write once, run anywhere" (WORA).

2. JDK & Environment Path Setup

To start writing and running Java code, we needed the Java Development Kit (JDK).

JDK Installation: Downloaded and installed the appropriate JDK (e.g., from Oracle, OpenJDK).

Environment Variable Setup: To allow the command line and other tools to find the Java compiler (javac) and runtime (java), we configured the system's environment variables.

JAVA_HOME: Created a new variable pointing to the root directory of the JDK installation (e.g., C:\Program Files\Java\jdk-21).

Path: Edited the Path variable to include the JDK's bin directory (e.g., %JAVA_HOME%\bin).

3. VS Code Project Setup (No Build Tools)

We used Visual Studio Code as our code editor. We also installed the "Extension Pack for Java" from the VS Code Marketplace to get language support, debugging, and project management features.

To create our first project:

Opened the Command Palette using the shortcut Ctrl+Shift+P.

Typed and selected "Java: Create Java Project...".

When prompted for a build tool, we selected "No build tools".

We then chose a folder location for our project.

Finally, we named the project java.

This created a simple folder structure with a src directory for our source code and a lib directory for any future libraries.

4. Creating First Programs

With the project folder open in VS Code, we used the integrated terminal to organize our code:

Navigated into the source folder: cd src

Created a new directory for the day's work: mkdir day1

Entered the new directory: cd day1

Wrote the logic for our first Java files, Ascii.java and Cricket.java, based on the problems we were given.

5. Compiling and Running

After writing the code, we used the terminal (still inside the src/day1 directory) to compile and run our programs:

Compile: We used the Java compiler, javac, to create the .class (bytecode) file.

javac Ascii.java
javac Cricket.java


Run: We used the Java runtime, java, to execute the compiled bytecode. (Note: We don't add the .java or .class extension here).

java Ascii
java Cricket


Next Steps

With the basic setup and workflow established, we are ready to move on to more complex Java concepts.
