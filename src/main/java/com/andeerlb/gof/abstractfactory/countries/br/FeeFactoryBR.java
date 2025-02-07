package com.andeerlb.gof.abstractfactory.countries.br;

import com.andeerlb.gof.abstractfactory.Fee;
import com.andeerlb.gof.abstractfactory.RequiredFeeFactory;

public class FeeFactoryBR implements RequiredFeeFactory {
    public Fee createPlatformFee() {
        return new PlatformFee();
    }

    public Fee createDeliveryFee() {
        return new DeliveryFee();
    }
}
