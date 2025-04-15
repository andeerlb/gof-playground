## Proxy
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

## Problem
The Proxy Pattern solves the problem of controlling access to an object by adding an intermediary layer that allows performing additional operations before or after accessing the real object.

## How does it solve these problems?
The Proxy Pattern solves these problems by providing a surrogate object that implements the same interface as the real object but controls access to it

Basically, there are two types of proxies: [dynamic](./DynamicProxy.java) and [static](./StaticProxy.java) proxies and our variations:

### 1. Static Proxy

A **static proxy** is created at **compile-time**. It usually involves creating a specific class or interface that implements the proxy behavior, often through **inheritance** or **interface implementation**.

- **Use Case**: The behavior of the proxy is defined at compile-time and remains fixed.
- **How it Works**: A specific class or interface is written to forward calls to the real object.

### 2. Dynamic Proxy

A **dynamic proxy** is created at **runtime** using reflection or libraries like **Java Proxy** or **Spring AOP**. Dynamic proxies are more flexible because they allow you to add behavior to an object without predefined proxy classes.

- **Use Case**: The proxy behavior is flexible and can be defined at runtime.
- **How it Works**: The proxy class is generated dynamically at runtime, often by reflecting over the methods of the real object.

## Variations of Proxy Pattern

Several other proxy types can be derived from the basic **Static** and **Dynamic** proxies, each serving specific use cases. Let's look at some of the most common variations:

### 1. Virtual Proxy

A **virtual proxy** is typically implemented using a **dynamic proxy**. It is used to **delay the creation** of an object until it is actually needed.

- **Use Case**: To avoid creating expensive objects upfront, particularly when the object is not used immediately.
- **How it Works**: The virtual proxy defers the creation of the object until the first method call is made.

#### Example:
A dynamic proxy can be used to load data only when needed, saving resources.

### 2. Remote Proxy

A **remote proxy** represents an object that resides on a **different machine** or process. It is often used in distributed systems to communicate with objects that are not local.

- **Use Case**: Representing remote objects in a distributed system.
- **How it Works**: The remote proxy delegates the method calls to a server or remote object, often using **Remote Method Invocation (RMI)**.

#### Example:
**RMI (Remote Method Invocation)** in Java uses dynamic proxies to represent remote objects. The proxy forwards method calls to the server.

### 3. Cache Proxy

A **cache proxy** is used to **store results of expensive operations** so that subsequent calls can be returned quickly without needing to re-execute the expensive operation.

- **Use Case**: Improve performance by caching frequently accessed data.
- **How it Works**: The proxy stores the results of method calls and returns the cached result if the same method is called again.

#### Example:
A dynamic proxy can cache the result of database queries, so that repeated requests for the same data are served from memory.

### 4. Security Proxy

A **security proxy** is used to **control access** to an object based on security rules, such as authentication and authorization.

- **Use Case**: Protect sensitive operations or data by checking the user's permissions.
- **How it Works**: The proxy intercepts method calls and checks whether the caller has permission to perform the requested action.

#### Example:
A proxy checks if the user is authenticated and authorized before allowing access to a specific method or resource.

### 5. Monitoring or Logging Proxy

A **monitoring or logging proxy** intercepts method calls to **log or track the interactions** with an object. This can be useful for debugging, profiling, or audit purposes.

- **Use Case**: Track method calls and log information about their execution.
- **How it Works**: The proxy logs method invocations, arguments, and the results of the operations.

#### Example:
A proxy can log the time taken by a method to execute, the parameters passed, and the result returned.

### 6. Access Control Proxy

An **access control proxy** is similar to a **security proxy**, but it focuses on controlling **access to methods** based on conditions like user roles or privileges.

- **Use Case**: Control access to methods based on user roles or privileges.
- **How it Works**: The proxy checks the caller's permissions and decides whether the method can be invoked.

#### Example:
A proxy can restrict access to certain methods based on the user's role (e.g., Admin vs. User).

### 7. Smart Proxy

A **smart proxy** adds **extra functionality** to an object, such as reference counting, resource management, or object lifecycle management.

- **Use Case**: Enhance the functionality of an object without modifying its code.
- **How it Works**: The smart proxy provides additional features such as counting how many times an object is referenced or managing its lifecycle.

#### Example:
A smart proxy could keep track of how many times a resource has been used and release it after a certain number of uses.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/proxy/ProxyTest.java)