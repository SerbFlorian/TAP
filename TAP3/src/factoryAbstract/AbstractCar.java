package factoryAbstract;

/**
 * Interfaz AbstractCar que define el comportamiento básico para los distintos tipos de coche.
 */
interface AbstractCar {
    /**
     * Especifica el lado del conductor.
     *
     * @return Un String que indica el lado del conductor ("left" o "right").
     */
    String getDriverSide();
}
