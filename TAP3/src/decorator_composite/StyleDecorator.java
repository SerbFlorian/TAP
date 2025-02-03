package decorator_composite;

/**
 * Clase decoradora que añade funcionalidad de estilo a un componente de menú.
 * Esta clase envuelve un componente de menú y le aplica un estilo visual,
 * mostrando el componente con un estilo decorativo antes de mostrarlo.
 */
class StyleDecorator implements MenuComponent {
    private final MenuComponent component;  // Componente de menú al que se le aplica el estilo
    private final String style;             // Estilo que se aplicará al componente

    /**
     * Constructor que crea un decorador de estilo.
     * @param component El componente de menú que se decora.
     * @param style El estilo que se aplicará al componente.
     */
    public StyleDecorator(MenuComponent component, String style) {
        this.component = component;
        this.style = style;
    }

    /**
     * Obtiene el nombre del componente de menú decorado.
     * @return El nombre del componente.
     */
    @Override
    public String getName() {
        return component.getName();
    }

    /**
     * Aplica el estilo al componente decorado antes de mostrarlo.
     * Muestra un mensaje indicando el estilo que se aplica, y luego
     * delega la acción de mostrar el componente al componente envuelto.
     */
    @Override
    public void display() {
        System.out.println("Applying style [" + style + "] to:");
        component.display();
    }

    /**
     * Permite agregar un nuevo componente al componente decorado.
     * Delegado al componente de menú envuelto.
     * @param component El componente a agregar.
     */
    @Override
    public void add(MenuComponent component) {
        this.component.add(component);
    }

    /**
     * Permite eliminar un componente del componente decorado.
     * Delegado al componente de menú envuelto.
     * @param component El componente a eliminar.
     */
    @Override
    public void remove(MenuComponent component) {
        this.component.remove(component);
    }

    /**
     * Obtiene un hijo del componente decorado.
     * Delegado al componente de menú envuelto.
     * @param i El índice del hijo.
     * @return El componente hijo en el índice dado.
     */
    @Override
    public MenuComponent getChild(int i) {
        return component.getChild(i);
    }
}
