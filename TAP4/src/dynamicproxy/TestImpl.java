package dynamicproxy;

/**
 * Implementación de la interfaz {@link TestIF}.
 * <p>
 * Esta clase proporciona la implementación del método {@link #hello(String)}
 * definido en la interfaz {@code TestIF}. El método genera un saludo personalizado
 * utilizando el nombre proporcionado como parámetro.
 * </p>
 */
public class TestImpl implements TestIF {
    /**
     * Saluda a una persona de forma personalizada.
     *
     * @param name El nombre de la persona a saludar.
     * @return Un saludo personalizado que incluye el nombre de la persona
     * y el nombre de la instancia de la clase.
     */
    public String hello(String name) {
        // Retorna un saludo en formato "Hello <name>, this is <instance>"
        return String.format("Hello %s, this is %s", name, this);
    }
}
