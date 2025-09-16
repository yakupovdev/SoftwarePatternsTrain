package FactoryMethod.transports;

public class TrainTransport extends Transport {

    public TrainTransport() {
        setFrom("Hamburg");
        setTo("London");
        setRoute("Hamburg → Brussels → Lille → London (Eurostar)");
        setDistance(900);
        setCost(300);
        setTime(10);
    }


    @Override
    public void delivery(){
        System.out.println("Delivery by Train:");
        System.out.println("Route: " + getRoute());
        System.out.println("Distance: " + getDistance() + " km");
        System.out.println("Cost: " + getCost() +  " €");
        System.out.println("Travel time: " + getTime() + " h");
    }
}
