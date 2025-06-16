package com.andeerlb.gof.memento;

import java.util.Stack;

public class History {
    private final Stack<DocumentMemento> history = new Stack<>();

    public void save(Document document) {
        history.push(document.save());
    }

    public void undo(Document document) {
        if (!history.isEmpty()) {
            document.restore(history.pop());
        }
    }
}
