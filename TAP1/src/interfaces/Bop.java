package interfaces;

/**
 * La interfaz `Bop` define el comportamiento común para cualquier clase
 * que implemente esta interfaz y que desee tener la capacidad de "bailar".
 * La interfaz establece el contrato de que las clases que la implementen
 * deben proporcionar su propia implementación del método `dance`.
 * <p>
 * Created by pedro on 9/9/15.
 */
interface Bop {

    /**
     * Método que debe ser implementado por cualquier clase que implemente la interfaz `Bop`.
     * Este método representa la acción de bailar, y cada clase debe definir cómo lo hace.
     *
     * @return Un mensaje o una descripción de cómo se realiza el baile.
     */
    String dance();  // Método abstracto que debe ser implementado por las clases que implementen esta interfaz
}
