package others;

import java.util.Date;
import java.util.Properties;

/**
 * Ejemplo de auto-documentación que lista la información del sistema disponible en una máquina.
 */
public class Property {
    /**
     * Punto de ejecución de esta clase.
     * <p>
     * Este método muestra la fecha actual, las propiedades del sistema y el uso de memoria.
     *
     * @param args Array de cadenas que contiene los argumentos pasados al programa (no utilizado en este caso).
     * @throws exception Este método no lanza ninguna excepción.
     */
    public static void main(String[] args) {
        // Imprime la fecha actual
        System.out.println(new Date());

        // Obtiene las propiedades del sistema
        Properties p = System.getProperties();
        // Lista las propiedades del sistema
        p.list(System.out);

        System.out.println("--- Uso de Memoria:");

        // Obtiene el objeto Runtime para gestionar la memoria
        Runtime rt = Runtime.getRuntime();

        // Imprime la memoria total y la memoria libre
        System.out.println("Memoria Total = " + rt.totalMemory()
                + ", Memoria Libre = " + rt.freeMemory());
    }

    /**
     * Calcula el máximo entre dos enteros o -1 si son iguales.
     *
     * @param a Primer número entero a comparar.
     * @param b Segundo número entero a comparar.
     * @return El valor máximo entre los dos números, o -1 si son iguales.
     * @throws exception Este método no lanza ninguna excepción.
     */
    public static int maximum(int a, int b) {
        // Compara los dos números y retorna el máximo o -1 si son iguales.
        if (a > b)
            return a;
        else if (a < b)
            return b;
        else
            return -1;
    }
}
