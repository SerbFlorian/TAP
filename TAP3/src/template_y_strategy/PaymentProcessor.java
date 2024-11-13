package template_y_strategy;

/**
 * Clase abstracta que define el flujo general del proceso de pago utilizando el patrón Template Method.
 * Las clases concretas deben proporcionar sus propias implementaciones para los pasos específicos del proceso.
 */
public abstract class PaymentProcessor {
    /**
     * Método de plantilla que define el flujo general del proceso de pago.
     * Llama a los métodos específicos en el orden adecuado.
     *
     * @param amount El monto a pagar
     */
    public void processOrder(double amount) {
        validatePayment();   // Validación del pago
        executePayment(amount); // Ejecución del pago
        confirmPayment();    // Confirmación del pago
    }

    /**
     * Método abstracto para validar el pago. Debe ser implementado por las clases concretas.
     */
    protected abstract void validatePayment();

    /**
     * Método abstracto para ejecutar el pago. Debe ser implementado por las clases concretas.
     *
     * @param amount El monto a pagar
     */
    protected abstract void executePayment(double amount);

    /**
     * Método abstracto para confirmar el pago. Debe ser implementado por las clases concretas.
     */
    protected abstract void confirmPayment();
}
