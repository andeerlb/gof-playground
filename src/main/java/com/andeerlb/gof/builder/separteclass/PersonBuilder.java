package com.andeerlb.gof.builder.separteclass;

import java.util.Date;

public class PersonBuilder {
    private String surname;
    private String givenName;
    private Date dateOfBirth;
    private String personalNumber;
    private String placeOfBirth;

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder givenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    public PersonBuilder dateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public PersonBuilder personalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
        return this;
    }

    public PersonBuilder placeOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
        return this;
    }

    public Person build() {
        return new Person(this.surname, this.givenName, this.dateOfBirth, this.personalNumber, this.placeOfBirth);
    }
}
