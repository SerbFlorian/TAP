package iterator_y_visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que representa una carpeta en el sistema de archivos.
 * Implementa tanto la interfaz Component como Iterable para permitir la iteración sobre sus elementos.
 */
class Folder implements Component, Iterable<Component> {
    private final String name;
    private final List<Component> components = new ArrayList<>();

    /**
     * Constructor que inicializa la carpeta con un nombre.
     *
     * @param name El nombre de la carpeta.
     */
    public Folder(String name) {
        this.name = name;
    }

    /**
     * Agrega un componente a la carpeta. Puede ser otro archivo o una subcarpeta.
     *
     * @param component El componente a agregar (archivo o subcarpeta).
     */
    public void add(Component component) {
        components.add(component); // Agrega un archivo o una subcarpeta a la carpeta
    }

    /**
     * Obtiene el nombre de la carpeta.
     *
     * @return El nombre de la carpeta.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Acepta un visitante y le permite visitar esta carpeta.
     * Luego, permite que el visitante recorra todos los elementos dentro de la carpeta.
     *
     * @param visitor El visitante que se va a aceptar.
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFolder(this); // El visitante visita la carpeta
        for (Component component : components) {
            component.accept(visitor); // El visitante recorre cada componente dentro de la carpeta
        }
    }

    /**
     * Devuelve un iterador para recorrer todos los componentes dentro de la carpeta.
     *
     * @return El iterador de componentes.
     */
    @Override
    public Iterator<Component> iterator() {
        return components.iterator(); // Devuelve el iterador para recorrer la lista de componentes
    }
}
