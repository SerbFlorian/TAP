package solutions.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa un directorio dentro de un sistema jerárquico de componentes.
 * Un directorio puede contener otros componentes, como archivos o subdirectorios.
 */
public class Directory implements AComponent {
    // Nombre del directorio
    private String name;

    // Lista de componentes hijos (archivos o subdirectorios)
    private List<AComponent> children;

    // Componente padre en la jerarquía
    private AComponent parent = null;

    /**
     * Constructor que inicializa un directorio con un nombre específico.
     *
     * @param name el nombre del directorio.
     */
    public Directory(String name) {
        this.name = name;
        children = new LinkedList<AComponent>();
    }

    /**
     * Añade un componente hijo (archivo o subdirectorio) al directorio.
     * También establece el directorio como su componente padre.
     *
     * @param child el componente hijo que se desea agregar al directorio.
     */
    public void addChild(AComponent child) {
        children.add(child);
        child.setParent(this);
    }

    /**
     * Elimina un componente hijo del directorio.
     *
     * @param child el componente hijo que se desea eliminar.
     */
    public void removeChild(AComponent child) {
        children.remove(child);
    }

    /**
     * Muestra el nombre del directorio y llama a ls() en cada uno de los hijos
     * para que también se muestren.
     */
    public void ls() {
        System.out.println(name);
        for (AComponent child : children)
            child.ls();
    }

    /**
     * Establece el componente padre de este directorio.
     *
     * @param parent el componente padre que debe ser asignado a este directorio.
     */
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    /**
     * Devuelve la representación en forma de cadena del directorio, con su ruta completa.
     * La ruta se construye concatenando el nombre de los directorios padres.
     *
     * @return la ruta completa del directorio en forma de cadena.
     */
    public String toString() {
        String path = "/";
        if (parent != null)
            path = parent.toString() + "/";
        return path + name;
    }

    /**
     * Convierte el directorio en una lista de componentes, incluyendo a todos sus hijos
     * y los hijos de esos hijos, recursivamente.
     *
     * @return una lista de componentes que representa al directorio y todos sus descendientes.
     */
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(this);
        for (AComponent child : children)
            result.addAll(child.toList());
        return result;
    }

    /**
     * Obtiene la lista de hijos de este directorio.
     *
     * @return la lista de componentes hijos del directorio.
     */
    public List<AComponent> getChildren() {
        return children;
    }

    /**
     * Permite que un visitante interactúe con este directorio.
     * El patrón de diseño Visitor permite agregar nuevas funcionalidades sin modificar el código
     * de las clases.
     *
     * @param v el visitante que debe interactuar con este directorio.
     */
    public void accept(Visitor v) {
        v.visit(this);
    }
}
