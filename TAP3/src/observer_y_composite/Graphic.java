package observer_y_composite;

// Interfaz Component
public interface Graphic {
    void draw();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}