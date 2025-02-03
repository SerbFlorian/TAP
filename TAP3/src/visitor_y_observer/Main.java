package visitor_y_observer;

/**
 * Visitor se enfoca en operar sobre la estructura de datos (el árbol de nodos), sin modificar
 * las clases de los nodos, permitiendo agregar nuevas funcionalidades (como sumar los valores)
 * sin tocar el código de la estructura.
 * <p>
 * Observer mantiene el árbol de nodos informado sobre cambios sin acoplarse directamente a la lógica
 * interna del árbol, lo que permite reaccionar a esos cambios (como agregar o eliminar nodos) de manera flexible.
 */
public class Main {
    public static void main(String[] args) {
        // Crear el nodo raíz del árbol con un valor inicial de 10
        SimpleTreeNode root = new SimpleTreeNode(10);

        // Crear un observador que imprimirá las notificaciones en la consola
        ConsoleObserver observer = new ConsoleObserver();

        // Registrar el observador en el nodo raíz para que reciba notificaciones
        root.addObserver(observer);

        // Crear nodos secundarios para el árbol
        SimpleTreeNode child1 = new SimpleTreeNode(5);
        SimpleTreeNode child2 = new SimpleTreeNode(3);
        SimpleTreeNode child3 = new SimpleTreeNode(7);

        // Construir el árbol añadiendo los nodos secundarios al nodo raíz
        root.add(child1); // Notifica "Node added with value 5"
        root.add(child2); // Notifica "Node added with value 3"
        child1.add(child3); // Notifica "Node added with value 7"

        // Aplicar el patrón de diseño Visitor para obtener la suma de todos los nodos
        SumVisitor visitor = new SumVisitor();
        root.accept(visitor); // El visitante recorre el árbol sumando los valores de cada nodo

        // Imprimir la suma total de los valores de los nodos
        System.out.println("Sum of all node values: " + visitor.getSum()); // Suma total de valores

        // Remover un nodo (child2) y ver la notificación del observador
        root.remove(child2); // Notifica "Node removed with value 3"
    }
}
