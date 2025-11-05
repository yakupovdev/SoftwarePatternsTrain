package Observer.observersimpl;

import Observer.observers.IObserver;

public class PhoneObserverImpl implements IObserver {
    @Override
    public void update(String storeName, String message) {
        System.out.printf("Phone notification: In %s new promotion - %s\n",storeName, message);
    }
}
