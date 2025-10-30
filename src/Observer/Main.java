package Observer;

import Observer.observers.EmailObserverImpl;
import Observer.observers.PhoneObserverImpl;
import Observer.subjects.ISubject;
import Observer.subjects.StoreImpl;


public class Main {
    public static void main(String[] args) {
        ISubject techStore = new StoreImpl("TechStore");

        techStore.attach(new PhoneObserverImpl());
        techStore.attach(new EmailObserverImpl());

        techStore.notifyObservers("Black Friday!");

    }
}
