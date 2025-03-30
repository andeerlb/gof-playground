## Facade
Facade is a structural design pattern that provides a simplified interface to a library, a framework, 
or any other complex set of classes.
Facade Method Design Pattern provides a unified interface to a set of interfaces in a subsystem.
Facade defines a high-level interface that makes the subsystem easier to use.

## Problem
Having a facade is handy when you need to integrate your app with a sophisticated library that has dozens of features, 
but you just need a tiny bit of its functionality.
For instance, an app that uploads short funny videos with cats to social media could potentially use a 
professional video conversion library. However, all that it really needs is a class with the single 
method encode(filename, format). After creating such a class and connecting it with the video conversion library, 
you’ll have your first facade.

## How does it solve these problems?

A facade is a class that provides a simple interface to a complex subsystem which contains lots of moving parts. A facade might provide limited functionality in comparison to working with the subsystem directly. 
However, it includes only those features that clients really care about.