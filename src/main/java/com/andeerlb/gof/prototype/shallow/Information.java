package com.andeerlb.gof.prototype.shallow;

public class Information implements Cloneable {
    private String gender;
    private int age;

    public Information() {
    }

    public Information(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }

    public Information(Information other) {
        this.gender = other.gender;
        this.age = other.age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Information clone() {
        try {
            return (Information) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Error cloning object");
        }
    }
}
