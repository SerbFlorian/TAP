package dynamicproxy;
/**
 * CONTRACTE -> TestIF
 * ASSIGNACIO POLIMORFICA -> toda la linea 11,
 * ja que es on espero la classe pare i li assigno la filla
 * DYNAMIC BIDING -> .equal() y hello()
 */

import java.lang.reflect.*;

/**
 * Clase de prueba para demostrar el uso de un Proxy dinámico en Java.
 * Utiliza reflexión para crear una instancia de un proxy que implementa la interfaz {@link TestIF},
 * y maneja las llamadas a sus métodos mediante un {@link TestInvocationHandler}.
 */
public class Test {
    /**
     * Método principal que ejecuta las pruebas sobre el proxy dinámico.
     * Se crea un proxy para la interfaz {@link TestIF} y se invocan varios métodos
     * como {@link TestIF#hello(String)}, {@link Object#toString()}, {@link Object#hashCode()},
     * y {@link Object#equals(Object)}.
     * <p>
     * Los resultados de cada invocación se imprimen por consola.
     */
    public static void main(String... args) {
        // Crear un proxy dinámico para la interfaz TestIF, que delega las llamadas a TestImpl
        TestIF t = (TestIF) Proxy.newProxyInstance(
                TestIF.class.getClassLoader(), // Cargador de clases
                new Class<?>[]{TestIF.class}, // La interfaz que implementará el proxy
                new TestInvocationHandler(new TestImpl()) // Manejador de invocaciones, que delega en TestImpl
        );

        // Invocar el método hello() del proxy
        System.out.printf("t.hello(Duke): %s%n", t.hello("Duke"));

        // Invocar el método toString() del proxy
        System.out.printf("t.toString(): %s%n", t);

        // Invocar el método hashCode() del proxy
        System.out.printf("t.hashCode(): %H%n", t);

        // Invocar el método equals() del proxy, comparando con sí mismo
        System.out.printf("t.equals(t): %B%n", t.equals(t));

        // Invocar el método equals() del proxy, comparando con un objeto diferente
        System.out.printf("t.equals(new Object()): %B%n", t.equals(new Object()));

        // Invocar el método equals() del proxy, pasando null como argumento
        System.out.printf("t.equals(null): %B%n", t.equals(null));
    }
}
