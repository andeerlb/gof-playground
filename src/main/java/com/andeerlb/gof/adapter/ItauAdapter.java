package com.andeerlb.gof.adapter;

import java.math.BigDecimal;

public class ItauAdapter implements Payment {
    private final Itau bank;
    private final Person person;

    public ItauAdapter(Itau bank, Person person) {
        this.bank = bank;
        this.person = person;
    }

    @Override
    public void pay(BigDecimal value) {
        bank.doPayment(person.getEmail(), value);
    }
}
