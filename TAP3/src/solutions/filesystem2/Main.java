package solutions.filesystem2;

import java.util.Collections;
import java.util.List;
/**
 * Clase principal que simula un sistema de archivos
 * utilizando componentes como directorios y archivos.
 * Demuestra el uso de la interfaz AComponent, herencia y polimorfismo.
 */
public class Main {
    // CONTRACTE -> AComponent
    // ASSIGNACIO POLIMORFICA -> new Directory y new File, ja que es on espero la classe pare i li assigno la filla
    // DYNAMIC BIDING -> .ls(), size(), collect(), ja que crida el de image i me permet fer POLIMORFISME D'HERENCIA
    // STATIC BINDING -> .search(), ja que crida el de file i no es pot fer POLIMORFISME D'HERENCIA
    /**
     * Método principal que simula la estructura de un sistema de archivos
     * con directorios y archivos. Se realizan operaciones como listar,
     * recolectar y ordenar los componentes.
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     * @throws ExistException Si se intenta agregar un hijo que ya existe.
     */
    public static void main(String[] args) throws ExistException {
        // Crear la estructura del sistema de archivos
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory lp = new Directory("lp");

        File f1 = new File("f1", 1234);
        File f2 = new File("f2", 3445);
        File f3 = new File("f3", 6688);
        File f4 = new File("lp", 99999);

        // Añadir hijos a los directorios
        root.addChild(home);
        root.addChild(f1);
        home.addChild(lp);
        home.addChild(f2);
        lp.addChild(f3);
        root.addChild(f4);

        // Mostrar la estructura del sistema de archivos
        root.ls();
        System.out.println("-------------");

        // Recolectar todos los nombres de los componentes
        List<String> result = root.collect();
        printList(result);

        System.out.println("-------------");

        // Buscar los archivos con el nombre "lp"
        List<File> result2 = root.search("lp");
        printList(result2);

        System.out.println("-------------");

        // Imprimir un archivo específico
        System.out.println(f3);
        System.out.println("-------------");

        // Convertir todo a una lista y mostrar
        List<AComponent> result3 = root.toList();
        printList(result3);

        System.out.println("-------------");

        // Ordenar los componentes y mostrar
        Order o = new Order();
        Collections.sort(result3, o);
        printList(result3);

        System.out.println("-------------");

        // Imprimir el tamaño total del sistema de archivos
        System.out.println("SIZE:" + root.size());

        System.out.println("-------------");

        // Imprimir todos los componentes utilizando el iterador
        for (AComponent a : root) {
            System.out.println(a);
        }
    }

    /**
     * Método auxiliar para imprimir una lista de objetos.
     * Utiliza el método toString() de cada objeto para imprimir.
     *
     * @param list Lista de objetos a imprimir.
     */
    private static <T> void printList(List<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
    }
}
