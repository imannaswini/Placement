
-----

# BIZOTIC Java Programming Assignments

[cite\_start]This repository contains a collection of Java programming problems from BIZOTIC technical modules[cite: 1, 24, 43, 69, 83, 105, 126, 148, 171]. The problems cover fundamental concepts including basic I/O, operators, conditional statements, and control loops.

## Modules Overview

  * [Module 1: TECH 201 - Introduction to Java](https://www.google.com/search?q=%23module-1-tech-201---introduction-to-java)
  * [Module 2: TECH 202 - Taking Input in Java](https://www.google.com/search?q=%23module-2-tech-202---taking-input-in-java)
  * [Module 3: TECH 203 - Conditional Statements](https://www.google.com/search?q=%23module-3-tech-203---conditional-statements)
  * [Module 4: TECH 204 - Control Statements](https://www.google.com/search?q=%23module-4-tech-204---control-statements)
  * [Additional Problems](https://www.google.com/search?q=%23additional-problems)

-----

## [cite\_start]Module 1: TECH 201 - Introduction to Java [cite: 127]

[cite\_start]This module covers an introduction to Java, its applications, features, and the concepts of JDK, JRE, and JVM, as well as data types and variables[cite: 129, 130, 131].

### [cite\_start]1. Magic Board [cite: 133]

  * [cite\_start]**Task:** Help Ritik build a "magic board" that converts exactly four input numbers into their corresponding ASCII characters without using loops[cite: 133, 134, 135].
  * [cite\_start]**Input:** Four integer digits entered by the user (e.g., 65, 66, 67, 68)[cite: 137, 138, 139, 140, 141].
  * [cite\_start]**Output:** The number and its corresponding character, separated by a hyphen (e.g., `65-A`)[cite: 143, 144, 145, 146].

-----

## [cite\_start]Module 2: TECH 202 - Taking Input in Java [cite: 172, 173]

[cite\_start]This module focuses on using the `Scanner` class for input, operators, expressions, and type casting[cite: 175, 177, 179].

### [cite\_start]1. Cricket Stadium [cite: 181]

  * [cite\_start]**Task:** Help the corporation calculate the exact length of rope needed for fencing (perimeter) and the exact quantity of carpet (area) for a rectangular ground[cite: 182, 184, 185, 187, 189].
  * [cite\_start]**Input:** Two integers: the length and the breadth of the ground[cite: 190].
  * [cite\_start]**Output:** Two integers: the calculated length of the rope (perimeter) and the quantity of carpet (area)[cite: 191, 192].

-----

## [cite\_start]Module 3: TECH 203 - Conditional Statements [cite: 2]

[cite\_start]This module covers conditional statements like `if`, `if-else`, `if-else-if`, nested `if`, and `switch-case`[cite: 4, 5].

### [cite\_start]1. Investor Stock Decision [cite: 7]

  * [cite\_start]**Task:** Determine if an investor should "Buy," "Hold," or "Sell" a stock based on its price change from the previous month[cite: 7, 11].
  * **Conditions:**
      * [cite\_start]**Buy:** If the stock price increased by more than 10%[cite: 8].
      * [cite\_start]**Hold:** If the stock price stayed within 5-10% of its previous value[cite: 9].
      * [cite\_start]**Sell:** If the stock price dropped by more than 5%[cite: 10].
  * [cite\_start]**Input:** The stock price a month ago (float) and the current stock price (float)[cite: 13, 14].
  * [cite\_start]**Output:** A string: "Buy," "Hold," or "Sell"[cite: 16].

-----

## [cite\_start]Module 4: TECH 204 - Control Statements [cite: 149]

[cite\_start]This module introduces control statements like `for`, `while`, `do-while` loops, as well as `break` and `continue`[cite: 151, 152].

### [cite\_start]1. Kaprekar Number [cite: 155]

  * [cite\_start]**Task:** Determine if a given number is a Kaprekar number[cite: 156].
  * **Logic:** A Kaprekar number's square can be divided into two parts whose sum equals the original number. [cite\_start]Neither part can be zero[cite: 156, 169]. [cite\_start]For example, $45^2 = 2025$, and $20 + 25 = 45$[cite: 159].
  * [cite\_start]**Input:** An integer `n`[cite: 157].
  * [cite\_start]**Output:** "Yes" or "No"[cite: 158, 161].

-----

## Additional Problems

These are other problems from the provided documents, not explicitly tied to a module number.

### [cite\_start]The Newspaper Agency [cite: 26]

  * [cite\_start]**Task:** Calculate the profit a newspaper agency makes on its Sunday special edition[cite: 30, 31].
  * **Logic:** The profit is based on the number of copies sold (`w`), the selling price per copy (`x`), and the cost per copy (`y`), minus a fixed cost of Rs. [cite\_start]100[cite: 27, 28, 29].
  * [cite\_start]**Input:** Three integers: `w`, `x`, and `y`[cite: 32].
  * [cite\_start]**Output:** A single integer representing the total profit[cite: 34].

### [cite\_start]Tiered Water Tariff System [cite: 107]

  * [cite\_start]**Task:** Develop a billing system to calculate a customer's total water bill based on a tiered tariff structure[cite: 108, 112].
  * **Tiers:**
      * First 100 litres: Rs. [cite\_start]2 per litre[cite: 109].
      * 101 to 500 litres: Rs. [cite\_start]1.5 per litre[cite: 110].
      * Above 500 litres: Rs. [cite\_start]1 per litre[cite: 111].
  * [cite\_start]**Input:** The total number of litres consumed[cite: 113].
  * [cite\_start]**Output:** The total water bill[cite: 114].

### [cite\_start]Minimum Travel Time [cite: 42]

  * [cite\_start]**Task:** Help Williams decide whether to use the "Stairs" or "Elevator" to minimize his travel time from floor `N` to the ground floor[cite: 46, 52].
  * [cite\_start]**Stairs:** Williams's velocity is `V1` m/s, and the stair length is `sqrt(2) * N` meters[cite: 48, 51].
  * **Elevator:** The elevator moves at `V2` m/s. [cite\_start]It travels from the ground floor to floor `N` and then back down to the ground floor, covering a total distance of `2 * N` meters (N up, N down)[cite: 49, 50, 51].
  * [cite\_start]**Input:** Three space-separated integers: `N`, `V1`, `V2`[cite: 55].
  * [cite\_start]**Output:** A single line: "Elevator" or "Stairs"[cite: 57].

### [cite\_start]The Chronicles of Narnia [cite: 68]

  * [cite\_start]**Task:** Help Lucy find the route to her home by finding the sum of the digits of a 2-digit number found on a tree[cite: 75, 76].
  * [cite\_start]**Input:** An integer corresponding to the 2-digit number[cite: 76].
  * [cite\_start]**Output:** An integer corresponding to the sum of its digits[cite: 77].

### [cite\_start]Co-Partners in Train [cite: 85]

  * [cite\_start]**Task:** Identify the "Co-Partner" berth for a given berth number in a train[cite: 87, 98].
  * [cite\_start]**Logic:** The coach is arranged in blocks of 8[cite: 88]. The co-partner pairings within each block are:
      * [cite\_start]1 (LB) ↔ 4 (LB) [cite: 101]
      * [cite\_start]2 (MB) ↔ 5 (MB) [cite: 100]
      * [cite\_start]3 (UB) ↔ 6 (UB) [cite: 99]
      * [cite\_start]7 (SL) ↔ 8 (SU) [cite: 102]