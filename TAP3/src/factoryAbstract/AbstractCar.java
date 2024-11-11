package factoryAbstract;

/**
 * Interfaz AbstractCar que define el comportamiento básico para los distintos tipos de coche.
 * Las clases que implementen esta interfaz deberán especificar el lado del conductor (izquierda o derecha),
 * siguiendo las configuraciones regionales de cada tipo de coche.
 */
interface AbstractCar {
    /**
     * Especifica el lado del conductor del coche.
     *
     * @return Un String que indica el lado del conductor: "left" para conducción a la izquierda
     * o "right" para conducción a la derecha.
     */
    String getDriverSide();
}
