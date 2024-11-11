package mediator;

/**
 * Implementación concreta de un componente B que realiza una acción específica
 * y notifica al mediador sobre esta acción para coordinar con otros componentes.
 */
public class ComponentB extends Component {
    /**
     * Constructor que inicializa ComponentB con una referencia al mediador.
     *
     * @param mediator El mediador que coordina la comunicación con otros componentes.
     */
    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    /**
     * Método que realiza la acción específica de ComponentB y notifica al mediador.
     * Imprime un mensaje de la acción realizada y envía una notificación con el identificador "B".
     */
    public void doB() {
        System.out.println("Component B does B.");
        mediator.notify(this, "B");
    }
}
