package Observer;

import Observer.observers.IObserver;
import Observer.observersimpl.EmailObserverImpl;
import Observer.observersimpl.PhoneObserverImpl;
import Observer.subjects.ISubject;
import Observer.subjectsimpl.StoreImpl;


public class Main {
    public static void main(String[] args) {
        ISubject techStore = new StoreImpl("TechStore");
        IObserver phoneObserver = new PhoneObserverImpl();
        IObserver emailObserver = new EmailObserverImpl();

        techStore.attach(phoneObserver);
        techStore.attach(emailObserver);

        techStore.notifyObservers("Black Friday!");

    }
}
