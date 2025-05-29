import java.text.DecimalFormat;

public class CoffeeMachineProfitCalculator {
    static class ProfitResult {
        String manufacturer;
        double netProfit;

        ProfitResult(String manufacturer, double netProfit) {
            this.manufacturer = manufacturer;
            this.netProfit = netProfit;
        }
    }

    public static double calculateNetProfit(CoffeeMachineFactory factory, int N, int dailySalesPerBeverage) {
        BeverageType[] types = BeverageType.values();
        double totalBeverageProfit = 0.0;

        for (BeverageType type : types) {
            Beverage beverage = factory.createBeverage(type);
            totalBeverageProfit += beverage.getProfit() * dailySalesPerBeverage * N;
        }

        double totalCost = factory.getMachineCost() + factory.getDailyMaintenanceCost() * N;
        return totalBeverageProfit - totalCost;
    }

    public static void main(String[] args) {
        int N = 25;
        int dailySalesPerBeverage = 5;

        CoffeeMachineFactory[] factories = {
            new DeLonghiFactory(),
            new NespressoFactory(),
            new PhilipsFactory()
        };

        String[] manufacturers = { "DeLonghi", "Nespresso", "Philips" };
        ProfitResult[] results = new ProfitResult[factories.length];

        for (int i = 0; i < factories.length; i++) {
            double netProfit = calculateNetProfit(factories[i], N, dailySalesPerBeverage);
            results[i] = new ProfitResult(manufacturers[i], netProfit);
        }

        ProfitResult maxProfit = results[0];
        for (ProfitResult result : results) {
            if (result.netProfit > maxProfit.netProfit) {
                maxProfit = result;
            }
        }

        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("Дні: " + N + ", Щоденні продажі: " + dailySalesPerBeverage);
        System.out.println("----------------------------------------");
        for (ProfitResult result : results) {
            System.out.println(result.manufacturer + " Прибуток: $" + df.format(result.netProfit));
        }
        System.out.println("----------------------------------------");
        System.out.println("Рекомендований виробник: " + maxProfit.manufacturer);
        System.out.println("Прибуток: $" + df.format(maxProfit.netProfit));
    }
}
