package com.andeerlb.gof.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ObserverTest {
    @Test
    void testEditorNotifiesObservers() throws Exception {
        Editor editor = new Editor();

        EmailNotificationListener logListener = new EmailNotificationListener("anderson@log.teste");
        LogOpenListener emailListener = new LogOpenListener("/path/to/log/file.txt");

        editor.getEvents().subscribe("open", logListener);
        editor.getEvents().subscribe("save", emailListener);

        editor.openFile("test.txt");
        editor.saveFile();

        assertTrue(logListener.notified, "Log listener should be notified on open");

        assertTrue(emailListener.notified, "Email listener should be notified on save");
    }
}
