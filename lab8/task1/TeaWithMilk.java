public class TeaWithMilk extends Tea {
    private final int milkVolume;

    public TeaWithMilk(int sugar, int milkVolume, DrinkType drinkType) {
        super(sugar, drinkType);
        this.milkVolume = milkVolume;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.printf("Put some milk : %s ml...%n", milkVolume);
        if (sugar > 0) System.out.printf("Put some sugar: %s pieces ...%n", sugar);
    }

    @Override
    public void drink() {
        System.out.println("Drink tee with milk!");
        serve();
    }

    @Override
    public int cost() {
        return super.cost() + (int) (milkVolume / 20.0);
    }
}