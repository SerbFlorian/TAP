package solutions.visitor;
// CONTRACTE -> AComponent, Visitor
// ASSIGNACIO POLIMORFICA -> new Directory() y new File(), ja que es on espero la classe pare i li assigno la filla
// DYNAMIC BIDING -> accept() y getSize() y visit() y getResults()

import java.util.List;

/**
 * Clase principal que demuestra el uso del patrón de diseño Visitor en una estructura jerárquica de directorios y archivos.
 * En este ejemplo se crean directorios y archivos, y luego se aplican diferentes visitantes para realizar operaciones
 * como listar los archivos, calcular tamaños, buscar archivos por nombre y buscar archivos por propietario.
 */
public class Main {

    /**
     * Método principal que crea una estructura de directorios y archivos, y aplica varios visitantes.
     *
     * @param args argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {

        // Crear directorios y archivos
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory lp = new Directory("lp");
        File f1 = new File("f1", 1234, "pedro");
        File f2 = new File("f2", 3445, "pep");
        File f3 = new File("f3", 6688, "pedro");
        File f4 = new File("lp", 99999, "jordi");

        // Agregar archivos y directorios a la jerarquía
        root.addChild(home);
        root.addChild(f1);
        home.addChild(lp);
        home.addChild(f2);
        lp.addChild(f3);
        root.addChild(f4);

        // Listar todos los directorios y archivos comenzando desde la raíz
        root.ls();
        System.out.println("-------------");

        // Mostrar la ruta completa del archivo f3
        System.out.println(f3);

        System.out.println("-------------");

        // Convertir la jerarquía de directorios y archivos en una lista y mostrarla
        List<AComponent> result3 = root.toList();
        for (AComponent a : result3) {
            System.out.println(a);
        }

        // Aplicar el Visitor de tamaño (SizeVisitor) y mostrar el tamaño total de los archivos
        System.out.println("Visitor code:-----size");
        SizeVisitor vs = new SizeVisitor();
        root.accept(vs);
        System.out.println("Size: " + vs.getSize());

        // Aplicar el Visitor de búsqueda (SearchVisitor) para buscar un archivo por nombre
        System.out.println("Visitor code:-----search");
        SearchVisitor search = new SearchVisitor("f3");
        root.accept(search);
        List<File> results = search.getResults();
        for (File f : results) {
            System.out.println(f);
        }

        // Aplicar el Visitor de propietario (OwnerVisitor) para buscar archivos por propietario
        System.out.println("Visitor code:-----owner");
        OwnerVisitor owner = new OwnerVisitor("pedro");
        root.accept(owner);
        List<File> results2 = owner.getResults();
        for (File f : results2) {
            System.out.println(f);
        }
    }
}
