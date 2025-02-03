package composite_y_Iterator;

import java.util.Collections;
import java.util.Iterator;

/**
 * Clase que representa un archivo dentro de la estructura de componentes.
 * Esta clase implementa la interfaz Component y no tiene hijos (hoja del árbol).
 * Es utilizada dentro del patrón Composite para representar un archivo en una
 * estructura jerárquica de componentes.
 */
class File implements Component {
    private final String name; // Nombre del archivo

    /**
     * Constructor de la clase File.
     *
     * @param name El nombre del archivo.
     */
    public File(String name) {
        this.name = name; // Inicializa el nombre del archivo
    }

    /**
     * Obtiene el nombre del archivo.
     *
     * @return El nombre del archivo.
     */
    @Override
    public String getName() {
        return name; // Devuelve el nombre del archivo
    }

    /**
     * Imprime información sobre el archivo.
     * Este método muestra el nombre del archivo en consola.
     */
    @Override
    public void print() {
        System.out.println("File: " + name); // Imprime el nombre del archivo
    }

    /**
     * Crea un iterador para los componentes hijos.
     * Dado que un archivo no tiene hijos, devuelve un iterador vacío.
     *
     * @return Un iterador vacío, ya que no hay componentes hijos.
     */
    @Override
    public Iterator<Component> createIterator() {
        return Collections.emptyIterator(); // No tiene hijos, devuelve un iterador vacío
    }
}
