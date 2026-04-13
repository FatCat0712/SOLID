package base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer>  observers = new ArrayList<>();
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.notify(arg);
        }
    }

}
