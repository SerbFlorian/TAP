package exception;

/**
 * Esta clase representa un curso donde se determina si un estudiante ha aprobado o no.
 * El método `passCourse` verifica si el estudiante ha estudiado lo suficiente
 * para aprobar el curso. Si no ha estudiado, lanza una excepción personalizada `TAPException`.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class TapCourse {
    /**
     * Este método determina si el estudiante aprueba el curso o no,
     * según si ha estudiado o no.
     * Si el estudiante ha estudiado, el método devuelve un mensaje de aprobación.
     * Si no ha estudiado, se lanza una excepción `TAPException` con un mensaje de error.
     *
     * @param hasStudied Indica si el estudiante ha estudiado o no.
     *                   Si es verdadero, se considera que el estudiante ha aprobado.
     *                   Si es falso, se lanza una excepción.
     * @return Un mensaje indicando si el estudiante ha aprobado o no el curso.
     * @throws TAPException Si el estudiante no ha estudiado, se lanza una excepción personalizada.
     */
    public static String passCourse(boolean hasStudied) throws TAPException {
        // Verificamos si el estudiante ha estudiado
        if (hasStudied) {
            // Si ha estudiado, devuelve el mensaje de éxito
            return "You pass the course";
        } else {
            // Si no ha estudiado, lanza una excepción con un mensaje de fracaso
            throw new TAPException("You failed, better study next time");
        }
    }
}
