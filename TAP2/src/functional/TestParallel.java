package functional;

import java.util.stream.IntStream;

/**
 * Ejemplo de uso de streams paralelos en Java.
 * Este programa crea un stream de enteros, los procesa en paralelo,
 * y mide el tiempo transcurrido en la ejecución de cada operación.
 */
public class TestParallel {
    public static void main(String[] args) {
        // Guardar el tiempo de inicio para medir la duración de las operaciones
        long start = System.currentTimeMillis();

        // Crear un stream de enteros desde 0 hasta 19
        IntStream s = IntStream.range(0, 20);

        // Comentada la configuración del número de hilos para el ForkJoinPool
        // Se puede descomentar y configurar para especificar el número de hilos a utilizar
        // System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "20");

        // Usar un stream paralelo para procesar los elementos
        s.parallel().forEach(i -> {
            try {
                // Simula una operación de larga duración (por ejemplo, una consulta a la base de datos)
                Thread.sleep(100);
            } catch (Exception ignore) {
                // Ignorar excepciones por simplificación
            }
            // Imprimir el tiempo transcurrido desde el inicio de la ejecución
            System.out.print((System.currentTimeMillis() - start) + " ");
        });
        // Nota: La salida será desordenada debido a la concurrencia de los hilos.
    }
}
