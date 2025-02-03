package state_y_strategy;

/**
 * Estrategia de descuento para miembros.
 * Aplica un descuento del 10% al precio original.
 */
public class MemberDiscountStrategy implements DiscountStrategy {
    /**
     * Aplica un descuento del 10% al precio proporcionado.
     *
     * @param price El precio original del producto o servicio.
     * @return El precio con un 10% de descuento aplicado.
     */
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% de descuento para miembros
    }
}
