package FactoryMethod.transports;

public class ShipTransport extends Transport {

    public ShipTransport() {
        setFrom("Hamburg (Port)");
        setTo("London (Tilbury Port)");
        setRoute("Hamburg → North Sea → English Channel → London");
        setDistance(950);
        setCost(150);
        setTime(48);
    }


    @Override
    public void delivery(){
        System.out.println("Delivery by Ship:");
        System.out.println("Route: " + getRoute());
        System.out.println("Distance: " + getDistance() + " km");
        System.out.println("Cost: " + getCost() +  " €");
        System.out.println("Travel time: " + getTime() + " h");
    }
}
