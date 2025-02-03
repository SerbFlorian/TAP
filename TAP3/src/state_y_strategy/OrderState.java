package state_y_strategy;

/**
 * Interfaz que define el comportamiento de los diferentes estados de una orden.
 * Cada estado implementa la lógica para gestionar el cambio de estado de la orden.
 */
public interface OrderState {
    /**
     * Maneja el estado de la orden y puede cambiar su estado.
     *
     * @param context El contexto de la orden que contiene la información y el estado actual.
     */
    void handleState(OrderContext context);
}
