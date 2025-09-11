public class Director {

    public static void constructBoeing747(IAircraftBuilder builder){
        builder.setName("Boeing 747");
        builder.setLength(70.6);
        builder.setWingspan(64.4);
        builder.setHeight(19.4);
        builder.setFlightRange(13850);
        builder.setMaxCruisingSpeed(933);
    }

    public static void constructBell206(IAircraftBuilder builder){
        builder.setName("Bell 206");
        builder.setLength(12.12);
        builder.setWingspan(10.16);
        builder.setHeight(2.83);
        builder.setFlightRange(693);
        builder.setMaxCruisingSpeed(240);
    }
}
