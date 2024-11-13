package inheritance;

/**
 * La clase `Bart` extiende la clase `Talkative` y sobrescribe el método `talk`.
 * Esta clase representa un comportamiento específico de un objeto que puede hablar,
 * con el mensaje particular "multiply for 0".
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Bart extends Talkative {
    /**
     * Método sobrescrito de la clase `Talkative`.
     * Este método devuelve un mensaje específico de la clase `Bart`.
     *
     * @return Un mensaje que indica "multiply for 0".
     */
    public String talk() {
        return "multiply for 0";  // Retorna el mensaje propio de la clase Bart
    }
}
