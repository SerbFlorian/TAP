package defaultmethods;

/**
 * Implementación de la interfaz {@link IPerson}.
 * <p>La clase {@code DefaultPerson} proporciona una implementación para el método
 * {@code sayHello()} y hereda el método por defecto {@code blackCard()} de la interfaz.</p>
 * <p>
 * Creado por Pedro el 26/10/14.
 */
public class DefaultPerson implements IPerson {

    /**
     * Muestra un saludo en la consola.
     * <p>Este método sobreescribe el método {@code sayHello()} de la interfaz {@link IPerson}
     * y muestra "HELLO!" en la consola cuando es invocado.</p>
     */
    public void sayHello() {
        System.out.println("HELLO!"); // Imprimir saludo en consola
    }

    // La implementación hereda el método por defecto blackCard() de la interfaz IPerson
}
