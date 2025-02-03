package adapter_y_composite;

// Hoja concreta: un círculo que implementa la interfaz Graphic
public class Circle implements Graphic {
    /**
     * Método para dibujar un círculo.
     * Esta implementación concreta de la interfaz Graphic imprime un mensaje
     * indicando que se está dibujando un círculo.
     */
    @Override
    public void draw() {
        System.out.println("Dibujando un Círculo");
    }
}
