public class Wheel implements Cloneable {
    public enum Material { Steel, Alloy, Forged }

    private Material material;
    private int diameter;

    public Wheel(Material material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    public Wheel clone() {
        try {
            return (Wheel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}