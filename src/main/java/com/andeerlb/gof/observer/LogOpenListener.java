package com.andeerlb.gof.observer;

import java.io.File;

class LogOpenListener implements EventListener {
    private File log;
    boolean notified = false;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        notified = true;
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
