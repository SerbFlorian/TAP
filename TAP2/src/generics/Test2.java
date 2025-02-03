package generics;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Clase de prueba para trabajar con colecciones genéricas y mostrar el uso de
 * comodines y restricciones de tipo en métodos.
 *
 * @author Pedro García
 */
public class Test2 {
    /*
     * CONCEPTOS TEORIA:
     * - CONTRACTE= Animal -> ja que es la classe PARE
     * - Assignacio POLIMORFICA= new Animal/Cat/MutantParrot -> linea 29/30/31, ja que li estic passant una filla
     * - DYNAMIC BINDING= linea 59, ja que el metode elem.talk() es dinamic
     */

    /**
     * Método principal para crear instancias de diferentes tipos de animales,
     * añadirlas a una colección y probar los métodos `test`, `test2` y `getParam`.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        // Crear instancias de animales
        Animal a = new Animal(3, 3);
        Cat g = new Cat(1, 2);
        MutantParrot lM = new MutantParrot(3, 3);

        // Crear una lista de tipo LinkedList que almacenará animales
        LinkedList<Animal> granja = new LinkedList<Animal>();
        granja.add(a);
        granja.add(g);
        granja.add(lM);

        // Llamada al método test con una colección de animales
        test(granja);

        // Llamada al método test2 con una colección de animales
        test2(granja);

        // Llamada al método getParam que retorna un parámetro de tipo Animal
        Cat p = getParam(g);
    }

    /**
     * Método que acepta una colección de animales (o subtipos de Animal)
     * y los itera mostrando su método `talk()`.
     * Utiliza un comodín para aceptar cualquier tipo que extienda de `Animal`.
     *
     * @param c Colección de objetos que extienden de Animal
     */
    public static void test(Collection<? extends Animal> c) {
        // Itera sobre la colección y llama al método `talk()` de cada animal
        for (Animal elem : c)
            System.out.println(elem.talk());

        System.out.println("-------------------------");
    }

    /**
     * Método genérico que acepta una colección de animales (o subtipos de Animal)
     * y los itera mostrando su método `talk()`.
     * Este método utiliza una restricción de tipo para asegurarse de que
     * solo se pase colecciones de tipos que extiendan `Animal`.
     *
     * @param c   Colección de objetos de tipo Animal o sus subtipos
     * @param <T> Tipo que extiende de Animal
     */
    public static <T extends Animal> void test2(Collection<T> c) {
        // Itera sobre la colección y llama al método `talk()` de cada animal
        for (Animal elem : c)
            System.out.println(elem.talk());

        System.out.println("-------------------------");
    }

    /**
     * Método genérico que acepta un parámetro de tipo `T` que extiende de `Animal`.
     * Este método devuelve el mismo parámetro que recibe, sin modificarlo.
     *
     * @param elem El elemento de tipo T que extiende Animal
     * @param <T>  Tipo que extiende de Animal
     * @return El mismo objeto que fue pasado como parámetro
     */
    public static <T extends Animal> T getParam(T elem) {
        return elem;  // Retorna el parámetro sin cambios
    }
}
