package observer_y_composite;

import java.util.ArrayList;
import java.util.List;
// Composite: un contenedor de gráficos
public class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing composite graphic:");
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        for (Graphic graphic : graphics) {
            graphic.addObserver(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        for (Graphic graphic : graphics) {
            graphic.removeObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}