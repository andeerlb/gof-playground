package com.andeerlb.gof.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AdapterTest {

    @BeforeEach
    public void setup() {
        MemoryDB.clearDB();
    }

    @DisplayName("Should do payment by using same interface with different bank client")
    @Test
    public void shouldDoPaymentByUsingSameInterfaceWithDifferentBankClient() {
        final List<Payment> paymentList = new ArrayList<>();

        var person = new Person("Anderson", "andeerlb@gmail.com");

        var nubankClient = new Nubank();
        var itauClient = new Itau();

        var paymentAdapterNubank = new NubankAdapter(nubankClient, person);
        var paymentAdapterItau = new ItauAdapter(itauClient, person);

        paymentAdapterNubank.pay(BigDecimal.valueOf(125.24));
        paymentAdapterItau.pay(BigDecimal.valueOf(8.98));

        Assertions.assertEquals(125.24, MemoryDB.get(person).get());
        Assertions.assertEquals(BigDecimal.valueOf(8.98), MemoryDB.get(person.getEmail()).get());
    }
}
