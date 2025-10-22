package Decorator.decorators;

import Decorator.base.IPaymentProcessor;

public class ValidationPaymentDecorator extends PaymentDecoratorImpl {
    private final String messageOfValidation = "Invalid amount or username";

    public ValidationPaymentDecorator(IPaymentProcessor payment) {
        super(payment);
    }
    @Override
    public boolean processPayment(float amount, String username) {
        if (amount <= 0 || username == null || username.isEmpty()) {
            System.out.println(messageOfValidation);
            return false;
        } else{
            return super.processPayment(amount, username);
        }
    }
}
