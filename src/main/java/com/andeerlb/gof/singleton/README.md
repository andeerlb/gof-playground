[CLICK HERE](App.java) to go to code
## Singleton 
Is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

## Problem
The Singleton pattern solves two problems at the same time

* Ensure that a class has just a single instance
* Provide a global access point to that instance

## How does it solve these problems?
* Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
* Create a static creation method that acts as a constructor. This method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.