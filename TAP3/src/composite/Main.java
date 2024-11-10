package composite;

/**
 * Clase principal que demuestra el uso del patrón Composite para trabajar con
 * directorios y archivos. Los directorios pueden contener tanto otros directorios
 * como archivos, y se puede calcular el tamaño total de un directorio sumando el
 * tamaño de sus elementos hijos (archivos y directorios).
 */
public class Main {
    /**
     * **Contrato:** La interfaz {@link AComponent} es la "PADRE" de la que extienden
     * todos los demás componentes (como directorios y archivos).
     * **Asignación Polimórfica:** new Directory y new File.
     * **Dynamic Binding:** root.size() -> .size().
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear directorios y archivos
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory tap = new Directory("tap");
        File f1 = new File("f1", 1234);
        File f2 = new File("f2", 3445);
        File f3 = new File("f3", 6688);
        File f4 = new File("lp", 99999);

        // Añadir archivos y directorios a la estructura jerárquica
        root.addChild(home);
        root.addChild(f1);
        home.addChild(tap);
        home.addChild(f2);
        tap.addChild(f3);
        root.addChild(f4);

        // Imprimir tamaños de los directorios
        System.out.println("-------------");

        // Mostrar el tamaño total de los directorios
        System.out.println("Root SIZE: " + root.size());  // Tamaño del directorio root
        System.out.println("Home SIZE: " + home.size());  // Tamaño del directorio home
        System.out.println("TAP SIZE: " + tap.size());    // Tamaño del directorio tap
    }
}
