package proxy;

/**
 * <a href="http://www.tutorialspoint.com/design_pattern/proxy_pattern.htm" \>
 * Clase principal que simula el uso del patrón Proxy con la interfaz {@link Image}.
 * En este caso, el patrón Proxy se utiliza para retrasar la carga de la imagen desde el disco,
 * usando la clase {@link ProxyImage} como intermediario que solo carga la imagen cuando es necesario.
 *
 * <p>Este patrón permite, entre otras cosas, optimizar el uso de recursos al evitar operaciones costosas
 * como la carga de archivos de gran tamaño si no es necesario.</p>
 *
 * <p>En este ejemplo, se crea una instancia de {@link ProxyImage}, que actúa como proxy de una imagen real.</p>
 *
 * @author Pedro
 * @version 1.0
 */
public class Main {
    // CONTRACTE -> IMAGE
    // ASSIGNACIO POLIMORFICA -> new ProxyImage(), ja que es on espero la classe pare i li assigno la filla
    // DYNAMIC BIDING -> .display(), ja que crida el de image i me permet fer POLIMORFISME D'HERENCIA

    /**
     * Método principal donde se demuestra el uso del patrón Proxy para el manejo de imágenes.
     * El ProxyImage simula la carga de una imagen desde el disco solo cuando es necesario.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo)
     */
    public static void main(String[] args) {
        // Se crea una instancia de ProxyImage, que actúa como un proxy de la imagen real
        Image image = new ProxyImage("test_10mb.jpg");

        // La imagen será cargada desde el disco por primera vez
        image.display();
        //System.out.println("");

        // La imagen NO será cargada desde el disco, ya que el proxy la carga solo una vez
        image.display();
    }
}