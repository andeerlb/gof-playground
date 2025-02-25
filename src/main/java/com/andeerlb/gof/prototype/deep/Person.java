package com.andeerlb.gof.prototype.deep;

import java.io.*;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

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

    public Person clone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error cloning object", e);
        }
    }
}
