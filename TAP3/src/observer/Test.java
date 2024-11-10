package observer;

/**
 * Clase de prueba que demuestra cómo funciona el patrón de diseño Observer.
 * Se crea un sujeto y varios observadores que se registran para ser notificados
 * cuando el estado del sujeto cambia.
 * <p>
 * Ejemplo de conceptos clave:
 * <ul>
 *   <li><strong>Contrato (Contract):</strong> La interfaz <code>{@link Observer}</code> define el contrato
 *   de los métodos que deben implementarse.</li>
 *   <li><strong>Asignación Polimórfica:</strong> Al utilizar el método <code>attach()</code>, se le pasa un
 *   objeto que implementa el contrato <code>Observer</code> Entonces la asignacion polimorfica esta en:
 *   - new HexaObserver()
 *   - new OctalObserver()
 *   - new BinaryObserver().
 *   </li>
 *   <li><strong>Vinculación Dinámica (Dynamic Binding):</strong> Classe Subject-> linea 62 -> .update()
 *   La llamada al método <code>update()</code>
 *   de los observadores se resuelve en tiempo de ejecución.</li>
 * </ul>
 *
 * @author Pedro
 */
public class Test {
    // ASSIGNACIO POLIMORFICA -> .attach(), me pasan un objeto que implementa el contrato Observer
    // on espero el contrato y me pasan una clase hija o alguien que completa el contrato.

    public static void main(String[] args) {
        // Crear un objeto sujeto (Subject)
        Subject subject = new Subject();

        // Añadir observadores (observadores que se registran en el sujeto)
        subject.attach(new HexaObserver());  // Observador que muestra el estado en formato hexadecimal
        subject.attach(new OctalObserver()); // Observador que muestra el estado en formato octal
        subject.attach(new BinaryObserver()); // Observador que muestra el estado en formato binario

        // Cambiar el estado del sujeto y notificar a todos los observadores
        System.out.println("First state change: 15");
        subject.setState(15); // Se actualiza el estado del sujeto a 15 (los observadores son notificados)

        System.out.println("Second state change: 10");
        subject.setState(10); // Se actualiza el estado del sujeto a 10 (los observadores son notificados)
    }
}
