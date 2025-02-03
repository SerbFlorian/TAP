package template_y_strategy;

/**
 * Clase que procesa pagos utilizando PayPal, extendiendo de la clase abstracta PaymentProcessor.
 * Esta clase define el flujo específico de procesamiento de pagos mediante PayPal,
 * utilizando la estrategia de pago definida en PaymentStrategy.
 */
public class PayPalPaymentProcessor extends PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    /**
     * Constructor que inicializa el procesador de pagos con una estrategia de pago específica.
     *
     * @param paymentStrategy Estrategia de pago que define cómo se procesará el pago.
     */
    public PayPalPaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Valida el pago mediante PayPal. Este método puede incluir validaciones adicionales
     * específicas para el servicio de PayPal.
     */
    @Override
    protected void validatePayment() {
        System.out.println("Validando PayPal...");
    }

    /**
     * Ejecuta el pago usando la estrategia proporcionada. En este caso, utiliza
     * la estrategia de pago (por ejemplo, PayPal) para procesar el monto.
     *
     * @param amount El monto a pagar.
     */
    @Override
    protected void executePayment(double amount) {
        paymentStrategy.processPayment(amount);  // Usa la estrategia de pago
    }

    /**
     * Confirma que el pago se ha realizado correctamente mediante PayPal.
     */
    @Override
    protected void confirmPayment() {
        System.out.println("Pago con PayPal confirmado.");
    }
}
