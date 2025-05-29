public class AmericanoFactory implements DrinkFactory {
    @Override
    public Drink createDrink() {
        return new Americano();
    }
}