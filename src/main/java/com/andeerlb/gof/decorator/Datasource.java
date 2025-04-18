package com.andeerlb.gof.decorator;

public interface Datasource {
    void writeData(String data);
    String readData();
}
