package bank;

/**
 * Excepción personalizada para indicar falta de fondos en una cuenta.
 *
 * La excepción NoMoney se lanza cuando se intenta realizar una operación
 * que requiere más dinero del que está disponible en la cuenta.
 *
 * @see Account
 * @see InvestFund
 *
 * @author Pedro
 * @version 1.0
 * @since 9/14/15
 */
public class NoMoney extends Exception {

    /**
     * Constructor de la excepción NoMoney.
     *
     * Crea una nueva instancia de la excepción con un mensaje descriptivo.
     *
     * @param message Mensaje que describe la causa de la excepción.
     */
    public NoMoney(String message) {
        super(message);
    }
}
