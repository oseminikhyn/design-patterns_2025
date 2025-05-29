public class AmericanCarCalculator {
    private final String model;
    private final int age;
    private final int mileage;
    private final int damageLevel; // 0 (no damage) to 10 (totalled)

    public AmericanCarCalculator(String model, int age, int mileage, int damageLevel) {
        this.model = model;
        this.age = age;
        this.mileage = mileage;
        this.damageLevel = damageLevel;
    }

    public double calculatePrice() {
        double basePrice = 30000;
        basePrice -= age * 1000;
        basePrice -= mileage * 0.05;
        basePrice -= damageLevel * 1500;
        return Math.max(basePrice, 500); // мінімальна ціна
    }
}