package solutions.observer;

/**
 * Interfaz ObserverList para el patrón de diseño Observer.
 * <p>
 * La interfaz ObserverList define una lista de observadores que pueden ser registrados y notificados
 * de los cambios en la lista de elementos. Esta interfaz permite agregar y eliminar elementos
 * de la lista y también gestionar los observadores que reaccionan ante estos cambios.
 *
 * @param <T> El tipo de elemento que está siendo gestionado en la lista.
 */
interface ObserverList<T> extends Iterable<T> {
    /**
     * Registra un observador en la lista de observadores.
     * <p>
     * Este método permite añadir un nuevo observador que será notificado cuando se agreguen
     * o eliminen elementos en la lista. Si el observador ya está registrado, se lanzará una excepción.
     *
     * @param observer El observador que será registrado.
     * @throws RepeatedObserverException Si el observador ya está registrado en la lista.
     */
    void register(Observer<T> observer) throws RepeatedObserverException;

    /**
     * Elimina un observador de la lista de observadores.
     * <p>
     * Este método permite eliminar un observador previamente registrado en la lista,
     * de modo que ya no será notificado de los cambios en la lista de elementos.
     *
     * @param observer El observador que será eliminado.
     */
    void unregister(Observer<T> observer);

    /**
     * Agrega un elemento a la lista de elementos y notifica a los observadores.
     * <p>
     * Este método agrega un nuevo elemento a la lista y notifica a los observadores registrados
     * que un nuevo elemento ha sido añadido. Los observadores pueden reaccionar en consecuencia.
     *
     * @param elem El elemento que será agregado a la lista.
     */
    void add(T elem);

    /**
     * Elimina un elemento de la lista y notifica a los observadores.
     * <p>
     * Este método elimina un elemento de la lista y notifica a los observadores registrados
     * que el elemento ha sido eliminado. Los observadores pueden reaccionar en consecuencia.
     *
     * @param elem El elemento que será eliminado de la lista.
     */
    void remove(T elem);
}
