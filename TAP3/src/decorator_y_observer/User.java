package decorator_y_observer;

// Clase User que actúa como un Observer
/**
 * Clase que representa a un usuario que se suscribe a un sujeto (Subject) para recibir
 * notificaciones cuando el sujeto cambie.
 * Implementa la interfaz Observer para recibir actualizaciones.
 */
public class User implements Observer {
    private String name;

    /**
     * Constructor que inicializa el nombre del usuario.
     *
     * @param name El nombre del usuario.
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Método que es llamado cuando el sujeto notifica a sus observadores.
     * Este método imprime el mensaje recibido, indicando que el usuario ha sido
     * notificado.
     *
     * @param message El mensaje que el sujeto envía al usuario.
     */
    @Override
    public void update(String message) {
        System.out.println(name + " recibió una notificación: " + message);
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return El nombre del usuario.
     */
    public String getName() {
        return name;
    }
}
