package structures;

import java.util.Comparator;

/**
 * Comparador personalizado para ordenar objetos de la clase `Client` por edad.
 * Implementa la interfaz `Comparator<Client>`, lo que permite comparar dos objetos `Client` en función de su edad.
 */
public class AgeComparator implements Comparator<Client> {
    /**
     * Compara dos objetos `Client` en función de su edad.
     *
     * @param p1 El primer objeto `Client` a comparar.
     * @param p2 El segundo objeto `Client` a comparar.
     * @return Un valor entero que indica el orden:
     * - 1 si la edad de `p1` es mayor que la de `p2`
     * - -1 si la edad de `p1` es menor que la de `p2`
     * - 0 si ambas edades son iguales.
     */
    public int compare(Client p1, Client p2) {
        // Obtener la edad de ambos clientes
        int s1 = p1.getAge();
        int s2 = p2.getAge();

        // Comparar las edades y devolver el resultado correspondiente
        if (s1 > s2)
            return 1;  // p1 es más viejo que p2
        else if (s1 < s2)
            return -1; // p1 es más joven que p2
        return 0;  // Ambos tienen la misma edad
    }
}
