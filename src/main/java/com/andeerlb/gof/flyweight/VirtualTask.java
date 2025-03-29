package com.andeerlb.gof.flyweight;

import java.util.UUID;

public class VirtualTask implements Task {
    private final String id;

    public VirtualTask() {
        this.id = "virtual-task";
    }

    @Override
    public void execute() {
        System.out.println("Executing Task "+ this.id +" in thread: " + Thread.currentThread().getName());
    }

    @Override
    public String getId() {
        return id;
    }
}
