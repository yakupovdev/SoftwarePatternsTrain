package Decorator;

public class ValidationPayment extends PaymentDecoratorImpl {

    public ValidationPayment(IPaymentProcessor payment) {
        super(payment);
    }
    @Override
    public boolean processPayment(double amount, String username) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return false;
        }

        if (username == null || username.isEmpty()) {
            System.out.println("Invalid username");
            return false;
        }

        return super.processPayment(amount, username);
    }
}
