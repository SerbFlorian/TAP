package solutions.observer;

/**
 * Interfaz Observer para el patrón de diseño Observer.
 * <p>
 * El patrón de diseño Observer permite que un objeto (el sujeto) notifique a otros objetos (los observadores)
 * cuando su estado cambia. Los observadores se registran en el sujeto y reciben notificaciones
 * cuando ocurren ciertos eventos (por ejemplo, cuando se añade o elimina un elemento).
 *
 * @param <T> El tipo del elemento que está siendo observado.
 */
interface Observer<T> {
    /**
     * Método que es llamado cuando un nuevo elemento es añadido.
     * <p>
     * Este método se invoca cuando el sujeto notifica que se ha añadido un nuevo elemento.
     * Los observadores deben implementar este método para reaccionar ante este evento.
     *
     * @param elem El elemento que ha sido añadido.
     */
    void notifyAdd(T elem);

    /**
     * Método que es llamado cuando un elemento es eliminado.
     * <p>
     * Este método se invoca cuando el sujeto notifica que se ha eliminado un elemento.
     * Los observadores deben implementar este método para reaccionar ante este evento.
     *
     * @param elem El elemento que ha sido eliminado.
     */
    void notifyRemove(T elem);
}
