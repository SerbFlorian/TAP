package map;

/**
 * Clase utilitaria que proporciona un método estático para aplicar una operación a cada elemento de un arreglo de enteros.
 * Utiliza la interfaz IMap para permitir diferentes implementaciones de operaciones sobre los elementos del arreglo.
 *
 * @author Pedro García
 */
public class MapUtil {

    /**
     * Aplica una operación a cada elemento de un arreglo de enteros.
     * Utiliza una instancia de la interfaz IMap para realizar la operación en cada elemento.
     *
     * @param lista    El arreglo de enteros sobre el que se va a aplicar la operación.
     * @param function La operación que se va a aplicar a cada elemento del arreglo.
     * @return Un nuevo arreglo con los resultados de aplicar la operación a cada elemento del arreglo original.
     */
    public static int[] map(int[] lista, IMap function) {
        // Crear un arreglo de enteros para almacenar los resultados.
        int[] result = new int[lista.length];

        // Recorrer cada elemento del arreglo de entrada y aplicar la operación.
        for (int i = 0; i < lista.length; i++) {
            result[i] = function.apply(lista[i]);  // Aplicar la operación a cada elemento
        }

        // Retornar el arreglo con los resultados de la operación.
        return result;
    }
}
