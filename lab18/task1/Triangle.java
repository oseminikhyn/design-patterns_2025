// Triangle.java
public class Triangle {

    private float a;
    private float b;
    private float c;

    public static boolean checkExistence(float a, float b, float c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public Triangle(float a, float b, float c) {
        assert checkExistence(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(float a) {
        if (checkExistence(a, b, c))
            this.a = a;
        else System.out.println("Error: value is not set");
    }

    public void setB(float b) {
        if (checkExistence(a, b, c))
            this.b = b;
        else System.out.println("Error: value is not set");
    }

    public void setC(float c) {
        if (checkExistence(a, b, c))
            this.c = c;
        else System.out.println("Error: value is not set");
    }

    public float perimeter() {
        return a + b + c;
    }

    public float square() {
        float p = perimeter() / 2;
        float s = p * (p - a) * (p - b) * (p - c);
        return (float) Math.sqrt(s);
    }

    // Internal class based Memento
    public class Memento {
        private final float a, b, c;

        private Memento(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public Memento saveState() {
        return new Memento(a, b, c);
    }

    public void restoreState(Memento memento) {
        this.a = memento.a;
        this.b = memento.b;
        this.c = memento.c;
    }

    // Protected Memento (Strong encapsulation)
    public interface ProtectedMemento {}

    private static class SecureMemento implements ProtectedMemento {
        private final float a, b, c;

        private SecureMemento(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public ProtectedMemento secureSave() {
        return new SecureMemento(a, b, c);
    }

    public void secureRestore(ProtectedMemento memento) {
        if (memento instanceof SecureMemento sm) {
            this.a = sm.a;
            this.b = sm.b;
            this.c = sm.c;
        }
    }

    // Marker interface
    public interface MarkerMemento {}

    private static class MarkerImpl implements MarkerMemento {
        private final float a, b, c;

        public MarkerImpl(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public MarkerMemento markerSave() {
        return new MarkerImpl(a, b, c);
    }

    public void markerRestore(MarkerMemento m) {
        if (m instanceof MarkerImpl mi) {
            this.a = mi.a;
            this.b = mi.b;
            this.c = mi.c;
        }
    }

    @Override
    public String toString() {
        return String.format("Triangle(a=%.2f, b=%.2f, c=%.2f)", a, b, c);
    }
}