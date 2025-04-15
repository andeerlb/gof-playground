package com.andeerlb.gof.bridge;

public class BasicRemote {
    private final Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }

    public void volumeUp() {
        device.setVolume(50); // simplified
    }
}
