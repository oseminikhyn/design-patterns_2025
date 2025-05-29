public abstract class Beverage {
    protected final int sugar;
    protected DrinkType drinkType;

    public Beverage(int sugar, DrinkType drinkType) {
        this.sugar = sugar;
        this.drinkType = drinkType;
    }

    public abstract void prepare();
    public abstract void drink();
    public abstract int cost();

    public void serve() {
        drinkType.serve();
    }
}
