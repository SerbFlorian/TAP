package map2;

/**
 * Clase que implementa la interfaz Imap para convertir un String a mayúsculas.
 */
public class Capitals implements Imap<String> {
    /**
     * Convierte el valor de un String a mayúsculas.
     *
     * @param elem El String que se va a convertir a mayúsculas.
     * @return El String en mayúsculas.
     */
    public String apply(String elem) {
        return elem.toUpperCase();  // Convierte el String a mayúsculas.
    }
}
