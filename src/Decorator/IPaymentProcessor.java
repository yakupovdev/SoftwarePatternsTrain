package Decorator;

public interface IPaymentProcessor {
    boolean processPayment(double amount, String username);
}
