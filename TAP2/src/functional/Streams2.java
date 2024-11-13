package functional;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Demostración del uso de Streams en Java 8 con operaciones de mapeo, agrupamiento, partición y agregación.
 * Se usa la clase Animal para ilustrar cómo realizar varias operaciones como:
 * - Conversión de elementos de una lista a otro tipo de colección (List, Set, etc.).
 * - Agrupamiento de elementos por género.
 * - Cálculo de sumas y promedios.
 * - Partición de datos en dos grupos.
 * <p>
 * Más información sobre los métodos de los Collectors: https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
 *
 * @author MikeW
 */
public class Streams2 {
    public static void main(String args[]) {
        // Crear una lista de animales
        List<Animal> people = new LinkedList<Animal>();

        // Crear instancias de animales con sus nombres y edades
        Animal a1 = new Animal("loro", 24);
        Animal a2 = new Animal("oso", 75);
        Animal a3 = new Animal("gato", 16);
        Animal a4 = new Animal("perro", 6);
        Animal a5 = new Animal("elefante", 67);
        Animal a6 = new Animal("mamut", 81);

        // Agregar los animales a la lista
        people.add(a1);
        people.add(a2);
        people.add(a3);
        people.add(a4);
        people.add(a5);
        people.add(a6);

        /**
         * Convertir la lista de animales a una lista de nombres de animales
         * Ya que queremos trabajar con los nombres de animales y NO con sus Objetos
         * es una forma abreviada de escribir una expresion lambda que llama a un metodo especifico en un objeto
         * en este caso es equivalente Animal::getName a animal -> animal.getName()
         */
        List<String> list = people.stream().map(Animal::getName).collect(Collectors.toList());

        // Convertir la lista de animales a un conjunto (Set) de nombres, ordenados alfabéticamente
        Set<String> set = people.stream().map(Animal::getName).collect(Collectors.toCollection(java.util.TreeSet::new));
        set.forEach(System.out::println);

        // Unir todos los nombres de los animales en un solo String, separados por coma
        String joined = people.stream()
                .map(Object::toString)// muestra el Objeto como String
                .collect(Collectors.joining(", "));

        System.out.println(joined);

        // Calcular la suma de las edades de todos los animales en la lista
        int total = people.stream()
                //collect transforma los elementos de un stream en un tipo de coleccion
                .collect(Collectors.summingInt(Animal::getAge));
        System.out.println("Total de edades: " + total);

        // Ordenar la lista de animales por nombre
        List<Animal> ordered = people.stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))//define una expression lambda que compara dos objetos
                .collect(Collectors.toList());
        System.out.println("Lista ordenada por nombre:");
        ordered.forEach(System.out::println);// muestra todos los elementos de la lista

        // Crear una lista de personas de ejemplo
        List<Person> persons = Person.createShortList();

        // Agrupar a las personas por género
        Map<Gender, List<Person>> byGender = persons.stream()
                .collect(Collectors.groupingBy(Person::getGender));
        byGender.get(Gender.FEMALE).forEach(System.out::println);

        // Calcular la suma de las edades de las personas por género
        Map<Gender, Integer> totalAge = persons.stream()
                .collect(Collectors.groupingBy(Person::getGender,
                        Collectors.summingInt(Person::getAge)));
        System.out.println("Suma de edades de los hombres: " + totalAge.get(Gender.MALE));

        // Particionar los animales en dos grupos: los viejos (mayores de 30 años) y los jóvenes
        Map<Boolean, List<Animal>> oldAnimals = people.stream()
                .collect(Collectors.partitioningBy(s -> s.getAge() >= 30));

        // Mostrar los animales viejos (mayores de 30 años)
        System.out.println("Animales viejos:");
        oldAnimals.get(true).forEach(System.out::println);

        // Mostrar los animales jóvenes (menores de 30 años)
        System.out.println("Animales jóvenes:");
        oldAnimals.get(false).forEach(System.out::println);
    }
}
