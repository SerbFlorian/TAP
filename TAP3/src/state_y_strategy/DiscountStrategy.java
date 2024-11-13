package state_y_strategy;

/**
 * Interfaz que define el comportamiento común de las estrategias de descuento.
 * Las clases que implementen esta interfaz deben proporcionar la lógica para aplicar un descuento sobre un precio.
 */
public interface DiscountStrategy {
    /**
     * Aplica un descuento al precio proporcionado.
     *
     * @param price El precio original del producto o servicio.
     * @return El precio después de aplicar el descuento.
     */
    double applyDiscount(double price);
}
