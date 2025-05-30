import java.util.HashMap;
import java.util.Map;

public class WheelFactory {
    private static final Map<Integer, Wheel> cache = new HashMap<>();

    public static Wheel getWheel(int diameter) {
        return cache.computeIfAbsent(diameter, d -> new Wheel(d));
    }
}