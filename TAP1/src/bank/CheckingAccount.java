package bank;

/**
 * Clase que representa una cuenta de cheques.
 * <p>
 * Esta clase extiende la clase Account y establece una tasa de interés fija
 * para cuentas de cheques. Sobrescribe el método de revisión para aplicar
 * el interés sin comisiones.
 *
 * @author Pedro
 * @version 1.0
 * @see Account
 * @see Bank
 * @see Customer
 * @since 9/14/15
 */
public class CheckingAccount extends Account {
    /**
     * Constructor de la clase CheckingAccount.
     * <p>
     * Inicializa la cuenta de cheques con un saldo y un propietario, y establece
     * una tasa de interés fija de 0.1.
     *
     * @param balance Saldo inicial de la cuenta de cheques.
     * @param owner   Propietario de la cuenta.
     */
    public CheckingAccount(int balance, Customer owner) {
        super(balance, owner);
        interest = 0.1; // Establece una tasa de interés específica para cuentas de cheques.
    }

    /**
     * Realiza una revisión de la cuenta de cheques.
     * <p>
     * Aplica la tasa de interés actual al saldo de la cuenta sin deducir comisiones.
     */
    @Override
    public void revision() {
        balance = balance + balance * getInterest();
    }
}
