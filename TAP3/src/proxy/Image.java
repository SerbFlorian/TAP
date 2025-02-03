package proxy;

/**
 * Interfaz que define el contrato para la visualización de imágenes.
 * El patrón Proxy utiliza esta interfaz para representar tanto las imágenes reales como las imágenes proxy.
 * La interfaz contiene el método {@code display()} que debe ser implementado por las clases que muestran imágenes.
 *
 * <p>El propósito de esta interfaz es permitir que el proxy controle el acceso a la imagen real sin cambiar su comportamiento.</p>
 *
 * @author Pedro
 * @version 1.0
 */
public interface Image {
    /**
     * Método que debe ser implementado por las clases que muestran la imagen.
     * Este método es llamado para mostrar la imagen en la interfaz de usuario.
     */
    void display();
}
