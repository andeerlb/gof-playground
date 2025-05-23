## Chain of Responsibility
Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. 
Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

## Problem
Helps avoid tight coupling between senders and receivers of requests
In simpler terms, CoR turns a series of conditional checks into a flexible object-oriented structure. It’s essentially 
an object-oriented alternative to writing a long if-else if-else or switch statement to handle various conditions. 
Instead of the sender explicitly choosing a code path, the chain structure decides which handler (if any) will handle 
the request. This can make the code more extensible – you can rearrange or add new handlers to the chain (even at runtime) 
without changing the code that dispatches the request.

## How does it solve these problems?
You typically define a common interface (or abstract class) for all handlers, often with a method like handle(request) 
(or similar) and a reference to the next handler in the chain. Each concrete handler will attempt to handle the request; 
if it cannot, it forwards the request to the next handler in line.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/chain/ChainTest.java)