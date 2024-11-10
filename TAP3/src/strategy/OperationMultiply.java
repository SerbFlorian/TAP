package strategy;

/**
 * Clase que implementa la estrategia de multiplicación.
 * <p>
 * Esta clase define la operación matemática específica de multiplicación. Implementa el método
 * `doOperation` de la interfaz `Strategy` para realizar la multiplicación de dos números enteros.
 */
public class OperationMultiply implements Strategy {
    /**
     * Realiza la operación de multiplicación entre dos números.
     *
     * @param num1 El primer número para la operación.
     * @param num2 El segundo número para la operación.
     * @return El resultado de multiplicar num1 por num2.
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
