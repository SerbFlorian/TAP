package solutions.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Visitor para buscar archivos por nombre.
 * <p>
 * Este visitante recorre los archivos y selecciona aquellos cuyo nombre coincide
 * con el nombre especificado en su construcción. Los resultados se almacenan en una lista.
 */
public class SearchVisitor extends Visitor {
    // Nombre del archivo que estamos buscando
    private String name;

    // Lista de archivos que coinciden con el nombre especificado
    private List<File> results;

    /**
     * Constructor del visitante de búsqueda por nombre de archivo.
     *
     * @param name el nombre del archivo que estamos buscando.
     */
    public SearchVisitor(String name) {
        results = new LinkedList<File>();
        this.name = name;
    }

    /**
     * Método que visita un archivo y lo añade a los resultados si el nombre
     * coincide con el especificado.
     *
     * @param file el archivo que se visita.
     */
    @Override
    public void visit(File file) {
        // Si el nombre del archivo coincide con el que estamos buscando,
        // lo añadimos a la lista de resultados
        if (file.getName().equals(name)) {
            results.add(file);
        }
    }

    /**
     * Obtiene los archivos que coinciden con el nombre especificado.
     *
     * @return una lista de archivos cuyo nombre coincide con el buscado.
     */
    public List<File> getResults() {
        return results;
    }
}
