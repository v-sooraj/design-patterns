# Duck Simulator using Strategy Pattern

## Overview
This project demonstrates the **Strategy Design Pattern** in Java by simulating different types of ducks and their behaviors.  
The goal is to **encapsulate behaviors that vary** (like flying and quacking) and allow dynamic behavior changes at runtime.

---

## Key Concepts
- **Strategy Pattern**: Defines a family of algorithms/behaviors and encapsulates each one, making them interchangeable.
- **Context Class**: `Duck` acts as the context, delegating behavior to strategy objects.
- **Strategy Interface**: `FlyBehaviour` and `QuackBehaviour` define families of behaviors.
- **Concrete Strategies**: Implement specific behaviors (`FlyWithWings`, `FlyNoWay`, `Quack`, `Squeak`, etc.).
- **Dynamic Behavior Change**: Setters allow a duck to change its fly or quack behavior at runtime.

---

## Features
- Multiple types of ducks (`MallardDuck`, `RedheadDuck`, `RubberDuck`, `DecoyDuck`).
- Each duck can:
  - **Swim** (`swim()`)
  - **Perform flying behavior** (`performFly()`)
  - **Perform quacking behavior** (`performQuack()`)
- **Encapsulation of behaviors** allows easy extension and modification without changing existing code.

---

## Design Principles Applied
1. **Encapsulate what varies**: Flying and quacking behaviors are separated from Duck class.
2. **Favor composition over inheritance**: Duck class holds references to behavior interfaces.
3. **Program to interface, not implementation**: Ducks depend on `FlyBehaviour` and `QuackBehaviour`, not concrete classes.
4. **Open/Closed Principle**: New behaviors can be added without modifying existing duck classes.

---

## Class Diagram
<img width="1391" height="707" alt="image" src="https://github.com/user-attachments/assets/7ea94271-b372-41cc-bf06-b2d7ef043f4f" />
