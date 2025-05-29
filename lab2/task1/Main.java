public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.sellDrink("Espresso", 30);
        cafe.sellDrink("Americano", 20);
        cafe.sellDrink("Latte", 15);
        cafe.sellDrink("Cappuccino", 18);

        cafe.report();
    }
}
