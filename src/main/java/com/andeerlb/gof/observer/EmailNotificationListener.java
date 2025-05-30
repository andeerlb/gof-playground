package com.andeerlb.gof.observer;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;
    boolean notified = false;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        notified = true;
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
