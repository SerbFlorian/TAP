package decorator_y_observer;

/**
 * Observer: Este patrón permite que un objeto (el Subject) notifique a varios objetos
 * interesados (Observers) cuando cambia su estado. Es ideal para situaciones en las que
 * varios objetos necesitan reaccionar ante eventos de un objeto central sin acoplarse fuertemente entre sí.
 * El Subject no necesita conocer a los observadores de manera explícita, solo les
 * notifica de los cambios. Esto facilita la gestión de dependencias y la extensión de la funcionalidad
 * sin modificar el objeto principal.
 * <p>
 * Decorator: Este patrón permite añadir funcionalidades adicionales a un objeto
 * sin modificar su estructura interna. En lugar de modificar la clase base, el Decorator envuelve el objeto
 * y le agrega nuevos comportamientos. Esto es útil cuando se desea extender la funcionalidad de
 * objetos específicos sin alterar el código original o crear subclases adicionales.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un Subject que notifica a los observadores
        Subject subject = new Subject();

        // Crear usuarios
        User user1 = new User("Juan");
        User user2 = new User("Maria");

        // Decorar a user2 con el mensaje de bienvenida
        WelcomeMessageUser decoratedUser2 = new WelcomeMessageUser(user2);

        // Agregar usuarios como observadores
        subject.addObserver(user1);
        subject.addObserver(decoratedUser2);

        // Notificar a los usuarios que un nuevo usuario ha sido agregado
        subject.notifyObservers("Se ha agregado un nuevo usuario.");

        // Decorar el comportamiento de user1 con un mensaje de bienvenida
        WelcomeMessageUser decoratedUser1 = new WelcomeMessageUser(user1);
        decoratedUser1.sendWelcomeMessage();  // Enviar mensaje de bienvenida a user1
    }
}
