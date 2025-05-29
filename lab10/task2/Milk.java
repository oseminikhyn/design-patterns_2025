public class Milk extends AddOnDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String description() {
        return beverage.description() + ", milk";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.20f;
    }
}