package template_y_strategy;

/**
 * Clase que implementa la estrategia de pago utilizando tarjeta de crédito.
 * Esta clase proporciona el comportamiento específico para procesar el pago mediante tarjeta de crédito.
 */
public class CreditCardPayment implements PaymentStrategy {
    /**
     * Procesa el pago utilizando tarjeta de crédito.
     * Este método simula la acción de realizar un pago con tarjeta de crédito,
     * mostrando un mensaje con el monto a pagar.
     *
     * @param amount El monto a pagar con tarjeta de crédito.
     */
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago de tarjeta de crédito: " + amount);
    }
}
