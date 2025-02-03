package solutions.iterator;

/**
 * Demo del patrón de diseño Iterator.
 * Este patrón permite recorrer los elementos de una colección sin exponer su estructura interna.
 * <p>
 * En este caso, se utiliza para iterar sobre los nombres almacenados en la clase NameRepository.
 * <p>
 * Fuente: http://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
 */
public class IteratorPatternDemo {
    // CONTRACTE -> Iterable
    // ASSIGNACIO POLIMORFICA -> new NameRepository(), ja que es on espero la classe pare i li assigno la filla
    // DYNAMIC BIDING -> no tiene

    /**
     * Método principal que ejecuta el demo del patrón Iterator.
     * <p>
     * Crea una instancia de NameRepository y utiliza un bucle foreach para recorrer los nombres
     * almacenados en la colección proporcionada por el iterador de NameRepository.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        // Se crea una instancia de NameRepository, que es la clase que contiene la colección de nombres.
        NameRepository namesRepository = new NameRepository();

        // Se utiliza un bucle foreach, que internamente utiliza el iterador de NameRepository,
        // para recorrer cada elemento (nombre) y mostrarlo en la consola.
        for (String elem : namesRepository) {
            // Se imprime el nombre en la consola.
            System.out.println("Name : " + elem);
        }
    }
}

