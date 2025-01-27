# Data Encapsulation in Java

This repository contains the code examples demonstrated in the lecture on **Data Encapsulation in Java**. The lecture introduces the concepts of creating classes explicitly designed to encapsulate data while maintaining control over its access and modification.

## Overview

Data encapsulation is a fundamental principle in object-oriented programming. It involves defining classes that manage their internal state through controlled access. In Java, this is typically achieved using **getters** and **setters**, along with private variables. However, in many cases, it is necessary to ensure that certain data cannot be changed after it is initialized.

### Key Concepts Covered in the Lecture:

1. **Getters and Setters**:
   - Use private variables to control access to data.
   - Provide public methods (getters and setters) for controlled access and modification.

2. **Immutable Data**:
   - To prevent data from being modified, variables are marked as `final`.
   - With `final` variables, setters are unnecessary, and all required data must be passed to the class constructor.
   - Only **getters** are required in such cases.

3. **Encapsulation Classes**:
   - The structure of encapsulation classes is largely defined by their variables.
   - These classes focus solely on storing data.

4. **Record Classes**:
   - Java provides a shorthand for creating encapsulation classes with the `record` keyword.
   - Record classes automatically generate the boilerplate code for class variables, constructors, and getter methods.
   - Ideal for creating classes designed purely for storing data.

## Classes in This Repository
Below are the classes that were created.
- **`StudentInfo.java`**: A traditional example of an encapsulation class with private variables and getter methods.
- **`StudentInfoRecord.java`**: This `record` class will expand out to be equivalent to the `StudentInfo.java` class.

