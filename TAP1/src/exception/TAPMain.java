package exception;

/**
 * Esta clase contiene el método `main` que ejecuta el programa y prueba la funcionalidad
 * de la clase `TapCourse`. El propósito es verificar si el estudiante ha aprobado el curso
 * o si se lanza una excepción `TAPException` en caso de que no haya estudiado.
 *
 * Created by pedro on 9/9/15.
 */
public class TAPMain {

    /**
     * Si el estudiante no ha estudiado, se lanza una excepción que es capturada
     * y se imprime el mensaje de error.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String args[]) {
        try {
            // Se intenta ejecutar el método `passCourse` con el argumento 'false',
            // lo que provocará que se lance una excepción
            System.out.println(TapCourse.passCourse(true));
        } catch (TAPException e) {
            // Si se lanza una `TAPException`, se captura y se imprime el mensaje de la excepción
            System.out.println(e.getMessage());
        }
    }
}
