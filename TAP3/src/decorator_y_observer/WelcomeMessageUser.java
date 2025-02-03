package decorator_y_observer;

// Decorador que añade un mensaje de bienvenida y es un observador
/**
 * Clase decoradora que añade una funcionalidad adicional para enviar un mensaje de
 * bienvenida al usuario. También implementa Observer para recibir actualizaciones del
 * sujeto al que está suscrito.
 */
public class WelcomeMessageUser implements UserDecorator, Observer {
    private User user;

    /**
     * Constructor que inicializa el usuario decorado.
     *
     * @param user El usuario al que se le añade la funcionalidad de bienvenida.
     */
    public WelcomeMessageUser(User user) {
        this.user = user;
    }

    /**
     * Método update que permite que este decorador reciba notificaciones.
     * Este método simplemente pasa la notificación al usuario decorado.
     *
     * @param message El mensaje recibido del sujeto.
     */
    @Override
    public void update(String message) {
        user.update(message);  // Pasa la notificación al usuario decorado
    }

    /**
     * Método que envía un mensaje de bienvenida al usuario.
     * Este método añade una funcionalidad extra de bienvenida.
     */
    @Override
    public void sendWelcomeMessage() {
        System.out.println("Bienvenido, " + user.getName() + "!");
    }
}
