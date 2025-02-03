package defaultmethods;

/**
 * Clase de prueba que demuestra el uso de métodos por defecto en interfaces.
 * <p>Esta clase instancia un objeto de tipo {@link DefaultPerson} y llama a sus
 * métodos, incluyendo el método por defecto {@code blackCard()} definido en la interfaz.</p>
 * <p>
 * Creado por Pedro el 26/10/14.
 */
public class DefaultTest {
    /**
     * Método principal que inicia el programa.
     * <p>Crea una instancia de {@link DefaultPerson}, llama a {@code sayHello()}
     * para mostrar un saludo y a {@code blackCard()} para demostrar el uso del método
     * por defecto de la interfaz {@link IPerson}.</p>
     *
     * @param args argumentos de línea de comandos (no utilizados en este ejemplo)
     */
    public static void main(String args[]) {
        DefaultPerson p = new DefaultPerson();  // Crear instancia de DefaultPerson
        p.sayHello(); // Llamar al método sayHello() de la instancia
        p.blackCard(); // Llamar al método por defecto blackCard() de la interfaz IPerson
    }
}
