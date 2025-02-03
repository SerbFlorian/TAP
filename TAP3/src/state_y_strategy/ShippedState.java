package state_y_strategy;

/**
 * Estado que representa un pedido que ha sido enviado.
 * En este estado, se aplica un descuento de temporada.
 */
public class ShippedState implements OrderState {
    @Override
    public void handleState(OrderContext context) {
        System.out.println("Pedido está ENVIADO.");
        context.setDiscountStrategy(new SeasonalDiscountStrategy()); // Aplica descuento de temporada
    }
}
