package com.andeerlb.gof.composite;

import java.util.ArrayList;
import java.util.List;

class Folder implements FileSystem {
    private final String name;
    private final List<FileSystem> contents = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem item) {
        contents.add(item);
    }

    @Override
    public String showDetails() {
        return showDetails(0);
    }

    private String showDetails(int level) {
        StringBuilder details = new StringBuilder("📁 Folder: " + name + "\n");
        String indentation = "  ".repeat(level + 1);

        for (FileSystem item : contents) {
            if (item instanceof Folder) {
                details.append(indentation).append(((Folder) item).showDetails(level + 1)).append("\n");
            } else {
                details.append(indentation).append(item.showDetails()).append("\n");
            }
        }
        return details.toString().trim();
    }
}
