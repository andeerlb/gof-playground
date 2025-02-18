package com.andeerlb.gof.builder.separteclass;

import java.util.Date;

public class Person {
    private String surname;
    private String givenName;
    private Date dateOfBirth;
    private String personalNumber;
    private String placeOfBirth;

    public Person(String surname, String givenName, Date dateOfBirth, String personalNumber, String placeOfBirth) {
        this.surname = surname;
        this.givenName = givenName;
        this.dateOfBirth = dateOfBirth;
        this.personalNumber = personalNumber;
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
