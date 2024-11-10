package composite;

/**
 * Clase que representa un archivo en el patrón Composite. Un archivo es un componente
 * individual que tiene un nombre y un tamaño. Implementa la interfaz {@link AComponent},
 * lo que le permite ser tratado de manera uniforme junto con otros componentes (como directorios).
 */
public class File implements AComponent {

    private String name;  // Nombre del archivo
    private int size;     // Tamaño del archivo en unidades arbitarias

    /**
     * Constructor que inicializa un archivo con un nombre y un tamaño específicos.
     *
     * @param name Nombre del archivo.
     * @param size Tamaño del archivo.
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Obtiene el nombre del archivo.
     *
     * @return El nombre del archivo.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece un nuevo nombre para el archivo.
     *
     * @param name El nuevo nombre para el archivo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el tamaño del archivo.
     *
     * @return El tamaño del archivo.
     */
    public int getSize() {
        return size;
    }

    /**
     * Establece un nuevo tamaño para el archivo.
     *
     * @param size El nuevo tamaño del archivo.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Devuelve el tamaño del archivo. Implementa el método de la interfaz {@link AComponent}.
     *
     * @return El tamaño del archivo.
     */
    public int size() {
        return size;  // El tamaño del archivo es simplemente su tamaño propio
    }
}
