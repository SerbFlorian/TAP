package factory; // Paquete donde se encuentra la clase

/**
 * Interfaz AbstractCar que define el comportamiento básico para los distintos tipos de coche.
 * Se utiliza una interfaz en lugar de una clase abstracta porque en este ejemplo no se necesitan
 * atributos ni métodos ya implementados, solo un contrato que las clases concretas deben seguir.
 * Las clases que implementen esta interfaz deberán proporcionar una implementación del método
 * {@link #getDriverSide()} para indicar el lado del conductor del coche.
 */
interface AbstractCar {
    /**
     * Método que debe ser implementado por las clases concretas para especificar
     * el lado del conductor del coche.
     *
     * @return Un String que indica si el coche es de conducción a la izquierda (LHD)
     * o a la derecha (RHD).
     */
    String getDriverSide();
}
