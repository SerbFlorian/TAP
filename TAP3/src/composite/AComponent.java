package composite;

/**
 * Interfaz común para todos los componentes en el patrón Composite.
 * Esta interfaz define un método común para obtener el tamaño del componente,
 * que puede ser utilizado tanto para los objetos individuales como para los
 * componentes compuestos (que contienen otros componentes).
 */
interface AComponent {
    /**
     * Método para obtener el tamaño del componente.
     * El tamaño puede representar la cantidad de elementos o el tamaño físico
     * dependiendo de la implementación.
     *
     * @return El tamaño del componente.
     */
    int size();
}
