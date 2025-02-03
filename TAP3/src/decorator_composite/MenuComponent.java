package decorator_composite;

/**
 * Interfaz que representa un componente del menú. Todos los elementos del menú (tanto menús como elementos individuales)
 * deben implementar esta interfaz, permitiendo tratar de manera uniforme tanto los menús compuestos (que contienen otros
 * elementos) como los elementos individuales del menú.
 */
interface MenuComponent {
    /**
     * Obtiene el nombre del componente del menú.
     * @return El nombre del componente.
     */
    String getName();

    /**
     * Muestra la información del componente, como su nombre. Los componentes compuestos mostrarán sus hijos también.
     */
    void display();

    /**
     * Agrega un componente hijo al componente actual. Este método solo tiene sentido en componentes compuestos como `Menu`.
     * @param component El componente a agregar (puede ser otro `Menu` o un `MenuItem`).
     */
    void add(MenuComponent component);

    /**
     * Elimina un componente hijo del componente actual. Este método solo tiene sentido en componentes compuestos como `Menu`.
     * @param component El componente a eliminar.
     */
    void remove(MenuComponent component);

    /**
     * Obtiene un componente hijo en la posición especificada. Este método solo tiene sentido en componentes compuestos.
     * @param i El índice del componente hijo.
     * @return El componente hijo en la posición especificada.
     */
    MenuComponent getChild(int i);
}
