public class Bus extends Transport {
    public Bus(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public String getType() {
        return "Bus";
    }
}