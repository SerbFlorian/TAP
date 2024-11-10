package composite;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa un directorio en el patrón Composite. Un directorio puede contener
 * otros componentes, como archivos o subdirectorios. Implementa la interfaz {@link AComponent}
 * para que pueda ser tratado de manera uniforme con otros componentes.
 */
public class Directory implements AComponent {

    private String name;  // Nombre del directorio
    private List<AComponent> children;  // Lista de componentes hijos del directorio

    /**
     * Constructor que inicializa un directorio con un nombre específico.
     *
     * @param name Nombre del directorio.
     */
    public Directory(String name) {
        this.name = name;
        children = new LinkedList<AComponent>();  // Inicializa la lista de hijos
    }

    /**
     * Agrega un componente hijo (archivo o subdirectorio) al directorio.
     *
     * @param child Componente que se va a añadir al directorio.
     */
    public void addChild(AComponent child) {
        children.add(child);  // Añade el hijo a la lista de hijos
    }

    /**
     * Elimina un componente hijo del directorio.
     *
     * @param child Componente que se va a eliminar del directorio.
     */
    public void removeChild(AComponent child) {
        children.remove(child);  // Elimina el hijo de la lista
    }

    /**
     * Calcula el tamaño del directorio. El tamaño de un directorio es la suma de los tamaños
     * de sus componentes hijos. Si el directorio contiene otros subdirectorios, también se
     * sumará el tamaño de esos subdirectorios recursivamente.
     *
     * @return El tamaño total del directorio, que es la suma de los tamaños de sus hijos.
     */
    public int size() {
        int result = 0;
        // Recorre todos los hijos del directorio y suma su tamaño
        for (AComponent child : children) {
            result = result + child.size();
        }
        return result;  // Devuelve el tamaño total
    }
}
