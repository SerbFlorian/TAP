package state_y_strategy;

/**
 * Estrategia sin descuento.
 * No aplica ningún descuento al precio.
 */
public class NoDiscountStrategy implements DiscountStrategy {
    /**
     * No aplica descuento y devuelve el precio original.
     *
     * @param price El precio original del producto o servicio.
     * @return El mismo precio sin ningún descuento.
     */
    @Override
    public double applyDiscount(double price) {
        return price; // Sin descuento
    }
}
