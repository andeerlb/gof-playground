package com.andeerlb.gof.prototype.factory;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static final Map<String, Serializable> prototypes = new HashMap<>();

    public static void addPrototype(String key, Serializable prototype) {
        prototypes.put(key, prototype);
    }

    public static Serializable getPrototype(String key) {
        if (!prototypes.containsKey(key)) {
            throw new IllegalArgumentException("Prototype not found: " + key);
        }

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(prototypes.get(key));
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Serializable) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error cloning object", e);
        }
    }
}
