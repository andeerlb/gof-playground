## Template
At its core, the Template Method Pattern defines an algorithm’s steps in a base class, 
deferring the implementation of some steps to subclasses. This allows you to enforce a consistent structure across subclasses 
while giving them freedom to customize specific behaviors.

## Problem
If many classes generate reports in similar ways — like fetching data, processing it, formatting it — the Template pattern 
lets you put the shared logic in one place and let each report type customize only the parts that are different.

## How does it solve these problems?
The Template Method pattern suggests that you break down an algorithm into a series of steps, turn these steps into methods, 
and put a series of calls to these methods inside a single template method. The steps may either be abstract, or have some default implementation. To use the algorithm, the client is supposed to provide its own subclass, implement all abstract steps, and override some of the optional ones if needed (but not the template method itself).

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/template/TemplateTest.java)