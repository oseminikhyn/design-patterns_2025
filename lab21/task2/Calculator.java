public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int compute(int a, int b) {
        if (operation == null) {
            throw new IllegalStateException("No operation set.");
        }
        return operation.execute(a, b);
    }
}

