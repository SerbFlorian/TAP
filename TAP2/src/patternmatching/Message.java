package patternmatching;

/**
 * La clase `Message` representa un mensaje genérico con información sobre el remitente
 * y el contenido del mensaje. Esta clase puede ser extendida para crear tipos específicos
 * de mensajes, como `InsultMessage`.
 */
public class Message {
    // Remitente del mensaje
    private String from;

    // Contenido o cuerpo del mensaje
    private String body;

    /**
     * Constructor de la clase `Message`.
     *
     * @param from El remitente del mensaje.
     * @param body El contenido o cuerpo del mensaje.
     */
    public Message(String from, String body) {
        this.from = from;
        this.body = body;
    }

    /**
     * Obtiene el remitente del mensaje.
     *
     * @return el remitente del mensaje.
     */
    public String getFrom() {
        return from;
    }

    /**
     * Establece el remitente del mensaje.
     *
     * @param from El remitente del mensaje.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Obtiene el contenido o cuerpo del mensaje.
     *
     * @return el cuerpo del mensaje.
     */
    public String getBody() {
        return body;
    }

    /**
     * Establece el contenido o cuerpo del mensaje.
     *
     * @param body El contenido o cuerpo del mensaje.
     */
    public void setBody(String body) {
        this.body = body;
    }
}
