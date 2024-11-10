package vthreads;

/**
 * Clase que extiende la clase Thread para crear un hilo y ejecutar
 * un mensaje en consola.
 */
public class HelloThread extends Thread {
    // Contracte: Thread
    // Assignacio Polimorfica: HelloThread
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
        // Crear una nueva instancia de HelloThread y llamar a start() para iniciar el hilo.
        (new HelloThread()).start();
    }
}
