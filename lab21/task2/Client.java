public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setOperation(new AddOperation());
        calculator.compute(10, 5);

        calculator.setOperation(new SubtractOperation());
        calculator.compute(12, 13);

        calculator.setOperation(new MultiplyOperation());
        calculator.compute(6, 7);
    }
}
