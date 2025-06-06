## State
Is a behavioral design pattern that lets an object alter its behavior when its internal state changes. 
It appears as if the object changed its class.

## Problem
Imagine you have an object that can be in multiple states, and its behavior depends on the current state. 
Without the State pattern, you might write lots of if-else or switch statements inside the object’s methods to check 
the current state and decide what to do. This makes the code:

* Hard to read  
* Difficult to maintain  
* Hard to extend (adding new states means modifying existing code)  

## How does it solve these problems?
* Encapsulates state-specific behavior into separate classes (one class per state).
* The main object (called Context) holds a reference to a state object representing its current state.
* When the state changes, the context changes the state object it refers to.
* The behavior of the context changes because the state object’s methods are called.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/state/StateTest.java)