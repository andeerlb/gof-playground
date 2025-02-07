package com.andeerlb.gof.abstractfactory.countries.usa;

import com.andeerlb.gof.abstractfactory.Fee;
import com.andeerlb.gof.abstractfactory.RequiredFeeFactory;

public class FeeFactoryUSA implements RequiredFeeFactory {
    public Fee createPlatformFee() {
        return new PlatformFee();
    }

    public Fee createDeliveryFee() {
        return new DeliveryFee();
    }
}
