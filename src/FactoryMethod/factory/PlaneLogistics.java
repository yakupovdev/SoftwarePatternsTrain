package FactoryMethod.factory;

import FactoryMethod.transports.PlaneTransport;

public class PlaneLogistics extends Logistics {

    @Override
    public PlaneTransport createTransport() {
        return new PlaneTransport();
    }
}
