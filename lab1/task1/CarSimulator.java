public class CarSimulator {
    private final  CarBuilder carBuilder;

    public CarSimulator(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void runSimulation() {
        Car car = carBuilder.buildCar();
        car.drive();
    }

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        CarSimulator simulator = new CarSimulator(builder);
        simulator.runSimulation();
    }
}
