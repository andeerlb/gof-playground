package com.andeerlb.gof.abstractfactory;

import com.andeerlb.gof.abstractfactory.countries.factories.FeeFactoryBR;
import com.andeerlb.gof.abstractfactory.countries.factories.FeeFactoryUSA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AbstractFactoryTest {
    private static final BigDecimal AMOUNT_PRODUCT = BigDecimal.valueOf(150);

    @Test
    @DisplayName("Should return Delivery Fee Brazil with percentage value")
    public void shouldReturnDeliveryFeeBrazilWithPercentage() {
        RequiredFeeFactory requiredFeeFactory = new FeeFactoryBR();
        Fee fee = requiredFeeFactory.createDeliveryFee();

        BigDecimal feeCalculated = fee.calculate(AMOUNT_PRODUCT);

        Assertions.assertEquals(FeeType.PERCENTAGE, fee.getType());
        Assertions.assertEquals(BigDecimal.valueOf(4), fee.fee());
        Assertions.assertEquals(feeCalculated, BigDecimal.valueOf(6).setScale(2, RoundingMode.CEILING));
    }

    @Test
    @DisplayName("Should return Platform Fee Brazil with fixed value")
    public void shouldReturnDeliveryFeeBrazilWithFixed() {
        RequiredFeeFactory requiredFeeFactory = new FeeFactoryBR();
        Fee fee = requiredFeeFactory.createPlatformFee();

        BigDecimal feeCalculated = fee.calculate(AMOUNT_PRODUCT);

        Assertions.assertEquals(FeeType.FIXED, fee.getType());
        Assertions.assertEquals(BigDecimal.valueOf(2), fee.fee());
        Assertions.assertEquals(feeCalculated, BigDecimal.valueOf(2));
    }

    @Test
    @DisplayName("Should return Delivery Fee USA with percentage value")
    public void shouldReturnDeliveryFeeUSAWithPercentage() {
        RequiredFeeFactory requiredFeeFactory = new FeeFactoryUSA();
        Fee fee = requiredFeeFactory.createDeliveryFee();

        BigDecimal feeCalculated = fee.calculate(AMOUNT_PRODUCT).setScale(2);

        Assertions.assertEquals(FeeType.PERCENTAGE, fee.getType());
        Assertions.assertEquals(BigDecimal.valueOf(1.5), fee.fee());
        Assertions.assertEquals(feeCalculated, BigDecimal.valueOf(2.25));
    }

    @Test
    @DisplayName("Should return Platform Fee USA with fixed value")
    public void shouldReturnDeliveryFeeUSAWithFixed() {
        RequiredFeeFactory requiredFeeFactory = new FeeFactoryUSA();
        Fee fee = requiredFeeFactory.createPlatformFee();

        BigDecimal feeCalculated = fee.calculate(AMOUNT_PRODUCT);

        Assertions.assertEquals(FeeType.FIXED, fee.getType());
        Assertions.assertEquals(BigDecimal.valueOf(2), fee.fee());
        Assertions.assertEquals(feeCalculated, BigDecimal.valueOf(2));
    }
}
