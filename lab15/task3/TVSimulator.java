public class TVSimulator {
    public static void main(String[] args) {

        Device tv = new Television();
        Device radio = new Radio();

        RemoteController controller = new RemoteController(tv);
        RemoteController radioController = new RemoteController(radio);
        RemoteController universalController = new RemoteController();

        controller.deviceOn();
        for (int i = 0; i < 5; i++) controller.deviceNextChanel();
        controller.deviceVolumeUp();
        controller.deviceOff();

        radioController.deviceOn();
        radioController.deviceNextChanel();
        radioController.deviceVolumeUp();
        radioController.deviceOff();

        universalController.deviceOff();
    }
}