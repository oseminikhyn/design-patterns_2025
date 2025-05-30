public class Controller {

    private Lamp lamp;

    public Controller() {
    }

    public Controller(Lamp lamp) {
        this.lamp = lamp;
    }

    public void on() {
        if (lamp != null) {
            lamp.lightOn();
        } else {
            System.out.println("Universal controller ON: not applicable");
        }
    }

    public void off() {
        if (lamp != null) {
            lamp.lightOff();
        } else {
            System.out.println("Universal controller: turning off all lamps...");
            for (Lamp l : LampRegistry.getAllLamps()) {
                l.lightOff();
            }
        }
    }
}