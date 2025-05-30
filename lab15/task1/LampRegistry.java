import java.util.ArrayList;
import java.util.List;

public class LampRegistry {
    private static final List<Lamp> lamps = new ArrayList<>();

    public static void register(Lamp lamp) {
        lamps.add(lamp);
    }

    public static List<Lamp> getAllLamps() {
        return lamps;
    }
}