package singleton_y_strategy;

/**
 * Clase que gestiona la estrategia de precios utilizando el patrón Singleton.
 * Permite cambiar la estrategia de precios en tiempo de ejecución y calcular
 * el precio final según la estrategia actual.
 */
public class PricingContext {
    // Instancia única de la clase (Singleton)
    private static PricingContext instance;

    // Estrategia actual de precios
    private PricingStrategy pricingStrategy;

    /**
     * Constructor privado para evitar la creación de múltiples instancias.
     * Inicializa la estrategia de precios con la estrategia normal por defecto.
     */
    private PricingContext() {
        // Inicializamos con la estrategia normal por defecto
        pricingStrategy = new NormalPricingStrategy();
    }

    /**
     * Método para obtener la instancia única de la clase (Singleton).
     *
     * @return La instancia única de PricingContext.
     */
    public static PricingContext getInstance() {
        if (instance == null) {
            instance = new PricingContext();
        }
        return instance;
    }

    /**
     * Método para cambiar la estrategia de precios.
     *
     * @param pricingStrategy La nueva estrategia de precios a usar.
     */
    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    /**
     * Método para calcular el precio utilizando la estrategia de precios actual.
     *
     * @param price El precio original del producto.
     * @return El precio calculado con la estrategia actual.
     */
    public double calculatePrice(double price) {
        return pricingStrategy.calculatePrice(price);
    }
}
