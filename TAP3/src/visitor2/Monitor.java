package visitor2;

/**
 * La clase `Monitor` representa una parte de la computadora, en este caso, el monitor.
 * Implementa la interfaz `ComputerPart`, lo que le permite ser visitada por un objeto
 * que implemente `ComputerPartVisitor` y realizar operaciones sobre ella.
 */
public class Monitor implements ComputerPart {
    /**
     * Este método es utilizado para aceptar un visitante y permitir que realice una operación
     * sobre el objeto `Monitor`.
     * <p>
     * El comportamiento de lo que sucede cuando se visita este objeto depende de la implementación
     * del método `visit` del visitante.
     *
     * @param computerPartVisitor El visitante que realizará la operación sobre el `Monitor`.
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);  // El visitante realiza una acción sobre este monitor.
    }
}
