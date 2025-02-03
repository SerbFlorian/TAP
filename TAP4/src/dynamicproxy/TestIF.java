package dynamicproxy;

/**
 * Interfaz que define un método simple para saludar.
 * <p>
 * La interfaz {@code TestIF} tiene un solo método, {@link #hello(String)},
 * que acepta un nombre como argumento y devuelve un saludo en forma de cadena.
 * </p>
 *
 * <p>Este ejemplo utiliza un proxy dinámico para implementar esta interfaz.</p>
 *
 * @see <a href="http://javahowto.blogspot.com.es/2011/12/java-dynamic-proxy-example.html">Ejemplo de Proxy Dinámico en Java</a>
 */
interface TestIF {
    /**
     * Método para saludar a una persona.
     *
     * @param name El nombre de la persona a saludar.
     * @return Un saludo personalizado en forma de cadena.
     */
    String hello(String name);
}
