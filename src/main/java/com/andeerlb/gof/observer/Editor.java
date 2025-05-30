package com.andeerlb.gof.observer;

import java.io.File;

public class Editor {
    private final EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager();
    }

    public EventManager getEvents() {
        return events;
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}