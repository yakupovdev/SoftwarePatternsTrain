package Decorator.base;

public class BasicPaymentImpl implements IPaymentProcessor {

    @Override
    public boolean processPayment(float amount, String username) {
        System.out.printf("Processing payment of %f $ for %s \n", amount, username);
        return true;
    }
}
