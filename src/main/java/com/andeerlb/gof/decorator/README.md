## Decorator
Is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside 
special wrapper objects that contain the behaviors.

## Problem
You need to add responsibilities or behaviors to individual objects without affecting other objects of the same class, 
and without creating an explosion of subclasses to handle every possible combination of features.

## How does it solve these problems?
The Decorator Pattern solves this by using composition instead of inheritance. It wraps the original object with one or 
more decorator objects that implement the same interface, adding new behavior before or after delegating to the wrapped 
object. This allows behaviors to be added dynamically, flexibly, and in any combination, without changing the original class.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/decorator/DecoratorTest.java)