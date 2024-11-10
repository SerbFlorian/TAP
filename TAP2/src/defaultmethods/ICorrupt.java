package defaultmethods;

/**
 * Interfaz que representa el comportamiento de una persona corrupta, proporcionando
 * métodos relacionados con el gasto irresponsable de dinero.
 * <p>Incluye un método por defecto {@code blackCard()} que simula el gasto de dinero
 * y un método estático {@code spendLikeCrazy()} que detalla un comportamiento de gasto excesivo.</p>
 * <p>
 * Creado por Pedro el 26/10/14.
 */
interface ICorrupt {

    /**
     * Método por defecto que imprime un mensaje simulando el uso de dinero
     * de manera irresponsable con una "tarjeta negra".
     * <p>Este método se puede sobrescribir en las implementaciones de la interfaz.</p>
     */
    default void blackCard() {
        System.out.println("spending money ...");
    }

    /**
     * Método estático que simula el comportamiento de gastar de forma descontrolada.
     * <p>Este método imprime un mensaje con actividades de alto gasto y está disponible
     * para ser invocado directamente desde la interfaz sin necesidad de instanciarla.</p>
     */
    static void spendLikeCrazy() {
        System.out.println("Restaurants, parties, vacations, ...");
    }
}
