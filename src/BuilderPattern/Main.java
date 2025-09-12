package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        Plane planeBoeing747 = Director.constructBoeing747();
        System.out.println(planeBoeing747);

        Helicopter helicopter = Director.constructBell206();
        System.out.println(helicopter);

    }
}
