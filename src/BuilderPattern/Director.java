package BuilderPattern;

public class Director {

    public static Plane constructBoeing747(){
        return  new PlaneBuilderImpl()
                .setName("Boeing 747").
                setLength(70.6).
                setWingspan(64.4)
                .setHeight(19.4)
                .setFlightRange(13850)
                .setMaxCruisingSpeed(933)
                .build();
    }

    public static Helicopter constructBell206(){
        return new HelicopterBuilderImpl()
                .setName("Bell 206")
                .setLength(12.12)
                .setWingspan(10.16)
                .setHeight(2.83)
                .setFlightRange(693)
                .setMaxCruisingSpeed(240)
                .build();
    }
}
