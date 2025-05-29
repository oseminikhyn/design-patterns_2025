public abstract class Coffee extends Beverage {
    public Coffee(int sugar, DrinkType drinkType) {
        super(sugar, drinkType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
    }

    @Override
    public int cost() {
        return 10;
    }
}