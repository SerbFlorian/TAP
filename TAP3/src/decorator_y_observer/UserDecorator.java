package decorator_y_observer;

/**
 * Interfaz que define el comportamiento para un decorador de usuario.
 * Los decoradores implementarán esta interfaz para agregar funcionalidades adicionales
 * al proceso de envío del mensaje de bienvenida.
 */
public interface UserDecorator {
    /**
     * Método que envía un mensaje de bienvenida al usuario.
     * Este método puede ser modificado por decoradores para agregar comportamientos extra.
     */
    void sendWelcomeMessage();
}
