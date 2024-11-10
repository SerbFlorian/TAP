package solutions.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa un archivo dentro de un sistema jerárquico de componentes.
 * Un archivo tiene un nombre, un tamaño, un propietario y se puede agregar a un directorio.
 */
public class File implements AComponent {
    // Nombre del archivo
    private String name;

    // Tamaño del archivo
    private int size;

    // Propietario del archivo
    private String owner;

    // Componente padre (en este caso, un directorio)
    private AComponent parent;

    /**
     * Constructor que inicializa un archivo con un nombre, tamaño y propietario específicos.
     *
     * @param name  el nombre del archivo.
     * @param size  el tamaño del archivo.
     * @param owner el propietario del archivo.
     */
    public File(String name, int size, String owner) {
        this.name = name;
        this.size = size;
        this.owner = owner;
    }

    /**
     * Obtiene el propietario del archivo.
     *
     * @return el propietario del archivo.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Obtiene el tamaño del archivo.
     *
     * @return el tamaño del archivo.
     */
    public int getSize() {
        return size;
    }

    /**
     * Establece el tamaño del archivo.
     *
     * @param size el nuevo tamaño del archivo.
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Establece el componente padre del archivo (un directorio).
     *
     * @param parent el directorio que será el nuevo componente padre del archivo.
     */
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    /**
     * Muestra el nombre del archivo.
     * Este método podría ser extendido para mostrar más detalles si fuera necesario.
     */
    public void ls() {
        System.out.println(name);
    }

    /**
     * Devuelve la representación en forma de cadena del archivo, con su ruta completa.
     * La ruta se construye concatenando el nombre de los directorios padres y el nombre del archivo.
     *
     * @return la ruta completa del archivo en forma de cadena.
     */
    public String toString() {
        String path = parent.toString() + "/";
        return path + name;
    }

    /**
     * Obtiene el nombre del archivo.
     *
     * @return el nombre del archivo.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del archivo.
     *
     * @param name el nuevo nombre del archivo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Convierte el archivo en una lista de componentes.
     * En este caso, la lista solo contiene al archivo en sí.
     *
     * @return una lista que contiene este archivo.
     */
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(this);
        return result;
    }

    /**
     * Permite que un visitante interactúe con este archivo.
     * El patrón de diseño Visitor permite agregar nuevas funcionalidades sin modificar el código
     * de las clases.
     *
     * @param v el visitante que debe interactuar con este archivo.
     */
    public void accept(Visitor v) {
        v.visit(this);
    }
}
