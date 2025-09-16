package FactoryMethod.factory;

import FactoryMethod.transports.Transport;

public abstract class Logistics {
        public void planDelivery(){
            Transport transport = createTransport();
            transport.delivery();
        }

        public abstract Transport createTransport();

}
