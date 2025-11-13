# Day 1: Introduction to Java & Environment Setup

## Overview
This session focused on setting up the Java development environment and running our first basic Java programs.

## Today's Goals
- Get an introduction to the Java programming language.  
- Install the Java Development Kit (JDK).  
- Configure system environment variables for Java.  
- Set up a simple Java project in Visual Studio Code.  
- Create, compile, and run the first Java programs.

---

## 1. Java Introduction
We learned that **Java** is a **high-level, class-based, object-oriented programming language** designed to be platform-independent.  
Its main principle is **“Write Once, Run Anywhere (WORA)”**, meaning compiled Java programs can run on any system with a Java Virtual Machine (JVM).

---

## 2. JDK Installation & Environment Setup
To start coding in Java, we installed the **Java Development Kit (JDK)**, which provides the compiler (`javac`) and runtime (`java`) tools.

### Steps:
1. **JDK Installation:** Downloaded and installed the appropriate JDK (e.g., Oracle JDK or OpenJDK).  
2. **Environment Variables Configuration:**  
   - **JAVA_HOME:** Created a variable pointing to the JDK installation folder (e.g.,  
     `C:\Program Files\Java\jdk-21`).  
   - **Path Variable:** Added `%JAVA_HOME%\bin` to the system `Path` to make Java commands available globally.  

After setup, running `java -version` and `javac -version` in the terminal confirmed a successful installation.

---

## 3. Setting Up a Java Project in VS Code
We used **Visual Studio Code** as the code editor and installed the **“Extension Pack for Java”** to enable Java language support, debugging, and project management.

### Steps:
1. Opened the Command Palette (**Ctrl + Shift + P**).  
2. Selected **“Java: Create Java Project…”**.  
3. Chose **“No build tools”** (for a simple project).  
4. Selected the desired folder location.  
5. Named the project **`java`**.

This created a folder structure with:
- `src/` → Source code folder  
- `lib/` → For libraries (if needed later)

---

## 4. Writing the First Programs
Inside VS Code:
1. Opened the integrated terminal.  
2. Navigated to the source folder:  
   ```bash
   cd src
   mkdir day1
   cd day1
   ```
3. Created and wrote two Java programs:  
   - **Ascii.java** — to display ASCII values.  
   - **Cricket.java** — a small program based on the given problem.

---

## 5. Compiling and Running Java Programs
We used terminal commands to compile and execute our programs:

### Compile the code:
```bash
javac Ascii.java
javac Cricket.java
```

### Run the programs:
```bash
java Ascii
java Cricket
```

> **Note:** We do not include `.java` or `.class` extensions when running the program.

---

## Next Steps
With the environment and workflow successfully set up, the next step is to explore **core Java concepts** such as data types, control statements, input/output handling, and basic problem-solving using Java.
