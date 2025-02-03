package iterator;

/**
 * Interfaz que representa un contenedor que puede ser recorrido por un iterador.
 * <p>
 * Esta interfaz define el método para obtener un iterador que permita recorrer
 * los elementos de un contenedor. Los contenedores pueden ser listas, colecciones,
 * arreglos, entre otros, y esta interfaz asegura que cualquier contenedor tenga
 * la capacidad de ser recorrido de manera secuencial a través de un iterador.
 * </p>
 *
 * @author [Tu Nombre]
 */
interface Container {
    /**
     * Devuelve un iterador que puede recorrer los elementos del contenedor.
     *
     * @return un objeto de tipo {@link Iterator} que permite recorrer los
     * elementos del contenedor.
     */
    Iterator getIterator();
}
