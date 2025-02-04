package com.andeerlb.gof.factory;

import java.math.BigDecimal;

public class PlatformFee implements Fee {
    @Override
    public FeeType getType() {
        return FeeType.FIXED;
    }

    @Override
    public BigDecimal fee() {
        return BigDecimal.valueOf(10);
    }
}
