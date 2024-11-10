package solutions.filesystem2;

/**
 * Excepción lanzada cuando un componente ya existe en un directorio.
 * Esta excepción es útil para indicar que se está intentando añadir un
 * componente duplicado a un directorio.
 */
public class ExistException extends Exception {

	/**
	 * Serial version UID para la serialización de la excepción.
	 */
	private static final long serialVersionUID = 1L;

}
