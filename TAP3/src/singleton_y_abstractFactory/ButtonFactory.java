package singleton_y_abstractFactory;

/**
 * Interfaz Abstract Factory que define el método para crear un botón.
 * Las fábricas concretas deben implementar este método para
 * proporcionar una instancia específica de un botón.
 */
public interface ButtonFactory {
    /**
     * Método para crear un objeto Button.
     * Las implementaciones concretas de esta fábrica crearán diferentes tipos de botones.
     *
     * @return Una instancia de un objeto que implementa la interfaz Button.
     */
    Button createButton();
}
