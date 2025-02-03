package vthreads;

/**
 * Clase que implementa la interfaz Runnable para ejecutar un hilo que
 * imprime un mensaje en consola.
 */
public class HelloRunnable implements Runnable {
    // Contracte: Runnable
    // Assignacio Polimorfica: HelloRunnable
    // Dynamic Binding: .start()
    /**
     * Método que se ejecuta cuando el hilo se inicia. Imprime un mensaje en consola.
     */
    public void run() {
        System.out.println("Hello from a thread!");  // Mensaje que se imprime desde el hilo.
    }

    /**
     * Método principal que crea y lanza un hilo.
     *
     * @param args Parámetros de la línea de comandos.
     */
    public static void main(String args[]) {
        // Crear un nuevo objeto Thread y pasar una instancia de HelloRunnable a su constructor.
        // Luego, iniciar el hilo llamando al método start().
        (new Thread(new HelloRunnable())).start();
    }
}
