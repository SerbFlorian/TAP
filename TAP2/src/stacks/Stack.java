package stacks;

interface Stack<T> extends Iterable<T> {

    /**
     * Introduce un elemento en la cima
     *
     * @param elem Elemento a a�adir en la cima de la pila.
     */
    void push(T elem);

    /**
     * Obtiene el elemento que hay en la cima y lo elimina de la pila.
     *
     * @return elemento en la cima de la pila
     */
    T pop();

    /**
     * Dice si la pila est� llena. La cima ha alcanzado el tama�o de la pila.
     *
     * @return booleano indicando si la pila est� llena
     */
    boolean full();

    /**
     * Dice si la pila est� vac�a.
     *
     * @return booleano indicando si la pila est� vac�a
     */
    boolean empty();

}
