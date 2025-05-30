import java.util.HashMap;
import java.util.Map;

public class EngineFactory {
    private static final Map<String, Engine> cache = new HashMap<>();

    public static Engine getEngine(int power, Engine.Fuel fuel) {
        String key = power + ":" + fuel;
        return cache.computeIfAbsent(key, k -> new Engine(power, fuel));
    }
}
