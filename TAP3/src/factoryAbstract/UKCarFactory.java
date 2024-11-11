package factoryAbstract;

/**
 * Fábrica concreta para la creación de productos de coches del Reino Unido.
 */
public class UKCarFactory implements AbstractCarFactory {
    @Override
    public AbstractCar createCar() {
        return new UKCar();
    }

    @Override
    public AbstractEngine createEngine() {
        return new UKEngine();
    }
}
