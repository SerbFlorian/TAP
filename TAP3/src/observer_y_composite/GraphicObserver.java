package observer_y_composite;

// Observador concreto que reacciona a los cambios
public class GraphicObserver implements Observer {
    private String name;

    public GraphicObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Graphic graphic) {
        System.out.println(name + " notified about change in: " + graphic.getClass().getSimpleName());
    }
}