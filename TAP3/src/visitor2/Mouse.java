package visitor2;

/**
 * La clase `Mouse` representa una parte de la computadora, en este caso, el ratón.
 * Implementa la interfaz `ComputerPart`, lo que le permite ser visitada por un objeto
 * que implemente `ComputerPartVisitor` y realizar operaciones sobre ella.
 */
public class Mouse implements ComputerPart {
    /**
     * Este método es utilizado para aceptar un visitante y permitir que realice una operación
     * sobre el objeto `Mouse`.
     *
     * El comportamiento de lo que sucede cuando se visita este objeto depende de la implementación
     * del método `visit` del visitante.
     *
     * @param computerPartVisitor El visitante que realizará la operación sobre el `Mouse`.
     */
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);  // El visitante realiza una acción sobre este ratón.
    }
}
