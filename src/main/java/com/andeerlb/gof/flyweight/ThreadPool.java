package com.andeerlb.gof.flyweight;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private final ExecutorService executorService;

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public ThreadPool(int numThreads) {
        this.executorService = Executors.newFixedThreadPool(numThreads);
    }

    public void submitTasks(Task task) {
        executorService.submit(task::execute);
    }

    public void shutdown() {
        executorService.shutdown();
    }
}
