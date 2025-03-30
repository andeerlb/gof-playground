package com.andeerlb.gof.flyweight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FlyweightTest {

    @DisplayName("should ensure that objects are distinct")
    @Test
    public void shouldEnsureThatObjectsAreDistinct() {
        Task physicalTask = TaskFactory.getTask("physical-task");
        Task virtualTask = TaskFactory.getTask("virtual-task");

        physicalTask.execute();
        virtualTask.execute();

        Assertions.assertNotSame(physicalTask, virtualTask);
    }

    @DisplayName("Should ensure that objects are being sharing")
    @Test
    void shouldEnsureThatObjectsAreBeingSharing() {
        Task task1 = TaskFactory.getTask("physical-task");
        Task task2 = TaskFactory.getTask("physical-task");

        task1.execute();
        task2.execute();

        Assertions.assertSame(task1, task2);
    }
}
