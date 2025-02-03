package structures;

import java.util.Comparator;

/**
 * Clase que implementa el comparador para ordenar objetos `Client` por su nombre.
 * Implementa la interfaz `Comparator<Client>`.
 */
public class NameComparator implements Comparator<Client> {

    /**
     * Compara dos objetos `Client` basándose en el nombre de cada uno.
     * <p>
     * El método usa el método `compareTo` de la clase `String` para comparar los nombres lexicográficamente.
     * Si el nombre de `p1` es alfabéticamente menor que el de `p2`, el resultado será negativo;
     * si es mayor, el resultado será positivo; y si son iguales, el resultado será cero.
     *
     * @param p1 El primer cliente a comparar.
     * @param p2 El segundo cliente a comparar.
     * @return Un valor negativo si el nombre de `p1` es menor que el de `p2`, un valor positivo si es mayor,
     * o cero si los nombres son iguales.
     */
    public int compare(Client p1, Client p2) {

        // Obtiene los nombres de los clientes
        String s1 = p1.getName();
        String s2 = p2.getName();

        // Compara los nombres lexicográficamente
        return (s1.compareTo(s2));
    }
}
