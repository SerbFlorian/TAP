package singleton_y_strategy;

/**
 * Estrategia de Precio de Temporada que aplica un descuento del 10% al precio original.
 * Esta clase implementa la interfaz PricingStrategy y proporciona una lógica específica
 * para calcular el precio con base en una oferta de temporada.
 */
public class SeasonalPricingStrategy implements PricingStrategy {
    /**
     * Calcula el precio con un descuento del 10% para la temporada.
     *
     * @param price El precio original del producto.
     * @return El precio con el descuento aplicado.
     */
    @Override
    public double calculatePrice(double price) {
        return price * 0.9; // Descuento de temporada del 10%
    }
}
