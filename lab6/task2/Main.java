public class Main {
    public static void main(String[] args) {
        Director director = Director.getInstance();
        ConcreteCarBuilder builder = new ConcreteCarBuilder();

        director.constructSedan(builder);
        Car sedan = builder.build();
        System.out.println("Sedan: " + sedan);

        director.constructSUV(builder);
        Car suv = builder.build();
        System.out.println("SUV: " + suv);
    }
}