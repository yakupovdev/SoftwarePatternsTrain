public interface IAircraftBuilder {
    void setName(String name);
    void setLength(double length);
    void setWingspan(double wingspan);
    void setHeight(double height);
    void setFlightRange(int flightRange);
    void setMaxCruisingSpeed(int maxCruisingSpeed);
}
