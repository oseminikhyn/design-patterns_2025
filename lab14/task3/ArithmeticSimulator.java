abstract class OperationHandler {
    protected OperationHandler next;

    public OperationHandler setNext(OperationHandler next) {
        this.next = next;
        return next;
    }

    public abstract void handle(double a, double b, String operation);
}

class AdditionHandler extends OperationHandler {
    @Override
    public void handle(double a, double b, String operation) {
        if (operation.equals("+")) {
            System.out.printf("%f + %f = %f%n", a, b, a + b);
        } else if (next != null) {
            next.handle(a, b, operation);
        } else {
            System.out.println("Operation not supported: " + operation);
        }
    }
}

class SubtractionHandler extends OperationHandler {
    @Override
    public void handle(double a, double b, String operation) {
        if (operation.equals("-")) {
            System.out.printf("%f - %f = %f%n", a, b, a - b);
        } else if (next != null) {
            next.handle(a, b, operation);
        } else {
            System.out.println("Operation not supported: " + operation);
        }
    }
}

class MultiplicationHandler extends OperationHandler {
    @Override
    public void handle(double a, double b, String operation) {
        if (operation.equals("*")) {
            System.out.printf("%f * %f = %f%n", a, b, a * b);
        } else if (next != null) {
            next.handle(a, b, operation);
        } else {
            System.out.println("Operation not supported: " + operation);
        }
    }
}

class DivisionHandler extends OperationHandler {
    @Override
    public void handle(double a, double b, String operation) {
        if (operation.equals("/")) {
            if (b == 0) {
                System.out.println("Error: Division by zero");
            } else {
                System.out.printf("%f / %f = %f%n", a, b, a / b);
            }
        } else if (next != null) {
            next.handle(a, b, operation);
        } else {
            System.out.println("Operation not supported: " + operation);
        }
    }
}

public class ArithmeticSimulator {
    public static void main(String[] args) {

        OperationHandler chain = new AdditionHandler();
        chain.setNext(new SubtractionHandler())
             .setNext(new MultiplicationHandler())
             .setNext(new DivisionHandler());

        Object[][] requests = {
            {5.0, 3.0, "+"},
            {10.0, 2.0, "-"},
            {4.0, 2.5, "*"},
            {9.0, 3.0, "/"},
            {7.0, 0.0, "/"},
            {5.0, 3.0, "^"}
        };

        for (Object[] request : requests) {
            double a = (double) request[0];
            double b = (double) request[1];
            String op = (String) request[2];
            chain.handle(a, b, op);
        }
    }
}