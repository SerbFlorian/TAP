package mediator;

/**
 * Clase base abstracta para los componentes que interactúan a través de un mediador.
 * Cada componente mantiene una referencia al mediador para coordinar sus interacciones
 * con otros componentes sin necesidad de referirse directamente a ellos.
 */
public abstract class Component {
    protected Mediator mediator; // Referencia al mediador que coordina las interacciones entre componentes

    /**
     * Constructor que establece el mediador para el componente.
     *
     * @param mediator El mediador que gestionará la comunicación entre los componentes.
     */
    public Component(Mediator mediator) {
        this.mediator = mediator;
    }
}
