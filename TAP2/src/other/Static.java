package other;

import static java.lang.System.out;
import static java.lang.Math.*;

/**
 * Esta clase demuestra el uso de importaciones estáticas para simplificar el acceso a métodos y constantes
 * de las clases System y Math.
 * <p>
 * El programa imprime un mensaje en pantalla y realiza un cálculo de raíz cuadrada y coseno usando Math.
 * <p>
 * Created by pedro on 9/9/15.
 */
public class Static {
    public static void main(String[] args) {
        // Uso de out directamente para imprimir (gracias a la importación estática de System.out)
        out.println("pedro" + sqrt(9)); // Imprime "pedro3.0" donde 3.0 es el resultado de sqrt(9)

        // Cálculo del coseno usando la constante PI (Math.PI) multiplicada por 6
        double r = cos(PI * 6); // Almacena el valor del coseno de (PI * 6) en la variable r

        // Se puede agregar una impresión para visualizar el resultado de r si es necesario
        out.println("Coseno de PI * 6: " + r);
    }
}
