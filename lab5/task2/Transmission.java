public class Transmission implements Cloneable {
    public enum Type { Manual, Automatic }

    private Type type;
    private int gears;

    public Transmission(Type type, int gears) {
        this.type = type;
        this.gears = gears;
    }

    public Transmission clone() {
        try {
            return (Transmission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "type=" + type +
                ", gears=" + gears +
                '}';
    }
}
