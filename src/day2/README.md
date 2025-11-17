
---

# Java OOP and Programming Fundamentals

This repository contains a collection of Java programs developed as part of the BIZOTIC course modules. These projects demonstrate fundamental Java programming concepts and core Object-Oriented Programming (OOP) principles.

---

## 💡 Core Concepts Demonstrated

### **1. Classes and Objects**

A **class** is a blueprint for creating objects, and an **object** is an instance of that class.
Programs like **Employee**, **BankAccount**, **Shape**, and **Professor** illustrate how real-world entities can be modeled using classes.

### **2. Encapsulation**

Encapsulation protects data by restricting direct access to class variables. This is implemented using:

* **Private Variables** – data hidden from outside the class.
* **Getters and Setters** – public methods to access and update private data safely.

### **3. Constructors & Constructor Overloading**

* **Constructors** initialize objects when they are created.
* **Constructor Overloading** allows multiple constructors with different parameter lists inside a single class.

The **Shape** program demonstrates this by creating different constructors for Cube, Sphere, and Cylinder.

### **4. Inheritance (Single & Multilevel)**

Inheritance allows one class to acquire the properties and behavior of another.

* **Single Inheritance:** One class inherits from one parent class (e.g., `empLevel` → `Employee`).
* **Multilevel Inheritance:** A chain of inheritance (e.g., `Person` → `Student` → `Graduate`).

### **5. Keywords: `this` and `super`**

* **`this`** refers to the current object's instance variables.
* **`super`** is used to access parent class methods or constructors.

---

## 🚀 Program List & Details

### **Module 5: Classes and Objects**

#### ✔ Program 1 – Employee Data Management

Stores employee name and salary with private variables.
Uses getters and setters to implement encapsulation.

#### ✔ Program 2 – Bank Account Management

Maintains a private account balance.
Uses `deposit()` and `withdraw()` methods instead of direct setters to enforce business rules.

---

### **Module 6: Constructors & Static**

#### ✔ Program 1 – Shape Calculator

Calculates area/volume for different shapes using constructor overloading:

* Cube constructor
* Sphere constructor
* Cylinder constructor

The constructor invoked depends on the parameters passed.

---

### **Module 7: Inheritance**

#### ✔ Program 1 – Employee Level Categorization

Demonstrates **single inheritance** where the subclass extends a base `Employee` class and assigns salary levels.

#### ✔ Program 2 – Student → Graduate Tracker

Shows **multilevel inheritance** through a 3-level hierarchy:
`Person` → `Student` → `Graduate`.

---

### **Other Programs**

#### ✔ Professor Salary Filter

Creates an array of `Professor` objects and prints details of those with salaries ≥ 20,000.

#### ✔ Super Quiz Bee

Finds a participant’s team by calculating the absolute difference between the first and last digit of a registration number.

#### ✔ SoftCompInfo Encryption

Finds and sums all non-prime digits in a number to generate an encryption key.

---

## 💻 How to Run

Each program is an independent `.java` file.
To compile and run:

### **1. Open Terminal / Command Prompt**

### **2. Navigate to the folder**

```bash
cd path/to/your/java/files
```

### **3. Compile the program**

```bash
javac FileName.java
```

### **4. Run the program**

```bash
java FileName
```

### **5. Enter input when prompted**

---


