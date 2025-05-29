public class CappuccinoFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Cappuccino();
    }
}