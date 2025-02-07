package com.andeerlb.gof.abstractfactory.countries.factories;

import com.andeerlb.gof.abstractfactory.Fee;
import com.andeerlb.gof.abstractfactory.RequiredFeeFactory;
import com.andeerlb.gof.abstractfactory.countries.usa.DeliveryFee;
import com.andeerlb.gof.abstractfactory.countries.usa.PlatformFee;

public class FeeFactoryUSA implements RequiredFeeFactory {
    public Fee createPlatformFee() {
        return new PlatformFee();
    }

    public Fee createDeliveryFee() {
        return new DeliveryFee();
    }
}
