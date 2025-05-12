## Mediator
Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. 
The pattern restricts direct communications between the objects and forces them to collaborate only via a 
mediator object.

## Problem
In a nutshell, the Mediator pattern addresses the problem of complex communication between multiple objects 
in a system. Instead of objects referring to and communicating with each other directly (creating a tangled 
web of dependencies), the Mediator centralizes this communication. This promotes loose coupling, 
making the system easier to maintain, extend, and refactor.

## How does it solve these problems?
The Mediator pattern solves these problems by introducing a central object — the mediator — that manages all interactions between a group of related objects (called colleagues). Here's how it helps:

1. Reduces direct dependencies:
Colleague objects no longer reference each other directly. They communicate through the mediator, which decouples them.

2. Centralizes control logic:
Instead of having communication logic scattered across multiple classes, the mediator encapsulates it, making it easier to manage and change.

3. Improves maintainability and scalability:
Because objects are loosely coupled, adding new behavior or modifying interactions typically involves only the mediator, not all participating objects.

3. Simplifies object protocols:
Each object only needs to know how to talk to the mediator, not to every other object, reducing overall system complexity.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/mediator/TemplateTest.java)