package factoryAbstract;

/**
 * Implementación concreta de AbstractCar para coches españoles.
 * Representa un coche en el que el conductor se sienta en el lado izquierdo, típico en España.
 */
public class SpanishCar implements AbstractCar {
    /**
     * Devuelve el lado del conductor para un coche español.
     *
     * @return "left", indicando que el volante está en el lado izquierdo.
     */
    @Override
    public String getDriverSide() {
        return "left"; // En coches españoles, el volante está a la izquierda
    }
}
