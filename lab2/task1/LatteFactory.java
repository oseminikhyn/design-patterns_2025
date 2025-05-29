public class LatteFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Latte();
    }
}