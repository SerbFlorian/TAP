package template_y_strategy;

/**
 * Implementación de la estrategia de pago para PayPal.
 * Esta clase define cómo procesar un pago utilizando PayPal.
 */
public class PayPalPayment implements PaymentStrategy {
    /**
     * Procesa el pago usando PayPal.
     *
     * @param amount El monto a pagar.
     */
    @Override
    public void processPayment(double amount) {
        // Lógica específica para procesar el pago mediante PayPal.
        System.out.println("Procesando pago a través de PayPal: " + amount);
    }
}
