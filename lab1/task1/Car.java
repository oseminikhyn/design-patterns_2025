import java.util.List;

public class Car {
    private final List<Wheel> wheels;
    @SuppressWarnings("unused")
    private final Engine engine;

    public Car(List<Wheel> wheels, Engine engine) {
        this.wheels = wheels;
        this.engine = engine;
    }

    public void drive() {
        System.out.println("Car is driving with " + wheels.size() + " wheels and an engine");
    }
}
