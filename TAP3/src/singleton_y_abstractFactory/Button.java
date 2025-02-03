package singleton_y_abstractFactory;

/**
 * Interfaz Button que define el comportamiento de un botón.
 * Los botones concretos deben implementar este método para
 * definir su acción cuando se hace clic.
 */
public interface Button {
    /**
     * Método que se invoca cuando se hace clic en el botón.
     * Cada implementación concreta debe definir qué ocurre
     * cuando el botón es presionado.
     */
    void click();
}
