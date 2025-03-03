package com.andeerlb.gof.adapter;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;
    private final String email;

    public Person(String name, String email) {
        id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
