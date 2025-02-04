package com.andeerlb.gof.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("Test singleton instance is unique")
    public void shouldBeUnique() {
        var instance1 = ObjectSingleton.getInstance();
        var instance2 = ObjectSingleton.getInstance();
        Assertions.assertEquals(instance1, instance2);
    }

    @Test
    @DisplayName("Test instance is different, to compare with the singleton instance")
    public void shouldBeDifferent() {
        var instance1 = new ObjectNotSingleton();
        var instance2 = new ObjectNotSingleton();
        Assertions.assertNotEquals(instance1, instance2);
    }
}
