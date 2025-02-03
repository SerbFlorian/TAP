package decorator_y_observer;

/**
 * Interfaz Observer que deben implementar los objetos interesados en recibir actualizaciones.
 * Cuando el sujeto cambia su estado, los observadores son notificados.
 */
public interface Observer {
    /**
     * Método llamado para actualizar al observador con un nuevo mensaje.
     *
     * @param message El mensaje que el observador debe procesar.
     */
    void update(String message);
}
