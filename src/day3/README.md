

---

# BIZOTIC - Java OOP Concepts (Day 3)

This README covers the Java programs and Object-Oriented Programming (OOP) concepts from **Day 3**, focusing on **Polymorphism, Abstract Classes, Interfaces, and Arrays**.

---

## 💡 Core Concepts Demonstrated

### **1. Polymorphism (Module 8)**

Polymorphism allows an object to take multiple forms. It is demonstrated in two ways:

#### ✔ Method Overloading (Compile-Time Polymorphism)

Multiple methods with the same name but different parameters.
Used in the **Bank Interest Calculator**, where multiple versions of `getInterestRate()` accept different input types.

#### ✔ Method Overriding (Runtime Polymorphism)

A subclass redefines a method from its superclass.
Used in:

* **Employee/Manager Bonus Program**
* **VIP Account Program**

---

### **2. Abstract Classes (Module 9)**

An abstract class cannot be instantiated and serves as a base for subclasses. It may include:

* Abstract methods (no body)
* Concrete methods

Used in the **Appliance Bill Calculator**, where subclasses (`Fan`, `Light`, `TV`) override the `amount()` method.

---

### **3. Interfaces (Module 9)**

An interface defines a contract of methods that implementing classes must provide.

Used in the **Bank Maintenance Charge** program, where:

* `SavingsAccount`
* `CurrentAccount`

implement the `MaintenanceCharge` interface.

---

### **4. Arrays (Module 10)**

Arrays store multiple values of the same type.
Covered are:

* **Single-dimensional arrays**
* **Multi-dimensional arrays**

Used in:

* **Relay Race Score Calculator**
* **Spiral Matrix traversal**

---

## 🚀 Program Details

### **Module 8: Polymorphism**

#### ✔ Bank Interest Calculator (Program 1)

* Demonstrates **method overloading**.
* Calculates interest for Savings, Fixed Deposit, and Recurring Deposit accounts.
* Overloaded `getInterestRate()` accepts different parameter types.

#### ✔ Employee/Manager Bonus (Program 2)

* Demonstrates **method overriding**.
* `Manager` overrides `calculateBonus()` to apply a different bonus rate.

#### ✔ VIP Account Management (Program 3)

* Demonstrates **method overriding**.
* `VIPAccount` overrides `setAccountBalance()` to allow a negative balance (overdraft).

---

### **Module 9: Abstract Classes and Interfaces**

#### ✔ Bank Maintenance Charge (Program 1)

* Demonstrates **interfaces**.
* Interface: `MaintenanceCharge`
* Implementations:

  * `SavingsAccount`
  * `CurrentAccount`
* Each class applies its own formula for maintenance fee calculation.

#### ✔ Appliance Bill Calculator (Program 2)

* Demonstrates **abstract classes** and overriding.
* Base class: `currentBill`
* Subclasses: `Fan`, `Light`, `TV`
* Each subclass overrides `amount()` to compute its own consumption.

---

### **Module 10: Arrays**

#### ✔ Relay Race Score (Program 1)

* Demonstrates single-dimensional array manipulation.
* For a given array of speeds, computes a new array where each element is:
  **product of all speeds except speeds[i]**
  (without using division).

#### ✔ Spiral Matrix

* Demonstrates **2D array traversal**.
* Prints elements of a matrix in clockwise spiral order.

---

## 💻 How to Run

Each file is a standalone Java program.

### **1. Open Terminal / Command Prompt**

### **2. Navigate to the folder**

```bash
cd path/to/your/java/files
```

### **3. Compile a Java program**

```bash
javac FileName.java
```

### **4. Run the program**

```bash
java FileName
```

### **5. Provide input if required**

---
