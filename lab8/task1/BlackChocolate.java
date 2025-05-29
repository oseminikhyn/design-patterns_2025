public class BlackChocolate extends Chocolate {
    private final int water_volume;

    public BlackChocolate(int sugar, int water_volume, DrinkType drinkType) {
        super(sugar, drinkType);
        this.water_volume = water_volume;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Put some hot water: %s ml...%n", water_volume);
        if (sugar > 0) System.out.printf("Put some sugar     : %s pieces ...%n", sugar);
    }

    @Override
    public void drink() {
        System.out.println("Drink chocolate beverage!");
        serve();
    }
}