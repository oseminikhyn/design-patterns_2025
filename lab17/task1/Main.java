public class Main {
    public static void main(String[] args) {
        AirTrafficControl atc = new AirTrafficControl();

        Plane plane1 = new Plane(101, atc);
        Plane plane2 = new Plane(202, atc);

        plane1.takeOff();
        plane2.takeOff();  // should be denied if runway still occupied
        atc.releaseRunway();
        plane2.takeOff();

        plane1.land();
        plane2.land();
    }
}