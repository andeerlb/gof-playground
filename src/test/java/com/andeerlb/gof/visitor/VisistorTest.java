package com.andeerlb.gof.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisistorTest {
    @Test
    void shouldValidateVisitorPatternToCalculateArea() {
        Shape dot = new Dot();
        Shape circle = new Circle();

        AreaCalculator areaCalculator = new AreaCalculator();

        String acceptDot = dot.accept(areaCalculator);
        String acceptCircle = circle.accept(areaCalculator);

        assertEquals("Calculating area for Dot.", acceptDot);
        assertEquals("Calculating area for Circle.", acceptCircle);
    }

    @Test
    void shouldValidateVisitorPatternToDescriptionVisitor() {
        // Arrange
        Shape dot = new Dot();
        Shape circle = new Circle();
        Visitor visitor = new DescriptionVisitor();

        String resultDot = dot.accept(visitor);
        String resultCircle = circle.accept(visitor);

        assertEquals("Visiting Dot", resultDot);
        assertEquals("Visiting Circle", resultCircle);
    }
}
