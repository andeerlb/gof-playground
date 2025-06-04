package com.andeerlb.gof.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommandTest {
    private Light light;
    private RemoteControl remote;

    @BeforeEach
    void setup() {
        light = new Light();
        remote = new RemoteControl();
        remote.setCommand(new LightOnCommand(light));
    }

    @Test
    void testExecuteCommandTurnsLightOn() {
        remote.pressButton();
        assertTrue(light.isLightOn(), "Light should be ON after pressing button");
    }

    @Test
    void testUndoCommandTurnsLightOff() {
        remote.pressButton(); // turn on
        remote.pressUndo();   // turn off
        assertFalse(light.isLightOn(), "Light should be OFF after undo");
    }
}
