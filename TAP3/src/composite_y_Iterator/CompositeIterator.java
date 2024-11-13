package composite_y_Iterator;

import java.util.Iterator;
import java.util.Stack;

/**
 * Iterador compuesto que permite recorrer una estructura jerárquica de componentes.
 * Utiliza una pila para gestionar la iteración sobre composites anidados de manera
 * eficiente. Este iterador permite recorrer tanto hojas como composites (por ejemplo, carpetas).
 */
class CompositeIterator implements Iterator<Component> {
    // Pila para gestionar iteradores de los diferentes niveles de la jerarquía.
    private final Stack<Iterator<Component>> stack = new Stack<>();

    /**
     * Constructor de CompositeIterator.
     * Inicializa el iterador con un iterador inicial (por ejemplo, el de la raíz del composite).
     *
     * @param iterator El iterador inicial para empezar la iteración.
     */
    public CompositeIterator(Iterator<Component> iterator) {
        stack.push(iterator); // Empuja el iterador inicial en la pila.
    }

    /**
     * Comprueba si hay más elementos para iterar.
     * Revisa la pila y, si el iterador actual ha terminado, pasa al siguiente.
     *
     * @return true si hay más elementos para iterar, false si no.
     */
    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false; // Si la pila está vacía, no hay más elementos.
        }
        Iterator<Component> iterator = stack.peek(); // Obtiene el iterador actual.
        if (!iterator.hasNext()) {
            stack.pop(); // Si el iterador ha terminado, se elimina de la pila.
            return hasNext(); // Llama recursivamente para verificar el siguiente iterador en la pila.
        }
        return true; // Si hay un siguiente elemento, devuelve true.
    }

    /**
     * Obtiene el siguiente componente en la iteración.
     * Si el componente es un composite (como una carpeta), se añade su iterador a la pila.
     *
     * @return El siguiente componente, o null si no hay más elementos.
     */
    @Override
    public Component next() {
        if (hasNext()) {
            Iterator<Component> iterator = stack.peek(); // Obtiene el iterador actual.
            Component component = iterator.next(); // Avanza al siguiente componente.
            // Si el componente es un composite (por ejemplo, una carpeta), se agrega su iterador a la pila.
            if (component instanceof Folder) {
                stack.push(component.createIterator()); // Crea y empuja el iterador del composite.
            }
            return component; // Devuelve el componente actual.
        }
        return null; // Si no hay siguiente, devuelve null.
    }
}
