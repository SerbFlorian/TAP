package solutions.bstree2;

/**
 * Clase principal que contiene el método main para probar la funcionalidad del árbol binario de búsqueda (BSTree).
 */
public class Main {

    /**
     * Método principal que crea un árbol binario de búsqueda, inserta algunos elementos,
     * realiza búsquedas y recorre el árbol.
     *
     * @param args Argumentos de la línea de comandos (no se usan en este caso).
     */
    public static void main(String[] args) {
        // Se crea un árbol binario de búsqueda de enteros
        BSTree<Integer> arbol = new BSTree<Integer>();

        // Inserción de elementos en el árbol
        arbol.insert(5);  // El árbol se construye con el elemento 5
        arbol.insert(3);  // Se inserta el elemento 3
        arbol.insert(6);  // Se inserta el elemento 6
        arbol.insert(1);  // Se inserta el elemento 1
        arbol.insert(4);  // Se inserta el elemento 4

        // Comprobación de si el árbol contiene ciertos elementos
        System.out.println(arbol.contains(4));  // Devuelve true porque 4 está en el árbol
        System.out.println(arbol.contains(8));  // Devuelve false porque 8 no está en el árbol

        // Recorrido del árbol e impresión de sus elementos
        // El recorrido por defecto es en preorden (raíz, izquierda, derecha)
        for (Integer elem : arbol) {
            System.out.println(elem);  // Imprime cada elemento en el árbol
        }
    }
}
