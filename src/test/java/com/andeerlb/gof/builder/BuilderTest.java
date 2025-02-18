package com.andeerlb.gof.builder;

import com.andeerlb.gof.builder.sameclass.Person;
import com.andeerlb.gof.builder.separteclass.PersonBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class BuilderTest {

    @Test
    @DisplayName("Should build person class within the same class")
    public void shouldBuildAPersonWithinSameClass() {
        var person = new Person.PersonBuilder()
                .personalNumber("XXX.XXX.XXX-XX")
                .surname("Anderson")
                .givenName("Babinski")
                .dateOfBirth(1996, 3, 12)
                .placeOfBirth("Camboriú/SC")
                .build();

        Assertions.assertEquals("XXX.XXX.XXX-XX", person.getPersonalNumber());
        Assertions.assertEquals("Anderson", person.getSurname());
        Assertions.assertEquals("Babinski", person.getGivenName());
        Assertions.assertEquals("1996-03-12", person.getDateOfBirth().toString());
        Assertions.assertEquals("Camboriú/SC", person.getPlaceOfBirth());
    }

    @Test
    @DisplayName("Should build person class with separated class")
    public void shouldBuildAPersonWithSeparatedClass() {
        var person = new PersonBuilder()
                .personalNumber("XXX.XXX.XXX-XX")
                .surname("Anderson")
                .givenName("Babinski")
                .dateOfBirth(1996, 3, 12)
                .placeOfBirth("Camboriú/SC")
                .build();

        Assertions.assertEquals("XXX.XXX.XXX-XX", person.getPersonalNumber());
        Assertions.assertEquals("Anderson", person.getSurname());
        Assertions.assertEquals("Babinski", person.getGivenName());
        Assertions.assertEquals("1996-03-12", person.getDateOfBirth().toString());
        Assertions.assertEquals("Camboriú/SC", person.getPlaceOfBirth());
    }

    @Test
    @DisplayName("Should build person class with functional interface")
    public void shouldBuildAPersonWithFunctionalInterface() {
        var person = new com.andeerlb.gof.builder.fi.PersonBuilder()
                .with(p -> p.setPersonalNumber("XXX.XXX.XXX-XX"))
                .with(p -> p.setSurname("Anderson"))
                .with(p -> p.setGivenName("Babinski"))
                .with(p -> p.setDateOfBirth(LocalDate.of(1996, 3, 12)))
                .with(p -> p.setPlaceOfBirth("Camboriú/SC"))
                .build();

        Assertions.assertEquals("XXX.XXX.XXX-XX", person.getPersonalNumber());
        Assertions.assertEquals("Anderson", person.getSurname());
        Assertions.assertEquals("Babinski", person.getGivenName());
        Assertions.assertEquals("1996-03-12", person.getDateOfBirth().toString());
        Assertions.assertEquals("Camboriú/SC", person.getPlaceOfBirth());
    }
}
