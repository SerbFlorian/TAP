package vthreads;

import java.time.Duration;

public class PlatformThread {
    // Contracte: no tiene
    // Assignacio Polimorfica: no tiene
    // Dynamic Binding: no tiene
    /**
     * El método principal que crea un millón de hilos, cada uno duerme durante 10 minutos.
     *
     * @param args Argumentos de la línea de comandos (no se usan en este caso).
     */
    public static void main(String[] args) {

        // Bucle que se ejecuta un millón de veces.
        for (int i = 0; i < 1_000_000; i++) {

            // Cada vez que 'i' es múltiplo de 10,000, se imprime su valor.
            if (i % 10_000 == 0) {
                System.out.println(i);  // Imprime el progreso cada 10,000 iteraciones.
            }

            // Crea un nuevo hilo que duerme durante 10 minutos (600,000 milisegundos).
            new Thread(() -> {
                try {
                    // El hilo duerme durante 10 minutos.
                    Thread.sleep(Duration.ofMinutes(10).toMillis());
                } catch (Exception e) {
                    // Captura y muestra cualquier excepción que ocurra.
                    e.printStackTrace();
                }
            }).start();  // Inicia el hilo inmediatamente.
        }
    }
}
