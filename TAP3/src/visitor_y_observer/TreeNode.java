package visitor_y_observer;

/**
 * Interfaz que define las operaciones básicas de un nodo en un árbol.
 * Los nodos pueden tener valores, aceptar visitantes, y gestionar nodos hijos.
 */
interface TreeNode {
    /**
     * Obtiene el valor del nodo.
     * @return El valor del nodo.
     */
    int getValue();

    /**
     * Permite que un visitante realice una operación sobre el nodo.
     * @param visitor El visitante que llevará a cabo una operación en este nodo.
     */
    void accept(TreeVisitor visitor); // Permite que un visitante realice operaciones en el nodo

    /**
     * Agrega un nodo hijo a este nodo.
     * @param node El nodo hijo que se agregará.
     */
    void add(TreeNode node); // Agrega un nodo hijo

    /**
     * Elimina un nodo hijo de este nodo.
     * @param node El nodo hijo que se eliminará.
     */
    void remove(TreeNode node); // Elimina un nodo hijo
}
