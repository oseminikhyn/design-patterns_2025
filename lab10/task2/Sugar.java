public class Sugar extends AddOnDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", sugar";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.10f;
    }
}