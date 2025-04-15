package com.andeerlb.gof.bridge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BridgeTest {
    @Test
    @DisplayName("Should turn on, set volume, and turn off when remote methods are called")
    void shouldDelegateToDeviceMethodsWhenBasicRemoteUsed() {
        Device mockDevice = mock(Device.class);
        BasicRemote remote = new BasicRemote(mockDevice);

        remote.powerOn();
        remote.volumeUp();
        remote.powerOff();

        verify(mockDevice).turnOn();
        verify(mockDevice).setVolume(50);
        verify(mockDevice).turnOff();
    }
}
