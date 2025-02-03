package adapter_y_composite;

// Componente antiguo con una interfaz diferente (no implementa la interfaz Graphic)
public class OldRectangle {
    /**
     * Método que renderiza un rectángulo utilizando la interfaz antigua.
     * Este método es parte de una clase que no implementa la interfaz Graphic,
     * pero realiza una operación similar al método draw() en la interfaz Graphic.
     */
    public void render() {
        System.out.println("Renderizando un Rectángulo heredado");
    }
}
