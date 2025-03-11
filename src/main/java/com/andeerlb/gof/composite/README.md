## Composite
The Composite Pattern is a structural design pattern that allows you to compose objects into tree structures 
to represent part-whole hierarchies. 
It lets clients treat individual objects and compositions of objects uniformly. 
This pattern is commonly used in graphical user interfaces, file systems, and organizational structures.

## Problem
The Composite Pattern solves the problem of treating individual objects and compositions of objects uniformly. 
Without it, handling complex hierarchical structures requires different logic for single objects and groups. 
This pattern simplifies code by allowing clients to interact with both in a consistent way.

## How does it solve these problems?
The Composite Pattern solves this problem by defining a common interface for both individual objects (leaves) and composite objects (containers). 
This allows treating them the same way, enabling recursive structures where composites can contain other composites or leaves. 
Clients interact with all elements through the same interface, simplifying operations on hierarchical structures.