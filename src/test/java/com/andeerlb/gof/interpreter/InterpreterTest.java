package com.andeerlb.gof.interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InterpreterTest {
    @Test
    void shouldTerminalExpressionTrue() {
        Expression john = new TerminalExpression("John");
        assertTrue(john.interpret("My name is John Doe"));
    }

    @Test
    void shouldTerminalExpressionFalse() {
        Expression jane = new TerminalExpression("Jane");
        assertFalse(jane.interpret("My name is John Doe"));
    }

    @Test
    void shouldOrExpressionTrue() {
        Expression john = new TerminalExpression("John");
        Expression jane = new TerminalExpression("Jane");
        Expression orExpr = new OrExpression(john, jane);

        assertTrue(orExpr.interpret("Jane is here"));
        assertTrue(orExpr.interpret("John arrived"));
    }

    @Test
    void shouldOrExpressionFalse() {
        Expression john = new TerminalExpression("John");
        Expression jane = new TerminalExpression("Jane");
        Expression orExpr = new OrExpression(john, jane);

        assertFalse(orExpr.interpret("Mike is here"));
    }
}
