package FactoryMethod.factory;

import FactoryMethod.transports.ShipTransport;

public class ShipLogistics extends Logistics{

    @Override
    public ShipTransport createTransport() {
        return new ShipTransport();
    }
}
