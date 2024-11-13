package interfaces;

/**
 * La clase `Thing` implementa dos interfaces: `Musician` y `Bop`.
 * Esto significa que la clase debe proporcionar implementaciones para los métodos definidos en ambas interfaces.
 * <p>
 * En este caso, `Thing` implementa los métodos `sing` de la interfaz `Musician` y `dance` de la interfaz `Bop`,
 * representando el comportamiento de un objeto que puede cantar y bailar.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Thing implements Musician, Bop {
    /**
     * Implementación del método `dance` de la interfaz `Bop`.
     * Este método devuelve una cadena que representa el sonido o acción relacionada con el baile.
     *
     * @return Una cadena de texto que representa el sonido o acción de bailar.
     */
    @Override
    public String dance() {
        return "LALALA";  // Retorna una cadena que describe el baile de la clase Thing
    }

    /**
     * Implementación del método `sing` de la interfaz `Musician`.
     * Este método devuelve una cadena que representa el sonido o acción relacionada con el canto.
     *
     * @return Una cadena de texto que describe cómo canta la clase Thing.
     */
    @Override
    public String sing() {
        return "ouch...";  // Retorna una cadena que describe el canto de la clase Thing
    }
}
