package factoryAbstract;

/**
 * Interfaz AbstractEngine que define el comportamiento básico de un motor de coche.
 * Las clases que implementen esta interfaz deberán especificar el tipo de combustible
 * utilizado por el motor, permitiendo variar entre tipos de motor sin modificar el código del cliente.
 */
interface AbstractEngine {
    /**
     * Devuelve el tipo de combustible que utiliza el motor.
     *
     * @return Un String que indica el tipo de combustible, como "gasolina" o "diesel".
     */
    String getFuelType();
}
