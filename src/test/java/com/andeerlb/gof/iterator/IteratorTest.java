package com.andeerlb.gof.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {
    @Test
    void shouldIteratorTraversesAllElements() {
        NameCollection collection = new NameCollection();
        Iterator<String> iterator = collection.createIterator();

        String[] expected = {"Lucas", "Diego", "Guilherme"};
        int index = 0;

        while (iterator.hasNext()) {
            assertEquals(expected[index++], iterator.next());
        }

        assertEquals(expected.length, index, "All elements should be iterated");
    }

    @Test
    void shouldReturnsFalseAtEnd() {
        NameCollection collection = new NameCollection();
        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        assertFalse(iterator.hasNext(), "Should return false after reaching the end");
    }

    @Test
    void shouldReturnsNullIfNoMoreElements() {
        NameCollection collection = new NameCollection();
        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            iterator.next();
        }

        assertNull(iterator.next(), "Next should return null when no elements remain");
    }
}
