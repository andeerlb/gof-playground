package com.andeerlb.gof.abstractfactory.countries.usa;

import com.andeerlb.gof.abstractfactory.Fee;
import com.andeerlb.gof.abstractfactory.FeeType;

import java.math.BigDecimal;

public class PlatformFee implements Fee {
    @Override
    public FeeType getType() {
        return FeeType.FIXED;
    }

    @Override
    public BigDecimal fee() {
        return BigDecimal.valueOf(2);
    }
}
