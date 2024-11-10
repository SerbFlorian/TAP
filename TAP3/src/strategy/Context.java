package strategy;

/**
 * Contexto que utiliza una estrategia específica para ejecutar operaciones.
 * <p>
 * La clase Context es responsable de utilizar una instancia de la interfaz Strategy
 * para delegar la ejecución de una operación matemática específica (por ejemplo, suma, resta, multiplicación).
 * <p>
 * Almacena la estrategia seleccionada y permite cambiarla en tiempo de ejecución.
 */
public class Context {
    // Referencia a la estrategia que se va a utilizar
    private Strategy strategy;

    /**
     * Constructor que inicializa el contexto con una estrategia específica.
     *
     * @param strategy La estrategia que se utilizará para realizar una operación.
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Ejecuta la operación definida por la estrategia asociada.
     * <p>
     * Delegará la ejecución de la operación a la estrategia actual (por ejemplo, suma, resta o multiplicación).
     *
     * @param num1 El primer número para la operación.
     * @param num2 El segundo número para la operación.
     * @return El resultado de la operación según la estrategia actual.
     */
    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
