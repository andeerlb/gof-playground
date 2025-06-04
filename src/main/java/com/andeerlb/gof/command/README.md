## Command
Is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. 
This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

## Problem
The Command design pattern addresses the problem of decoupling the sender of a request from the receiver, 
allowing you to parameterize objects with operations, queue requests, and support undoable operations.

Problems it solves:
Tight coupling between sender and receiver
Without the pattern, an object that issues a request (like a button) must know the specific class that handles it, making it harder to change behavior dynamically.

Need to parameterize actions
Sometimes you want to treat actions (like "copy", "paste", "delete") as objects you can pass around, store, or log.

Support for undo/redo
Since each command is encapsulated as an object, you can keep a history of executed commands and reverse them.

Queueing or scheduling operations
Commands can be stored and executed later, useful in jobs systems, task queues, or macro recorders.

## How does it solve these problems?
1. Decouples sender and receiver
2. Parameterizes objects with operations
3. Supports undo/redo  
   Each command can implement undo() (or store prior state before execution).  
   Effect: You can store a list of executed commands and call undo() to reverse them.
4. Queues and logs operations  
   Commands can be stored in a queue, persisted, or re-executed later (like a job system or macro recorder).
## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/command/CommandTest.java)