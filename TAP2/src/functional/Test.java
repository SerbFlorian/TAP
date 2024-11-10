package functional; /**
 * Created by pedro on 7/17/14.
 */

import java.util.LinkedList;
import java.util.List;

/**
 * Clase de prueba que crea una lista de objetos `Animal` y realiza operaciones sobre ella.
 * En este caso, se muestra cómo iterar sobre la lista y llamar a métodos sobre los objetos.
 *
 * @author pedro
 */
public class Test {

    public static void main(String args[]) {
        // Crear una lista vacía de objetos Animal
        List<Animal> list = new LinkedList<Animal>();

        // Crear instancias de Animal con nombre y edad
        Animal a1 = new Animal("a", 3);
        Animal a2 = new Animal("b", 7);
        Animal a3 = new Animal("c", 1);

        // Agregar los animales a la lista
        list.add(a1);
        list.add(a2);
        list.add(a3);

        // Usar `forEach` con una expresión lambda para invocar el método `talk` de cada animal
        list.forEach(elem -> elem.talk());

        // Usar `forEach` con una referencia a método para imprimir los animales
        list.forEach(System.out::println);

        /* El bloque comentado abajo es una forma alternativa de iterar
         * sobre la lista usando un ciclo `for` tradicional para invocar
         * el método `talk` en cada objeto `Animal`.
         *
         * for (Animal a : list)
         *     a.habla();
         */
    }
}
