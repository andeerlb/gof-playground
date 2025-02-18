package com.andeerlb.gof.builder.sameclass;

import java.util.Date;

public class Person {
    private String surname;
    private String givenName;
    private Date dateOfBirth;
    private String personalNumber;
    private String placeOfBirth;

    public Person(PersonBuilder builder) {
        this.surname = builder.surname;
        this.givenName = builder.givenName;
        this.dateOfBirth = builder.dateOfBirth;
        this.personalNumber = builder.personalNumber;
        this.placeOfBirth = builder.placeOfBirth;
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

    public static class PersonBuilder {
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
    }
}
