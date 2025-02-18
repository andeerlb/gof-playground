package com.andeerlb.gof.builder.fi;

import java.util.function.Consumer;

public class PersonBuilder {
    private Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder with(Consumer<Person> setter) {
        setter.accept(person);
        return this;
    }

    public Person build() {
        return this.person;
    }
}
