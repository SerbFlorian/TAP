package stacks;

import java.util.Vector;

/**
 * Implementación de una pila (stack) utilizando la clase Vector de Java.
 * Esta clase permite apilar (push), desapilar (pop) y verificar el estado de la pila.
 * <p>
 * VectorStack permite redimensionar automáticamente el tamaño del Vector si se excede
 */
public class VectorStack implements Stack {
    private Vector<Integer> pile;  // Vector que almacena los elementos de la pila
    private int size;  // Tamaño máximo de la pila
    private int cnt;   // Contador que lleva la cuenta de los elementos apilados

    /**
     * Constructor de la pila que define el tamaño máximo de la pila.
     *
     * @param size El tamaño máximo de la pila.
     */
    public VectorStack(int size) {
        this.pile = new Vector<Integer>(size);  // Inicializa el Vector con el tamaño especificado
        this.size = size;  // Asigna el tamaño máximo a la variable size
        this.cnt = 0;      // Inicializa el contador de elementos en 0
    }

    /**
     * Introduce un elemento en la parte superior de la pila.
     *
     * @param elem El elemento que se va a agregar a la pila.
     */
    @Override
    public void push(int elem) {
        pile.add(elem);  // Añade el elemento al final del Vector
        cnt++;  // Incrementa el contador de elementos
    }

    /**
     * Obtiene y elimina el elemento que se encuentra en la parte superior de la pila.
     *
     * @return El elemento que estaba en la parte superior de la pila antes de ser eliminado.
     * @throws IllegalStateException Si la pila está vacía y se intenta desapilar.
     */
    @Override
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Pila vacía. No se puede desapilar.");
        }
        int elem = pile.lastElement();  // Obtiene el último elemento del Vector (parte superior de la pila)
        pile.remove(elem);  // Elimina el último elemento del Vector
        cnt--;  // Decrementa el contador de elementos
        return elem;  // Retorna el elemento desapilado
    }

    /**
     * Verifica si la pila está llena.
     *
     * @return true si la pila está llena, false en caso contrario.
     */
    @Override
    public boolean full() {
        return (size == cnt);  // La pila está llena si el contador de elementos es igual al tamaño máximo
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    @Override
    public boolean empty() {
        return (cnt == 0);  // La pila está vacía si el contador de elementos es 0
    }
}
