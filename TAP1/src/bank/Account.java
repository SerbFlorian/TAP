package bank;

/**
 * Clase que representa una cuenta bancaria.
 * <p>
 * Permite realizar operaciones básicas de depósito, retiro y revisión de saldo con intereses.
 * Cada cuenta tiene un saldo, un propietario (cliente) y una tasa de interés.
 *
 * @author Pedro
 * @version 1.0
 * @since 9/14/15
 */
public class Account {
    /**
     * Saldo de la cuenta.
     */
    protected double balance;

    /**
     * Propietario de la cuenta.
     */
    private Customer owner;

    /**
     * Tasa de interés aplicada a la cuenta.
     */
    protected double interest;

    /**
     * Constructor de la clase Account.
     *
     * @param balance Saldo inicial de la cuenta.
     * @param owner   Propietario de la cuenta.
     */
    public Account(double balance, Customer owner) {
        this.balance = balance;
        this.owner = owner;
    }

    /**
     * Establece la tasa de interés de la cuenta.
     *
     * @param interest Nueva tasa de interés.
     */
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     * Deposita una cantidad de dinero en la cuenta.
     *
     * @param amount Cantidad de dinero a depositar.
     */
    public void deposit(double amount) {
        balance = balance + amount;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param amount Cantidad de dinero a retirar.
     * @throws NoMoney Si la cantidad a retirar es mayor al saldo disponible.
     */
    public void withdraw(double amount) throws NoMoney {
        if (amount > balance) {
            throw new NoMoney("Saldo insuficiente");
        } else {
            balance = balance - amount;
        }
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo actual de la cuenta.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retorna el propietario de la cuenta.
     *
     * @return El propietario (cliente) de la cuenta.
     */
    public Customer getOwner() {
        return owner;
    }

    /**
     * Establece el propietario de la cuenta.
     *
     * @param owner Nuevo propietario de la cuenta.
     */
    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    /**
     * Obtiene la tasa de interés de la cuenta.
     *
     * @return Tasa de interés de la cuenta.
     */
    public double getInterest() {
        return interest;
    }

    /**
     * Obtiene la comisión aplicada en la cuenta.
     * Por defecto, la comisión es 1.
     *
     * @return Comisión aplicada en la cuenta.
     */
    public double getComission() {
        return 1;
    }

    /**
     * Realiza una revisión de la cuenta aplicando la tasa de interés y descontando la comisión.
     * Incrementa el saldo en función de la tasa de interés y resta la comisión.
     */
    public void revision() {
        balance = balance + balance * getInterest() - getComission();
    }

    /**
     * Devuelve una representación en cadena de la cuenta, que incluye el saldo y el propietario.
     *
     * @return Representación en cadena de la cuenta.
     */
    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", owner=" + owner +
                '}';
    }
}
