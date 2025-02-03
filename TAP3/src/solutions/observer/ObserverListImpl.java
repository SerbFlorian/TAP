package solutions.observer;

import java.util.Iterator;
import java.util.Vector;

/**
 * Implementación concreta de la interfaz ObserverList.
 * <p>
 * Esta clase mantiene una lista de observadores y una lista de elementos. Los observadores
 * son notificados cuando se añaden o eliminan elementos de la lista.
 *
 * @param <T> El tipo de los elementos que la lista contiene.
 */
public class ObserverListImpl<T> implements ObserverList<T> {
    private Vector<Observer<T>> observers; // Lista de observadores registrados
    private Vector<T> content; // Lista de elementos contenidos en el ObserverList

    /**
     * Constructor que inicializa las listas de observadores y contenido.
     */
    public ObserverListImpl() {
        observers = new Vector<Observer<T>>();
        content = new Vector<T>();
    }

    /**
     * Registra un nuevo observador en la lista de observadores.
     * <p>
     * Si el observador ya está registrado, lanza una excepción {@link RepeatedObserverException}.
     *
     * @param observer El observador que se quiere registrar.
     * @throws RepeatedObserverException Si el observador ya está registrado.
     */
    public void register(Observer<T> observer) throws RepeatedObserverException {
        if (observers.contains(observer)) {
            throw new RepeatedObserverException("Observer '" + observer + "' already exists!");
        }
        observers.add(observer);
    }

    /**
     * Elimina un observador previamente registrado.
     *
     * @param observer El observador que se desea eliminar.
     */
    public void unregister(Observer<T> observer) {
        observers.remove(observer);
    }

    /**
     * Agrega un elemento a la lista de contenido y notifica a todos los observadores registrados.
     *
     * @param elem El elemento que se agrega a la lista.
     */
    public void add(T elem) {
        content.add(elem);
        notifyAllAdd(elem); // Notifica a los observadores que se ha añadido un nuevo elemento
    }

    /**
     * Elimina un elemento de la lista de contenido y notifica a todos los observadores registrados.
     *
     * @param elem El elemento que se elimina de la lista.
     */
    public void remove(T elem) {
        content.remove(elem);
        notifyAllRemove(elem); // Notifica a los observadores que se ha eliminado un elemento
    }

    /**
     * Notifica a todos los observadores registrados que se ha añadido un elemento.
     *
     * @param elem El elemento que se ha añadido.
     */
    protected void notifyAllAdd(T elem) {
        for (Observer<T> ob : observers) {
            ob.notifyAdd(elem); // Llama al método de notificación de adición de cada observador
        }
    }

    /**
     * Notifica a todos los observadores registrados que se ha eliminado un elemento.
     *
     * @param elem El elemento que se ha eliminado.
     */
    protected void notifyAllRemove(T elem) {
        for (Observer<T> ob : observers) {
            ob.notifyRemove(elem); // Llama al método de notificación de eliminación de cada observador
        }
    }

    /**
     * Devuelve un iterador para recorrer los elementos de la lista de contenido.
     *
     * @return Un iterador para la lista de elementos.
     */
    public Iterator<T> iterator() {
        return content.iterator(); // Devuelve el iterador de la lista de elementos
    }
}
