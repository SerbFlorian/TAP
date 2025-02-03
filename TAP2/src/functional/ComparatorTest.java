package functional;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Clase de prueba para ordenar listas de objetos {@code Person} utilizando diferentes enfoques de comparadores.
 * <p>Esta clase muestra cómo ordenar una lista de personas ({@code Person}) por apellido (surName) en orden
 * ascendente y descendente utilizando tanto clases internas anónimas como expresiones lambda.</p>
 * <p>
 * Creado por MikeW.
 */
public class ComparatorTest {

    /**
     * Método principal que ejecuta las pruebas de ordenación.
     * <p>Primero ordena la lista de personas en orden ascendente utilizando una clase interna.
     * Luego, realiza la misma ordenación y una ordenación descendente usando expresiones lambda.</p>
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {

        // Crear una lista de personas de ejemplo
        List<Person> personList = Person.createShortList();

        // Ordenar usando una clase interna anónima, clase anonima -> new Comparator<Person>()
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName()); // Comparación de apellidos (ascendente)
            }
        });

        System.out.println("=== Ordenado Ascendente por Apellido(clase interna anonima) ===");
        for (Person p : personList) {
            p.printName();
        }

        // Ordenar usando expresiones Lambda

        // Orden ascendente por apellido
        System.out.println("=== Ordenado Ascendente por Apellido(expresiones Lambda) ===");
        Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

        for (Person p : personList) {
            p.printName();
        }

        // Orden descendente por apellido
        System.out.println("=== Ordenado Descendente por Apellido(expresiones Lambda) ===");
        Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));

        for (Person p : personList) {
            p.printName();
        }

    }
}
