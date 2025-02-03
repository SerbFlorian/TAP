package visitor2;

/**
 * Esta clase representa una computadora que consta de varios componentes, como un ratón, teclado y monitor.
 * Implementa la interfaz `ComputerPart` y permite que un visitante interactúe con todos sus componentes.
 * <p>
 * CONTRACTE -> ComputerPart
 * ASSIGNACIO POLIMORFICA -> La clase `Computer` es tratada como un `ComputerPart` porque implementa la interfaz `ComputerPart`.
 * DYNAMIC BINDING -> El método `accept()` permite que el visitante se "acepte" de forma polimórfica, dependiendo del tipo concreto.
 */
public class Computer implements ComputerPart {
    // Array que almacena los diferentes componentes de la computadora
    ComputerPart[] parts;

    /**
     * Constructor que inicializa los componentes de la computadora.
     * Crea un ratón, teclado y monitor como partes de la computadora.
     */
    public Computer() {
        parts = new ComputerPart[]{new Mouse(), new Keyboard(), new Monitor()};
    }

    /**
     * Este método permite que un visitante interactúe con la computadora y sus componentes.
     * El visitante interactúa con cada parte de la computadora (ratón, teclado, monitor)
     * llamando al método `accept()` en cada una de ellas.
     *
     * @param computerPartVisitor El visitante que realizará alguna operación sobre la computadora y sus componentes.
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        // Se recorre cada componente de la computadora y se le permite al visitante interactuar con él
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor); // El visitante visita cada parte (mouse, teclado, monitor)
        }

        // Finalmente, el visitante realiza una operación sobre la computadora como un todo
        computerPartVisitor.visit(this); // Aquí el visitante interactúa con la propia computadora
    }
}
