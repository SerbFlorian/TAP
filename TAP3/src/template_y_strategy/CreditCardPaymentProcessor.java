package template_y_strategy;

/**
 * Clase que procesa pagos utilizando tarjeta de crédito, extendiendo de la clase abstracta PaymentProcessor.
 * Esta clase define el flujo específico de procesamiento de pagos mediante tarjeta de crédito,
 * utilizando la estrategia de pago definida en PaymentStrategy.
 */
public class CreditCardPaymentProcessor extends PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    /**
     * Constructor que inicializa el procesador de pagos con una estrategia de pago específica.
     *
     * @param paymentStrategy Estrategia de pago que define cómo se procesará el pago.
     */
    public CreditCardPaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Valida el pago mediante tarjeta de crédito. Este método puede incluir validaciones adicionales
     * específicas para el servicio de pagos con tarjeta.
     */
    @Override
    protected void validatePayment() {
        System.out.println("Validando tarjeta de crédito...");
    }

    /**
     * Ejecuta el pago usando la estrategia proporcionada. En este caso, utiliza
     * la estrategia de pago (por ejemplo, tarjeta de crédito) para procesar el monto.
     *
     * @param amount El monto a pagar.
     */
    @Override
    protected void executePayment(double amount) {
        paymentStrategy.processPayment(amount);  // Usa la estrategia de pago
    }

    /**
     * Confirma que el pago se ha realizado correctamente mediante tarjeta de crédito.
     */
    @Override
    protected void confirmPayment() {
        System.out.println("Pago con tarjeta de crédito confirmado.");
    }
}
