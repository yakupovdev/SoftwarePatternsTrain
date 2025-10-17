package Decorator.base;

public interface IPaymentProcessor {
    boolean processPayment(float amount, String username);
}
