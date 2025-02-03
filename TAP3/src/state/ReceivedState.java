package state;

/**
 * Estado que representa el momento en que el paquete ha sido recibido por el cliente.
 * <p>
 * Esta clase implementa la interfaz `PackageState` y define las acciones específicas cuando el paquete
 * está en el estado "Recibido". El paquete no puede avanzar más allá de este estado, pero sí puede retroceder
 * al estado "Entregado".
 */
public class ReceivedState implements PackageState {
    /**
     * Cambia al siguiente estado del paquete. En este caso, el paquete ya ha sido recibido por el cliente,
     * por lo que no se puede cambiar a otro estado.
     *
     * @param pkg el paquete cuyo estado se quiere cambiar.
     */
    @Override
    public void next(Package pkg) {
        System.out.println("Este paquete ya ha sido recibido por un cliente.");
    }

    /**
     * Cambia el estado del paquete al estado "Entregado", es decir, retrocede al estado anterior.
     *
     * @param pkg el paquete cuyo estado se quiere cambiar al anterior.
     */
    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    /**
     * Imprime el estado actual del paquete, que en este caso indica que el paquete ha sido recibido por el cliente.
     */
    @Override
    public void printStatus() {
        System.out.println("El paquete ha sido recibido por el cliente.");
    }

    /**
     * Devuelve una representación en cadena del estado actual.
     *
     * @return el nombre de la clase que representa el estado actual.
     */
    @Override
    public String toString() {
        return "ReceivedState{}";
    }
}
