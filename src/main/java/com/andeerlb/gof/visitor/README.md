## Visitor
Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.

## Problem
When you have an object structure (like classes in a hierarchy) and you want to perform operations on these objects 
without changing their classes, adding new operations becomes difficult because it usually requires modifying those classes.

## How does it solve these problems?
* The Visitor pattern lets you create a new class (Visitor) that contains the operations you want to perform.
* The objects in the structure accept the visitor, which then performs the operation.
* This way, you can add new operations without modifying the existing object classes.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/observer/VisitorTest.java)