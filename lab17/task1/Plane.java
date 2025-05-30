public class Plane {

    private boolean isInTheAir;
    private final int id;
    private final AirTrafficControl atc;

    public Plane(int id, AirTrafficControl atc) {
        this.id = id;
        this.atc = atc;
        this.isInTheAir = false;
        atc.registerPlane(this);
    }

    public void takeOff() {
        if (atc.requestTakeOff(this)) {
            // Optional additional behavior after successful takeoff
        }
    }

    public void land() {
        atc.landPlane(this);
    }

    public boolean getIsInTheAir() {
        return isInTheAir;
    }

    public void setIsInTheAir(boolean inTheAir) {
        isInTheAir = inTheAir;
    }

    public int getId() {
        return id;
    }
}