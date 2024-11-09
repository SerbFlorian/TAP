package inheritance;

/**
 * La clase abstracta `Talkative` sirve como base para cualquier clase que desee
 * implementar el comportamiento de hablar (con el método `talk`).
 * Las clases que extienden de `Talkative` deben proporcionar su propia implementación
 * del método `talk`.
 * <p>
 * Created by pedro on 9/9/15.
 */
abstract class Talkative {

    /**
     * Método abstracto `talk` que debe ser implementado por las clases que extienden `Talkative`.
     * Este método devuelve un mensaje, pero cada clase hija puede definir el mensaje que desea.
     *
     * @return Un mensaje específico que cada clase hija deberá definir.
     */
    abstract String talk();  // Método abstracto que debe ser implementado por las subclases
}
