public class Tram extends Transport {
    public Tram(int cost, int usageCost) {
        super(cost, usageCost);
    }

    @Override
    public String getType() {
        return "Tram";
    }
}