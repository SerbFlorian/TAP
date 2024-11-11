package factoryAbstract;

/**
 * Interfaz AbstractCarFactory que define el contrato para la creación de familias de productos de coches.
 * Esta fábrica abstracta permite la creación de diferentes componentes de coches, como el coche en sí
 * y el motor, asegurando que todas las implementaciones concretas sigan el mismo contrato.
 */
interface AbstractCarFactory {
    /**
     * Crea una instancia de un coche específico.
     *
     * @return Un objeto de tipo AbstractCar que representa el coche creado.
     */
    AbstractCar createCar();

    /**
     * Crea una instancia de un motor específico para el coche.
     *
     * @return Un objeto de tipo AbstractEngine que representa el motor creado.
     */
    AbstractEngine createEngine();
}
