package FactoryMethod.transports;

public class PlaneTransport extends Transport {

    public PlaneTransport() {
        setFrom("Hamburg (HAM)");
        setTo("London (LHR)");
        setRoute("Direct flight HAM ✈ LHR");
        setDistance(720);
        setCost(500);
        setTime(1.5);
    }


    @Override
    public void delivery(){
        System.out.println("Delivery by Plane:");
        System.out.println("Route: " + getRoute());
        System.out.println("Distance: " + getDistance() + " km");
        System.out.println("Cost: " + getCost() +  " €");
        System.out.println("Travel time: " + getTime() + " h");
    }
}
