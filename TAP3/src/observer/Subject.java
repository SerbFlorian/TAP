package observer;

/**
 * Created by pedro on 10/7/16.
 */
import java.util.ArrayList;
import java.util.List;

public class Subject {
    // DINAMIC BIDING -> observer.update(state);
    // sempre es cridar un metode del CONTRACTE, que en veritat es crida un dels fills


    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers(state);
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(int state){
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}