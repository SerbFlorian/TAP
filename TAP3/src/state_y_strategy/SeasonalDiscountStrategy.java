package state_y_strategy;

/**
 * Estrategia de descuento de temporada.
 * Aplica un descuento del 20% durante ciertas temporadas.
 */
public class SeasonalDiscountStrategy implements DiscountStrategy {
    /**
     * Aplica un descuento del 20% al precio proporcionado durante la temporada.
     *
     * @param price El precio original del producto o servicio.
     * @return El precio con un 20% de descuento aplicado.
     */
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% de descuento en temporada
    }
}
