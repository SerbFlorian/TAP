package solutions.visitor;

/**
 * Clase abstracta que define un visitante para los componentes del sistema de archivos.
 * <p>
 * Esta clase define un método `visit` para cada tipo de componente (en este caso, `File` y `Directory`).
 * Los visitantes concretos (como `SizeVisitor`, `SearchVisitor`, etc.) deben implementar el método `visit(File file)`
 * para realizar operaciones específicas sobre los archivos.
 */
abstract class Visitor {
    /**
     * Método abstracto que se debe implementar para realizar una operación sobre un archivo.
     * <p>
     * Este método es llamado cuando el visitante encuentra un archivo.
     *
     * @param file el archivo sobre el que se realiza la operación.
     */
    abstract void visit(File file);

    /**
     * Método que se utiliza para visitar un directorio.
     * <p>
     * Este método recorre los hijos del directorio y aplica el visitante a cada uno de ellos.
     *
     * @param dir el directorio que se visita.
     */
    void visit(Directory dir) {
        // Recorre todos los componentes dentro del directorio y les aplica el visitante
        for (AComponent elem : dir.getChildren()) {
            elem.accept(this);
        }
    }
}
