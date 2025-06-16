package com.andeerlb.gof.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {
    @Test
    void testDocumentUndo() {
        Document document = new Document();
        History history = new History();

        document.write("Hello ");
        history.save(document);

        document.write("World!");
        history.save(document);

        document.write(" Bye!");

        assertEquals("Hello World! Bye!", document.getContent());

        history.undo(document);
        assertEquals("Hello World!", document.getContent());

        history.undo(document);
        assertEquals("Hello ", document.getContent());
    }
}
