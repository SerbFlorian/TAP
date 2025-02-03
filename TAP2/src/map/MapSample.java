package map;

/**
 * Clase de ejemplo que muestra cómo usar el método `map` para aplicar funciones a un arreglo de enteros.
 * En este caso, se aplica primero una operación de incremento y luego una operación de cuadrado.
 *
 * @author Pedro García
 */
public class MapSample {
    /*
     * CONCEPTOS TEORIA:
     * - CONTRACTE= IMap -> ja que es la classe PARE
     * - Assignacio POLIMORFICA= new Increment/Square -> linea 21/30, ja que li estic passant una filla
     * - DYNAMIC BINDING= en Classe Map, linea 27, el .apply
     */
    public static void main(String[] args) {
        // Crear un arreglo de enteros
        int[] list = {1, 2, 3, 4, 5};

        // Aplicar la operación de incremento a cada elemento del arreglo utilizando la clase Increment.
        int[] result = Map.map(list, new Increment());

        // Imprimir los resultados después de la operación de incremento.
        System.out.println("Incrementados:");
        for (int i : result) {
            System.out.println(i); // Imprimir cada número incrementado
        }

        // Aplicar la operación de elevar al cuadrado a cada elemento del arreglo utilizando la clase Square.
        int[] result2 = Map.map(list, new Square());

        // Imprimir los resultados después de la operación de cuadrado.
        System.out.println("Cuadrados:");
        for (int i : result2) {
            System.out.println(i); // Imprimir cada número al cuadrado
        }
    }
}
