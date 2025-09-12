package BuilderPattern;

public interface IAircraftBuilder {
    IAircraftBuilder setName(String name);
    IAircraftBuilder setLength(double length);
    IAircraftBuilder setWingspan(double wingspan);
    IAircraftBuilder setHeight(double height);
    IAircraftBuilder setFlightRange(int flightRange);
    IAircraftBuilder setMaxCruisingSpeed(int maxCruisingSpeed);
}
