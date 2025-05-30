public class Customer {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
