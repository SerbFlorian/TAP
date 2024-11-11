package factoryAbstract;

/**
 * Interfaz AbstractEngine que define el comportamiento básico de un motor de coche.
 */
interface AbstractEngine {
    /**
     * Método que devuelve el tipo de combustible que utiliza el motor.
     *
     * @return Un String que indica el tipo de combustible ("gasolina" o "diesel").
     */
    String getFuelType();
}
