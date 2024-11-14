package solutions.filesystem2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Representa un directorio en el sistema de archivos, que puede contener otros componentes como archivos o subdirectorios.
 * Implementa la interfaz AComponent y la interfaz Iterable para permitir la iteración sobre los elementos dentro del directorio.
 */
public class Directory implements AComponent, Iterable<AComponent> {
    private String name;
    private List<AComponent> children; // Lista de componentes hijos (archivos o subdirectorios)
    private AComponent parent = null; // El directorio padre, si existe

    /**
     * Constructor de la clase Directory. Inicializa el nombre del directorio y la lista de hijos.
     *
     * @param name El nombre del directorio.
     */
    public Directory(String name) {
        this.name = name;
        children = new LinkedList<AComponent>(); // Inicializa la lista de hijos
    }

    /**
     * Añade un componente hijo al directorio.
     * Lanza una excepción si el componente ya existe en la lista de hijos.
     *
     * @param child El componente hijo a añadir.
     * @throws ExistException Si el componente ya existe en el directorio.
     */
    public void addChild(AComponent child) throws ExistException {
        if (children.contains(child)) {
            throw new ExistException(); // Lanza excepción si el hijo ya existe
        }
        children.add(child);
        child.setParent(this); // Establece este directorio como padre del hijo
    }

    /**
     * Elimina un componente hijo del directorio.
     *
     * @param child El componente hijo a eliminar.
     */
    public void removeChild(AComponent child) {
        children.remove(child);
    }

    /**
     * Muestra el nombre del directorio y ejecuta ls() recursivamente en los hijos.
     */
    public void ls() {
        System.out.println(name); // Muestra el nombre del directorio
        for (AComponent child : children) {
            child.ls(); // Llama al método ls de cada hijo (recursivo)
        }
    }

    /**
     * Recolecta los nombres de todos los componentes dentro de este directorio y sus hijos.
     *
     * @return Lista con los nombres de todos los componentes.
     */
    public List<String> collect() {
        List<String> result = new LinkedList<String>();
        result.add(name); // Añade el nombre de este directorio
        for (AComponent child : children) {
            result.addAll(child.collect()); // Añade los nombres de los hijos
        }
        return result;
    }

    /**
     * Busca archivos por nombre en este directorio y sus hijos.
     *
     * @param name El nombre del archivo a buscar.
     * @return Lista de archivos que coinciden con el nombre dado.
     */
    public List<File> search(String name) {
        List<File> result = new LinkedList<File>();
        for (AComponent child : children) {
            result.addAll(child.search(name)); // Busca recursivamente en los hijos
        }
        return result;
    }

    /**
     * Establece el directorio padre de este directorio.
     *
     * @param parent El directorio padre.
     */
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    /**
     * Genera la representación del camino (ruta) completo de este directorio, incluyendo su nombre y el de sus padres.
     *
     * @return El camino (ruta) completa del directorio.
     */
    public String toString() {
        String path = "/";
        if (parent != null)
            path = parent.toString() + "/"; // Llama recursivamente al toString del padre
        return path + name; // Devuelve el nombre del directorio con la ruta completa
    }

    /**
     * Convierte este directorio y todos sus hijos en una lista plana de componentes.
     *
     * @return Lista con este directorio y sus componentes hijos.
     */
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(this); // Añade el directorio actual
        for (AComponent child : children) {
            result.addAll(child.toList()); // Añade todos los hijos de manera recursiva
        }
        return result;
    }

    /**
     * Calcula el tamaño total de este directorio, sumando el tamaño de sus componentes hijos.
     *
     * @return El tamaño total del directorio y sus hijos.
     */
    public int size() {
        int result = 0;
        for (AComponent child : children) {
            result += child.size(); // Suma el tamaño de cada hijo
        }
        return result;
    }

    /**
     * Implementa la interfaz Iterable para permitir la iteración sobre los componentes del directorio.
     *
     * @return Un iterador para recorrer los componentes del directorio.
     */
    public Iterator<AComponent> iterator() {
        return this.toList().iterator(); // Devuelve un iterador sobre la lista de componentes
    }

    /**
     * Obtiene el nombre de este directorio.
     *
     * @return El nombre del directorio.
     */
    public String getName() {
        return name;
    }
}
