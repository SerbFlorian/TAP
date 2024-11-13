package adapter_y_composite;

// Hoja concreta: un rectángulo que implementa la interfaz Graphic
public class Rectangle implements Graphic {
    /**
     * Método para dibujar un rectángulo.
     * Esta implementación concreta de la interfaz Graphic imprime un mensaje
     * indicando que se está dibujando un rectángulo.
     */
    @Override
    public void draw() {
        System.out.println("Dibujando un Rectángulo");
    }
}
