package bank;

/**
 * Clase que representa una cuenta de ahorro.
 *
 * La clase SaveAccount extiende la clase Account y establece una tasa de interés
 * específica del 0.2. Esta cuenta es adecuada para almacenar ahorros y ganar interés.
 *
 * @see Account
 * @see Customer
 *
 * @version 1.0
 * @since 9/14/15
 */
public class SaveAccount extends Account {

    /**
     * Constructor de la clase SaveAccount.
     *
     * Inicializa una nueva cuenta de ahorro con un saldo inicial y un propietario.
     * Establece una tasa de interés fija de 0.2 para la cuenta de ahorro.
     *
     * @param balance Saldo inicial de la cuenta de ahorro.
     * @param owner   Propietario de la cuenta de ahorro.
     */
    public SaveAccount(int balance, Customer owner) {
        super(balance, owner);
        interest = 0.2; // Establece la tasa de interés específica para la cuenta de ahorro.
    }
}
