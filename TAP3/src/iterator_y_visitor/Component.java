package iterator_y_visitor;

/**
 * Interfaz para los componentes que serán visitados por un visitante.
 * Cada componente tiene un nombre y permite aceptar un visitante.
 */
interface Component {
    /**
     * Devuelve el nombre del componente.
     *
     * @return El nombre del componente.
     */
    String getName();

    /**
     * Acepta un visitante para que realice alguna acción sobre el componente.
     *
     * @param visitor El visitante que realizará la acción.
     */
    void accept(Visitor visitor);
}
