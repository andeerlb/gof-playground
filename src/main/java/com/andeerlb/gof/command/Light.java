package com.andeerlb.gof.command;

public class Light {
    private boolean isOn = false;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    boolean isLightOn() {
        return isOn;
    }
}
