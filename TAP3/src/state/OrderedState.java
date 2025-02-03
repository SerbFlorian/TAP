package state;

/**
 * Estado de un paquete que indica que ha sido ordenado, pero aún no ha sido entregado en la oficina de correos.
 * <p>
 * Este estado forma parte de una máquina de estados que gestiona el ciclo de vida de un paquete, en este caso, el paquete está
 * en la fase inicial de su proceso, es decir, cuando el paquete ha sido ordenado pero no ha sido entregado a la oficina de correos.
 */
public class OrderedState implements PackageState {
    /**
     * Transición al siguiente estado.
     * <p>
     * Cuando el paquete está en el estado "Ordenado", la siguiente transición será al estado "Entregado",
     * lo que indica que el paquete se ha entregado en la oficina de correos para su posterior distribución.
     *
     * @param pkg el paquete cuyo estado se va a actualizar.
     */
    @Override
    public void next(Package pkg) {
        // Cambia el estado del paquete a "Entregado"
        pkg.setState(new DeliveredState());
    }

    /**
     * Transición al estado anterior.
     * <p>
     * Si el paquete está en el estado "Ordenado", no hay un estado previo, ya que este es el estado raíz del ciclo de vida del paquete.
     *
     * @param pkg el paquete cuyo estado se va a actualizar.
     */
    @Override
    public void prev(Package pkg) {
        // No se puede ir a un estado anterior desde "Ordenado"
        System.out.println("The package is in it's root state.");
    }

    /**
     * Muestra el estado actual del paquete.
     * <p>
     * En este caso, imprime que el paquete ha sido ordenado pero aún no ha sido entregado en la oficina de correos.
     */
    @Override
    public void printStatus() {
        System.out.println("Package ordered, not delivered to the office yet.");
    }

    /**
     * Devuelve una representación en forma de cadena del estado actual.
     *
     * @return una cadena que describe el estado "Ordenado".
     */
    @Override
    public String toString() {
        return "OrderedState{}";
    }
}
