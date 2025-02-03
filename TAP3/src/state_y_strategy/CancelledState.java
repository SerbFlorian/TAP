package state_y_strategy;

/**
 * Estado que representa un pedido que ha sido cancelado.
 * En este estado, no se aplica ningún descuento.
 */
public class CancelledState implements OrderState {
    @Override
    public void handleState(OrderContext context) {
        System.out.println("Pedido está CANCELADO.");
        context.setDiscountStrategy(new NoDiscountStrategy()); // No se aplica descuento
    }
}
