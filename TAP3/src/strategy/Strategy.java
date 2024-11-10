package strategy;

/**
 * Interfaz que define una operación matemática a realizar.
 *
 * Esta interfaz define un contrato para las clases que implementan diferentes
 * tipos de operaciones matemáticas, como suma, resta o multiplicación.
 */
public interface Strategy {
    /**
     * Realiza una operación matemática entre dos números.
     *
     * @param num1 El primer número para la operación.
     * @param num2 El segundo número para la operación.
     * @return El resultado de la operación.
     */
    int doOperation(int num1, int num2);
}
