package iterator_y_visitor;

/**
 * Implementación del patrón Visitor que cuenta los archivos visitados.
 * Esta clase visita tanto archivos como carpetas, pero solo cuenta los archivos.
 */
class FileCountVisitor implements Visitor {
    private int fileCount = 0;

    /**
     * Método que visita un archivo y aumenta el contador de archivos.
     *
     * @param file El archivo que se visita.
     */
    @Override
    public void visitFile(File file) {
        fileCount++; // Incrementa el contador de archivos cuando se visita un archivo
    }

    /**
     * Método que visita una carpeta. En este caso, no realiza ninguna acción,
     * ya que solo se cuentan los archivos.
     *
     * @param folder La carpeta que se visita (aunque no se hace nada con ella).
     */
    @Override
    public void visitFolder(Folder folder) {
        // No hace nada en carpetas, solo cuenta archivos
    }

    /**
     * Obtiene la cantidad de archivos contados por el visitante.
     *
     * @return El número total de archivos visitados.
     */
    public int getFileCount() {
        return fileCount;
    }
}
