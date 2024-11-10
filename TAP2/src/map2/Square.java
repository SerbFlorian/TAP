package map2;

/**
 * Clase que implementa la interfaz Imap para transformar un valor de tipo Integer
 * mediante la operación de elevarlo al cuadrado.
 */
public class Square implements Imap<Integer> {

    /**
     * Aplica la operación de elevar al cuadrado el valor proporcionado.
     *
     * @param elem El valor de tipo Integer que será elevado al cuadrado.
     * @return El valor resultante de elevar al cuadrado el elemento proporcionado.
     */
    public Integer apply(Integer elem) {
        // Retornamos el cuadrado del valor proporcionado
        return elem * elem;
    }
}
