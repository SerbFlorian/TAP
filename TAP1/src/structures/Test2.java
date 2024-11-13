package structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Clase de prueba que muestra el uso de las colecciones en Java.
 * Esta clase demuestra cómo agregar elementos a una lista, ordenarla,
 * buscar elementos mediante búsqueda binaria y mostrar el contenido.
 */
public class Test2 {
    /**
     * Método principal de la clase.
     * Crea una lista de cadenas, agrega elementos, los ordena y realiza una búsqueda binaria.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String args[]) {
        // Se crea una lista vacía de cadenas
        List<String> c = new ArrayList<String>();

        // Se crea un arreglo de cadenas a agregar a la lista
        String lista[] = {"uno", "dos", "tres", "cuatro"};

        // Se agregan los elementos del arreglo a la lista
        for (String num : lista)
            c.add(num);

        // Se imprime el contenido de la lista antes de ordenarla
        print(c);

        // Se ordenan los elementos de la lista
        // Ordena de forma ascendente por defecto
        Collections.sort(c);

        // Se imprime el contenido de la lista después de ordenarla
        print(c);

        // Se realiza una búsqueda binaria para encontrar la posición de "dos"
        int loc = Collections.binarySearch(c, "dos");
        System.out.println("Posición de 'dos' = " + loc); // Imprime la posición de "dos" en la lista ordenada
    }

    /**
     * Método que imprime el contenido de una colección de cadenas.
     *
     * @param c Colección de cadenas a imprimir.
     */
    public static void print(Collection<String> c) {
        // Se recorre la colección e imprime cada elemento
        for (String num : c)
            System.out.println(num);

        // Imprime una línea separadora para mejor visualización
        System.out.println("-------------------------");
    }
}
