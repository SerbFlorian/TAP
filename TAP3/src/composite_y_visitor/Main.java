package composite_y_visitor;
/*
 * El patrón *Composite* permite tratar de manera uniforme tanto a los componentes "hoja" (como archivos)
 * como a los componentes "compuestos" (como carpetas) en una estructura jerárquica. Esto facilita la creación
 * y gestión de estructuras complejas como árboles de directorios. Permite agregar, eliminar y recorrer elementos
 * sin importar si son archivos individuales o carpetas que contienen otros componentes.
 *
 * El patrón *Visitor*, por su parte, permite añadir nuevas funcionalidades (como contar archivos o calcular tamaños)
 * a las estructuras del Composite sin modificar sus clases. Mediante el uso del visitante, podemos operar sobre
 * los elementos de la estructura sin acoplar la funcionalidad al código de los componentes.
 *
 * Estos dos patrones trabajan muy bien juntos porque el Composite proporciona una estructura uniforme para los
 * componentes, mientras que el Visitor facilita la extensión de funcionalidades sin alterar el código existente.
 * El uso conjunto permite recorrer y manipular las estructuras jerárquicas de manera eficiente y flexible.
 */

public class Main {
    public static void main(String[] args) {
        // Creamos archivos y carpetas con nombres y tamaños para los archivos
        File file1 = new File("File1.txt", 10); // Archivo con 10 unidades de tamaño
        File file2 = new File("File2.txt", 20); // Archivo con 20 unidades de tamaño
        File file3 = new File("File3.txt", 30); // Archivo con 30 unidades de tamaño

        // Creamos carpetas
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        Folder rootFolder = new Folder("RootFolder");

        // Añadimos archivos a las carpetas correspondientes
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);

        // Añadimos carpetas al folder raíz
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Usamos el visitante que cuenta el número total de archivos
        FileCountVisitor countVisitor = new FileCountVisitor();
        rootFolder.accept(countVisitor); // Aplicamos el visitante sobre la estructura
        System.out.println("Total de archivos: " + countVisitor.getFileCount());

        // Usamos el visitante que calcula el tamaño total de los archivos
        TotalSizeVisitor sizeVisitor = new TotalSizeVisitor();
        rootFolder.accept(sizeVisitor); // Aplicamos el visitante sobre la estructura
        System.out.println("Tamaño total: " + sizeVisitor.getTotalSize());
    }
}
