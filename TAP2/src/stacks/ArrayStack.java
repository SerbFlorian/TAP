package stacks;

import java.util.Iterator;

/**
 * Implementación de una pila usando un arreglo.
 * La pila sigue el principio LIFO (Last In, First Out),
 * donde el último elemento insertado es el primero en ser eliminado.
 *
 * @param <T> Tipo de los elementos almacenados en la pila.
 */
public class ArrayStack<T> implements Stack<T>, Iterator<T> {
    private T[] monton;  // Arreglo que almacena los elementos de la pila.
    private int cima;    // Índice de la cima de la pila (donde se encuentra el siguiente elemento a insertar o eliminar).

    int cnt = 0;  // Contador utilizado para el iterador.

    /**
     * Constructor de la pila.
     *
     * @param lista Arreglo que se usa como almacenamiento interno de la pila.
     *              La capacidad de la pila está determinada por el tamaño de este arreglo.
     */
    public ArrayStack(T[] lista) {
        monton = lista;
        cima = 0;
    }

    /**
     * Introduce un elemento en la cima de la pila.
     *
     * @param elem Elemento a añadir en la cima de la pila.
     */
    public void push(T elem) {
        // Inserta el elemento en la cima y luego incrementa la cima.
        monton[cima] = elem;
        cima++;
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
        cima--;  // Decrementa la cima.
        return monton[cima];  // Devuelve el elemento de la cima.
    }

    /**
     * Verifica si la pila está llena, es decir, si ha alcanzado su capacidad máxima.
     *
     * @return true si la pila está llena, false en caso contrario.
     */
    public boolean full() {
        return (cima == monton.length);  // La pila está llena si la cima alcanzó el tamaño del arreglo.
    }

    /**
     * Verifica si la pila está vacía, es decir, si no tiene elementos.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean empty() {
        return (cima == 0);  // La pila está vacía si la cima es 0.
    }

    /**
     * Devuelve un iterador para recorrer los elementos de la pila.
     *
     * @return Un iterador sobre los elementos de la pila.
     */
    public Iterator<T> iterator() {
        return this;  // Este objeto también actúa como iterador.
    }

    /**
     * Verifica si hay más elementos en la pila para iterar.
     *
     * @return true si hay más elementos para iterar, false en caso contrario.
     */
    public boolean hasNext() {
        return (cnt < cima);  // Hay más elementos si el contador es menor que la cima.
    }

    /**
     * Devuelve el siguiente elemento de la pila durante la iteración.
     *
     * @return El siguiente elemento de la pila.
     */
    public T next() {
        System.out.println("avanza");
        cnt = cnt + 1;  // Aumenta el contador para avanzar al siguiente elemento.
        return monton[cnt - 1];  // Devuelve el elemento correspondiente al índice actual del contador.
    }

    /**
     * Método no implementado en esta clase.
     * Este método sería utilizado para eliminar elementos durante la iteración,
     * pero no se soporta en esta implementación.
     */
    public void remove() {
        // No se implementa en esta clase.
    }
}
