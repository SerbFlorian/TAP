package composite_y_visitor;

/**
 * Interfaz Visitor que declara los métodos para visitar los distintos tipos de componentes.
 * Permite que el visitante (Visitor) actúe sobre objetos de tipo File y Folder.
 */
interface Visitor {
    /**
     * Método para visitar un objeto de tipo File.
     * @param file El archivo a visitar.
     */
    void visitFile(File file);

    /**
     * Método para visitar un objeto de tipo Folder.
     * @param folder La carpeta a visitar.
     */
    void visitFolder(Folder folder);
}
