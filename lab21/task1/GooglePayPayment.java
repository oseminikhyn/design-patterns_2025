public class GooglePayPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Payment of $" + amount + " made using Google Pay.");
    }
}
