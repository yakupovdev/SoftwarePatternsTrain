package Decorator;

public class Main {
    public static void main(String[] args) {
        IPaymentProcessor payment = new BasicPaymentImpl();
        payment.processPayment(16, "Vyacheslav");

        payment = new NotificationPaymentDecorator(new ValidationPayment(payment));
        payment.processPayment(5, "Vyacheslav");
    }
}
