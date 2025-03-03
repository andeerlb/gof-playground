package com.andeerlb.gof.adapter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public abstract class MemoryDB {
    private static Map<Object, Object> database;

    public static void clearDB() {
        if(!Objects.isNull(database)) {
            database.clear();
        }
    }

    public static void put(Object key, Object value) {
        if(Objects.isNull(database)) {
            MemoryDB.database = new HashMap<>();
        }
        database.put(key, value);
    }

    public static Optional<Object> get(Object key) {
        if(Objects.isNull(database)) {
            return Optional.empty();
        }
        return Optional.ofNullable(database.get(key));
    }

    public static boolean del(Object key) {
        if(Objects.isNull(database)) {
            return true;
        } else if (!database.containsKey(key)) {
            return true;
        } else {
            database.remove(key);
            return true;
        }
    }
}
