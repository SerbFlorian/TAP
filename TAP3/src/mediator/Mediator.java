package mediator;

/**
 * Interfaz para el Mediator.
 */
public interface Mediator {
    void notify(Component sender, String event);
}