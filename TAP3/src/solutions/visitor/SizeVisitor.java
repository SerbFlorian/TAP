package solutions.visitor;

/**
 * Visitor para calcular el tamaño total de los archivos visitados.
 * <p>
 * Este visitante recorre los archivos y acumula su tamaño en un valor total.
 * El tamaño se calcula sumando el tamaño de cada archivo visitado.
 */
public class SizeVisitor extends Visitor {
    // Variable que almacena el tamaño acumulado de los archivos visitados
    private int size = 0;

    /**
     * Obtiene el tamaño total acumulado de los archivos visitados.
     *
     * @return el tamaño total de los archivos visitados.
     */
    public int getSize() {
        return size;
    }

    /**
     * Método que visita un archivo y acumula su tamaño en la variable `size`.
     *
     * @param file el archivo que se visita.
     */
    @Override
    public void visit(File file) {
        // Sumamos el tamaño del archivo al total acumulado
        size += file.getSize();
    }
}
