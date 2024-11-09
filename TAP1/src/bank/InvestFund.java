package bank;

/**
 * Clase que representa un fondo de inversión.
 * <p>
 * La clase InvestFund extiende la clase Account y establece una tasa de interés
 * específica. Esta cuenta está bloqueada, lo que significa que no se permite
 * realizar retiros.
 *
 * @author Pedro
 * @version 1.0
 * @see Account
 * @see Customer
 * @since 9/14/15
 */
public class InvestFund extends Account {

    /**
     * Cantidad asociada al fondo de inversión.
     */
    private double amount;

    /**
     * Constructor de la clase InvestFund.
     * <p>
     * Inicializa un nuevo fondo de inversión con un saldo inicial y un propietario.
     * Establece una tasa de interés fija de 0.34 para el fondo de inversión.
     *
     * @param balance Saldo inicial del fondo de inversión.
     * @param owner   Propietario del fondo de inversión.
     */
    public InvestFund(int balance, Customer owner) {
        super(balance, owner);
        interest = 0.34; // Establece la tasa de interés específica para el fondo de inversión.
    }

    /**
     * Método para realizar un retiro.
     * <p>
     * En un fondo de inversión, los retiros están bloqueados, por lo que este método
     * lanza una excepción NoMoney cuando se intenta retirar una cantidad.
     *
     * @param amount Cantidad que se intenta retirar.
     * @throws NoMoney Siempre lanza esta excepción, ya que los retiros no están permitidos.
     */
    @Override
    public void withdraw(double amount) throws NoMoney {
        throw new NoMoney("InvestFund is locked");
    }
}
