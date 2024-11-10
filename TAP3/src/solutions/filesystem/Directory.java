package solutions.filesystem;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase Directory representa un directorio dentro de un sistema de archivos.
 * Los directorios pueden contener otros archivos o directorios como hijos.
 * Implementa la interfaz AComponent para ser tratado de manera uniforme con otros tipos de componentes del sistema de archivos.
 * <p>
 * Esta clase utiliza el patrón Composite para permitir la manipulación recursiva de archivos y directorios.
 *
 * @version 1.0
 */
public class Directory implements AComponent {

    // Nombre del directorio
    private String name;

    // Lista de componentes hijos (archivos o subdirectorios)
    private List<AComponent> children;

    // Componente padre del directorio (puede ser otro directorio o null si no tiene)
    private AComponent parent = null;

    /**
     * Constructor para crear un directorio con un nombre dado.
     * Inicializa la lista de hijos como un LinkedList.
     *
     * @param name El nombre del directorio.
     */
    public Directory(String name) {
        this.name = name;
        children = new LinkedList<AComponent>();  // Inicialización de la lista de hijos
    }

    /**
     * Añade un hijo al directorio.
     * Establece este directorio como el padre del hijo.
     *
     * @param child El componente hijo a añadir (puede ser un archivo o subdirectorio).
     */
    public void addChild(AComponent child) {
        children.add(child);
        child.setParent(this);  // Establecer este directorio como el padre del hijo
    }

    /**
     * Elimina un hijo del directorio.
     *
     * @param child El componente hijo a eliminar.
     */
    public void removeChild(AComponent child) {
        children.remove(child);
    }

    /**
     * Muestra el nombre del directorio y luego muestra el contenido de todos sus hijos.
     * Si es un directorio, recursivamente muestra el contenido de sus subdirectorios.
     */
    public void ls() {
        System.out.println(name);
        for (AComponent child : children) {
            child.ls();  // Llamada recursiva para mostrar el contenido de los hijos
        }
    }

    /**
     * Recoge el nombre del directorio y el de todos sus componentes hijos.
     *
     * @return Una lista de nombres de todos los componentes (archivos y subdirectorios) dentro de este directorio.
     */
    public List<String> collect() {
        List<String> result = new LinkedList<String>();
        result.add(name);  // Añadir el nombre del directorio
        for (AComponent child : children) {
            result.addAll(child.collect());  // Añadir los nombres de los hijos
        }
        return result;
    }

    /**
     * Busca archivos que coincidan con el nombre dado dentro del directorio y sus hijos.
     *
     * @param name El nombre del archivo o subdirectorio que se busca.
     * @return Una lista de archivos que coinciden con el nombre dado.
     */
    public List<File> search(String name) {
        List<File> result = new LinkedList<File>();
        for (AComponent child : children) {
            result.addAll(child.search(name));  // Llamada recursiva para buscar en los hijos
        }
        return result;
    }

    /**
     * Establece el directorio padre de este directorio.
     *
     * @param parent El directorio que será el padre de este directorio.
     */
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    /**
     * Devuelve una representación en cadena del camino absoluto desde la raíz hasta este directorio.
     *
     * @return El camino absoluto del directorio.
     */
    public String toString() {
        String path = "/";
        if (parent != null) {
            path = parent.toString() + "/";  // Llamada recursiva para añadir el nombre del directorio padre
        }
        return path + name;  // Añadir el nombre del directorio actual
    }

    /**
     * Convierte este directorio y sus hijos en una lista de componentes.
     *
     * @return Una lista con este directorio y todos sus hijos.
     */
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(this);  // Añadir este directorio a la lista
        for (AComponent child : children) {
            result.addAll(child.toList());  // Llamada recursiva para convertir los hijos en lista
        }
        return result;
    }

    /**
     * Calcula el tamaño total de este directorio, que es la suma del tamaño de todos sus hijos.
     * El tamaño puede ser el número de componentes dentro del directorio o el tamaño de los archivos contenidos.
     *
     * @return El tamaño total del directorio.
     */
    public int size() {
        int result = 0;
        for (AComponent child : children) {
            result = result + child.size();  // Sumar el tamaño de los hijos
        }
        return result;
    }
}
