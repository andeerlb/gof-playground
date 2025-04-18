package com.andeerlb.gof.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(Datasource source) {
        super(source);
    }

    public void writeData(String data) {
        String encrypted = "ENCRYPTED(" + data + ")";
        super.writeData(encrypted);
    }

    public String readData() {
        String data = super.readData();
        return "DECRYPTED(" + data + ")";
    }
}
