package observer_y_composite;

public class Main {
    public static void main(String[] args) {
        // Crear algunos gráficos
        Graphic circle = new Circle();
        Graphic rectangle = new Rectangle();

        // Crear un composite y agregar los gráficos
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle);
        composite.add(rectangle);

        // Crear observadores
        Observer observer1 = new GraphicObserver("Observer 1");
        Observer observer2 = new GraphicObserver("Observer 2");

        // Agregar observadores a la composite (y, por ende, a los gráficos dentro de ella)
        composite.addObserver(observer1);
        composite.addObserver(observer2);

        // Dibujar gráficos, lo que notificará a los observadores
        circle.draw();
        rectangle.draw();
        composite.draw();
    }
}
