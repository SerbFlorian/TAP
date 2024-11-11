package factoryAbstract;

/**
 * Implementación concreta de AbstractCar para coches españoles.
 */
public class SpanishCar implements AbstractCar {
    @Override
    public String getDriverSide() {
        return "left"; // En coches españoles, el volante está a la izquierda
    }
}
