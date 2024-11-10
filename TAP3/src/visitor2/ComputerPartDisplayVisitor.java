package visitor2;

/**
 * Esta clase es una implementación concreta del visitante (patrón Visitor).
 * Se encarga de realizar la operación de "mostrar" (display) en cada componente de la computadora.
 *
 * Este visitante implementa el método `visit()` para cada tipo de parte de la computadora (Computer, Mouse, Keyboard, Monitor),
 * y realiza una acción específica para cada tipo.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    /**
     * Este método se llama cuando se visita un objeto `Computer`.
     * Imprime un mensaje indicando que se está mostrando una computadora.
     *
     * @param computer La computadora que se está visitando.
     */
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    /**
     * Este método se llama cuando se visita un objeto `Mouse`.
     * Imprime un mensaje indicando que se está mostrando un ratón.
     *
     * @param mouse El ratón que se está visitando.
     */
    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    /**
     * Este método se llama cuando se visita un objeto `Keyboard`.
     * Imprime un mensaje indicando que se está mostrando un teclado.
     *
     * @param keyboard El teclado que se está visitando.
     */
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    /**
     * Este método se llama cuando se visita un objeto `Monitor`.
     * Imprime un mensaje indicando que se está mostrando un monitor.
     *
     * @param monitor El monitor que se está visitando.
     */
    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
