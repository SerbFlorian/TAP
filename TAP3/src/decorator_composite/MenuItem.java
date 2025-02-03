package decorator_composite;

/**
 * Clase que representa un ítem de menú. Esta clase implementa el componente del menú como una hoja,
 * lo que significa que no puede contener otros elementos (como submenús).
 * Cuando se invoca el método `add`, `remove` o `getChild`, lanza una excepción, ya que estos métodos
 * solo deben ser usados por los componentes compuestos (como los menús).
 */
class MenuItem implements MenuComponent {
    private final String name;

    /**
     * Constructor que crea un nuevo ítem de menú con el nombre proporcionado.
     * @param name El nombre del ítem de menú.
     */
    public MenuItem(String name) {
        this.name = name;
    }

    /**
     * Obtiene el nombre del ítem de menú.
     * @return El nombre del ítem de menú.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Muestra la información del ítem de menú.
     * En este caso, simplemente imprime el nombre del ítem.
     */
    @Override
    public void display() {
        System.out.println("Item: " + name);
    }

    /**
     * Método que no es soportado por los ítems de menú (hojas). Lanza una excepción si se intenta usar.
     * @throws UnsupportedOperationException Si se intenta agregar un componente a un ítem de menú.
     */
    @Override
    public void add(MenuComponent component) {
        throw new UnsupportedOperationException("Cannot add to a leaf component");
    }

    /**
     * Método que no es soportado por los ítems de menú (hojas). Lanza una excepción si se intenta usar.
     * @throws UnsupportedOperationException Si se intenta eliminar un componente de un ítem de menú.
     */
    @Override
    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a leaf component");
    }

    /**
     * Método que no es soportado por los ítems de menú (hojas). Lanza una excepción si se intenta usar.
     * @throws UnsupportedOperationException Si se intenta obtener un hijo de un ítem de menú.
     */
    @Override
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("Leaf does not have children");
    }
}
