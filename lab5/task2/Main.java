public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);
        Transmission transmission = new Transmission(Transmission.Type.Manual, 5);

        Car car = new Car(Car.Type.Sedan, Car.CarColor.White, engine, transmission, wheel);
        Car clonedCar = car.clone();

        System.out.println("Original Car: " + car);
        System.out.println("Cloned Car:   " + clonedCar);
    }
}