package composite_y_visitor;

/**
 * Interfaz Component que declara los métodos comunes que deben tener los componentes de la estructura.
 * Los componentes pueden ser visitados por un Visitor, que implementa la lógica específica sobre ellos.
 */
interface Component {
    /**
     * Obtiene el nombre del componente.
     * @return El nombre del componente.
     */
    String getName();

    /**
     * Método para aceptar a un visitante y delegar la operación específica en el visitante.
     * @param visitor El visitante que realizará la operación sobre el componente.
     */
    void accept(Visitor visitor);
}
