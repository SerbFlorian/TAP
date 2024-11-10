package solutions.observer;

/**
 * Observador concreto que imprime mensajes cuando un elemento es añadido o eliminado de la lista.
 * <p>
 * Esta clase implementa la interfaz {@link Observer} y notifica a los observadores mediante
 * la impresión de un mensaje en consola cada vez que un elemento es agregado o eliminado
 * de la lista.
 *
 * @param <T> El tipo de los elementos que el observador maneja.
 */
public class PrinterObserver<T> implements Observer<T> {
    /**
     * Notifica que un elemento ha sido añadido a la lista.
     * <p>
     * Este método imprime un mensaje indicando que el elemento ha sido añadido.
     *
     * @param elem El elemento que ha sido añadido.
     */
    public void notifyAdd(T elem) {
        System.out.println("ADDED: " + elem); // Imprime el elemento añadido
    }

    /**
     * Notifica que un elemento ha sido eliminado de la lista.
     * <p>
     * Este método imprime un mensaje indicando que el elemento ha sido eliminado.
     *
     * @param elem El elemento que ha sido eliminado.
     */
    public void notifyRemove(T elem) {
        System.out.println("REMOVED: " + elem); // Imprime el elemento eliminado
    }

    /**
     * Compara este observador con otro objeto para determinar si son iguales.
     * <p>
     * La comparación se realiza verificando si las clases de los dos objetos son iguales.
     *
     * @param obj El objeto con el que se quiere comparar.
     * @return true si las clases del objeto y este observador son iguales, false en caso contrario.
     */
    public boolean equals(Object obj) {
        return this.getClass().getCanonicalName().equals(obj.getClass().getCanonicalName()); // Compara las clases
    }

    /**
     * Devuelve una representación en cadena del observador.
     * <p>
     * Este método devuelve el nombre completo de la clase del observador como una cadena.
     *
     * @return El nombre completo de la clase.
     */
    public String toString() {
        return this.getClass().getName(); // Devuelve el nombre de la clase
    }
}
