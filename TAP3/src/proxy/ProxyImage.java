package proxy;

/**
 * Clase Proxy que implementa la interfaz {@link Image}.
 * Esta clase actúa como un intermediario entre el cliente y la imagen real.
 * Utiliza el patrón Proxy para controlar el acceso a una imagen real.
 *
 * <p>El propósito de la clase Proxy es retrasar la carga de la imagen real hasta que sea necesaria
 * y delegar la operación de mostrar la imagen a la clase {@link RealImage} cuando se requiere.</p>
 *
 * @author Pedro
 * @version 1.0
 */
public class ProxyImage implements Image {
    // Instancia de la imagen real, se crea solo cuando se necesita
    private RealImage realImage;

    // Nombre del archivo de la imagen
    private String fileName;

    /**
     * Constructor que recibe el nombre del archivo de la imagen.
     *
     * @param fileName el nombre del archivo de la imagen
     */
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Método que muestra la imagen.
     * Si la imagen real no ha sido cargada, la instancia y la carga antes de mostrarla.
     * <p>
     * Si la imagen real ya ha sido cargada previamente, simplemente la muestra.
     */
    @Override
    public void display() {
        // Si la imagen real aún no ha sido cargada, crearla
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        // Llamar al método display() de la imagen real para mostrarla
        realImage.display();
    }
}
