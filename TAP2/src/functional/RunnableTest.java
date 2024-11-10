package functional;

/**
 * Esta clase demuestra cómo utilizar la interfaz `Runnable` con una implementación anónima y con una expresión lambda.
 * Se crean dos instancias de `Runnable`: una utilizando una clase anónima y otra utilizando una expresión lambda,
 * ambas imprimiendo un mensaje en la consola cuando se ejecutan.
 *
 * @author MikeW
 */
public class RunnableTest {
    public static void main(String[] args) {

        // Imprime un mensaje de inicio en la consola
        System.out.println("=== RunnableTest ===");

        // Runnable con clase anónima
        // Se define una implementación de la interfaz Runnable utilizando una clase anónima.
        // El método `run` contiene la lógica que se ejecutará cuando el Runnable sea invocado.
        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                // Imprime el mensaje "Hello world one!" en la consola
                System.out.println("Hello world one!(con funcion anonima)");
            }
        };

        // Runnable con expresión Lambda
        // Se define una implementación de la interfaz Runnable utilizando una expresión lambda.
        // La expresión lambda simplifica el código eliminando la necesidad de escribir una clase anónima.
        Runnable r2 = () -> System.out.println("Hello world two!(con lambda)");
        // La expresion lambda permite escribir codigo limpio y legible, eliminando la necesidad de clases anonimas

        // Ejecutar ambos Runnables
        // Aquí se invocan ambos Runnables utilizando el método `run()`.
        r1.run();  // Ejecuta el primer Runnable (clase anónima)
        r2.run();  // Ejecuta el segundo Runnable (lambda)
    }
}
