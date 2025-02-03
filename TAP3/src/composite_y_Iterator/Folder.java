package composite_y_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que representa una carpeta dentro de la estructura de componentes.
 * Esta clase implementa la interfaz Component y es utilizada dentro del patrón
 * Composite para representar una carpeta que puede contener otros componentes (archivos o carpetas).
 * Los componentes de tipo Folder pueden contener tanto hojas (como File) como otros composites (otras carpetas).
 */
class Folder implements Component {
    private final String name; // Nombre de la carpeta
    private final List<Component> components = new ArrayList<>(); // Lista de componentes hijos

    /**
     * Constructor de la clase Folder.
     *
     * @param name El nombre de la carpeta.
     */
    public Folder(String name) {
        this.name = name; // Inicializa el nombre de la carpeta
    }

    /**
     * Agrega un componente hijo a la carpeta.
     * Un componente puede ser un archivo (File) o una subcarpeta (Folder).
     *
     * @param component El componente que se desea agregar (puede ser un archivo o una subcarpeta).
     */
    public void add(Component component) {
        components.add(component); // Añade el componente a la lista de hijos
    }

    /**
     * Obtiene el nombre de la carpeta.
     *
     * @return El nombre de la carpeta.
     */
    @Override
    public String getName() {
        return name; // Devuelve el nombre de la carpeta
    }

    /**
     * Imprime información sobre la carpeta y sus componentes hijos.
     * Este método imprime el nombre de la carpeta y luego recurre a los componentes hijos para imprimirlos.
     */
    @Override
    public void print() {
        System.out.println("Folder: " + name); // Imprime el nombre de la carpeta
        for (Component component : components) {
            component.print(); // Imprime los componentes hijos (archivos o subcarpetas)
        }
    }

    /**
     * Crea un iterador para los componentes hijos de la carpeta.
     *
     * @return Un iterador que recorre todos los componentes hijos de la carpeta.
     */
    @Override
    public Iterator<Component> createIterator() {
        return new CompositeIterator(components.iterator()); // Devuelve un iterador que recorre los hijos
    }
}
