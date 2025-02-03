package solutions.bstree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Clase `BSTree` que representa un Árbol Binario de Búsqueda (Binary Search Tree).
 * Almacena elementos genéricos y utiliza un `Comparator` para ordenar los elementos.
 * Implementa la interfaz `Iterable` para permitir iteraciones sobre los elementos.
 *
 * @param <T> el tipo de los elementos almacenados en el árbol
 */
public class BSTree<T> implements Iterable<T> {
    private T data; // Dato almacenado en el nodo actual
    private BSTree<T> left; // Hijo izquierdo del nodo
    private BSTree<T> right; // Hijo derecho del nodo
    private Comparator<T> comp; // Comparador para ordenar los elementos

    /**
     * Constructor de un árbol binario vacío con un comparador.
     *
     * @param comp el comparador utilizado para ordenar los elementos del árbol
     */
    public BSTree(Comparator<T> comp) {
        this.comp = comp;
        this.left = null;
        this.right = null;
        this.data = null;
    }

    /**
     * Constructor de un árbol binario con un nodo raíz inicial.
     *
     * @param comp el comparador utilizado para ordenar los elementos del árbol
     * @param data el dato inicial del nodo raíz
     */
    public BSTree(Comparator<T> comp, T data) {
        this(comp);
        this.data = data;
    }

    /**
     * Inserta un elemento en el árbol binario de búsqueda. Utiliza el comparador
     * para determinar la posición correcta del nuevo elemento.
     *
     * @param elem el elemento a insertar en el árbol
     */
    public void insert(T elem) {
        if (data == null) {
            data = elem;
        } else {
            if (comp.compare(elem, data) <= 0) {
                if (left == null) {
                    left = new BSTree<>(comp, elem);
                } else {
                    left.insert(elem);
                }
            } else {
                if (right == null) {
                    right = new BSTree<>(comp, elem);
                } else {
                    right.insert(elem);
                }
            }
        }
    }

    /**
     * Verifica si el árbol contiene un elemento específico.
     *
     * @param elem el elemento a buscar en el árbol
     * @return true si el elemento está en el árbol, de lo contrario false
     */
    public boolean contains(T elem) {
        if (data == null) {
            return false;
        } else if (data.equals(elem)) {
            return true;
        } else if (comp.compare(elem, data) <= 0) {
            return left != null && left.contains(elem);
        } else {
            return right != null && right.contains(elem);
        }
    }

    /**
     * Devuelve un iterador que itera sobre los elementos del árbol.
     * El método convierte el árbol en una lista y luego devuelve un iterador para esa lista.
     *
     * @return un iterador de tipo `Iterator<T>` para el árbol
     */
    public Iterator<T> iterator() {
        LinkedList<T> lista = new LinkedList<>();
        BSTree.tree2list(this, lista);
        return lista.iterator();
    }

    /**
     * Convierte el árbol en una lista utilizando un recorrido en preorden.
     *
     * @param arbol el árbol a convertir en lista
     * @param list  la lista donde se almacenarán los elementos del árbol
     * @param <T>   el tipo de los elementos en el árbol
     */
    public static <T> void tree2list(BSTree<T> arbol, List<T> list) {
        if (arbol.getData() != null) {
            list.add(arbol.getData());
            if (arbol.getLeft() != null)
                BSTree.tree2list(arbol.getLeft(), list);
            if (arbol.getRight() != null)
                BSTree.tree2list(arbol.getRight(), list);
        }
    }

    // Getters y setters para el nodo actual y sus hijos
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
