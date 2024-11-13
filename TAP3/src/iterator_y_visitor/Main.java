package iterator_y_visitor;

/**
 * El patrón *Iterator* proporciona una forma eficiente de recorrer la estructura jerárquica
 * (archivos y carpetas) de forma unificada, sin necesidad de preocuparse por los detalles
 * de implementación interna de cada componente.
 * <p>
 * El patrón *Visitor*, por su parte, permite realizar operaciones específicas
 * sobre los componentes (como contar archivos o calcular el tamaño) de manera extensible,
 * sin modificar el código existente de los componentes.
 * <p>
 * Juntos, estos patrones permiten recorrer y operar sobre la misma estructura de objetos
 * de manera flexible y reutilizable, manteniendo el código organizado y fácil de mantener.
 * El iterador facilita el acceso a cada componente de la estructura, mientras que el visitante permite
 * agregar nuevas funcionalidades sin cambiar las clases base.
 */
public class Main {
    public static void main(String[] args) {
        // Crear archivos con nombres y tamaños
        File file1 = new File("File1.txt", 10);
        File file2 = new File("File2.txt", 20);
        File file3 = new File("File3.txt", 30);

        // Crear carpetas
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        Folder rootFolder = new Folder("RootFolder");

        // Agregar archivos a las carpetas
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);

        // Agregar carpetas a la carpeta raíz
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Usar un iterador para recorrer los elementos en la estructura de carpetas y archivos
        System.out.println("Recorriendo la estructura con Iterator:");
        for (Component component : rootFolder) {
            System.out.println(component.getName()); // Imprime el nombre de cada componente (archivo o carpeta)
        }

        // Usar el visitante para contar los archivos
        FileCountVisitor countVisitor = new FileCountVisitor();
        rootFolder.accept(countVisitor); // El visitante recorre la estructura y cuenta los archivos
        System.out.println("Total de archivos: " + countVisitor.getFileCount()); // Muestra el total de archivos encontrados

        // Usar el visitante para calcular el tamaño total de los archivos
        TotalSizeVisitor sizeVisitor = new TotalSizeVisitor();
        rootFolder.accept(sizeVisitor); // El visitante recorre la estructura y calcula el tamaño total
        System.out.println("Tamaño total: " + sizeVisitor.getTotalSize()); // Muestra el tamaño total de los archivos
    }
}
