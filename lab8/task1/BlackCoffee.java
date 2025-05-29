public class BlackCoffee extends Coffee {
    private final boolean extra_coffee;
    private final int water_volume;

    public BlackCoffee(int sugar, int water_volume, boolean extra_coffee, DrinkType drinkType) {
        super(sugar, drinkType);
        this.water_volume = water_volume;
        this.extra_coffee = extra_coffee;
    }

    @Override
    public void prepare() {
        super.prepare();
        if (extra_coffee) System.out.println("Put extra coffee...");
        System.out.printf("Put some hot water: %s ml...%n", water_volume);
        if (sugar > 0) System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
    }

    @Override
    public void drink() {
        System.out.println("Drink black coffee!");
        serve();
    }
}