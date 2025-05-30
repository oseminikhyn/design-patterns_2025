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

    public void duplicateA() {
        if (checkExistence(2f * a, b, c))
            this.a *= 2f;
        else System.out.println("Error: value is not set");
    }

    public void halfA() {
        if (checkExistence(a / 2f, b, c))
            this.a /= 2f;
        else System.out.println("Error: value is not set");
    }

    public void duplicateB() {
        if (checkExistence(a, 2f * b, c))
            this.b *= 2f;
        else System.out.println("Error: value is not set");
    }

    public void halfB() {
        if (checkExistence(a, b / 2f, c))
            this.b /= 2f;
        else System.out.println("Error: value is not set");
    }

    public void duplicateC() {
        if (checkExistence(a, b, 2f * c))
            this.c *= 2f;
        else System.out.println("Error: value is not set");
    }

    public void halfC() {
        if (checkExistence(a, b, c / 2f))
            this.c /= 2f;
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

    public Memento save() {
        return new Memento(a, b, c);
    }

    public void restore(Memento memento) {
        this.a = memento.a;
        this.b = memento.b;
        this.c = memento.c;
    }

    public static class Memento {
        private final float a, b, c;

        private Memento(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return String.format("Triangle(a=%.2f, b=%.2f, c=%.2f)", a, b, c);
    }
}