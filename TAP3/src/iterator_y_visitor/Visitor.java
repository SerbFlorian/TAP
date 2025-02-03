package iterator_y_visitor;

/**
 * Interfaz para los visitantes que realizan operaciones sobre diferentes tipos de componentes.
 * En este caso, los componentes son archivos y carpetas.
 */
interface Visitor {
    /**
     * Realiza una operación sobre un archivo.
     *
     * @param file El archivo sobre el que se realizará la operación.
     */
    void visitFile(File file);

    /**
     * Realiza una operación sobre una carpeta.
     *
     * @param folder La carpeta sobre la que se realizará la operación.
     */
    void visitFolder(Folder folder);
}
