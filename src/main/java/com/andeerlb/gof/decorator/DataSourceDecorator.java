package com.andeerlb.gof.decorator;

public class DataSourceDecorator implements Datasource {
    protected final Datasource wrappee;

    public DataSourceDecorator(Datasource source) {
        this.wrappee = source;
    }

    public void writeData(String data) {
        wrappee.writeData(data);
    }

    public String readData() {
        return wrappee.readData();
    }
}
