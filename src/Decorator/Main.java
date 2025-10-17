package Decorator;

import Decorator.base.BasicPaymentImpl;
import Decorator.base.IPaymentProcessor;
import Decorator.decorators.NotificationPaymentDecorator;
import Decorator.decorators.ValidationPaymentDecorator;

public class Main {
    public static void main(String[] args) {
        IPaymentProcessor payment = new BasicPaymentImpl();
        payment.processPayment(16, "Vyacheslav");

        payment = new NotificationPaymentDecorator(new ValidationPaymentDecorator(payment));
        payment.processPayment(5, "Vyacheslav");
    }
}
