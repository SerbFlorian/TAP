package visitor_y_observer;

/**
 * Visitor para calcular la suma de los valores de los nodos en un árbol.
 * Implementa la interfaz TreeVisitor y acumula la suma de los valores de los nodos.
 */
class SumVisitor implements TreeVisitor {
    private int sum = 0;

    /**
     * Visita un nodo y acumula su valor en la suma total.
     * @param node El nodo que se visita y cuya suma se actualiza.
     */
    @Override
    public void visit(TreeNode node) {
        sum += node.getValue(); // Sumar el valor del nodo
    }

    /**
     * Obtiene la suma total de los valores de los nodos visitados.
     * @return La suma total de los valores.
     */
    public int getSum() {
        return sum;
    }
}
