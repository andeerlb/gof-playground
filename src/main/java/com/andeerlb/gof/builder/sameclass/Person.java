package com.andeerlb.gof.builder.sameclass;

import java.time.LocalDate;

public class Person {
    private String surname;
    private String givenName;
    private LocalDate dateOfBirth;
    private String personalNumber;
    private String placeOfBirth;

    public Person(PersonBuilder builder) {
        this.surname = builder.surname;
        this.givenName = builder.givenName;
        this.dateOfBirth = builder.dateOfBirth;
        this.personalNumber = builder.personalNumber;
        this.placeOfBirth = builder.placeOfBirth;
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

    public static class PersonBuilder {
        private String surname;
        private String givenName;
        private LocalDate dateOfBirth;
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

        public PersonBuilder dateOfBirth(int year, int month, int day) {
            this.dateOfBirth = LocalDate.of(year, month, day);
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
            return new Person(this);
        }
    }
}
