package solutions.observer;

/**
 * Excepción personalizada que se lanza cuando se intenta registrar un observador repetido.
 * <p>
 * Esta excepción es utilizada en el contexto del patrón de diseño "Observer", específicamente
 * cuando un observador ya está registrado en la lista y se intenta agregarlo nuevamente.
 *
 * @author [Tu Nombre]
 */
public class RepeatedObserverException extends Exception {
    /**
     * Constructor por defecto para la excepción {@link RepeatedObserverException}.
     */
    public RepeatedObserverException() {
        super(); // Llama al constructor de la clase base (Exception) sin mensaje.
    }

    /**
     * Constructor que permite especificar un mensaje personalizado para la excepción.
     *
     * @param message El mensaje detallado que describe la causa de la excepción.
     */
    public RepeatedObserverException(String message) {
        super(message); // Llama al constructor de la clase base con un mensaje específico.
    }

    /**
     * Constructor que permite especificar un mensaje y una causa para la excepción.
     *
     * @param message El mensaje detallado que describe la causa de la excepción.
     * @param cause   La causa que originó la excepción (otra excepción).
     */
    public RepeatedObserverException(String message, Throwable cause) {
        super(message, cause); // Llama al constructor de la clase base con mensaje y causa.
    }

    /**
     * Constructor que permite especificar la causa de la excepción sin mensaje.
     *
     * @param cause La causa que originó la excepción (otra excepción).
     */
    public RepeatedObserverException(Throwable cause) {
        super(cause); // Llama al constructor de la clase base con la causa.
    }
}
