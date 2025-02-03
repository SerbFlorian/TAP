package map2;

/**
 * Implementación de la interfaz Imap para incrementar un número entero.
 * Esta clase aplica una transformación que suma 1 al valor recibido.
 */
public class Increment implements Imap<Integer> {
    /**
     * Aplica la transformación de incrementar el valor recibido en 1.
     *
     * @param elem El valor entero que se va a incrementar.
     * @return El valor incrementado en 1.
     */
    public Integer apply(Integer elem) {
        return elem + 1;
    }
}
