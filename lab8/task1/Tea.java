public abstract class Tea extends Beverage {
    public Tea(int sugar, DrinkType drinkType) {
        super(sugar, drinkType);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
    }

    @Override
    public int cost() {
        return 7;
    }
}
