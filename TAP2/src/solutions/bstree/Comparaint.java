package solutions.bstree;

import java.util.Comparator;

/**
 * Clase `Comparaint` que implementa la interfaz `Comparator<Integer>`.
 * Esta clase proporciona una forma de comparar dos números enteros de forma personalizada.
 */
public class Comparaint implements Comparator<Integer> {
    /**
     * Compara dos números enteros.
     * Si el primer número es menor o igual al segundo, devuelve -1 (lo que indica que el primer número es "menor").
     * Si el primer número es mayor que el segundo, devuelve 1 (lo que indica que el primer número es "mayor").
     *
     * @param arg0 el primer número entero a comparar
     * @param arg1 el segundo número entero a comparar
     * @return un valor negativo si el primer número es menor o igual al segundo, un valor positivo si es mayor
     */
    @Override
    public int compare(Integer arg0, Integer arg1) {
        // Si el primer número es menor o igual que el segundo, retorna -1 (es decir, `arg0` es menor que `arg1`)
        if (arg0 <= arg1)
            return -1;
            // Si el primer número es mayor que el segundo, retorna 1
        else
            return 1;
    }
}
