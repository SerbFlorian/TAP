package template_y_strategy;

/**
 * *Template* Method establece la estructura general del algoritmo, garantizando que el flujo del proceso
 * se mantenga consistente, mientras que *Strategy* permite la flexibilidad de cambiar el comportamiento
 * de los pasos dentro de ese flujo (como cambiar la estrategia de pago) sin afectar el algoritmo general.
 */
public class Main {
    public static void main(String[] args) {
        // Crear la estrategia de pago
        PaymentStrategy creditCardStrategy = new CreditCardPayment();  // Estrategia de pago con tarjeta de crédito
        PaymentStrategy paypalStrategy = new PayPalPayment();         // Estrategia de pago con PayPal

        // Crear los procesadores de pago usando las estrategias
        PaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor(creditCardStrategy);  // Procesador para tarjeta de crédito
        PaymentProcessor paypalProcessor = new PayPalPaymentProcessor(paypalStrategy);              // Procesador para PayPal

        // Procesar pagos con diferentes estrategias
        System.out.println("Procesando pago con tarjeta de crédito:");
        creditCardProcessor.processOrder(100.0);  // Monto del pago con tarjeta de crédito

        System.out.println("\nProcesando pago con PayPal:");
        paypalProcessor.processOrder(200.0);  // Monto del pago con PayPal
    }
}
