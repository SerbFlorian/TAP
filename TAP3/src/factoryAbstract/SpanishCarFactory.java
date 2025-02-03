package factoryAbstract;

/**
 * Fábrica concreta para la creación de productos de coches españoles.
 * Implementa la interfaz {@link AbstractCarFactory} para producir coches y motores específicos para el mercado español.
 */
public class SpanishCarFactory implements AbstractCarFactory {
    /**
     * Crea un coche español.
     *
     * @return Una instancia de {@link SpanishCar}, que representa un coche con el volante a la izquierda.
     */
    @Override
    public AbstractCar createCar() {
        return new SpanishCar();
    }

    /**
     * Crea un motor español.
     *
     * @return Una instancia de {@link SpanishEngine}, que representa un motor adecuado para el mercado español.
     */
    @Override
    public AbstractEngine createEngine() {
        return new SpanishEngine();
    }
}
