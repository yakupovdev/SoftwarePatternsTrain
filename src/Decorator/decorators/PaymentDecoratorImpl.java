package Decorator.decorators;

import Decorator.base.IPaymentProcessor;

public abstract class PaymentDecoratorImpl implements IPaymentProcessor {
    protected IPaymentProcessor payment;

    public PaymentDecoratorImpl(IPaymentProcessor payment) {
        this.payment = payment;
    }

    @Override
    public boolean processPayment(float amount, String username) {
        return payment.processPayment(amount, username);
    }
}
