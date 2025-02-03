package factoryAbstract; // Paquete donde se encuentra la clase

/**
 * Fábrica concreta para la creación de productos de coches del Reino Unido.
 * Esta fábrica se encarga de la creación de un coche y su motor, específicamente para el mercado del Reino Unido.
 */
public class UKCarFactory implements AbstractCarFactory {
    /**
     * Crea un coche del Reino Unido.
     *
     * @return Un objeto de tipo AbstractCar, que en este caso es un coche del Reino Unido (UKCar).
     */
    @Override
    public AbstractCar createCar() {
        return new UKCar(); // Retorna un coche con volante a la derecha
    }

    /**
     * Crea un motor para coches del Reino Unido.
     *
     * @return Un objeto de tipo AbstractEngine, que en este caso es un motor específico para el Reino Unido (UKEngine).
     */
    @Override
    public AbstractEngine createEngine() {
        return new UKEngine(); // Retorna un motor adecuado para coches del Reino Unido
    }
}
