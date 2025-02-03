package composite_y_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una carpeta en la estructura de componentes.
 * Una carpeta puede contener otros componentes (archivos o subcarpetas).
 * Implementa la interfaz Component y permite aceptar visitantes para realizar operaciones.
 */
class Folder implements Component {
    private final String name; // Nombre de la carpeta
    private final List<Component> components = new ArrayList<>(); // Lista de componentes contenidos en la carpeta

    /**
     * Constructor de la clase Folder.
     * @param name Nombre de la carpeta.
     */
    public Folder(String name) {
        this.name = name;
    }

    /**
     * Agrega un componente (archivo o subcarpeta) a la carpeta.
     * @param component El componente que se agregará a la carpeta.
     */
    public void add(Component component) {
        components.add(component);
    }

    /**
     * Obtiene la lista de componentes (archivos y carpetas) contenidos en la carpeta.
     * @return Lista de componentes dentro de la carpeta.
     */
    public List<Component> getComponents() {
        return components;
    }

    /**
     * Obtiene el nombre de la carpeta.
     * @return El nombre de la carpeta.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Acepta un visitante que realizará una operación sobre la carpeta y sus componentes.
     * El visitante visita primero la carpeta y luego todos los componentes contenidos.
     * @param visitor El visitante que realizará la operación.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFolder(this); // El visitante visita la carpeta
        for (Component component : components) {
            component.accept(visitor); // El visitante visita cada componente hijo
        }
    }
}
