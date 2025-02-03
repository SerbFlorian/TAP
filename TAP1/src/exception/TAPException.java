package exception;

/**
 * Esta clase representa una excepción personalizada para el curso TAP.
 * La excepción `TAPException` extiende la clase `Exception` y permite
 * pasar un mensaje personalizado cuando se lanza la excepción.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class TAPException extends Exception {
    /**
     * Constructor de la clase `TAPException`.
     * Inicializa la excepción con un mensaje personalizado.
     *
     * @param message El mensaje que se asociará con la excepción.
     *                Este mensaje describe la causa de la excepción.
     */
    public TAPException(String message) {
        // Llama al constructor de la clase base `Exception` para pasar el mensaje
        super(message);
    }
}
