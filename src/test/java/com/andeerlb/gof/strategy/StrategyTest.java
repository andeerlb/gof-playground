package com.andeerlb.gof.strategy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

public class StrategyTest {
    @Test
    void testStrategy() {
        PaymentStrategy strategyCredit = Mockito.spy(new CreditCardPayment());
        PaymentContext context = new PaymentContext();

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        context.setStrategy(strategyCredit);
        context.pay(100.0);
        String outputCreditCard = outContent.toString().trim();

        verify(strategyCredit).pay(100.0);
        assertTrue(outputCreditCard.contains("Paid 100.0 using Credit Card."));

        PaymentStrategy strategyPaypal = Mockito.spy(new PayPalPayment());
        context.setStrategy(strategyPaypal);
        context.pay(175.8);
        String outputPayPal = outContent.toString().trim();

        verify(strategyPaypal).pay(175.8);
        assertTrue(outputPayPal.contains("Paid 175.8 using PayPal."));

        System.setOut(originalOut);
    }
}
