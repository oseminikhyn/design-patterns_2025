public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setPaymentStrategy(new BankAccountPayment());
        customer.makePayment(100);

        customer.setPaymentStrategy(new PayPalPayment());
        customer.makePayment(250);

        customer.setPaymentStrategy(new GooglePayPayment());
        customer.makePayment(80);
    }
}
