import java.util.ArrayList;
import java.util.List;

public class AirTrafficControl {

    private final Runway runway = new Runway();
    private final List<Plane> planesInFlight = new ArrayList<>();
    private final List<Plane> planesOnGround = new ArrayList<>();

    public void registerPlane(Plane plane) {
        planesOnGround.add(plane);
    }

    public boolean requestTakeOff(Plane plane) {
        if (plane.getIsInTheAir()) return false;

        if (runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is taking off...");
            planesOnGround.remove(plane);
            planesInFlight.add(plane);
            plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
            return true;
        }
        System.out.println("Runway not available for plane " + plane.getId());
        return false;
    }

    public void releaseRunway() {
        runway.setIsAvailable(true);
    }

    public void landPlane(Plane plane) {
        if (!plane.getIsInTheAir()) return;

        planesInFlight.remove(plane);
        planesOnGround.add(plane);
        plane.setIsInTheAir(false);
        runway.setIsAvailable(true);
        System.out.println("Plane " + plane.getId() + " has landed.");
    }

    public List<Plane> getPlanesInFlight() {
        return planesInFlight;
    }

    public List<Plane> getPlanesOnGround() {
        return planesOnGround;
    }
}