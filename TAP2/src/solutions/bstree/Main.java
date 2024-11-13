package solutions.bstree;

/**
 * Clase principal que prueba las funcionalidades del árbol binario de búsqueda (BSTree).
 * Se insertan varios elementos en el árbol y se verifican si ciertos valores están presentes.
 */
public class Main {
    /**
     * Método principal que ejecuta las operaciones de inserción y búsqueda en el árbol.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Se crea un árbol binario de búsqueda (BSTree) para almacenar enteros, usando el comparador 'Comparaint'
        BSTree<Integer> arbol = new BSTree<Integer>(new Comparaint());

        // Insertar elementos en el árbol
        arbol.insert(5);  // Se inserta el valor 5
        arbol.insert(3);  // Se inserta el valor 3
        arbol.insert(6);  // Se inserta el valor 6
        arbol.insert(1);  // Se inserta el valor 1
        arbol.insert(4);  // Se inserta el valor 4

        // Verificar si ciertos elementos están presentes en el árbol
        System.out.println(arbol.contains(4));  // Imprime 'true' porque el 4 está en el árbol
        System.out.println(arbol.contains(8));  // Imprime 'false' porque el 8 no está en el árbol

        // Iterar sobre el árbol y mostrar sus elementos
        // Imprime los elementos del árbol en orden (dependiendo de cómo se implemente el iterador)
        for (Integer elem : arbol) {
            System.out.println(elem);
        }
    }
}
