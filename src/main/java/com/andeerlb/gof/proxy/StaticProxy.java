package com.andeerlb.gof.proxy;

public class StaticProxy implements Service{
    private final ServiceImpl service;
    public StaticProxy(ServiceImpl service) {
        this.service = service;
    }

    @Override
    public void execute() {
        System.out.printf("execute static proxy before\n");
        this.service.execute();
        System.out.printf("execute static proxy after\n");
    }
}
