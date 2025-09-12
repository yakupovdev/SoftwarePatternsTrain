package BuilderPattern;

public class Helicopter {
    private final String type =  "Helicopter";
    private String name;
    private double length;
    private double wingspan;
    private double height;
    private int flightRange;
    private int maxCruisingSpeed;



    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public void setMaxCruisingSpeed(int maxCruisingSpeed) {
        this.maxCruisingSpeed = maxCruisingSpeed;
    }

    public Helicopter(HelicopterBuilderImpl builder) {
        this.name = builder.getName();
        this.length = builder.getLength();
        this.wingspan = builder.getWingspan();
        this.height = builder.getHeight();
        this.flightRange = builder.getFlightRange();
        this.maxCruisingSpeed = builder.getMaxCruisingSpeed();
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", wingspan=" + wingspan +
                ", height=" + height +
                ", flightRange=" + flightRange +
                ", maxCruisingSpeed=" + maxCruisingSpeed +
                '}';
    }
}
