package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        PlaneBuilderImpl planeBuilder = new PlaneBuilderImpl();
        Director.constructBoeing747(planeBuilder);
        Plane planeBoeing747 = planeBuilder.build();
        System.out.println(planeBoeing747);

        HelicopterBuilderImpl helicopterBuilder = new HelicopterBuilderImpl();
        Director.constructBell206(helicopterBuilder);
        Helicopter helicopter = helicopterBuilder.build();
        System.out.println(helicopter);

    }
}
