package decorator_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Menu implementa el componente MenuComponent y actúa como un contenedor para otros componentes de menú.
 * Esta clase representa un menú que puede contener otros menús o elementos de menú (que también implementan MenuComponent).
 * Utiliza una lista para gestionar los componentes hijos (submenús o elementos de menú individuales).
 */
class Menu implements MenuComponent {
    private final String name;
    private final List<MenuComponent> components = new ArrayList<>();

    /**
     * Constructor de la clase Menu.
     * @param name El nombre del menú.
     */
    public Menu(String name) {
        this.name = name;
    }

    /**
     * Obtiene el nombre del menú.
     * @return El nombre del menú.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Muestra la información del menú, seguido de la visualización de todos sus componentes hijos.
     */
    @Override
    public void display() {
        System.out.println("Menú: " + name);
        // Recorre y muestra cada componente hijo del menú (ya sea otro menú o un elemento de menú)
        for (MenuComponent component : components) {
            component.display();
        }
    }

    /**
     * Agrega un componente (menú o elemento de menú) al menú actual.
     * @param component El componente a agregar.
     */
    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    /**
     * Elimina un componente (menú o elemento de menú) del menú actual.
     * @param component El componente a eliminar.
     */
    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    /**
     * Obtiene un componente hijo del menú en la posición indicada.
     * @param i El índice del componente hijo.
     * @return El componente hijo en la posición especificada.
     */
    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }
}
