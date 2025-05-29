public class NespressoFactory implements CoffeeMachineFactory {
    public Beverage createBeverage(BeverageType type) {
        return switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
        };
    }

    public double getMachineCost() { return 4000.0; }
    public double getDailyMaintenanceCost() { return 12.0; }
}