package vthreads;

/**
 * La clase SleepMessages simula la pausa de 4 segundos entre la impresión de mensajes en consola.
 * <p>
 * Este programa muestra una serie de mensajes, con una pausa de 4 segundos entre cada uno, utilizando
 * el método `Thread.sleep()`. Los mensajes están almacenados en un arreglo y son impresos uno a uno.
 */
public class SleepMessages {
    // Contracte: no tiene
    // Assignacio Polimorfica: no tiene
    // Dynamic Binding: no tiene

    /**
     * Método principal que ejecuta el programa. Imprime mensajes con una pausa de 4 segundos entre cada uno.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     * @throws InterruptedException Si el hilo actual es interrumpido durante la pausa de `Thread.sleep()`.
     */
    public static void main(String args[]) throws InterruptedException {

        // Arreglo de mensajes importantes que se van a imprimir.
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        // Bucle que recorre el arreglo de mensajes.
        for (int i = 0; i < importantInfo.length; i++) {

            // Pausa de 4 segundos antes de imprimir el siguiente mensaje.
            // Esta es la instrucción que provoca que el programa espere 4000 milisegundos (4 segundos).
            Thread.sleep(4000);

            // Imprime el mensaje en la consola.
            System.out.println(importantInfo[i]);
        }
    }
}
