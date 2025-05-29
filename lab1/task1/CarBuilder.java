import java.util.ArrayList;
import java.util.List;

public class CarBuilder {
    public Car buildCar() {
        List<Wheel> wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel());
        }

        Engine engine = new Engine();
        return new Car(wheels, engine);
    }
}
