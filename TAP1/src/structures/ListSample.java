package structures;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que demuestra el uso de una lista (LinkedList) para almacenar objetos de tipo `Person`.
 * <p>
 * Se crean tres instancias de la clase `Person` y se añaden a una lista. Luego, se imprime cada persona en la lista.
 */
public class ListSample {
    /**
     * Punto de entrada principal del programa.
     * <p>
     * Crea objetos `Person`, los añade a una lista de tipo `LinkedList` y los imprime.
     *
     * @param args Argumentos de la línea de comandos (no se usan en este ejemplo).
     */
    public static void main(String args[]) {
        // Creación de objetos Person con ID, nombre y edad
        Person p1 = new Person("111", "pedro", 1);
        Person p2 = new Person("222", "pep", 2);
        Person p3 = new Person("333", "pere", 3);

        // Creación de una lista de objetos Person utilizando LinkedList
        List<Person> persons = new LinkedList<Person>();

        // Añadir los objetos Person a la lista
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        // Iteración sobre la lista y impresión de cada objeto Person
        for (Person p : persons) {
            System.out.println(p); // Imprime el objeto Person (se asume que `toString` está implementado)
        }
    }
}
