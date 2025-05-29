public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteStringBuilderBuilder builder = new ConcreteStringBuilderBuilder();

        director.constructExample(builder);
        String result = builder.build();

        System.out.println("Built string: " + result);
    }
}
