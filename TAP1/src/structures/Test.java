package structures;

import java.util.*;

/**
 * Clase de prueba que muestra el uso de diferentes implementaciones de la interfaz `Collection` en Java.
 * Se crean y prueban varias colecciones: `ArrayList`, `LinkedList`, `HashSet` y `TreeSet`.
 */
public class Test {
    /**
     * Método de entrada del programa.
     * Se crean varias colecciones de tipo `String` y se prueban utilizando el método `test`.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String args[]) {
        Collection<String> c;

        // Probamos con una ArrayList
        c = new ArrayList<String>();
        test(c);

        // Probamos con una LinkedList
        c = new LinkedList<String>();
        test(c);

        // Probamos con un HashSet (sin orden específico)
        // Nota: HashSet no permite elementos duplicados
        c = new HashSet<String>();
        test(c);

        // Probamos con un TreeSet (que ordena los elementos)
        // Nota: TreeSet no permite elementos duplicados
        c = new TreeSet<String>();
        test(c);
    }

    /**
     * Método que agrega elementos a una colección y los imprime en consola.
     *
     * @param c La colección en la que se van a agregar los elementos. Puede ser de cualquier tipo que implemente `Collection`.
     */
    public static void test(Collection<String> c) {
        // Array de cadenas de texto a agregar a la colección
        String strings[] = {"uno", "dos", "tres", "cuatro", "tres"};

        // Añadimos los elementos a la colección
        for (String num : strings) {
            c.add(num);
        }

        // Imprimimos los elementos de la colección
        for (String num : c) {
            System.out.println(num);
        }

        // Se imprime una línea separadora para facilitar la lectura
        System.out.println("-------------------------");
    }
}
