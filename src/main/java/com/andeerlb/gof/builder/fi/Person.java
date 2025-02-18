package com.andeerlb.gof.builder.fi;

import java.time.LocalDate;

public class Person {
    private String surname;
    private String givenName;
    private LocalDate dateOfBirth;
    private String personalNumber;
    private String placeOfBirth;

    public Person() {}

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
