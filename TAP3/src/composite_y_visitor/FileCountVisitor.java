package composite_y_visitor;

/**
 * Visitor concreto que cuenta el número de archivos en la estructura.
 * Implementa la interfaz Visitor y realiza la operación de contar archivos.
 */
class FileCountVisitor implements Visitor {
    private int fileCount = 0; // Contador de archivos
    /**
     * Método que se ejecuta cuando el visitante visita un archivo.
     * Incrementa el contador de archivos.
     * @param file El archivo que está siendo visitado.
     */
    @Override
    public void visitFile(File file) {
        fileCount++; // Incrementa el contador de archivos
    }

    /**
     * Método que se ejecuta cuando el visitante visita una carpeta.
     * En este caso, no realiza ninguna acción, ya que solo estamos contando archivos.
     * @param folder La carpeta que está siendo visitada.
     */
    @Override
    public void visitFolder(Folder folder) {
        // No hace nada en carpetas, solo contamos archivos
    }

    /**
     * Obtiene el número total de archivos contados.
     * @return El número total de archivos encontrados.
     */
    public int getFileCount() {
        return fileCount;
    }
}
