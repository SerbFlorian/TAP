package mediator;

/**
 * Implementación concreta del Mediador que coordina la comunicación entre ComponentA y ComponentB.
 * Controla el flujo de comunicación entre los componentes sin que estos se conozcan directamente.
 */
public class ConcreteMediator implements Mediator {
    private ComponentA componentA;
    private ComponentB componentB;

    /**
     * Bandera que previene notificaciones recursivas entre componentes.
     */
    private boolean isNotifying = false;

    /**
     * Asigna el componente A al mediador.
     *
     * @param componentA El componente A que será coordinado por el mediador.
     */
    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    /**
     * Asigna el componente B al mediador.
     *
     * @param componentB El componente B que será coordinado por el mediador.
     */
    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }

    /**
     * Método de notificación utilizado para coordinar las interacciones entre los componentes.
     * Evita la recursividad mediante la bandera isNotifying.
     *
     * @param sender El componente que envía la notificación.
     * @param event  El evento que ocurrió en el componente.
     */
    @Override
    public void notify(Component sender, String event) {
        if (isNotifying) {
            return; // Previene la recursividad en las notificaciones
        }

        isNotifying = true;
        if (sender == componentA && event.equals("A")) {
            componentB.doB(); // Activa la acción de ComponentB en respuesta al evento de ComponentA
        } else if (sender == componentB && event.equals("B")) {
            componentA.doA(); // Activa la acción de ComponentA en respuesta al evento de ComponentB
        }
        isNotifying = false; // Restablece la bandera después de la notificación
    }
}
