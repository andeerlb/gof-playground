## Builder
The Builder Pattern is a creational design pattern used to construct complex objects step by step.

## Problem
When an object has many optional parameters, using a constructor with many arguments makes the code hard to read and maintain.

## How does it solve these problems?
The Builder pattern solves this problem by:  
✅ Breaking object construction into small, manageable steps.  
✅ Providing a clear and readable way to set optional parameters.  
✅ Ensuring immutability by returning a fully constructed object at the end.  

Basically, we can create this solution in three common ways:
* With a [functional interface](./fi)
* With a [separate class](./separteclass)
* With a builder class [within the same class](./sameclass)
