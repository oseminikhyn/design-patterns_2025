public class Main {
    public static void main(String[] args) {
        // Espresso with 2 sugars
        Beverage espresso = new Sugar(new Sugar(new Espresso()));
        System.out.println(espresso);

        // Dark roast with cream and 2 sugars
        Beverage darkRoast1 = new Sugar(new Sugar(new Cream(new DarkRoast())));
        System.out.println(darkRoast1);

        // Dark roast with whipped cream and 1 sugar
        Beverage darkRoast2 = new Sugar(new WhippedCream(new DarkRoast()));
        System.out.println(darkRoast2);

        // Decaf with milk and 2 sugars
        Beverage decaf = new Sugar(new Sugar(new Milk(new Decaf())));
        System.out.println(decaf);
    }
}
