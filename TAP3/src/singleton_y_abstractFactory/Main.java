package singleton_y_abstractFactory;

/**
 * Patrón *Singleton*: Este patrón asegura que una clase tenga una única instancia en toda la
 * aplicación y proporciona un punto de acceso global a esa instancia. En este caso,
 * ButtonFactorySingleton garantiza que solo exista una fábrica para crear botones, controlando
 * el acceso y evitando la creación de múltiples instancias.
 * <p>
 * Patrón *Abstract Factory*: Este patrón proporciona una interfaz para crear familias de objetos
 * relacionados sin especificar sus clases concretas. La interfaz ButtonFactory define el método
 * para crear botones, mientras que las implementaciones concretas (como WindowsButton y MacOSButton)
 * permiten crear botones específicos para diferentes plataformas sin depender directamente de las clases de botones.
 * <p>
 * El patrón *Singleton* se encarga de asegurar que solo haya una instancia de la fábrica de botones,
 * lo que simplifica la gestión de objetos a través de la aplicación.
 * Al combinarse con el patrón *Abstract Factory*, la creación de botones es flexible y modular,
 * permitiendo la creación de botones para diferentes plataformas
 * (Windows, macOS, etc.) sin acoplarse a implementaciones concretas. Juntos, permiten crear una fábrica eficiente
 * y flexible, garantizando que solo haya una instancia responsable de la creación de objetos sin perder la posibilidad
 * de adaptarse a diferentes entornos.
 */
public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de la fábrica (Singleton)
        ButtonFactory factory = ButtonFactorySingleton.getInstance();

        // Crear un botón usando la fábrica
        Button button = factory.createButton();

        // Usar el botón: simula un clic en el botón
        button.click();

        // Verificar que la fábrica es la misma (Singleton)
        ButtonFactory sameFactory = ButtonFactorySingleton.getInstance();
        // Comprobamos si ambas fábricas son la misma instancia
        System.out.println(factory == sameFactory); // true (es la misma instancia)
    }
}
