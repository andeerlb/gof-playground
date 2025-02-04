package com.andeerlb.gof.factory;

public class DeliveryFeeFactory implements FeeFactory {
    @Override
    public Fee createFee() {
        return new DeliveryFee();
    }
}
