package map2;

import java.util.Arrays;
import java.util.List;

/*
 * CONCEPTOS TEORIA:
 * - CONTRACTE = Imap -> ya que es la clase PARE (superclase)
 * - Asignación POLIMÓRFICA = new Increment/Capitals -> líneas 22/36, ya que le estoy pasando una clase hija
 * - ENLAZADO DINÁMICO (DYNAMIC BINDING) = classe Map -> línea 27, ya que el método function.apply()
 * se resuelve de manera dinámica en tiempo de ejecución
 */
public class MapSample {

    public static void main(String[] args) {
        // Lista de enteros
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

        // Lista de cadenas
        List<String> list2 = Arrays.asList("pedro", "lenguajes", "programacion", "Java", "haskell");

        // Usamos el map para incrementar cada número de la lista
        List<Integer> result = Map.map(list, new Increment());
        for (Integer elem : result) {
            // Imprime los resultados de incrementar cada número
            System.out.println(elem);
        }

        // Usamos el map para elevar al cuadrado cada número de la lista
        result = Map.map(list, new Square());
        for (Integer elem : result) {
            // Imprime los resultados de elevar al cuadrado cada número
            System.out.println(elem);
        }
        // Utilizo lambda para mostrar los resultados(version facil de entener)
        /*result.forEach(elem -> System.out.println(elem));*/
        // Utilizo lambda para mostrar los resultados(version mas compleja de entender, por los ::)
        /*result.forEach(System.out::println); */ // -> toma cada elemento de la lista result y lo pasa al metodo println
        // Usamos el map para convertir cada cadena de la lista a mayúsculas
        List<String> result2 = Map.map(list2, new Capitals());
        for (String elem : result2) {
            // Imprime las cadenas convertidas a mayúsculas
            System.out.println(elem);
        }
    }
}
