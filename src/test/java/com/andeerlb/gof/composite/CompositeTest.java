package com.andeerlb.gof.composite;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    @DisplayName("Should match file details")
    @Test
    void shouldMatchFileDetails() {
        File file = new File("chat.txt");
        assertEquals("📄 File: chat.txt", file.showDetails());
    }

    @DisplayName("Should match folder with files")
    @Test
    public void shouldMatchFolderWithFiles() {
        Folder folder = new Folder("Downloads");
        folder.add(new File("chat.txt"));
        folder.add(new File("backup.zip"));
        folder.add(new File("photo.jpg"));

        String expected = """
                📁 Folder: Downloads
                  📄 File: chat.txt
                  📄 File: backup.zip
                  📄 File: photo.jpg""";

        assertEquals(expected, folder.showDetails());
    }

    @DisplayName("Should match nested folders")
    @Test
    void shouldMatchNestedFolders() {
        Folder homeFolder = new Folder("Home");
        Folder documentsFolder = new Folder("Documents");

        documentsFolder.add(new File("mainClass.java"));
        homeFolder.add(documentsFolder);
        homeFolder.add(new File("resume.pdf"));

        String expected = """
                📁 Folder: Home
                  📁 Folder: Documents
                    📄 File: mainClass.java
                  📄 File: resume.pdf""";

        assertEquals(expected, homeFolder.showDetails());
    }
}
