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
        Assertions.assertNotSame(physicalTask, virtualTask);
    }

    @DisplayName("Should ensure that objects are being sharing")
    @Test
    void shouldEnsureThatObjectsAreBeingSharing() {
        Task task1 = TaskFactory.getTask("physical-task");
        Task task2 = TaskFactory.getTask("physical-task");
        Assertions.assertSame(task1, task2);
    }

    @Test
    public void shouldEnsureThatThreadsAreBeingUsingAndSharingObjects() {
        var threadPool = new ThreadPool(2);
        var task1 = TaskFactory.getTask("physical-task");
        var task2 = TaskFactory.getTask("physical-task");

        threadPool.submitTasks(task1);
        threadPool.submitTasks(task2);



        threadPool.shutdown();
    }
}
