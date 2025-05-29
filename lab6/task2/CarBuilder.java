public interface CarBuilder {
    void setType(Car.Type type);
    void setColor(Car.CarColor color);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setWheel(Wheel wheel);
    Car build();
}