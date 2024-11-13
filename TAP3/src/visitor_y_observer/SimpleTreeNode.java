package visitor_y_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación concreta de un nodo en un árbol con capacidad de observación.
 * Cada nodo puede tener hijos y observadores que se notificarán sobre cambios.
 */
class SimpleTreeNode implements TreeNode {
    private final int value; // Valor del nodo
    private final List<TreeNode> children = new ArrayList<>(); // Lista de nodos hijos
    private final List<TreeObserver> observers = new ArrayList<>(); // Lista de observadores

    /**
     * Constructor para crear un nodo con un valor específico.
     * @param value El valor que tendrá el nodo.
     */
    public SimpleTreeNode(int value) {
        this.value = value;
    }

    /**
     * Obtiene el valor del nodo.
     * @return El valor del nodo.
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * Permite que el nodo acepte un visitante para aplicar una operación sobre él y sus hijos.
     * @param visitor El visitante que aplicará la operación.
     */
    @Override
    public void accept(TreeVisitor visitor) {
        visitor.visit(this); // Visita el nodo actual
        for (TreeNode child : children) {
            child.accept(visitor); // Visita a cada hijo
        }
    }

    /**
     * Añade un hijo al nodo y notifica a los observadores sobre el cambio.
     * También propaga los observadores del nodo actual al nuevo hijo.
     * @param node El nodo hijo que se añadirá.
     */
    @Override
    public void add(TreeNode node) {
        children.add(node);
        notifyObservers("Node added with value " + node.getValue());

        // Propaga los observadores actuales al nuevo nodo hijo
        if (node instanceof SimpleTreeNode) {
            SimpleTreeNode childNode = (SimpleTreeNode) node;
            for (TreeObserver observer : observers) {
                childNode.addObserver(observer);
            }
        }
    }

    /**
     * Elimina un hijo del nodo y notifica a los observadores sobre el cambio.
     * También elimina los observadores asociados al nodo eliminado.
     * @param node El nodo hijo que se eliminará.
     */
    @Override
    public void remove(TreeNode node) {
        children.remove(node);
        notifyObservers("Node removed with value " + node.getValue());

        // Remueve los observadores del nodo eliminado
        if (node instanceof SimpleTreeNode) {
            SimpleTreeNode childNode = (SimpleTreeNode) node;
            for (TreeObserver observer : observers) {
                childNode.removeObserver(observer);
            }
        }
    }

    // Métodos para añadir y remover observadores

    /**
     * Añade un observador a este nodo y a todos sus hijos.
     * @param observer El observador que se añadirá.
     */
    public void addObserver(TreeObserver observer) {
        observers.add(observer);
        // Añade el observador a todos los hijos también
        for (TreeNode child : children) {
            if (child instanceof SimpleTreeNode) {
                ((SimpleTreeNode) child).addObserver(observer);
            }
        }
    }

    /**
     * Elimina un observador de este nodo y de todos sus hijos.
     * @param observer El observador que se eliminará.
     */
    public void removeObserver(TreeObserver observer) {
        observers.remove(observer);
        // Remueve el observador de todos los hijos también
        for (TreeNode child : children) {
            if (child instanceof SimpleTreeNode) {
                ((SimpleTreeNode) child).removeObserver(observer);
            }
        }
    }

    /**
     * Notifica a todos los observadores registrados sobre un cambio.
     * @param message El mensaje que se enviará a los observadores.
     */
    private void notifyObservers(String message) {
        for (TreeObserver observer : observers) {
            observer.update(message);
        }
    }
}
