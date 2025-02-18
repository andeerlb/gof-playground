package com.andeerlb.gof.builder.separteclass;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String surname;
    private String givenName;
    private LocalDate dateOfBirth;
    private String personalNumber;
    private String placeOfBirth;

    public Person(String surname, String givenName, LocalDate dateOfBirth, String personalNumber, String placeOfBirth) {
        this.surname = surname;
        this.givenName = givenName;
        this.dateOfBirth = dateOfBirth;
        this.personalNumber = personalNumber;
        this.placeOfBirth = placeOfBirth;
    }

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
}
