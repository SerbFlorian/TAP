package mediator;

/**
 * Implementación concreta de un componente A que realiza una acción específica
 * y notifica al mediador sobre esta acción para que coordine con otros componentes.
 */
public class ComponentA extends Component {
    /**
     * Constructor que inicializa ComponentA con una referencia al mediador.
     *
     * @param mediator El mediador que coordina la comunicación con otros componentes.
     */
    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    /**
     * Método que realiza la acción específica de ComponentA y notifica al mediador.
     * Imprime un mensaje de la acción realizada y envía una notificación con el identificador "A".
     */
    public void doA() {
        System.out.println("Component A does A.");
        mediator.notify(this, "A");
    }
}
