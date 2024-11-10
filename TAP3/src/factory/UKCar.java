package factory; // Paquete donde se encuentra la clase

/**
 * Implementación concreta de un coche del Reino Unido.
 * Esta clase implementa la interfaz {@link AbstractCar} y proporciona la información
 * sobre el lado del conductor en los coches del Reino Unido.
 */
public class UKCar implements AbstractCar {
    /**
     * Método que devuelve el lado del conductor para un coche del Reino Unido.
     * Según la normativa de tráfico del Reino Unido, el conductor se encuentra en el lado derecho.
     *
     * @return Un {@link String} que indica que el conductor se encuentra en el lado "right".
     */
    public String getDriverSide() {
        return "right"; // El conductor se encuentra en el lado derecho en los coches del Reino Unido
    }
}
