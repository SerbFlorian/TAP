package singleton_y_strategy;

/**
 * Estrategia de Precio Normal que devuelve el precio original sin aplicar ningún descuento.
 * Esta clase implementa la interfaz PricingStrategy y proporciona la lógica para
 * calcular el precio sin modificar el valor original.
 */
public class NormalPricingStrategy implements PricingStrategy {
    /**
     * Calcula el precio sin aplicar ningún descuento.
     *
     * @param price El precio original del producto.
     * @return El precio original sin modificaciones.
     */
    @Override
    public double calculatePrice(double price) {
        return price; // Precio sin modificaciones (sin descuento)
    }
}
