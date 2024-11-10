package solutions.filesystem2;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa un archivo dentro del sistema de archivos.
 * Implementa la interfaz AComponent y tiene atributos como el nombre
 * y tamaño del archivo.
 */
public class File implements AComponent {

    private String name;
    private int size;
    private AComponent parent;

    /**
     * Constructor de la clase File.
     *
     * @param name El nombre del archivo.
     * @param size El tamaño del archivo.
     */
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Muestra el nombre del archivo.
     */
    public void ls() {
        System.out.println(name);
    }

    /**
     * Recolecta el nombre del archivo en una lista.
     *
     * @return Una lista con el nombre del archivo.
     */
    public List<String> collect() {
        List<String> result = new LinkedList<>();
        result.add(name);
        return result;
    }

    /**
     * Realiza una búsqueda del archivo por nombre.
     *
     * @param name El nombre a buscar.
     * @return Una lista con el archivo encontrado si el nombre coincide.
     */
    public List<File> search(String name) {
        List<File> result = new LinkedList<>();
        if (this.name.equals(name)) {
            result.add(this);
        }
        return result;
    }

    /**
     * Establece el componente padre del archivo.
     *
     * @param parent El componente padre que contiene el archivo.
     */
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    /**
     * Devuelve la ruta del archivo, construida a partir de su
     * componente padre y su propio nombre.
     *
     * @return La ruta completa del archivo.
     */
    public String toString() {
        String path = "/";
        if (parent != null) {
            path = parent.toString() + "/";
        }
        return path + name;
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
     * Establece el nombre del archivo.
     *
     * @param name El nuevo nombre del archivo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Convierte el archivo en una lista que contiene solo al archivo mismo.
     *
     * @return Una lista con el archivo.
     */
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<>();
        result.add(this);
        return result;
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
     * Establece el tamaño del archivo.
     *
     * @param size El nuevo tamaño del archivo.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Obtiene el tamaño del archivo. Este es un método de la interfaz AComponent.
     *
     * @return El tamaño del archivo.
     */
    public int size() {
        return size;
    }
}
