package structures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Clase de prueba que demuestra el uso de colecciones y comparadores.
 * La clase ordena una lista de objetos `Client` primero por nombre y luego por edad.
 */
public class Test3 {
    /**
     * Método que imprime el contenido de una colección de objetos `Client`.
     *
     * @param c Colección de objetos `Client` a imprimir.
     */
    public static void print(Collection<Client> c) {
        // Recorre la colección e imprime el nombre y la edad de cada cliente
        for (Client p : c) {
            System.out.println("name: " + p.getName() + "  age: " + p.getAge());
        }
        // Imprime una línea separadora para mejorar la lectura
        System.out.println("-------------------------");
    }

    /**
     * Método principal de la clase.
     * Crea una lista de objetos `Client`, los ordena por nombre y por edad,
     * y muestra los resultados en la consola.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String args[]) {
        // Crear tres objetos Client con nombre y edad
        Client p1 = new Client("jose", 30);
        Client p2 = new Client("pedro", 24);
        Client p3 = new Client("jcarlos", 100);

        // Crear una lista de objetos Client
        List<Client> c = new ArrayList<Client>();
        // Agregar los objetos Client a la lista
        c.add(p1);
        c.add(p2);
        c.add(p3);

        // Imprimir la lista sin ordenar
        System.out.println("- No ordering ---------------");
        print(c);

        // Crear un comparador de nombres y ordenar la lista por nombre
        NameComparator t1 = new NameComparator();
        Collections.sort(c, t1); // t1 es el comparator para ordenar por nombre
        System.out.println("- Ordered by name --------");
        print(c);

        // Crear un comparador de edades y ordenar la lista por edad
        AgeComparator t2 = new AgeComparator();
        Collections.sort(c, t2); // t2 es el comparator para ordenar por edad
        System.out.println("- Ordered by age --------");
        print(c);
    }
}
