package BuilderPattern;

public class Plane {
    private final String type =  "Plane";
    private String name;
    private double length;
    private double wingspan;
    private double height;
    private int flightRange;
    private int maxCruisingSpeed;


    public Plane(PlaneBuilderImpl builder){
        this.name = builder.getName();
        this.length = builder.getLength();
        this.wingspan = builder.getWingspan();
        this.height = builder.getHeight();
        this.flightRange = builder.getFlightRange();
        this.maxCruisingSpeed = builder.getMaxCruisingSpeed();
    }

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

    @Override
    public String toString() {
        return "Plane{" +
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
