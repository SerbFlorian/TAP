package strategy;

/**
 * Clase que implementa la estrategia de resta.
 * <p>
 * Esta clase define la operación matemática específica de resta. Implementa el método
 * `doOperation` de la interfaz `Strategy` para realizar la resta de dos números enteros.
 */
public class OperationSubstract implements Strategy {
    /**
     * Realiza la operación de resta entre dos números.
     *
     * @param num1 El primer número para la operación (minuendo).
     * @param num2 El segundo número para la operación (sustraendo).
     * @return El resultado de restar num2 a num1 (num1 - num2).
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
