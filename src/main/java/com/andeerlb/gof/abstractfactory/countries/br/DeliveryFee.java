package com.andeerlb.gof.abstractfactory.countries.br;

import com.andeerlb.gof.abstractfactory.Fee;
import com.andeerlb.gof.abstractfactory.FeeType;

import java.math.BigDecimal;

public class DeliveryFee implements Fee {
    @Override
    public FeeType getType() {
        return FeeType.PERCENTAGE;
    }

    @Override
    public BigDecimal fee() {
        return BigDecimal.valueOf(4);
    }
}
