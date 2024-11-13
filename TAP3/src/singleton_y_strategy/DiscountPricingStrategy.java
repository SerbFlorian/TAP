package singleton_y_strategy;

/**
 * Estrategia de Precio con Descuento que aplica un descuento del 20% al precio original.
 * Esta clase implementa la interfaz PricingStrategy y proporciona una lógica específica
 * para calcular el precio con base en un descuento fijo.
 */
public class DiscountPricingStrategy implements PricingStrategy {
    /**
     * Calcula el precio con un descuento del 20%.
     *
     * @param price El precio original del producto.
     * @return El precio con el descuento aplicado.
     */
    @Override
    public double calculatePrice(double price) {
        return price * 0.8; // Descuento del 20%
    }
}
