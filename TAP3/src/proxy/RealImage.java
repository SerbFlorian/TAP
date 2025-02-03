package proxy;

/**
 * Clase RealImage que implementa la interfaz {@link Image}.
 * Esta clase representa la imagen real que se debe cargar y mostrar.
 *
 * <p>Cuando la clase {@link RealImage} se instancie, se cargará la imagen desde el disco,
 * lo que podría ser una operación costosa, por lo que la clase {@link ProxyImage}
 * actúa como un intermediario para retrasar esta carga.</p>
 *
 * @author Pedro
 * @version 1.0
 */
public class RealImage implements Image {
    // Nombre del archivo de la imagen
    private String fileName;

    /**
     * Constructor que recibe el nombre del archivo de la imagen.
     * Inicia la carga de la imagen desde el disco.
     *
     * @param fileName el nombre del archivo de la imagen
     */
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);  // Cargar la imagen desde el disco
    }

    /**
     * Método que muestra la imagen en pantalla.
     * En este caso, simplemente imprime un mensaje simulando la visualización de la imagen.
     */
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);  // Mostrar la imagen
    }

    /**
     * Método privado que simula la carga de la imagen desde el disco.
     * En una implementación real, aquí se cargaría la imagen del archivo.
     *
     * @param fileName el nombre del archivo de la imagen a cargar
     */
    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);  // Simular la carga de la imagen
    }
}
