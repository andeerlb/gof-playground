package com.andeerlb.gof.abstractfactory;

public interface RequiredFeeFactory {
    Fee createPlatformFee();
    Fee createDeliveryFee();
}
