## Iterator
The Iterator Pattern is a behavioral design pattern that provides a way to access the elements of a 
collection (like a list or set) sequentially without exposing its underlying structure.  
It typically involves:

* An Iterator interface (with methods like hasNext() and next())
* A ConcreteIterator that implements this interface
* A Collection (like a list or aggregate)
* A ConcreteCollection that returns an iterator

## Problem
* Direct access to collection internals: Without this pattern, accessing elements often means exposing or tightly coupling to the collection’s internal structure.
* Different traversal logic: Each collection may have different traversal logic (e.g., forward, reverse, tree, graph).
* Inconsistent access code: Without iterators, client code often has repetitive and inconsistent loops or index logic.

## How does it solve these problems?
* Encapsulation: Iterator provides a standard way to traverse elements without revealing how the collection is implemented.
* Uniform access: Clients use the same interface (Iterator) regardless of the collection type (list, tree, set, etc.).
* Separation of concerns: Traversal logic is moved out of the collection class, making both the collection and iteration more maintainable.
* Flexibility: Multiple iterator types (e.g. forward, reverse, filter) can be created without modifying the collection.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/iterator/IteratorTest.java)