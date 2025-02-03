package state_y_strategy;

/**
 * Estado que representa un pedido pendiente.
 * En este estado, no se aplica descuento.
 */
public class PendingState implements OrderState {
    @Override
    public void handleState(OrderContext context) {
        System.out.println("Pedido está en estado PENDIENTE.");
        context.setDiscountStrategy(new NoDiscountStrategy()); // No aplica descuento en este estado
    }
}
