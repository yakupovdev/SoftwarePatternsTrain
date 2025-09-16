package FactoryMethod.factory;

import FactoryMethod.transports.TrainTransport;
public class TrainLogistics extends Logistics {

    @Override
    public TrainTransport createTransport() {
        return new TrainTransport();
    }
}
