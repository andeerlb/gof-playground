package com.andeerlb.gof.composite;

class File implements FileSystem {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String showDetails() {
        return "📄 File: " + name;
    }
}

