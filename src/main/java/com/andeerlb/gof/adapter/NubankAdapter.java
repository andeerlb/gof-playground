package com.andeerlb.gof.adapter;

import java.math.BigDecimal;

public class NubankAdapter implements Payment {
    private final Nubank bank;
    private final Person person;

    public NubankAdapter(Nubank bank, Person person) {
        this.bank = bank;
        this.person = person;
    }

    @Override
    public void pay(BigDecimal value) {
        bank.processPayment(person, value.doubleValue());
    }
}
