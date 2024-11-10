package solutions.filesystem;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase File representa un archivo dentro de un sistema de archivos.
 * Los archivos son componentes que pueden ser almacenados dentro de un directorio.
 * Implementa la interfaz AComponent para que pueda ser tratada de manera uniforme con otros componentes del sistema de archivos.
 *
 * @version 1.0
 */
public class File implements AComponent {

    // Nombre del archivo
    private String name;

    // Tamaño del archivo
    private int size;

    // Componente padre de este archivo (usualmente un directorio)
    private AComponent parent;

    /**
     * Constructor para crear un archivo con nombre y tamaño.
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
     * Este método es común para todos los componentes, incluso los archivos y directorios.
     */
    public void ls() {
        System.out.println(name);  // Mostrar solo el nombre del archivo
    }

    /**
     * Recoge el nombre del archivo en una lista.
     *
     * @return Una lista que contiene el nombre del archivo.
     */
    public List<String> collect() {
        List<String> result = new LinkedList<String>();
        result.add(name);  // Añadir el nombre del archivo a la lista
        return result;
    }

    /**
     * Busca archivos que coincidan con el nombre dado.
     *
     * @param name El nombre que se busca en los archivos.
     * @return Una lista de archivos que coinciden con el nombre dado.
     */
    public List<File> search(String name) {
        List<File> result = new LinkedList<File>();
        if (this.name.equals(name)) {
            result.add(this);  // Si el nombre del archivo coincide, añadirlo a la lista
        }
        return result;
    }

    /**
     * Establece el componente padre de este archivo (generalmente un directorio).
     *
     * @param parent El componente que será el padre de este archivo.
     */
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    /**
     * Devuelve el camino absoluto del archivo desde la raíz.
     * Si el archivo tiene un padre, añade su nombre al camino.
     *
     * @return El camino absoluto del archivo.
     */
    public String toString() {
        String path = "/";
        if (parent != null) {
            path = parent.toString() + "/";  // Llamada recursiva para añadir el nombre del directorio padre
        }
        return path + name;  // Añadir el nombre del archivo al camino
    }

    /**
     * Devuelve el nombre del archivo.
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
     * Convierte este archivo en una lista de componentes.
     * En este caso, la lista contendrá solo este archivo.
     *
     * @return Una lista con este archivo.
     */
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(this);  // Añadir el archivo a la lista
        return result;
    }

    /**
     * Devuelve el tamaño del archivo.
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
     * Devuelve el tamaño del archivo. Este método se utiliza en la clase Directory
     * para calcular el tamaño total de un directorio, sumando el tamaño de sus archivos.
     *
     * @return El tamaño del archivo.
     */
    public int size() {
        return size;  // El tamaño del archivo es el tamaño dado al constructor
    }
}
