package stacks;

import java.util.Iterator;
import java.util.Vector;

/**
 * Implementación de una pila utilizando un Vector como estructura interna de almacenamiento.
 * La pila sigue el principio LIFO (Last In, First Out), donde el último elemento insertado
 * es el primero en ser eliminado.
 *
 * @param <T> Tipo de los elementos almacenados en la pila.
 */
public class VectorStack<T> implements Stack<T> {
    private Vector<T> monton;  // Vector utilizado para almacenar los elementos de la pila.
    private int max;           // Capacidad máxima de la pila.
    private int cnt;           // Número actual de elementos en la pila.

    /**
     * Constructor de la pila con capacidad máxima definida.
     *
     * @param max Capacidad máxima de la pila.
     */
    public VectorStack(int max) {
        this.monton = new Vector<T>();
        this.max = max;  // Establece el tamaño máximo de la pila.
        this.cnt = 0;    // Inicializa el contador de elementos en 0.
    }

    /**
     * Introduce un elemento en la cima de la pila.
     *
     * @param elem Elemento a añadir en la cima de la pila.
     * @throws IllegalStateException Si la pila está llena.
     */
    public void push(T elem) {
        // Verifica si la pila está llena antes de insertar el elemento.
        if (full()) {
            throw new IllegalStateException("La pila está llena");
        }
        monton.add(elem);  // Añade el elemento al final del vector (cima de la pila).
        cnt++;  // Incrementa el contador de elementos.
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return El elemento en la cima de la pila.
     * @throws IllegalStateException Si la pila está vacía.
     */
    public T pop() {
        if (empty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        T elem = monton.lastElement();  // Obtiene el último elemento del vector (cima de la pila).
        monton.remove(elem);  // Elimina el elemento de la cima.
        cnt--;  // Decrementa el contador de elementos.
        return elem;  // Devuelve el elemento eliminado.
    }

    /**
     * Verifica si la pila está llena.
     *
     * @return true si la pila está llena, false en caso contrario.
     */
    public boolean full() {
        return (max == cnt);  // La pila está llena si el número de elementos es igual a la capacidad máxima.
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean empty() {
        return (cnt == 0);  // La pila está vacía si el contador de elementos es 0.
    }

    /**
     * Devuelve un iterador para recorrer los elementos de la pila.
     *
     * @return Un iterador sobre los elementos de la pila.
     */
    public Iterator<T> iterator() {
        return monton.iterator();  // Devuelve el iterador del vector.
    }
}
