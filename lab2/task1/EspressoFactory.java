public class EspressoFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Espresso();
    }
}