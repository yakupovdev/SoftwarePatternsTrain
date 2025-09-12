package BuilderPattern;

public class HelicopterBuilderImpl implements IAircraftBuilder{
    private String name;
    private double length;
    private double wingspan;
    private double height;
    private int flightRange;
    private int maxCruisingSpeed;


    @Override
    public HelicopterBuilderImpl setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public HelicopterBuilderImpl setLength(double length) {
        this.length = length;
        return this;
    }

    @Override
    public HelicopterBuilderImpl setWingspan(double wingspan) {
        this.wingspan = wingspan;
        return this;
    }

    @Override
    public HelicopterBuilderImpl setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public HelicopterBuilderImpl setFlightRange(int flightRange) {
        this.flightRange = flightRange;
        return this;
    }

    @Override
    public HelicopterBuilderImpl setMaxCruisingSpeed(int maxCruisingSpeed) {
        this.maxCruisingSpeed = maxCruisingSpeed;
        return this;
    }

    public Helicopter build(){
        return new Helicopter(name,length,wingspan,height,flightRange,maxCruisingSpeed);
    }
}
