package solutions.bstree2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase que implementa un Árbol Binario de Búsqueda (BSTree).
 * El árbol almacena elementos de tipo genérico T, que debe ser comparable.
 * Permite insertar elementos, buscar si un elemento está presente y recorrer el árbol.
 *
 * @param <T> Tipo de los elementos almacenados en el árbol, que debe implementar la interfaz Comparable.
 */
public class BSTree<T extends Comparable<T>> implements Iterable<T> {

    // Atributos del árbol
    T data;  // Dato almacenado en el nodo
    BSTree<T> left;  // Subárbol izquierdo
    BSTree<T> right;  // Subárbol derecho

    /**
     * Constructor por defecto. Crea un árbol vacío sin datos.
     */
    public BSTree() {
        this.left = null;
        this.right = null;
        this.data = null;
    }

    /**
     * Constructor que crea un árbol con un dato inicial.
     *
     * @param data El dato inicial para el nodo raíz del árbol.
     */
    public BSTree(T data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

    /**
     * Inserta un elemento en el árbol manteniendo la propiedad del árbol binario de búsqueda.
     * Los elementos menores o iguales al dato actual van al subárbol izquierdo,
     * y los elementos mayores van al subárbol derecho.
     *
     * @param elem El elemento a insertar.
     */
    public void insert(T elem) {
        if (data == null) {
            // Si el árbol está vacío, se coloca el primer dato
            data = elem;
        } else {
            // Si el árbol no está vacío, se compara el elemento con el dato actual
            if (elem.compareTo(data) <= 0) {
                if (left == null) {
                    // Si el subárbol izquierdo está vacío, se crea el nodo
                    left = new BSTree<T>(elem);
                } else {
                    // Si el subárbol izquierdo no está vacío, se inserta recursivamente
                    left.insert(elem);
                }
            } else {
                if (right == null) {
                    // Si el subárbol derecho está vacío, se crea el nodo
                    right = new BSTree<T>(elem);
                } else {
                    // Si el subárbol derecho no está vacío, se inserta recursivamente
                    right.insert(elem);
                }
            }
        }
    }

    /**
     * Comprueba si un elemento está presente en el árbol.
     *
     * @param elem El elemento a buscar.
     * @return true si el elemento está en el árbol, false en caso contrario.
     */
    public boolean contains(T elem) {
        if (data.equals(elem)) {
            return true;  // Si el dato actual es igual al elemento buscado, se devuelve true
        } else {
            // Si el dato es menor o igual al elemento, se busca en el subárbol izquierdo
            if (elem.compareTo(data) <= 0) {
                if (left != null) {
                    return left.contains(elem);  // Búsqueda recursiva en el subárbol izquierdo
                } else {
                    return false;  // Si no hay subárbol izquierdo, el elemento no está
                }
            } else {
                // Si el dato es mayor que el elemento, se busca en el subárbol derecho
                if (right != null) {
                    return right.contains(elem);  // Búsqueda recursiva en el subárbol derecho
                } else {
                    return false;  // Si no hay subárbol derecho, el elemento no está
                }
            }
        }
    }

    /**
     * Método para obtener un iterador que recorre el árbol en orden.
     *
     * @return Un iterador que permite recorrer el árbol en orden.
     */
    public Iterator<T> iterator() {
        LinkedList<T> lista = new LinkedList<T>();
        // Convierte el árbol a una lista en orden y devuelve su iterador
        BSTree.tree2list(this, lista);
        return lista.iterator();
    }

    /**
     * Convierte el árbol en una lista, recorriéndolo en preorden.
     *
     * @param arbol El árbol a convertir.
     * @param list  La lista donde se agregarán los elementos del árbol.
     */
    public static <T extends Comparable<T>> void tree2list(BSTree<T> arbol, List<T> list) {
        if (arbol.getData() != null) {
            // Si el nodo actual tiene datos, los añade a la lista
            list.add(arbol.getData());
            // Recursión para añadir los elementos del subárbol izquierdo
            if (arbol.getLeft() != null)
                BSTree.tree2list(arbol.getLeft(), list);
            // Recursión para añadir los elementos del subárbol derecho
            if (arbol.getRight() != null)
                BSTree.tree2list(arbol.getRight(), list);
        }
    }

    // Métodos getter y setter

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BSTree<T> getLeft() {
        return left;
    }

    public BSTree<T> getRight() {
        return right;
    }
}
