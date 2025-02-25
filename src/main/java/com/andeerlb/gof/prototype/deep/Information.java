package com.andeerlb.gof.prototype.deep;

import java.io.Serializable;

public class Information implements Serializable {
    private static final long serialVersionUID = 1L;

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
}
