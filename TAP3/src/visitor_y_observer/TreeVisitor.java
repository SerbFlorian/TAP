package visitor_y_observer;

/**
 * Interfaz que define un visitante para recorrer nodos de un árbol.
 * El visitante tiene un método `visit` que se aplicará a cada nodo del árbol.
 */
interface TreeVisitor {
    /**
     * Realiza una operación en el nodo proporcionado.
     * @param node El nodo que se va a visitar.
     */
    void visit(TreeNode node); // Define la operación que se aplicará a cada nodo
}
