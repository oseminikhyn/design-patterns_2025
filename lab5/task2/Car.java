// Car.java
public class Car implements Cloneable {
    public enum Type { Sedan, Hatchback, SUV }
    public enum CarColor { Red, Black, White, Blue }

    private Type type;
    private CarColor color;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;

    public Car(Type type, CarColor color, Engine engine, Transmission transmission, Wheel wheel) {
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.wheel = wheel;
    }

    public Car clone() {
        try {
            Car cloned = (Car) super.clone();
            cloned.engine = engine.clone();
            cloned.transmission = transmission.clone();
            cloned.wheel = wheel.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", color=" + color +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheel=" + wheel +
                '}';
    }
}

