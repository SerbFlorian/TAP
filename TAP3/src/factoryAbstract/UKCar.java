package factoryAbstract; // Paquete donde se encuentra la clase


/**
 * Implementación concreta de AbstractCar para coches del Reino Unido.
 */
public class UKCar implements AbstractCar {
    @Override
    public String getDriverSide() {
        return "right"; // En coches del Reino Unido, el volante está a la derecha
    }
}
