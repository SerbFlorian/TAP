package solutions.observer;

import java.util.Vector;

/**
 * Observador que mantiene una copia de seguridad de los elementos añadidos y eliminados.
 * <p>
 * Esta clase implementa el patrón de diseño "Observer", y se encarga de almacenar los elementos
 * que se añaden o eliminan en una lista interna (backup) para su posterior recuperación o manipulación.
 *
 * @param <T> Tipo de los elementos que el observador gestionará.
 */
public class BackupObserver<T> implements Observer<T> {
    // Vector que actúa como copia de seguridad de los elementos.
    private Vector<T> backup;

    /**
     * Constructor que inicializa el vector de copia de seguridad.
     */
    public BackupObserver() {
        backup = new Vector<T>();
    }

    /**
     * Notificación cuando se agrega un elemento a la lista observada.
     * <p>
     * Este método agrega el elemento al vector de copia de seguridad.
     *
     * @param elem El elemento que se ha añadido.
     */
    public void notifyAdd(T elem) {
        backup.add(elem); // Añade el elemento al backup.
    }

    /**
     * Notificación cuando se elimina un elemento de la lista observada.
     * <p>
     * Este método elimina el elemento del vector de copia de seguridad.
     *
     * @param elem El elemento que se ha eliminado.
     */
    public void notifyRemove(T elem) {
        backup.remove(elem); // Elimina el elemento del backup.
    }

    /**
     * Compara este observador con otro objeto para verificar si son iguales.
     * <p>
     * La comparación se realiza basándose en el nombre de la clase de ambos objetos.
     *
     * @param obj El objeto con el que se va a comparar.
     * @return true si ambos objetos son de la misma clase, false en caso contrario.
     */
    public boolean equals(Object obj) {
        return this.getClass().getCanonicalName().equals(obj.getClass().getCanonicalName());
    }

    /**
     * Devuelve una representación en forma de cadena del observador.
     * <p>
     * El método retorna el nombre completo de la clase del observador.
     *
     * @return El nombre completo de la clase del observador.
     */
    public String toString() {
        return this.getClass().getName();
    }
}
