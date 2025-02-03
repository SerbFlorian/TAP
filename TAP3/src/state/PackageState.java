package state;

/**
 * Interfaz que define los métodos necesarios para gestionar los diferentes estados de un paquete.
 * <p>
 * Esta interfaz es utilizada por la clase `Package` para delegar las acciones de cambio de estado y la impresión
 * del estado actual en los objetos que implementan esta interfaz. Cada estado (por ejemplo, "Ordenado", "Entregado")
 * tendrá una implementación concreta de estos métodos.
 */
public interface PackageState {
    /**
     * Cambia el estado del paquete al siguiente estado en el ciclo de vida.
     *
     * @param pkg el paquete cuyo estado se quiere cambiar al siguiente estado.
     */
    void next(Package pkg);

    /**
     * Cambia el estado del paquete al estado anterior en el ciclo de vida.
     *
     * @param pkg el paquete cuyo estado se quiere cambiar al estado anterior.
     */
    void prev(Package pkg);

    /**
     * Imprime el estado actual del paquete.
     * <p>
     * Este método imprime información relevante acerca del estado del paquete, por ejemplo,
     * si ha sido ordenado, entregado, recibido, etc.
     */
    void printStatus();
}
