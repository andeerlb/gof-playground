package com.andeerlb.gof.adapter;

import java.math.BigDecimal;

public class Itau {
    public boolean doPayment(String email, BigDecimal value) {
        MemoryDB.put(email, value);
        return true;
    }
}
