package com.andeerlb.gof.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class TaskFactory {
    private static final Map<String, Task> taskPool = new HashMap<>();

    public static Task getTask(String taskId) {
        var task = taskPool.get(taskId);
        if(Objects.nonNull(task)) {
            return task;
        }

        task = switch (taskId) {
            case "physical-task" -> new PhysicalTask();
            case "virtual-task" -> new VirtualTask();
            default -> null;
        };

        assert task != null;
        taskPool.put(task.getId(), task);
        return task;
    }

}
