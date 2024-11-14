package solutions.filesystem2;

import java.util.List;

/**
 * Interfaz común para los componentes del sistema de archivos, como directorios y archivos.
 * Define los métodos que deben implementar los componentes de la estructura del sistema de archivos.
 */
interface AComponent {
    /**
     * Muestra el nombre de este componente y todos sus hijos en el sistema de archivos.
     * Este método se usa para listar la estructura del sistema de archivos.
     */
    void ls();

    /**
     * Recolecta todos los nombres de los componentes dentro de este componente y sus hijos.
     * Devuelve una lista con los nombres de todos los componentes.
     *
     * @return Lista de nombres de los componentes.
     */
    List<String> collect();

    /**
     * Convierte el componente y sus hijos en una lista plana de componentes.
     *
     * @return Lista de componentes dentro de este componente.
     */
    List<AComponent> toList();

    /**
     * Busca archivos por nombre dentro de este componente y sus hijos.
     * Si el nombre coincide con algún archivo, lo agrega a la lista de resultados.
     *
     * @param name El nombre del archivo que se desea buscar.
     * @return Lista de archivos que coinciden con el nombre dado.
     */
    List<File> search(String name);

    /**
     * Devuelve el tamaño total de este componente y sus hijos.
     * Si es un archivo, retorna el tamaño del archivo. Si es un directorio, suma los tamaños de sus hijos.
     *
     * @return El tamaño del componente (en bytes).
     */
    int size();

    /**
     * Establece el padre de este componente dentro de la jerarquía del sistema de archivos.
     *
     * @param parent El componente que será el nuevo padre de este componente.
     */
    void setParent(AComponent parent);

    /**
     * Obtiene el nombre de este componente.
     *
     * @return El nombre del componente.
     */
    String getName();
}
