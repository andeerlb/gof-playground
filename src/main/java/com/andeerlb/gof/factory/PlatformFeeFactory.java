package com.andeerlb.gof.factory;

public class PlatformFeeFactory implements FeeFactory {
    @Override
    public Fee createFee() {
        return new PlatformFee();
    }
}
