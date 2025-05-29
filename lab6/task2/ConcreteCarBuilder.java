public class ConcreteCarBuilder implements CarBuilder {
    private Car.Type type;
    private Car.CarColor color;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;

    public void setType(Car.Type type) { this.type = type; }
    public void setColor(Car.CarColor color) { this.color = color; }
    public void setEngine(Engine engine) { this.engine = engine; }
    public void setTransmission(Transmission transmission) { this.transmission = transmission; }
    public void setWheel(Wheel wheel) { this.wheel = wheel; }

    public Car build() {
        return new Car(type, color, engine, transmission, wheel);
    }
}