## Abstract Factory

Allows the creation of objects without specifying their concrete type. This pattern provides an interface for
creating families of related or dependent objects without specifying their concrete classes, ensuring that the system is independent of how its objects are created.

## Problem

The Abstract Factory design pattern solves problems related to =creating and working with multiple families of products. It can help ensure consistency, flexibility, and scalability.

## How does it solve these problems?

For each product family, create a concrete factory class that implements the abstract factory interface and provides the specific concrete product implementations when the creation methods are called

## Abstract Factory VS Factory Method

Abstract factory adds another level of abstraction to factory method. While factory method abstracts the way objects are created,
abstract factory abstracts how the factories are created. The factories in turn abstracts the way objects are created.
You will often hear the abstract factory design pattern referred to as a “factory of factories“.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/abstractfactory/AbstractFactoryTest.java)
