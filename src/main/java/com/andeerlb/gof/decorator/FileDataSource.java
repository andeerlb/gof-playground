package com.andeerlb.gof.decorator;

public class FileDataSource implements Datasource {
    private final String filename;

    public FileDataSource(String filename) {
        this.filename = filename;
    }

    public void writeData(String data) {
        System.out.println("Writing to file: " + data);
    }

    public String readData() {
        return "File data";
    }
}
