public class Director {
    private static Director instance;

    private Director() {} // приватний конструктор

    public static synchronized Director getInstance() {
        if (instance == null) {
            instance = new Director();
        }
        return instance;
    }

    public void constructSedan(CarBuilder builder) {
        builder.setType(Car.Type.Sedan);
        builder.setColor(Car.CarColor.White);
        builder.setEngine(new Engine(105, 140, Engine.Fuel.Petrol, 1.4f));
        builder.setTransmission(new Transmission(Transmission.Type.Manual, 5));
        builder.setWheel(new Wheel(Wheel.Material.Steel, 14));
    }

    public void constructSUV(CarBuilder builder) {
        builder.setType(Car.Type.SUV);
        builder.setColor(Car.CarColor.Black);
        builder.setEngine(new Engine(180, 300, Engine.Fuel.Diesel, 2.2f));
        builder.setTransmission(new Transmission(Transmission.Type.Automatic, 6));
        builder.setWheel(new Wheel(Wheel.Material.Forged, 18));
    }
}
