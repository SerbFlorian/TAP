package patternmatching;

/**
 * La clase `InsultMessage` representa un mensaje de tipo insulto.
 * Extiende la clase base `Message` y contiene el mismo contenido, pero está
 * destinada a identificar o categorizar mensajes insultantes específicamente.
 * <p>
 * Esta clase es útil para casos donde se quiera aplicar un patrón de diseño
 * o lógica especial sobre mensajes de tipo insulto, posiblemente en un contexto
 * de filtrado de contenido o análisis de mensajes.
 *
 * @see Message
 */
public class InsultMessage extends Message {

    /**
     * Constructor de `InsultMessage`, inicializa el mensaje con el remitente
     * y el cuerpo del mensaje.
     *
     * @param from El remitente del mensaje
     * @param body El cuerpo del mensaje
     */
    public InsultMessage(String from, String body) {
        super(from, body);
    }
}
