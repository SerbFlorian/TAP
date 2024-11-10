package functional;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Clase de utilidad para filtrar listas de elementos usando expresiones lambda y predicados.
 * <p>
 * Proporciona un método genérico para aplicar filtros a listas, devolviendo una nueva lista
 * que contiene solo los elementos que cumplen con el criterio especificado en el predicado.
 * </p>
 *
 * <p>
 * Ejemplo de uso:
 * <pre>
 * {@code
 * List<String> result = Filter.filter(elems, (String p) -> p.startsWith("p"));
 * }
 * </pre>
 * </p>
 *
 * @author milax
 */
public class Filter {

    /**
     * Filtra los elementos de una lista en función de un predicado.
     * <p>
     * Recorre la lista de entrada y añade al resultado solo aquellos elementos
     * que cumplen con el predicado especificado.
     * </p>
     *
     * @param <T>  el tipo de los elementos en la lista
     * @param list la lista de elementos a filtrar
     * @param f    el predicado que define el criterio de filtrado
     * @return una nueva lista con los elementos que cumplen el criterio del predicado
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> f) {
        List<T> result = new LinkedList<T>();
        for (T elem : list) {
            if (f.test(elem))  // Agrega al resultado si el predicado devuelve true
                result.add(elem);
        }
        return result;
    }

    /**
     * Método principal para probar la funcionalidad del filtro.
     * <p>
     * En este ejemplo, se filtran los elementos de una lista de cadenas que comienzan con "p".
     * </p>
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String args[]) {
        List<String> elems = new LinkedList<>();
        elems.add("tap");
        elems.add("lp");
        elems.add("ptap");
        elems.add("lp");

        // Filtra las cadenas que empiezan con "p"
        List<String> result = Filter.filter(elems, (String p) -> p.startsWith("p"));

        // Imprime el resultado filtrado
        for (String elem : result)
            System.out.println(elem);
    }
}
