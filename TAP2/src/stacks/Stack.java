package stacks;

/**
 * Interfaz que define las operaciones básicas de una pila (stack).
 * La pila es una estructura de datos LIFO (Last In, First Out),
 * lo que significa que el último elemento agregado es el primero en ser eliminado.
 *
 * @param <T> Tipo de los elementos almacenados en la pila.
 */
interface Stack<T> extends Iterable<T> {

    /**
     * Introduce un elemento en la cima de la pila.
     *
     * @param elem Elemento a añadir en la cima de la pila.
     */
    void push(T elem);

    /**
     * Obtiene el elemento que hay en la cima de la pila y lo elimina.
     *
     * @return El elemento en la cima de la pila.
     * @throws IllegalStateException Si la pila está vacía.
     */
    T pop();

    /**
     * Verifica si la pila está llena. Esto significa que la pila ha alcanzado su capacidad máxima.
     *
     * @return true si la pila está llena, false en caso contrario.
     */
    boolean full();

    /**
     * Verifica si la pila está vacía, es decir, si no contiene elementos.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    boolean empty();
}
