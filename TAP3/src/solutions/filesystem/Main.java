package solutions.filesystem;

import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // CONTRACTE -> AComponent
        // ASSIGNACIO POLIMORFICA -> new Directory y new File, ja que es on espero la classe pare i li assigno la filla
        // DYNAMIC BIDING -> .ls(), size(), collect(), ja que crida el de image i me permet fer POLIMORFISME D'HERENCIA
        /**
         * Método principal que simula la creación y manipulación de una estructura de directorios y archivos.
         * Se muestran las operaciones de listar directorios, recolectar nombres, buscar archivos por nombre,
         * y calcular el tamaño total de la estructura.
         *
         * @param args Argumentos de línea de comandos (no utilizados en este caso).
         */
        // Se crean los directorios y archivos, estableciendo una jerarquía
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory lp = new Directory("lp");
        File f1 = new File("f1", 1234); // Archivo de 1234 unidades de tamaño
        File f2 = new File("f2", 3445); // Archivo de 3445 unidades de tamaño
        File f3 = new File("f3", 6688); // Archivo de 6688 unidades de tamaño
        File f4 = new File("lp", 99999); // Archivo de 99999 unidades de tamaño

        // Se añaden los archivos y directorios a la estructura
        root.addChild(home);
        root.addChild(f1);
        home.addChild(lp);
        home.addChild(f2);
        lp.addChild(f3);
        root.addChild(f4);

        // Listado de todos los componentes en el directorio raíz
        root.ls();
        System.out.println("-------------");

        // Recolección de los nombres de todos los componentes
        List<String> result = root.collect();
        for (String elem : result) {
            System.out.println(elem);
        }

        System.out.println("-------------");

        // Búsqueda de archivos por nombre (en este caso "lp")
        List<File> result2 = root.search("lp");
        for (File elem2 : result2) {
            System.out.println(elem2);
        }

        System.out.println("-------------");

        // Imprimir la ruta completa del archivo f3
        System.out.println(f3);

        System.out.println("-------------");

        // Convertir toda la jerarquía de directorios y archivos en una lista y mostrarla
        List<AComponent> result3 = root.toList();
        for (AComponent a : result3) {
            System.out.println(a);
        }

        System.out.println("-------------");

        // Mostrar el tamaño total de la estructura en el directorio raíz
        System.out.println("SIZE:" + root.size());
    }
}
