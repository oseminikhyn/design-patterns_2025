public class WhippedCream extends AddOnDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", whipped cream";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.30f;
    }
}