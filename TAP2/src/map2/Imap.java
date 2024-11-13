package map2;

/**
 * Interfaz genérica para aplicar una función a un elemento de tipo T.
 *
 * @param <T> Tipo de los elementos sobre los cuales se aplicará la función.
 */
interface Imap<T> {
    /**
     * Aplica una transformación a un elemento del tipo T.
     *
     * @param elem El elemento sobre el que se va a aplicar la función.
     * @return El elemento transformado.
     */
    T apply(T elem);
}
