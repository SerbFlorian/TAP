package adapter_y_composite;

// Interfaz para Componentes (hojas o composites) que pueden ser dibujados
public interface Graphic {
    /**
     * Método para dibujar el componente gráfico.
     * Este método debe ser implementado por las clases que representen
     * elementos gráficos, ya sean hojas (como Circle) o composites (como CompositeGraphic).
     */
    void draw();
}
