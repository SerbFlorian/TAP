package strategy;

/**
 * Clase que implementa la estrategia de adición.
 * <p>
 * Esta clase define la operación matemática específica de suma. Implementa el método
 * `doOperation` de la interfaz `Strategy` para realizar la suma de dos números enteros.
 */
public class OperationAdd implements Strategy {
    /**
     * Realiza la operación de suma entre dos números.
     *
     * @param num1 El primer número para la operación.
     * @param num2 El segundo número para la operación.
     * @return El resultado de la suma de num1 y num2.
     */
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
