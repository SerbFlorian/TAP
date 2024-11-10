package map;

/**
 * Clase que proporciona un método estático para aplicar una operación a cada elemento de un arreglo.
 * El método `map` toma un arreglo de enteros y una función, y devuelve un nuevo arreglo con los resultados
 * de aplicar la función a cada elemento del arreglo original.
 *
 * @author Pedro García
 */
public class Map {

    /**
     * Aplica una función a cada elemento de un arreglo de enteros.
     * El método recibe un arreglo de enteros y una instancia de una clase que implementa la interfaz IMap.
     * Para cada elemento del arreglo, se aplica la función `apply` y se guarda el resultado en un nuevo arreglo.
     *
     * @param lista    El arreglo de enteros a modificar.
     * @param function La función que se aplicará a cada elemento del arreglo. Debe ser una instancia de una clase que implemente la interfaz IMap.
     * @return Un nuevo arreglo de enteros con los resultados de aplicar la función a cada elemento.
     */
    public static int[] map(int[] lista, IMap function) {
        // Crear un nuevo arreglo de enteros del mismo tamaño que el arreglo original.
        int[] result = new int[lista.length];

        // Iterar sobre cada elemento del arreglo original y aplicar la función a cada uno.
        for (int i = 0; i < lista.length; i++) {
            result[i] = function.apply(lista[i]); // Aplicar la función y almacenar el resultado.
        }

        // Devolver el arreglo con los resultados.
        return result;
    }
}
