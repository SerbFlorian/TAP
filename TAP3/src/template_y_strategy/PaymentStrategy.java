package template_y_strategy;

/**
 * Interfaz que define la estrategia de pago.
 * Cada clase que implemente esta interfaz proporcionará su propia forma de procesar un pago.
 */
public interface PaymentStrategy {
    /**
     * Método para procesar un pago con una estrategia específica.
     *
     * @param amount El monto a pagar
     */
    void processPayment(double amount);
}
