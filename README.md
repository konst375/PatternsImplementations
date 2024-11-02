# GoF Design Patterns

Welcome to the **GoF Design Patterns** repository! This repository contains simple implementations of the Gang of Four (GoF) design patterns in Java.

## Table of Contents

- Introduction
- Design Patterns
    - Creational Patterns
    - Structural Patterns
    - Behavioral Patterns
- How to use
## Introduction

This repository is a collection of design patterns from the book *"Design Patterns: Elements of Reusable Object-Oriented Software"* by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides (the Gang of Four). Each pattern is implemented in Java with simple examples to help understand and apply these patterns in projects.

## Design Patterns

### Creational Patterns

- [ ] **Singleton**: Ensures a class has only one instance and provides a global point of access to it.
- [ ] **Factory Method**: Defines an interface for creating an object, but lets subclasses alter the type of objects that will be created.
- [x] **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- [x] **Builder**: Separates the construction of a complex object from its representation so that the same construction process can create different representations.
- [ ] **Prototype**: Specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying this prototype.

### Structural Patterns

- [ ] **Adapter**: Converts the interface of a class into another interface clients expect.
- [ ] **Bridge**: Decouples an abstraction from its implementation so that the two can vary independently.
- [x] **Composite**: Composes objects into tree structures to represent part-whole hierarchies.
- [x] **Decorator**: Attaches additional responsibilities to an object dynamically.
- [ ] **Facade**: Provides a unified interface to a set of interfaces in a subsystem.
- [ ] **Flyweight**: Uses sharing to support large numbers of fine-grained objects efficiently.
- [ ] **Proxy**: Provides a surrogate or placeholder for another object to control access to it.

### Behavioral Patterns

- [ ] **Chain of Responsibility**: Avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle the request.
- [ ] **Command**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
- [ ] **Interpreter**: Given a language, defines a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
- [ ] **Iterator**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
- [ ] **Mediator**: Defines an object that encapsulates how a set of objects interact.
- [ ] **Memento**: Without violating encapsulation, captures and externalizes an object's internal state so that the object can be restored to this state later.
- [x] **Observer**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- [ ] **State**: Allows an object to alter its behavior when its internal state changes.
- [x] **Strategy**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
- [ ] **Template Method**: Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.
- [ ] **Visitor**: Represents an operation to be performed on the elements of an object structure.

## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/konst375/PatternsImplementations.git
