## Strategy
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, 
and make their objects interchangeable.

## Problem
The Strategy design pattern aims to resolve the problem of selecting an algorithm's behavior at runtime without changing 
the context in which it is used.
Problem it solves:
When a class has multiple behaviors (algorithms or strategies) that could be used interchangeably, 
hardcoding these behaviors using conditionals like if, switch, or subclassing leads to:

* Code duplication
* Violation of the Open/Closed Principle (OCP: software entities should be open for extension but closed for modification)
* Difficulty in testing, maintaining, or extending behaviors independently

## How does it solve these problems?
It encapsulates each algorithm (or behavior) into a separate strategy class and makes them interchangeable. 
The context class delegates the behavior to one of the strategy objects.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/strategy/StrategyTest.java)