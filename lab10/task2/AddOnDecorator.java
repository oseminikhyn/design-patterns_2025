public abstract class AddOnDecorator extends Beverage {
    protected final Beverage beverage;

    public AddOnDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
