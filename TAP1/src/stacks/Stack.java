package stacks;

/**
 * Interfaz que define las operaciones básicas de una pila (stack).
 * Esta interfaz incluye métodos para apilar (push), desapilar (pop),
 * y verificar el estado de la pila.
 */
interface Stack {

    /**
     * Introduce un elemento en la parte superior de la pila.
     *
     * @param elem El elemento que se va a agregar a la pila.
     */
    void push(int elem);

    /**
     * Obtiene y elimina el elemento que se encuentra en la parte superior de la pila.
     *
     * @return El elemento que estaba en la parte superior de la pila antes de ser eliminado.
     * @throws IllegalStateException Si la pila está vacía y se intenta desapilar.
     */
    int pop();

    /**
     * Verifica si la pila está llena.
     *
     * @return true si la pila está llena, false en caso contrario.
     */
    boolean full();

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    boolean empty();
}
