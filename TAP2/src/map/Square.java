package map;

/**
 * Clase que implementa la interfaz IMap para elevar un número al cuadrado.
 */
public class Square implements IMap {
    /**
     * Eleva al cuadrado el valor de un número.
     *
     * @param elem El número que se va a elevar al cuadrado.
     * @return El número elevado al cuadrado.
     */
    public int apply(int elem) {
        return elem * elem;  // Eleva el número al cuadrado.
    }
}
