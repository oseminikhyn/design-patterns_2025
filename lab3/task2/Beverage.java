public abstract class Beverage {
    protected String name;
    protected double costPrice;
    protected double salePrice;

    public Beverage(String name, double costPrice, double salePrice) {
        this.name = name;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public double getProfit() {
        return salePrice - costPrice;
    }
}