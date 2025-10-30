package Observer.observers;

public class EmailObserverImpl implements IObserver {
    @Override
    public void update(String storeName, String message) {
        System.out.printf("Email notification: In %s new promotion - %s\n",storeName, message);
    }
}
