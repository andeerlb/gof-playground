package com.andeerlb.gof.adapter;

public class Nubank {
    public void processPayment(Person person, double value) {
        MemoryDB.put(person, value);
    }
}
