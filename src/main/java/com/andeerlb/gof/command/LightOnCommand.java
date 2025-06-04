package com.andeerlb.gof.command;

public class LightOnCommand implements Command {
    private Light light;
    LightOnCommand(Light light) { this.light = light; }

    public void execute() { light.turnOn(); }
    public void undo() { light.turnOff(); }
}
