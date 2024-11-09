package bank;

/**
 * Clase de prueba para el funcionamiento del sistema bancario.
 * <p>
 * La clase UseBank crea instancias de clientes, cuentas y un banco. Luego,
 * realiza operaciones de prueba, como depósitos, retiros y una revisión de
 * cuentas para verificar el funcionamiento correcto del sistema.
 *
 * @version 1.0
 * @see Bank
 * @see Account
 * @see Customer
 * @see NoMoney
 * @since 9/14/15
 */
public class UseBank {

    /**
     * Método principal que ejecuta el programa de prueba.
     * <p>
     * Crea clientes, cuentas y un banco. Añade las cuentas al banco,
     * realiza depósitos y retiros, y ejecuta una revisión de todas
     * las cuentas para aplicar intereses y comisiones.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear clientes
        Customer c1 = new Customer("1", "pedro");
        Customer c2 = new Customer("2", "pep");
        Customer c3 = new Customer("3", "pau");

        // Crear cuentas para los clientes
        Account a1 = new CheckingAccount(90, c1);
        Account a2 = new SaveAccount(100, c2);
        Account a3 = new InvestFund(10, c3);
        Account a4 = new BonusAccount(10, c3);

        // Crear banco y agregar cuentas y clientes
        Bank b1 = new Bank("TAP");
        b1.addAccount(a1);
        b1.addAccount(a2);
        b1.addAccount(a3);
        b1.addAccount(a4);

        b1.addCustomer(c1);
        b1.addCustomer(c2);
        b1.addCustomer(c3);

        // Mostrar todas las cuentas del banco
        System.out.println("Cuentas iniciales:");
        b1.showAccounts();

        // Realizar un depósito en la cuenta a1
        a1.deposit(10);

        // Intentar retirar dinero de la cuenta de inversión (bloqueada para retiros)
        // Al ser cuenta de INVERSIONES, en esta cuenta NO se permiten los retiros
        try {
            a3.withdraw(1);
        } catch (NoMoney e1) {
            System.out.println(e1.getMessage());// Mensaje: InvestFund is locked
        }

        // Intentar retirar una cantidad superior al saldo en la cuenta de bonificación
        try {
            a4.withdraw(100);
        } catch (NoMoney e1) {
            System.out.println(e1.getMessage()); // Mensaje: Saldo insuficiente
        }

        // Mostrar cuentas antes de la revisión
        System.out.println("Antes de la revisión:");
        b1.showAccounts();

        // Ejecutar la revisión de cuentas en el banco
        b1.revision();

        // Mostrar cuentas después de la revisión
        System.out.println("Después de la revisión:");
        b1.showAccounts();
    }
}
