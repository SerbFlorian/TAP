package strategy;

/**
 * CONTRACTE -> Strategy
 * ASSIGNACIO POLIMORFICA -> new OperationAdd() y new OperationSubstract() y new OperationMultiply(),
 * ja que es on espero la classe pare i li assigno la filla
 * DYNAMIC BIDING -> executeStrategy()
 */

// Clase principal que demuestra el uso del patrón de diseño Strategy.
// Este ejemplo simula una calculadora que realiza operaciones de suma, resta y multiplicación utilizando diferentes estrategias.
public class Main {
    /**
     * Método principal que ejecuta diferentes operaciones matemáticas (suma, resta, multiplicación)
     * utilizando el patrón de diseño Strategy.
     * <p>
     * Se crea un objeto `Context` que recibe una estrategia diferente (suma, resta, multiplicación)
     * y luego se ejecutan las operaciones con los valores 10 y 5.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {

        // Crear un contexto con la estrategia de suma y ejecutar la operación
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        // Cambiar la estrategia a resta y ejecutar la operación
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        // Cambiar la estrategia a multiplicación y ejecutar la operación
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
