package Observer.subjects;

import Observer.observers.IObserver;

public interface ISubject {
    void attach(IObserver o);
    void detach(IObserver o);
    void notifyObservers(String message);
}
