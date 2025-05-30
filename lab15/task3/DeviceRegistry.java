import java.util.ArrayList;
import java.util.List;

public class DeviceRegistry {
    private static final List<Device> devices = new ArrayList<>();

    public static void register(Device device) {
        devices.add(device);
    }

    public static List<Device> getDevices() {
        return devices;
    }
}
