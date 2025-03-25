package com.andeerlb.gof.proxy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ProxyTest {
    @DisplayName("Should execute static proxy")
    @Test
    void shouldExecuteStaticProxy() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        ServiceImpl serviceImpl = new ServiceImpl();
        StaticProxy proxy = new StaticProxy(serviceImpl);
        proxy.execute();

        String output = outputStream.toString();
        assert output.equals("execute static proxy before\n" +
                "service impl executed\n" +
                "execute static proxy after\n");
    }

    @DisplayName("Should execute dynamic proxy")
    @Test
    void shouldExecuteDynamicProxy() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        ServiceImpl serviceImpl = new ServiceImpl();
        Service proxy = (Service) DynamicProxy.createProxy(serviceImpl);

        proxy.execute();

        String output = outputStream.toString();
        assert output.equals("execute dynamic proxy before\n" +
                "service impl executed\n" +
                "execute dynamic proxy after\n");
    }
}
