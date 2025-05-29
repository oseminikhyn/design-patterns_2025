public interface CoffeeMachineFactory {
    Beverage createBeverage(BeverageType type);
    double getMachineCost();
    double getDailyMaintenanceCost();
}
