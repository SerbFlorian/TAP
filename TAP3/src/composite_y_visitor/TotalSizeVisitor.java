package composite_y_visitor;

/**
 * Visitante que calcula el tamaño total de los archivos en la estructura de componentes.
 * Este visitante recorre todos los archivos y suma su tamaño, pero no realiza ninguna operación
 * en las carpetas.
 */
class TotalSizeVisitor implements Visitor {
    private int totalSize = 0; // Acumulador del tamaño total de los archivos

    /**
     * Visita un archivo y suma su tamaño al total.
     * @param file El archivo cuya tamaño se sumará al total.
     */
    @Override
    public void visitFile(File file) {
        totalSize += file.getSize(); // Suma el tamaño del archivo al total
    }

    /**
     * Visita una carpeta. En este caso no realiza ninguna operación en las carpetas.
     * @param folder La carpeta que se visita, pero no se realiza ninguna operación en ella.
     */
    @Override
    public void visitFolder(Folder folder) {
        // No se realiza ninguna operación en carpetas, solo se suman tamaños de archivos
    }

    /**
     * Obtiene el tamaño total de los archivos en la estructura visitada.
     * @return El tamaño total acumulado de todos los archivos visitados.
     */
    public int getTotalSize() {
        return totalSize; // Devuelve el tamaño total acumulado
    }
}
