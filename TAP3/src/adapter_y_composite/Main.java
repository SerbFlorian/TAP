package adapter_y_composite;

/**
 * Patrón Composite: Este patrón permite tratar de manera uniforme a los objetos compuestos
 * (que contienen otros objetos) y a los objetos simples (hojas). Esto proporciona una estructura jerárquica
 * que facilita la manipulación de elementos gráficos de manera consistente, sin importar si son componentes
 * individuales o agrupaciones de ellos.
 * <p>
 * Patrón Adapter: El patrón Adapter permite que una clase con una interfaz diferente (en este caso, OldRectangle)
 * se pueda usar dentro de una estructura que espera una interfaz común (Graphic). Esto es útil cuando se desea
 * reutilizar código existente o integrar componentes heredados sin modificar su estructura original.
 */
public class Main {
    public static void main(String[] args) {
        // Crear algunas hojas (componentes individuales) que implementan la interfaz Graphic
        Graphic circle = new Circle();
        Graphic rectangle = new Rectangle();

        // Crear un componente viejo (OldRectangle) que necesitamos adaptar
        OldRectangle oldRectangle = new OldRectangle();
        Graphic adaptedOldRectangle = new OldRectangleAdapter(oldRectangle);

        // Crear un composite (componente contenedor) que puede contener tanto hojas como otros composites
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle);                  // Agregar un círculo al composite
        composite.add(rectangle);               // Agregar un rectángulo al composite
        composite.add(adaptedOldRectangle);     // Agregar el rectángulo antiguo adaptado al composite

        // Dibujar todos los gráficos (hojas y composites) en el composite
        System.out.println("Dibujando el gráfico compuesto:");
        composite.draw();
    }
}
