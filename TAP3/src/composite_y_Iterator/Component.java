package composite_y_Iterator;

import java.util.Iterator;

// Interfaz para los componentes que pueden ser utilizados en un patrón Composite
// y que pueden ser recorridos usando un iterador.
interface Component {
    /**
     * Obtiene el nombre del componente.
     * Este método debe ser implementado por las clases que representen
     * componentes, ya sean hojas o composites, para devolver su nombre.
     *
     * @return El nombre del componente.
     */
    String getName();

    /**
     * Imprime la información del componente.
     * Este método debe ser implementado por las clases que representen
     * componentes para mostrar detalles del componente (por ejemplo, su nombre).
     */
    void print();

    /**
     * Crea un iterador para recorrer los componentes.
     * Este método debe ser implementado por las clases que representen
     * composites para devolver un iterador que permita recorrer los hijos del composite.
     *
     * @return Un iterador para recorrer los componentes dentro del composite.
     */
    Iterator<Component> createIterator();
}
