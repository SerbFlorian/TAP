package template;

/**
 * Clase abstracta que representa un juego genérico y define el esqueleto
 * del algoritmo de un juego utilizando el patrón Template Method.
 * <p>
 * Este patrón permite que las subclases definan los pasos específicos del juego,
 * pero la estructura general del proceso de jugar (iniciar, jugar y finalizar)
 * se mantiene constante.
 * <p>
 * Fuente: http://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public abstract class Game {
    /**
     * Método abstracto para inicializar el juego.
     * Las subclases deben proporcionar la implementación específica de la inicialización.
     */
    abstract void initialize();

    /**
     * Método abstracto para iniciar el juego.
     * Las subclases deben proporcionar la implementación específica para el inicio del juego.
     */
    abstract void startPlay();

    /**
     * Método abstracto para finalizar el juego.
     * Las subclases deben proporcionar la implementación específica para el final del juego.
     */
    abstract void endPlay();

    /**
     * Método plantilla (Template Method) que define la secuencia de pasos para jugar el juego.
     * <p>
     * Este método no debe ser sobrescrito por las subclases, ya que define el flujo general
     * del juego utilizando los métodos abstractos que las subclases deben implementar.
     */
    public final void play() {

        // Inicializa el juego (delegado a la implementación de la subclase)
        initialize();

        // Inicia el juego (delegado a la implementación de la subclase)
        startPlay();

        // Finaliza el juego (delegado a la implementación de la subclase)
        endPlay();
    }
}
