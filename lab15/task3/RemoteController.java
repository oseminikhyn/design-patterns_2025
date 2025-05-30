public class RemoteController {

    private final Device device;

    public RemoteController(Device device) {
        this.device = device;
    }

    public RemoteController() {
        this.device = null;
    }

    public void deviceOn() {
        if (device != null) {
            device.on();
        } else {
            for (Device d : DeviceRegistry.getDevices()) {
                d.on();
            }
        }
    }

    public void deviceOff() {
        if (device != null) {
            device.off();
        } else {
            System.out.println("Universal controller: turning off all devices...");
            for (Device d : DeviceRegistry.getDevices()) {
                d.off();
            }
        }
    }

    public void deviceVolumeUp() {
        if (device != null) device.volumeUp();
    }

    public void deviceVolumeDown() {
        if (device != null) device.volumeDown();
    }

    public void deviceNextChanel() {
        if (device != null) device.nextChanel();
    }

    public void devicePrevChanel() {
        if (device != null) device.prevChanel();
    }
}
