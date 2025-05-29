public class PhilipsFactory implements CoffeeMachineFactory {
    public Beverage createBeverage(BeverageType type) {
        switch (type) {
            case ESPRESSO: return new Espresso();
            case AMERICANO: return new Americano();
            case CAPPUCCINO: return new Cappuccino();
            case LATTE: return new Latte();
        }
        return null;
    }

    public double getMachineCost() { return 4500.0; }
    public double getDailyMaintenanceCost() { return 8.0; }
}