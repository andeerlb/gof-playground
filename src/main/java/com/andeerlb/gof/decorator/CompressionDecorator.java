package com.andeerlb.gof.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(Datasource source) {
        super(source);
    }

    public void writeData(String data) {
        String compressed = "COMPRESSED(" + data + ")";
        super.writeData(compressed);
    }

    public String readData() {
        String data = super.readData();
        return "DECOMPRESSED(" + data + ")";
    }
}
