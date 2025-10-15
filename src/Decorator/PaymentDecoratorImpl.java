package Decorator;

public abstract class PaymentDecoratorImpl implements IPaymentProcessor {
    protected IPaymentProcessor payment;

    public PaymentDecoratorImpl(IPaymentProcessor payment) {
        this.payment = payment;
    }

    @Override
    public boolean processPayment(double amount, String username) {
        return payment.processPayment(amount, username);
    }
}
