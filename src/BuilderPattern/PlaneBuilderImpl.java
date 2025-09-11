public class PlaneBuilderImpl implements IAircraftBuilder{
    private String name;
    private double length;
    private double wingspan;
    private double height;
    private int flightRange;
    private int maxCruisingSpeed;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    @Override
    public void setMaxCruisingSpeed(int maxCruisingSpeed) {
        this.maxCruisingSpeed = maxCruisingSpeed;
    }

    public Plane build(){
        return new Plane(name,length,wingspan,height,flightRange,maxCruisingSpeed);
    }


}
