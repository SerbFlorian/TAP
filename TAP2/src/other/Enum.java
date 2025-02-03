package other;

import java.util.Arrays;

/**
 * Esta clase demuestra el uso de un tipo enumerado (enum) llamado Season que representa las estaciones del año.
 * Permite mostrar el uso de un enum en un switch y listar sus valores.
 */
public class Enum {
    // Definición del enum para representar las estaciones del año
    enum Season {WINTER, SPRING, SUMMER, FALL}

    public static void main(String[] args) {

        // Declaración de una variable de tipo Season y asignación de una estación
        Season temporada;

        temporada = Season.SUMMER;

        // Uso de un switch para ejecutar código específico basado en el valor de temporada
        switch (temporada) {
            case SUMMER:
                System.out.println("verano");
                break;
            case FALL:
                System.out.println("otoño");
                break;
            case SPRING:
                System.out.println("primavera");
                break;
            case WINTER:
                System.out.println("invierno");
        }

        // Uso del método values() para obtener todos los valores del enum
        Season lista[] = Season.values();
        for (Season s : lista) {
            System.out.println(s); // Imprime cada estación en el enum
        }
        // Otra forma de imprimir los valores del enum usando expresiones lambda
        // importanto java.util.Arrays.asList para poder usar el método forEach
        /*Arrays.asList(lista).forEach(System.out::println);*/
    }
}
