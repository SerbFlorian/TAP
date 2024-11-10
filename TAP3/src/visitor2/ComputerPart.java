package visitor2;

/**
 * Esta interfaz representa una parte de la computadora.
 * Cualquier componente de la computadora (como un ratón, teclado, monitor) debe implementar esta interfaz
 * para permitir la interacción con visitantes a través del patrón Visitor.
 *
 * El propósito de esta interfaz es definir el método `accept()` que será utilizado por el visitante para
 * interactuar con los componentes concretos de la computadora.
 */
public interface ComputerPart {
    /**
     * Este método permite que un visitante interactúe con un componente de la computadora.
     *
     * @param computerPartVisitor El visitante que realizará una operación sobre el componente de la computadora.
     */
    public void accept(ComputerPartVisitor computerPartVisitor);
}
