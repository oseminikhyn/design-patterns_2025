import java.io.*;
import java.util.*;

abstract class Equation implements Cloneable {
    List<Double> coefficients;

    Equation(List<Double> coefficients) {
        this.coefficients = new ArrayList<>(coefficients);
    }

    abstract List<Double> solve();

    @Override
    public Equation clone() {
        try {
            Equation clone = (Equation) super.clone();
            clone.coefficients = new ArrayList<>(this.coefficients);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

class LinearEquation extends Equation {
    LinearEquation(List<Double> coefficients) {
        super(coefficients);
    }

    @Override
    List<Double> solve() {
        double b = coefficients.get(0);
        double c = coefficients.get(1);

        if (b == 0) {
            if (c == 0) return Collections.singletonList(Double.POSITIVE_INFINITY);
            return new ArrayList<>();
        }
        return Collections.singletonList(-c / b);
    }

    @Override
    public LinearEquation clone() {
        return (LinearEquation) super.clone();
    }
}

class QuadraticEquation extends Equation {
    QuadraticEquation(List<Double> coefficients) {
        super(coefficients);
    }

    @Override
    List<Double> solve() {
        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);

        if (a == 0) return new LinearEquation(Arrays.asList(b, c)).solve();

        double D = b * b - 4 * a * c;
        if (D < 0) return new ArrayList<>();
        if (D == 0) return Collections.singletonList(-b / (2 * a));

        double sqrtD = Math.sqrt(D);
        return Arrays.asList((-b - sqrtD) / (2 * a), (-b + sqrtD) / (2 * a));
    }

    @Override
    public QuadraticEquation clone() {
        return (QuadraticEquation) super.clone();
    }
}

class BiQuadraticEquation extends Equation {
    BiQuadraticEquation(List<Double> coefficients) {
        super(coefficients);
    }

    @Override
    List<Double> solve() {
        double a = coefficients.get(0);
        double b = coefficients.get(2);
        double c = coefficients.get(4);

        QuadraticEquation qe = new QuadraticEquation(Arrays.asList(a, b, c));
        List<Double> yRoots = qe.solve();
        List<Double> roots = new ArrayList<>();

        for (double y : yRoots) {
            if (y < 0) continue;
            double sqrt = Math.sqrt(y);
            roots.add(-sqrt);
            roots.add(sqrt);
        }
        return roots;
    }

    @Override
    public BiQuadraticEquation clone() {
        return (BiQuadraticEquation) super.clone();
    }
}

public class EquationSolver {
    public static Equation classifyEquation(List<Double> coeffs) {
        int n = coeffs.size();
        if (n == 2) return new LinearEquation(coeffs);
        if (n == 3) return new QuadraticEquation(coeffs);
        if (n == 5) return new BiQuadraticEquation(coeffs);
        return null;
    }

    public static void processFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        int[] count = new int[6];
        Double minRoot = null, maxRoot = null;
        List<Double> oneRootEq = new ArrayList<>();

        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;
            String[] tokens = line.trim().split("\\s+");
            List<Double> coeffs = new ArrayList<>();
            for (String t : tokens) coeffs.add(Double.valueOf(t));

            Equation eq = classifyEquation(coeffs);
            if (eq == null) continue;

            Equation clonedEq = eq.clone();
            List<Double> roots = clonedEq.solve();
            if (roots.size() == 1 && roots.get(0).equals(Double.POSITIVE_INFINITY)) {
                count[5]++;
                continue;
            }

            int rCount = roots.size();
            if (rCount >= 0 && rCount <= 4) count[rCount]++;

            if (rCount == 1) {
                double root = roots.get(0);
                if (minRoot == null || root < minRoot) minRoot = root;
                if (maxRoot == null || root > maxRoot) maxRoot = root;
            }
        }

        System.out.println("\n=== Results for: " + fileName + " ===");
        System.out.println("No roots: " + count[0]);
        System.out.println("One root: " + count[1]);
        System.out.println("Two roots: " + count[2]);
        System.out.println("Three roots: " + count[3]);
        System.out.println("Four roots: " + count[4]);
        System.out.println("Infinite roots: " + count[5]);
        System.out.println("Smallest root (1 solution): " + (minRoot != null ? minRoot : "N/A"));
        System.out.println("Largest root (1 solution): " + (maxRoot != null ? maxRoot : "N/A"));
    }

    public static void main(String[] args) throws IOException {
        String[] inputFiles = {
            "C:\\java\\design-patterns_2025\\lab2\\task2\\input01.txt",
            "C:\\java\\design-patterns_2025\\lab2\\task2\\input02.txt",
            "C:\\java\\design-patterns_2025\\lab2\\task2\\input03.txt"
        };

        for (String file : inputFiles) {
            processFile(file);
        }
    }
}
