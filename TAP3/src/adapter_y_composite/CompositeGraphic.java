package adapter_y_composite;

import java.util.ArrayList;
import java.util.List;

// Composite: un contenedor de gráficos que implementa la interfaz Graphic
public class CompositeGraphic implements Graphic {
    // Lista que almacena los componentes gráficos (hojas o composites)
    private List<Graphic> graphics = new ArrayList<>();

    /**
     * Método para agregar un componente gráfico (puede ser una hoja o un composite).
     * @param graphic El componente gráfico a agregar.
     */
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    /**
     * Método para eliminar un componente gráfico (puede ser una hoja o un composite).
     * @param graphic El componente gráfico a eliminar.
     */
    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    /**
     * Método para dibujar todos los componentes gráficos.
     * Si el componente es un composite, recorrerá y dibujará sus elementos internos.
     */
    @Override
    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw(); // Llamada recursiva para dibujar el gráfico
        }
    }
}
