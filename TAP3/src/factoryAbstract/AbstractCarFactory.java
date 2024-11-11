package factoryAbstract;

/**
 * Interfaz AbstractCarFactory que define el contrato para la creación de familias de productos de coches.
 */
interface AbstractCarFactory {
    /**
     * Método para crear un coche.
     *
     * @return Un objeto AbstractCar.
     */
    AbstractCar createCar();

    /**
     * Método para crear un motor.
     *
     * @return Un objeto AbstractEngine.
     */
    AbstractEngine createEngine();
}
