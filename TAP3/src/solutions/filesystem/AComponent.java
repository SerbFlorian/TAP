package solutions.filesystem;

import java.util.List;

/**
 * Representa un componente en el sistema de archivos.
 * Esta interfaz es común para archivos y directorios, permitiendo tratar ambos de manera uniforme.
 * El patrón de diseño utilizado podría ser el patrón Composite, donde tanto los archivos como los directorios
 * son tratados como una única entidad (AComponent), permitiendo operaciones recursivas.
 * <p>
 * Los métodos definidos en esta interfaz permiten interactuar con componentes de archivos y directorios
 * de una manera abstracta y uniforme.
 *
 * @author Pedro
 * @version 1.0
 */
interface AComponent {

    /**
     * Muestra el listado de archivos y directorios en este componente.
     * El comportamiento de este método variará dependiendo de si el componente es un archivo
     * o un directorio.
     */
    void ls();

    /**
     * Recoge la información del componente y la devuelve en forma de lista de cadenas de texto.
     * Este método puede devolver detalles sobre el archivo o los contenidos de un directorio.
     *
     * @return Una lista de cadenas de texto con información sobre el componente.
     */
    List<String> collect();

    /**
     * Convierte este componente en una lista de otros componentes.
     * Este método puede ser útil para tratar recursivamente los elementos de un directorio.
     *
     * @return Una lista de componentes de tipo AComponent.
     */
    List<AComponent> toList();

    /**
     * Busca un componente con el nombre dado dentro del componente actual.
     * Este método puede ser útil para realizar una búsqueda en un directorio y encontrar archivos
     * o subdirectorios específicos.
     *
     * @param name El nombre del archivo o directorio que se busca.
     * @return Una lista de archivos que coinciden con el nombre dado.
     */
    List<File> search(String name);

    /**
     * Obtiene el tamaño del componente.
     * Este tamaño podría representar el tamaño del archivo o el número de elementos dentro de un directorio.
     *
     * @return El tamaño del componente.
     */
    int size();

    /**
     * Establece el componente padre de este componente.
     * Este método permite establecer una relación jerárquica entre los componentes del sistema de archivos.
     *
     * @param parent El componente padre de este componente.
     */
    void setParent(AComponent parent);
}
