package factoryAbstract; // Paquete donde se encuentra la clase

/**
 * Implementación concreta de AbstractCar para coches del Reino Unido.
 * Representa un coche diseñado para el mercado del Reino Unido, donde el volante está ubicado a la derecha.
 */
public class UKCar implements AbstractCar {
    /**
     * Devuelve el lado del conductor en un coche del Reino Unido.
     *
     * @return "right", indicando que el volante está en el lado derecho del coche.
     */
    @Override
    public String getDriverSide() {
        return "right"; // En coches del Reino Unido, el volante está a la derecha
    }
}
