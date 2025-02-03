package singleton_y_strategy;

/**
 * Interfaz Strategy que define el contrato para las estrategias de precios.
 * Cada implementación de esta interfaz proporcionará una lógica específica
 * para calcular el precio basado en una estrategia determinada.
 */
public interface PricingStrategy {
    /**
     * Calcula el precio final basado en una estrategia específica.
     *
     * @param price El precio original del producto.
     * @return El precio final después de aplicar la estrategia.
     */
    double calculatePrice(double price);
}
