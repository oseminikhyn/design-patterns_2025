public class Cafe {
    public static void main(String[] args) {
        DrinkType inRestaurant = new InRestaurant();
        DrinkType toGo = new ToGo();

        Beverage[] drinks = {
            new BlackCoffee(3, 200, true, inRestaurant),
            new CoffeeWithMilk(2, 150, toGo),
            new BlackChocolate(2, 180, toGo),
            new MilkChocolate(1, 120, inRestaurant),
            new BlackTea(0, 250, inRestaurant),
            new TeaWithMilk(2, 100, toGo)
        };

        for (Beverage drink : drinks) {
            System.out.println("=========================");
            drink.prepare();
            System.out.printf("Cost of beverage: %s uah%n", drink.cost());
            drink.drink();
        }
    }
}
