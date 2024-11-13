package patternmatching;

/**
 * La clase `QuitMessage` representa un tipo específico de mensaje en el sistema
 * que indica una solicitud de salida o desconexión. Extiende la clase `Message`,
 * heredando el remitente y el contenido del mensaje.
 */
public class QuitMessage extends Message {
    /**
     * Constructor de la clase `QuitMessage`.
     *
     * @param from El remitente del mensaje.
     * @param body El contenido o cuerpo del mensaje que indica la razón de salida.
     */
    public QuitMessage(String from, String body) {
        super(from, body);
    }
}
