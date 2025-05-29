public class Transmission {
    public enum Type { Manual, Automatic }

    private Type type;
    private int gears;

    public Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gears=" + gears +
                '}';
    }
}