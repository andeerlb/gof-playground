## Interpreter
The Interpreter Pattern is a behavioral design pattern that defines a way to evaluate language grammar or expressions. 
It is used to interpret sentences in a language (often a domain-specific language, or DSL).
* It defines a grammar for the language.
* Each rule in the grammar is represented by a class (usually implementing a common interface).
* The pattern uses a tree structure to represent a sentence, where each node is an expression.

## Problem
Parsing and interpreting a language: When you have a specific grammar or set of rules (like in mathematical expressions, 
logic queries, or SQL-like DSLs), you need a structured way to parse and evaluate them.  

Hard-to-maintain if-statements or switch cases: When interpreting expressions based on lots of conditions, code becomes 
messy. Interpreter organizes it into reusable classes.

## How does it solve these problems?
* Modular grammar: It splits the grammar rules into small, reusable expression classes.
* Tree structure: Expressions are combined into a syntax tree that represents the whole statement. Each node knows how to evaluate itself.
* Extensibility: New grammar rules or expression types can be added easily by creating new classes.
* Clear separation: It separates grammar definition, parsing, and evaluation logic cleanly.

## class test
[click here](../../../../../../../src/test/java/com/andeerlb/gof/interpreter/IteratorTest.java)