## Bridge
The Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation,
allowing both to vary independently, without affecting each other’s code.

## Problem
The Bridge pattern aims to solve the problem of class explosion and tight coupling between abstractions and implementations.
Imagine you have multiple abstractions (like Circle, Square) and multiple implementations (like VectorRenderer, RasterRenderer). 
Without the Bridge pattern, you'd need to create a separate class for every combination.

## How does it solve these problems?
* Decouples abstraction from implementation, so they can evolve independently.
* Reduces code duplication by separating concerns.
* Improves flexibility and scalability, making it easier to add new shapes or rendering methods without changing existing code.