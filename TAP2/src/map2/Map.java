package map2;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que proporciona un método estático para aplicar una transformación a una lista de elementos.
 * El método map recorre la lista original y aplica una función de transformación a cada elemento.
 */
public class Map {

    /**
     * Aplica una función de transformación a cada elemento de la lista y devuelve una nueva lista con los resultados.
     *
     * @param <T>      Tipo de los elementos de la lista y el resultado de la transformación.
     * @param list     Lista de elementos sobre los que se aplicará la transformación.
     * @param function La función de transformación a aplicar a cada elemento.
     * @return Una nueva lista con los resultados de aplicar la función a cada elemento de la lista original.
     */
    public static <T> List<T> map(List<T> list, Imap<T> function) {
        // Lista donde se almacenarán los elementos transformados
        List<T> result = new LinkedList<T>();

        // Recorremos cada elemento de la lista original
        for (T elem : list)
            // Aplicamos la función de transformación y añadimos el resultado a la lista
            result.add(function.apply(elem));

        // Devolvemos la lista con los elementos transformados
        return result;
    }
}
