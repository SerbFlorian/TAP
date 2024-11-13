package functional;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

/**
 * Esta clase demuestra el uso de la operación `map` en una lista utilizando una función para transformar sus elementos.
 * La operación `map` recibe una lista de elementos y aplica una función a cada uno de ellos, devolviendo una nueva lista con los resultados.
 *
 * @author pedro
 */
public class Map2 {
    /**
     * Aplica una función a cada elemento de una lista y devuelve una nueva lista con los resultados.
     *
     * @param <T>  El tipo de los elementos en la lista.
     * @param list La lista de entrada que contiene los elementos a transformar.
     * @param f    La función que se aplica a cada elemento de la lista.
     * @return Una nueva lista con los elementos transformados por la función.
     */
    public static <T> List<T> map(List<T> list, Function<T, T> f) {
        List<T> result = new LinkedList<T>();  // Lista para almacenar los resultados de la transformación
        for (T elem : list) {
            result.add(f.apply(elem));  // Aplica la función a cada elemento y lo añade al resultado
        }
        return result;  // Devuelve la nueva lista con los elementos transformados
    }

    /**
     * Método principal que demuestra el uso de la función `map`.
     * Se crea una lista de cadenas y se transforma cada elemento a mayúsculas utilizando la función `toUpperCase`.
     * Luego, imprime los elementos transformados en la consola.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String args[]) {
        // Crea una lista de cadenas
        List<String> elems = new LinkedList<>();
        elems.add("tap");
        elems.add("lp");

        // Aplica la función toUpperCase a cada elemento de la lista
        List<String> result = Map2.map(elems, (String p) -> p.toUpperCase());

        // Imprime los elementos transformados en la consola
        for (String elem : result)
            System.out.println(elem);
    }
}
