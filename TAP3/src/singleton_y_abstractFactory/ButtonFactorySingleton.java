package singleton_y_abstractFactory;

/**
 * Fábrica concreta que implementa el patrón Singleton y la interfaz ButtonFactory.
 * Esta fábrica es responsable de crear instancias de un tipo concreto de botón (en este caso, un botón de Windows).
 * El patrón Singleton asegura que solo haya una única instancia de la fábrica durante la ejecución de la aplicación.
 */
public class ButtonFactorySingleton implements ButtonFactory {
    // Instancia estática única de la fábrica
    private static ButtonFactorySingleton instance;

    // Constructor privado para evitar la creación de instancias externas
    private ButtonFactorySingleton() {
    }

    /**
     * Método para obtener la instancia única de la fábrica.
     * Si la instancia aún no ha sido creada, la crea.
     *
     * @return La única instancia de ButtonFactorySingleton.
     */
    public static ButtonFactorySingleton getInstance() {
        if (instance == null) {
            instance = new ButtonFactorySingleton();
        }
        return instance;
    }

    /**
     * Método que crea un botón de Windows.
     *
     * @return Un objeto Button de tipo WindowsButton.
     */
    @Override
    public Button createButton() {
        // Este ejemplo crea siempre un botón de Windows
        return new WindowsButton(); // Ejemplo: siempre crea un botón de Windows
    }
}
