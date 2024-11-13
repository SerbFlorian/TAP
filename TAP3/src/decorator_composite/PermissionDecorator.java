package decorator_composite;

/**
 * Clase decoradora que añade funcionalidad de permisos a un componente de menú.
 * Esta clase envuelve un componente de menú y restringe su acceso en función del rol del usuario.
 * Si el usuario tiene el rol requerido, se permite acceder al componente y mostrarlo,
 * de lo contrario, se deniega el acceso.
 */
class PermissionDecorator implements MenuComponent {
    private final MenuComponent component;  // Componente de menú al que se le añaden permisos
    private final String requiredRole;      // Rol requerido para acceder al componente
    private final String userRole;          // Rol del usuario actual

    /**
     * Constructor que crea un decorador de permisos.
     * @param component El componente de menú que se decora.
     * @param requiredRole El rol necesario para acceder al componente.
     * @param userRole El rol del usuario que intenta acceder.
     */
    public PermissionDecorator(MenuComponent component, String requiredRole, String userRole) {
        this.component = component;
        this.requiredRole = requiredRole;
        this.userRole = userRole;
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
     * Muestra el componente de menú solo si el rol del usuario coincide con el rol requerido.
     * Si el usuario tiene el rol adecuado, se muestra el componente; de lo contrario,
     * se imprime un mensaje indicando que el acceso está denegado.
     */
    @Override
    public void display() {
        if (userRole.equals(requiredRole)) {
            component.display();
        } else {
            System.out.println("Access denied to: " + component.getName());
        }
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
