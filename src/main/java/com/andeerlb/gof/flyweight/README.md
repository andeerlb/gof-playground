## Flyweight
The Flyweight design pattern is a structural pattern that optimizes memory usage by sharing a common state among multiple objects.
It aims to reduce the number of objects created and to decrease memory footprint, which is particularly useful when dealing 
with a large number of similar objects.

## Problem
The Flyweight Design Pattern is used to reduce memory usage and improve performance when a large number of similar objects are needed.

## How does it solve these problems?
1. Object Sharing Instead of Duplication
   Instead of creating multiple identical objects, Flyweight stores one instance and reuses it whenever needed.

This significantly reduces memory usage.

2. Separating Shared and Unique Data, Flyweight splits the object’s state into:  
   ✅ Intrinsic state (shared, constant data) → Stored inside the flyweight object.  
   ✅ Extrinsic state (unique, changing data) → Passed separately when needed.  

This keeps the shared object lightweight, avoiding unnecessary duplication of data.

3. Using a Factory to Manage Flyweights
   A Flyweight Factory ensures that shared objects are reused instead of creating new instances.

It keeps a cache (or pool) of flyweight objects and provides an existing one if requested.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/flyweight/FlyweightTest.java)