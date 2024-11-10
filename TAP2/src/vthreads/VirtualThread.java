package vthreads;

/**
 * La clase VirtualThread ilustra el uso de hilos virtuales en Java, que están disponibles a partir de Project Loom.
 * El código muestra cómo crear un millón de hilos virtuales que se duermen por 10 minutos,
 * aunque por razones de eficiencia, la creación de estos hilos está comentada.
 * <p>
 * **NOTA:** Para que el código funcione, necesitas tener configurado el entorno de Project Loom.
 * Consulta la guía en la URL proporcionada para más detalles.
 */
public class VirtualThread {
    // Contracte: no tiene
    // Assignacio Polimorfica: no tiene
    // Dynamic Binding: no tiene
    /**
     * Método principal que ejecuta el programa.
     * Crea un millón de hilos virtuales (comentados por defecto).
     * Cada hilo simula un período de espera de 10 minutos, pero solo se imprimen los múltiplos de 10,000.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {

        // Bucle que itera desde 0 hasta 999,999
        for (int i = 0; i < 1_000_000; i++) {

            // Imprime el valor de i cada 10,000 iteraciones para verificar el progreso.
            if (i % 10_000 == 0) {
                System.out.println(i);
            }

            // La creación de los hilos virtuales está comentada por razones de rendimiento.
            // Descomentar la siguiente línea cuando el entorno esté configurado para soportar hilos virtuales.
            /*
            Thread.startVirtualThread(() -> {
                try {
                    // Cada hilo virtual duerme por 10 minutos
                    Thread.sleep(Duration.ofMinutes(10).toMillis());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            */
        }
    }
}
