package observer_y_composite;

import java.util.ArrayList;
import java.util.List;
// Hoja concreta: un rectángulo
public class Rectangle implements Graphic {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}