package interfaces;

/**
 * La interfaz `Musician` define un comportamiento común para cualquier clase
 * que desee representar a un músico. Esta interfaz especifica que cualquier clase
 * que la implemente debe proporcionar una implementación del método `sing`.
 * Created by pedro on 9/9/15.
 */
interface Musician {
	/**
	 * Método que debe ser implementado por cualquier clase que implemente la interfaz `Musician`.
	 * Este método representa la acción de cantar, y cada clase debe definir cómo lo hace.
	 *
	 * @return Una cadena de texto que describe cómo canta el músico.
	 */
	String sing();  // Método abstracto que debe ser implementado por las clases que implementen la interfaz Musician
}
