package com.andeerlb.gof.singleton;

public class ObjectSingleton {
    private static ObjectSingleton instance;

    private ObjectSingleton() {}

    public static ObjectSingleton getInstance() {
        if (instance == null) {
            instance = new ObjectSingleton();
        }
        return instance;
    }
}
