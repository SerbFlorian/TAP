package state_y_strategy;

/**
 * Contexto del pedido que maneja el estado actual y la estrategia de descuento.
 * Este contexto permite cambiar el estado del pedido y aplicar el descuento correspondiente
 * según el estado en que se encuentre.
 */
public class OrderContext {
    private OrderState currentState; // Estado actual del pedido
    private DiscountStrategy discountStrategy; // Estrategia de descuento asociada al estado

    /**
     * Cambia el estado del pedido y actualiza la estrategia de descuento según el nuevo estado.
     * @param state Nuevo estado del pedido.
     */
    public void setState(OrderState state) {
        this.currentState = state;
        state.handleState(this);  // Actualiza la estrategia de descuento según el nuevo estado
    }

    /**
     * Establece la estrategia de descuento que se aplicará al pedido.
     * @param discountStrategy Estrategia de descuento a aplicar.
     */
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    /**
     * Aplica el descuento al precio dado utilizando la estrategia de descuento actual.
     * @param price Precio original del producto.
     * @return Precio con el descuento aplicado.
     */
    public double applyDiscount(double price) {
        return discountStrategy.applyDiscount(price);
    }
}
