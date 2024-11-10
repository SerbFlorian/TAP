package map;

/**
 * Interfaz que representa una operación de transformación sobre un elemento de tipo entero.
 * La interfaz define un único método, `apply`, que toma un número entero y devuelve
 * otro número entero como resultado de aplicar una operación.
 *
 * @author Pedro García
 */
interface IMap {

    /**
     * Aplica una operación sobre el elemento proporcionado.
     *
     * @param elem El número entero que se transformará.
     * @return El resultado de aplicar la operación sobre el parámetro `elem`.
     */
    int apply(int elem);
}
