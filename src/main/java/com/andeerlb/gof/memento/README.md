## Memento
Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

## Problem
When you need to provide the ability to restore an object to a previous state (like undo/rollback) without violating encapsulation. 
Directly exposing the internal state of objects breaks encapsulation and can lead to fragile code.

## How does it solve these problems?
The Memento Pattern captures and stores an object's internal state without exposing its internal details.
Later, the object can be restored to this saved state. This allows implementing features like undo/redo while preserving encapsulation.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/observer/MementoTest.java)