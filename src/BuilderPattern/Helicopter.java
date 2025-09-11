public class Helicopter {
    private final String type =  "Helicopter";
    private final String name;
    private final double length;
    private final double wingspan;
    private final double height;
    private final int flightRange;
    private final int maxCruisingSpeed;

    public Helicopter(String name, double length, double wingspan, double height, int flightRange,  int maxCruisingSpeed) {
        this.name = name;
        this.length = length;
        this.wingspan = wingspan;
        this.height = height;
        this.flightRange = flightRange;
        this.maxCruisingSpeed = maxCruisingSpeed;
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
