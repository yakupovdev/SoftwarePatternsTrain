package Decorator;

public class NotificationPaymentDecorator extends PaymentDecoratorImpl {

    public NotificationPaymentDecorator(IPaymentProcessor payment) {
        super(payment);
    }

    @Override
    public boolean processPayment(double amount, String username) {
        boolean result = super.processPayment(amount, username);
        if (result) {
            sendNotification(username, amount);
        }
        return result;
    }

    private void sendNotification(String user, double amount) {
        System.out.println("📩 Notification: Payment of " + amount + "$ for user " + user + " completed!");
    }
}
