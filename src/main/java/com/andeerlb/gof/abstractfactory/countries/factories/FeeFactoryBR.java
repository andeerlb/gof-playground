package com.andeerlb.gof.abstractfactory.countries.factories;

import com.andeerlb.gof.abstractfactory.Fee;
import com.andeerlb.gof.abstractfactory.RequiredFeeFactory;
import com.andeerlb.gof.abstractfactory.countries.br.DeliveryFee;
import com.andeerlb.gof.abstractfactory.countries.br.PlatformFee;

public class FeeFactoryBR implements RequiredFeeFactory {
    public Fee createPlatformFee() {
        return new PlatformFee();
    }

    public Fee createDeliveryFee() {
        return new DeliveryFee();
    }
}
