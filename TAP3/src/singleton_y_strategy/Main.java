package singleton_y_strategy;

/**
 * El patrón Singleton garantiza que una clase tenga una única instancia a lo largo de la
 * ejecución del programa. En este caso, PricingContext asegura que siempre se use la misma
 * instancia para gestionar la estrategia de precios, lo que permite un control centralizado y eficiente.
 * <p>
 * El patrón Strategy permite definir diferentes algoritmos (en este caso, estrategias de precios)
 * y cambiarlos dinámicamente sin modificar el código cliente. Las estrategias (NormalPricingStrategy,
 * DiscountPricingStrategy, SeasonalPricingStrategy) implementan el cálculo del precio de manera diferente,
 * y el contexto (PricingContext) puede cambiarlas en tiempo real según las necesidades.
 */
public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de PricingContext (Singleton)
        PricingContext pricingContext = PricingContext.getInstance();

        // Precio base
        double basePrice = 100.0;

        // Usar la estrategia de precios normal
        System.out.println("Precio con estrategia normal: " + pricingContext.calculatePrice(basePrice));

        // Cambiar a estrategia con descuento
        pricingContext.setPricingStrategy(new DiscountPricingStrategy());
        System.out.println("Precio con descuento: " + pricingContext.calculatePrice(basePrice));

        // Cambiar a estrategia de temporada
        pricingContext.setPricingStrategy(new SeasonalPricingStrategy());
        System.out.println("Precio con descuento de temporada: " + pricingContext.calculatePrice(basePrice));

        // Verificar que la instancia es única
        PricingContext anotherPricingContext = PricingContext.getInstance();
        System.out.println("Las instancias de PricingContext son iguales: " + (pricingContext == anotherPricingContext));
    }
}
