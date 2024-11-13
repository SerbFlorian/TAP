package composite_y_Iterator;

import java.util.Iterator;

/**
 * El patrón *Composite* permite tratar de forma uniforme tanto a los componentes "hoja"
 * (como archivos) como a los "compuestos" (como carpetas), facilitando la manipulación de
 * estructuras jerárquicas. Ambos implementan la misma interfaz, lo que permite agregar
 * componentes sin preocuparnos por su tipo.
 * <p>
 * El patrón *Iterator* se complementa perfectamente, ya que recorre recursivamente la estructura
 * jerárquica (archivos y carpetas) sin necesidad de diferenciarlos, garantizando
 * un acceso consistente a todos los componentes.
 */
public class Main {
    public static void main(String[] args) {
        // Creamos archivos y carpetas para formar la estructura
        File file1 = new File("File1.txt"); // Crear archivo 1
        File file2 = new File("File2.txt"); // Crear archivo 2
        File file3 = new File("File3.txt"); // Crear archivo 3

        Folder folder1 = new Folder("Folder1"); // Crear carpeta 1
        Folder folder2 = new Folder("Folder2"); // Crear carpeta 2
        Folder rootFolder = new Folder("RootFolder"); // Crear la carpeta raíz

        // Estructura jerárquica de los componentes
        folder1.add(file1); // Añadir archivo 1 a la carpeta 1
        folder1.add(file2); // Añadir archivo 2 a la carpeta 1

        folder2.add(file3); // Añadir archivo 3 a la carpeta 2

        rootFolder.add(folder1); // Añadir carpeta 1 a la carpeta raíz
        rootFolder.add(folder2); // Añadir carpeta 2 a la carpeta raíz

        // Usamos el iterador para recorrer la estructura completa
        Iterator<Component> iterator = rootFolder.createIterator(); // Crear un iterador para recorrer los componentes
        while (iterator.hasNext()) { // Mientras haya más componentes
            Component component = iterator.next(); // Obtener el siguiente componente
            component.print(); // Imprimir el nombre del componente
        }
    }
}
