package factory; // Paquete donde se encuentra la clase
/**
 * Clase concreta que implementa la interfaz AbstractCar.
 * Esta clase representa un coche español, donde el conductor se encuentra en el lado izquierdo del vehículo.
 * Implementa el método {@link AbstractCar#getDriverSide()} para devolver el lado del conductor.
 */
public class SpanishCar implements AbstractCar {
    /**
     * Método que retorna el lado en el que se encuentra el conductor en un coche español.
     * En España, los coches tienen el volante en el lado izquierdo.
     *
     * @return Un String que indica el lado del conductor, en este caso "left".
     */
    public String getDriverSide() {
        return "left"; // En coches españoles el conductor se encuentra a la izquierda
    }
}
