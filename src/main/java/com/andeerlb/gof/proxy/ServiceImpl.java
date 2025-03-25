package com.andeerlb.gof.proxy;

public class ServiceImpl implements Service {
    @Override
    public void execute() {
        System.out.println("service impl executed");
    }
}
