public class Trolleybus extends Transport {
    public Trolleybus(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public String getType() {
        return "Trolleybus";
    }
}