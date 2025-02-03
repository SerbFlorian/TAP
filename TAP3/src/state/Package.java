package state;

/**
 * Clase que representa un paquete en su ciclo de vida, con diferentes estados que gestionan las transiciones entre fases.
 * <p>
 * El paquete pasa por diferentes estados (como "Ordenado", "Entregado", "Recibido", etc.) y puede cambiar de estado
 * mediante las acciones definidas por el patrón de diseño **State**. El objeto `Package` delega la responsabilidad de
 * gestionar el estado en los objetos de tipo `PackageState`.
 */
public class Package {
    // Estado inicial del paquete: "Ordenado"
    private PackageState state = new OrderedState();

    /**
     * Obtiene el estado actual del paquete.
     *
     * @return el estado actual del paquete.
     */
    public PackageState getState() {
        return state;
    }

    /**
     * Establece el estado del paquete.
     *
     * @param state el nuevo estado que se desea asignar al paquete.
     */
    public void setState(PackageState state) {
        this.state = state;
    }

    /**
     * Realiza la transición al estado anterior.
     * <p>
     * Este método delega en el objeto `state` actual la acción de retroceder al estado anterior.
     */
    public void previousState() {
        state.prev(this);
    }

    /**
     * Realiza la transición al siguiente estado.
     * <p>
     * Este método delega en el objeto `state` actual la acción de avanzar al siguiente estado.
     */
    public void nextState() {
        state.next(this);
    }

    /**
     * Imprime el estado actual del paquete.
     * <p>
     * Este método delega en el objeto `state` actual la responsabilidad de imprimir el estado del paquete.
     */
    public void printStatus() {
        state.printStatus();
    }
}
