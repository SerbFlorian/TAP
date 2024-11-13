package visitor_y_observer;

/**
 * Implementación concreta de un observador que imprime las notificaciones en la consola.
 * Este observador es notificado cada vez que un nodo en el árbol cambia (se añade o se elimina).
 */
class ConsoleObserver implements TreeObserver {
    /**
     * Recibe la notificación de un cambio en el árbol y lo imprime en la consola.
     * @param message El mensaje que describe el cambio realizado en el árbol.
     */
    @Override
    public void update(String message) {
        System.out.println("Observer notification: " + message);
    }
}
