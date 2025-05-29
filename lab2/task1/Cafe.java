// Cafe.java
import java.util.*;

public class Cafe {
    private Map<String, Integer> sales = new HashMap<>();
    private Map<String, DrinkFactory> factories = new HashMap<>();

    public Cafe() {
        // Register available drinks
        registerDrink("Espresso", new EspressoFactory());
        registerDrink("Americano", new AmericanoFactory());
        registerDrink("Cappuccino", new CappuccinoFactory());
        registerDrink("Latte", new LatteFactory());
    }

    public void registerDrink(String name, DrinkFactory factory) {
        factories.put(name, factory);
        sales.put(name, 0);
    }

    public void sellDrink(String name, int quantity) {
        if (factories.containsKey(name)) {
            sales.put(name, sales.get(name) + quantity);
        } else {
            System.out.println("Напій \"" + name + "\" недоступний.");
        }
    }

    public double calculateProfit() {
        double profit = 0.0;
        for (String name : sales.keySet()) {
            Drink drink = factories.get(name).createDrink();
            int quantity = sales.get(name);
            profit += quantity * (drink.getSellingPrice() - drink.getCostPrice());
        }
        return profit;
    }

    public void report() {
        System.out.println("=== Продажі кав’ярні ===");
        for (String name : sales.keySet()) {
            int qty = sales.get(name);
            if (qty > 0) {
                System.out.println(name + ": " + qty + " шт.");
            }
        }
        System.out.println("Загальний прибуток: " + calculateProfit() + " грн");
    }
}
