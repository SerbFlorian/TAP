package state;

/**
 * Estado de un paquete que indica que ha sido entregado en la oficina de correos, pero aún no ha sido recibido.
 * <p>
 * Este estado forma parte de una máquina de estados que gestiona el ciclo de vida de un paquete, en este caso cuando el paquete
 * ha sido entregado en la oficina de correos pero no ha sido recibido por el destinatario.
 */
public class DeliveredState implements PackageState {
    /**
     * Transición al siguiente estado.
     * <p>
     * Cuando el paquete está en el estado "Entregado", la siguiente transición será al estado "Recibido",
     * ya que se asume que el destinatario finalmente recibe el paquete.
     *
     * @param pkg el paquete cuyo estado se va a actualizar.
     */
    @Override
    public void next(Package pkg) {
        // Cambia el estado del paquete a "Recibido"
        pkg.setState(new ReceivedState());
    }

    /**
     * Transición al estado anterior.
     * <p>
     * Si el paquete estaba en el estado "Entregado", la transición previa será al estado "Ordenado",
     * lo que podría indicar que el paquete estaba en una fase anterior del proceso, como la de ser preparado para su envío.
     *
     * @param pkg el paquete cuyo estado se va a actualizar.
     */
    @Override
    public void prev(Package pkg) {
        // Cambia el estado del paquete a "Ordenado"
        pkg.setState(new OrderedState());
    }

    /**
     * Muestra el estado actual del paquete.
     * <p>
     * En este caso, imprime que el paquete ha sido entregado en la oficina de correos pero no ha sido recibido aún.
     */
    @Override
    public void printStatus() {
        System.out.println("Package delivered to post office, not received yet.");
    }

    /**
     * Devuelve una representación en forma de cadena del estado actual.
     *
     * @return una cadena que describe el estado "Entregado".
     */
    @Override
    public String toString() {
        return "DeliveredState{}";
    }
}
