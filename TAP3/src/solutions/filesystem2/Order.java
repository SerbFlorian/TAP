package solutions.filesystem2;

import java.util.Comparator;

/**
 * Comparador que ordena dos componentes del sistema de archivos
 * basándose en el nombre del componente.
 */
public class Order implements Comparator<AComponent> {
    /**
     * Compara dos componentes AComponent basándose en su nombre.
     *
     * @param arg0 El primer componente a comparar.
     * @param arg1 El segundo componente a comparar.
     * @return Un valor negativo, cero o positivo dependiendo de si
     * el nombre de arg0 es menor, igual o mayor que el de arg1.
     */
    public int compare(AComponent arg0, AComponent arg1) {
        // Si ambos son null, se considera que son iguales
        if (arg0 == null && arg1 == null) {
            return 0;
        }

        // Si uno de los dos es null, el otro es considerado mayor
        if (arg0 == null) {
            return -1;
        }
        if (arg1 == null) {
            return 1;
        }

        // Comparación por el nombre de los componentes
        return arg0.getName().compareTo(arg1.getName());
    }
}
