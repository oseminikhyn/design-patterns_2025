public class Main {
    public static void main(String[] args) {
        int B = 10, T = 5, Tr = 40, N = 200_000;

        TransportFactory[] factories = {
            new VolvoFactory(),
            new SkodaFactory(),
            new HyundaiFactory()
        };

        String[] names = {"Volvo", "Skoda", "Hyundai"};

        int minCost = Integer.MAX_VALUE;
        String bestManufacturer = "";

        for (int i = 0; i < factories.length; i++) {
            TransportFactory factory = factories[i];
            int totalCost = 0;

            Bus bus = factory.createBus();
            Tram tram = factory.createTram();
            Trolleybus trolley = factory.createTrolleybus();

            totalCost += B * (bus.getCost() + N * bus.getUsageCost());
            totalCost += T * (tram.getCost() + N * tram.getUsageCost());
            totalCost += Tr * (trolley.getCost() + N * trolley.getUsageCost());

            System.out.printf("Виробник: %s, Загальна вартість: %,d грн%n", names[i], totalCost);

            if (totalCost < minCost) {
                minCost = totalCost;
                bestManufacturer = names[i];
            }
        }

        System.out.println("Найвигідніший виробник: " + bestManufacturer);
    }
}
