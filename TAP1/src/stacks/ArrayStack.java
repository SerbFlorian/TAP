package stacks;

/**
 * Implementación de una pila (stack) utilizando un arreglo (array).
 * Esta clase implementa la interfaz {@link Stack} y proporciona métodos
 * para apilar (push), desapilar (pop), y verificar el estado de la pila.
 *
 * ArrayStack tiene un tamaño fijo y no puede redimensionarse.
 */

public class ArrayStack implements Stack {

    private int[] pile;  // Arreglo que almacena los elementos de la pila.
    private int top;     // Indica la posición del último elemento apilado.

    /**
     * Constructor que inicializa la pila con un tamaño específico.
     *
     * @param size Tamaño máximo de la pila.
     */
    public ArrayStack(int size) {
        pile = new int[size];  // Crea un arreglo de tamaño 'size' para almacenar los elementos.
        top = 0;  // Inicializa el índice de la parte superior de la pila en 0.
    }

    /**
     * Agrega un nuevo elemento a la pila. Si la pila está llena, no realiza ninguna acción.
     *
     * @param elem Elemento que se va a agregar a la pila.
     */
    @Override
    public void push(int elem) {
        // Si la pila no está llena, agrega el elemento y aumenta el índice de 'top'.
        if (!full()) {
            pile[top] = elem;
            top++;  // Incrementa 'top' para apuntar al siguiente espacio disponible.
        } else {
            // En un caso real, se podría lanzar una excepción si la pila está llena.
            System.out.println("Pila llena. No se puede agregar el elemento.");
        }
    }

    /**
     * Elimina y devuelve el último elemento agregado a la pila.
     *
     * @return El elemento que se acaba de desapilar.
     * @throws IllegalStateException Si la pila está vacía, se lanza una excepción.
     */
    @Override
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Pila vacía. No se puede desapilar.");
        }
        top--;  // Decrementa 'top' para referirse al elemento previo en la pila.
        return pile[top];  // Devuelve el elemento desapilado.
    }

    /**
     * Verifica si la pila está llena.
     *
     * @return true si la pila está llena, false en caso contrario.
     */
    @Override
    public boolean full() {
        return (top == pile.length);  // Si 'top' es igual al tamaño de la pila, está llena.
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    @Override
    public boolean empty() {
        return (top == 0);  // Si 'top' es 0, la pila está vacía.
    }
}
