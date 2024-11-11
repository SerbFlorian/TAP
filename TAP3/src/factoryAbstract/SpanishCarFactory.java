package factoryAbstract;

/**
 * Fábrica concreta para la creación de productos de coches españoles.
 */
public class SpanishCarFactory implements AbstractCarFactory {
    @Override
    public AbstractCar createCar() {
        return new SpanishCar();
    }

    @Override
    public AbstractEngine createEngine() {
        return new SpanishEngine();
    }
}
