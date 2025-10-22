package Decorator.decorators;

import Decorator.base.IPaymentProcessor;

public class NotificationPaymentDecorator extends PaymentDecoratorImpl {

    public NotificationPaymentDecorator(IPaymentProcessor payment) {
        super(payment);
    }

    @Override
    public boolean processPayment(float amount, String username) {
        boolean result = super.processPayment(amount, username);
        if (result) {
            sendNotification(username, amount);
        }
        return result;
    }

    private void sendNotification(String user, float amount) {
        System.out.printf("📩 Notification: Payment of %f $ for %s completed! \n", amount, user);
    }
}
