package visitor_y_observer;

/**
 * Interfaz que define un observador para recibir notificaciones de cambios en el árbol.
 * Los observadores se suscriben para recibir actualizaciones cuando ocurra algún evento.
 */
interface TreeObserver {
    /**
     * Método que se llama cuando hay una actualización en el árbol.
     * @param message El mensaje de la notificación sobre el cambio ocurrido.
     */
    void update(String message); // Método para recibir notificaciones
}
