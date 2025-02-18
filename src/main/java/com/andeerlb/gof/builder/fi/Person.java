package com.andeerlb.gof.builder.fi;

import java.util.Date;

public class Person {
    private String surname;
    private String givenName;
    private Date dateOfBirth;
    private String personalNumber;
    private String placeOfBirth;

    public Person() {}

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", givenName='" + givenName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", personalNumber='" + personalNumber + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                '}';
    }
}
