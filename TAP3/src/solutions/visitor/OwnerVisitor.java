package solutions.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * Visitor para buscar archivos pertenecientes a un propietario específico.
 *
 * Este visitante recorre los archivos y selecciona aquellos que coinciden con el
 * propietario especificado en su construcción. Los resultados se almacenan en una lista.
 */
public class OwnerVisitor extends Visitor {
	// Propietario que estamos buscando
	private String owner;

	// Lista de archivos que pertenecen al propietario especificado
	private List<File> results;

	/**
	 * Constructor del visitante de propietario.
	 *
	 * @param owner el propietario que estamos buscando en los archivos.
	 */
	public OwnerVisitor(String owner) {
		results = new LinkedList<File>();
		this.owner = owner;
	}

	/**
	 * Método que visita un archivo y lo añade a los resultados si el propietario
	 * coincide con el especificado.
	 *
	 * @param file el archivo que se visita.
	 */
	@Override
	public void visit(File file) {
		// Si el propietario del archivo coincide con el que estamos buscando,
		// lo añadimos a la lista de resultados
		if (file.getOwner().equals(owner)) {
			results.add(file);
		}
	}

	/**
	 * Obtiene los archivos que pertenecen al propietario especificado.
	 *
	 * @return una lista de archivos que pertenecen al propietario.
	 */
	public List<File> getResults() {
		return results;
	}
}
