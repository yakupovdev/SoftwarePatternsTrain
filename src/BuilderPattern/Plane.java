public class Plane {
    private final String type =  "Plane";
    private final String name;
    private final double length;
    private final double wingspan;
    private final double height;
    private final int flightRange;
    private final int maxCruisingSpeed;

    public Plane(String name, double length, double wingspan, double height, int flightRange,  int maxCruisingSpeed) {
        this.name = name;
        this.length = length;
        this.wingspan = wingspan;
        this.height = height;
        this.flightRange = flightRange;
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
