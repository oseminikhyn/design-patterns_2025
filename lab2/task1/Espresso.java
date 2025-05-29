public class Espresso implements Drink {
    @Override
    public String getName() { return "Espresso"; }
    @Override
    public double getCostPrice() { return 10.0; }
    @Override
    public double getSellingPrice() { return 25.0; }
}