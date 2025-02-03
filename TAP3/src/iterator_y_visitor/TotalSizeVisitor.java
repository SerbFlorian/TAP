package iterator_y_visitor;

/**
 * Clase que implementa el patrón Visitor para calcular el tamaño total de los archivos en el sistema de archivos.
 * Esta clase recorre los archivos y calcula su tamaño total, pero no realiza ninguna acción sobre las carpetas.
 */
class TotalSizeVisitor implements Visitor {
    private int totalSize = 0;

    /**
     * Visita un archivo y suma su tamaño al total.
     *
     * @param file El archivo que se va a visitar.
     */
    @Override
    public void visitFile(File file) {
        totalSize += file.getSize(); // Suma el tamaño del archivo al total
    }

    /**
     * No hace nada en las carpetas, ya que solo se suman los tamaños de los archivos.
     *
     * @param folder La carpeta que se va a visitar.
     */
    @Override
    public void visitFolder(Folder folder) {
        // No hace nada en carpetas, solo suma tamaños de archivos
    }

    /**
     * Devuelve el tamaño total acumulado de los archivos visitados.
     *
     * @return El tamaño total de todos los archivos visitados.
     */
    public int getTotalSize() {
        return totalSize; // Retorna el tamaño total calculado
    }
}
