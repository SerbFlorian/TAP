package functional;
/**
 * http://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 */

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Esta clase demuestra el uso de Streams en Java 8 para procesar colecciones de datos de manera funcional.
 * Se realizan varias operaciones sobre una lista de objetos `Animal`, como filtrado, recolección y conteo.
 *
 * @author MikeW
 */
public class Streams {
    public static void main(String args[]) {
        // Crear una lista de animales
        List<Animal> list = new LinkedList<Animal>();

        // Crear instancias de animales con sus nombres y edades
        Animal a1 = new Animal("loro", 24);
        Animal a2 = new Animal("oso", 75);
        Animal a3 = new Animal("gato", 16);
        Animal a4 = new Animal("perro", 6);
        Animal a5 = new Animal("elefante", 67);
        Animal a6 = new Animal("mamut", 81);

        // Agregar los animales a la lista
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);
        list.add(a6);

        // Crear un Stream de animales filtrados por aquellos cuya edad es mayor a 30
        // Stream no guarda los elementos, solo los procesa
        Stream<Animal> animalsOver3 = list.stream().filter(p -> p.getAge() > 30);

        // Imprimir la edad de cada animal que cumple con el filtro (edad > 30)
        animalsOver3.forEach(elem -> System.out.println(elem.getAge()));

        // Crear una nueva lista con los animales cuya edad es mayor a 30 utilizando el método collect()
        List<Animal> result = list.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());

        // Imprimir cada animal en la nueva lista
        //result.forEach(elem2 -> System.out.println(elem2)); ALTERNATIVA
        result.forEach(System.out::println);

        // Contar el número de animales cuya edad es mayor a 30
        // collectors.counting() devuelve un valor de tipo LONG
        long number = list.stream().filter(p -> p.getAge() > 30).collect(Collectors.counting());
        System.out.println("Número de animales con edad mayor a 30: " + number);

        // Usar el método count() para contar directamente el número de elementos en el stream
        long count = list.stream().filter(p -> p.getAge() > 30).count();
        System.out.println("Número contado directamente: " + count);
    }
}