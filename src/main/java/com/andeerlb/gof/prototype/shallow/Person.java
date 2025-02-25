package com.andeerlb.gof.prototype.shallow;

public class Person implements Cloneable {
    private String givenName;
    private String surname;
    private Information information;

    public Person() {
    }

    public Person(String givenName, String surname, Information information) {
        this.givenName = givenName;
        this.surname = surname;
        this.information = information;
    }

    public Person(Person other) {
        this.givenName = other.givenName;
        this.surname = other.surname;
        this.information = new Information(other.information);
    }

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning object");
        }
    }
}
