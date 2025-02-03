package template;

/**
 * Clase que representa un juego de cricket y proporciona la implementación específica
 * de los métodos definidos en la clase abstracta `Game` como parte del patrón Template Method.
 * <p>
 * Esta clase implementa los pasos específicos del juego de cricket:
 * - Inicialización del juego.
 * - Inicio del juego.
 * - Finalización del juego.
 * <p>
 * Fuente: http://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public class Cricket extends Game {
    /**
     * Implementación del método `endPlay` para el juego de cricket.
     * Este método se encarga de mostrar el mensaje que indica que el juego ha terminado.
     */
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    /**
     * Implementación del método `initialize` para el juego de cricket.
     * Este método se encarga de mostrar el mensaje de inicialización del juego.
     */
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    /**
     * Implementación del método `startPlay` para el juego de cricket.
     * Este método se encarga de mostrar el mensaje que indica que el juego ha comenzado.
     */
    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
