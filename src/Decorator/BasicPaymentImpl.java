package Decorator;

public class BasicPaymentImpl implements IPaymentProcessor {

    @Override
    public boolean processPayment(double amount, String username) {
        System.out.println("Processing payment of " + amount + "$ for user " + username);
        return true;
    }
}
