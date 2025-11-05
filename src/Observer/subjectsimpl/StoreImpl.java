package Observer.subjectsimpl;

import java.util.ArrayList;
import java.util.List;
import Observer.observers.IObserver;
import Observer.subjects.ISubject;

public class StoreImpl implements ISubject {
    private final List<IObserver> observers;
    private final String storeName;

    public StoreImpl(String storeName) {
        this.observers = new ArrayList<>();
        this.storeName = storeName;
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (IObserver observer : observers) {
            observer.update(storeName, message);
        }
    }
}
