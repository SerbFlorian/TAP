package bank;

/**
 * Clase que representa una cuenta bancaria con bonificación.
 * <p>
 * Esta clase extiende la clase Account y establece una tasa de interés fija
 * para cuentas con bonificación.
 *
 * @author Pedro
 * @version 1.0
 * @see Account
 * @since 9/14/15
 */
public class BonusAccount extends Account {

    /**
     * Constructor de la clase BonusAccount.
     * <p>
     * Inicializa la cuenta con un saldo y un propietario, y establece una
     * tasa de interés fija de 0.6.
     *
     * @param balance Saldo inicial de la cuenta con bonificación.
     * @param owner   Propietario de la cuenta.
     */
    public BonusAccount(int balance, Customer owner) {
        super(balance, owner);
        interest = 0.6; // Establece una tasa de interés específica para cuentas con bonificación.
    }
}
