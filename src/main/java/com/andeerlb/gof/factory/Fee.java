package com.andeerlb.gof.factory;

import java.math.BigDecimal;

public interface Fee {
    FeeType getType();
    BigDecimal fee();

    default BigDecimal calculate(BigDecimal amount) {
        BigDecimal fee = fee();
        FeeType type = getType();
        if (type == FeeType.PERCENTAGE) {
            return fee.divide(BigDecimal.valueOf(100)).multiply(amount);
        }
        return fee;
    }
}
