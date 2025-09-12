package BuilderPattern;

public class PlaneBuilderImpl implements IAircraftBuilder{
    private String name;
    private double length;
    private double wingspan;
    private double height;
    private int flightRange;
    private int maxCruisingSpeed;


    @Override
    public PlaneBuilderImpl setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PlaneBuilderImpl setLength(double length) {
        this.length = length;
        return this;
    }

    @Override
    public PlaneBuilderImpl setWingspan(double wingspan) {
        this.wingspan = wingspan;
        return this;
    }

    @Override
    public PlaneBuilderImpl setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public PlaneBuilderImpl setFlightRange(int flightRange) {
        this.flightRange = flightRange;
        return this;
    }

    @Override
    public PlaneBuilderImpl setMaxCruisingSpeed(int maxCruisingSpeed) {
        this.maxCruisingSpeed = maxCruisingSpeed;
        return this;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getHeight() {
        return height;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getMaxCruisingSpeed() {
        return maxCruisingSpeed;
    }

    public Plane build(){
        return new Plane(this);
    }


}
