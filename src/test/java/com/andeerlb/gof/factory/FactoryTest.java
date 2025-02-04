package com.andeerlb.gof.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FactoryTest {
    private static final BigDecimal AMOUNT_PRODUCT = BigDecimal.valueOf(150);

    @Test
    @DisplayName("Should return Delivery Fee with percentage value")
    public void shouldReturnDeliveryFeeWithPercentage() {
        FeeFactory deliveryFeeFactory = new DeliveryFeeFactory();
        Fee fee = deliveryFeeFactory.createFee();

        // Get 4% of $ 150
        // (4 / 100) * 150 = $ 6.00
        BigDecimal feeCalculated = fee.calculate(AMOUNT_PRODUCT);

        Assertions.assertEquals(FeeType.PERCENTAGE, fee.getType());
        Assertions.assertEquals(BigDecimal.valueOf(4), fee.fee());
        Assertions.assertEquals(feeCalculated, BigDecimal.valueOf(6).setScale(2, RoundingMode.CEILING));
    }

    @Test
    @DisplayName("Should return Delivery Fee with fixed value")
    public void shouldReturnDeliveryFeeWithFixed() {
        FeeFactory deliveryFeeFactory = new PlatformFeeFactory();
        Fee fee = deliveryFeeFactory.createFee();

        BigDecimal feeCalculated = fee.calculate(AMOUNT_PRODUCT);

        Assertions.assertEquals(FeeType.FIXED, fee.getType());
        Assertions.assertEquals(BigDecimal.valueOf(10), fee.fee());
        Assertions.assertEquals(feeCalculated, BigDecimal.valueOf(10));
    }
}
