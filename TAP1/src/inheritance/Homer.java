package inheritance;

/**
 * La clase `Homer` extiende la clase `Talkative` y sobrescribe el método `talk`.
 * Esta clase representa un comportamiento específico de un objeto que puede hablar,
 * con el mensaje particular "ouch !!!".
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Homer extends Talkative {

    /**
     * Método sobrescrito de la clase `Talkative`.
     * Este método devuelve un mensaje específico de la clase `Homer`.
     *
     * @return Un mensaje que indica "ouch !!!".
     */
    public String talk() {
        return "ouch !!!";  // Retorna el mensaje propio de la clase Homer
    }
}
