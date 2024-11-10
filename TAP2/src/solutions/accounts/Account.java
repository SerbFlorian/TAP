package solutions.accounts;

/**
 * Clase `Account` que representa una cuenta bancaria con su respectiva información.
 * Cada cuenta incluye un identificador, un nombre, un tipo de cuenta y un saldo.
 */
public class Account {

    private String id;       // Identificador único de la cuenta
    private String name;     // Nombre del titular de la cuenta
    private AccType type;    // Tipo de cuenta, utilizando el enumerado AccType
    private double balance;  // Saldo actual de la cuenta

    /**
     * Constructor para inicializar una cuenta con los valores dados.
     *
     * @param id      Identificador de la cuenta.
     * @param name    Nombre del titular de la cuenta.
     * @param type    Tipo de cuenta, definido por el enumerado AccType.
     * @param balance Saldo inicial de la cuenta.
     */
    public Account(String id, String name, AccType type, double balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    /**
     * Constructor alternativo que acepta el tipo de cuenta como cadena y lo convierte al enumerado AccType.
     *
     * @param id      Identificador de la cuenta.
     * @param name    Nombre del titular de la cuenta.
     * @param type    Tipo de cuenta en forma de cadena.
     * @param balance Saldo inicial de la cuenta.
     */
    public Account(String id, String name, String type, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

        // Convierte el tipo de cuenta en cadena al tipo enumerado AccType
        switch (type) {
            case "IF": // Cuenta de inversión
                this.type = AccType.IF;
                break;
            case "CA": // Cuenta corriente
                this.type = AccType.CA;
                break;
            case "SA": // Cuenta de ahorros
                this.type = AccType.SA;
                break;
            case "BA": // Cuenta bancaria estándar
                this.type = AccType.BA;
                break;
            default:
                throw new IllegalArgumentException("Tipo de cuenta no reconocido: " + type);
        }
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return Saldo de la cuenta.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Obtiene el tipo de cuenta.
     *
     * @return Tipo de cuenta como un valor de `AccType`.
     */
    public AccType getType() {
        return type;
    }

    /**
     * Realiza un depósito en la cuenta, incrementando el saldo.
     *
     * @param money Cantidad a depositar.
     */
    public void deposit(double money) {
        balance += money;
    }

    /**
     * Retorna una representación en cadena de la cuenta, mostrando el nombre,
     * saldo y tipo de cuenta.
     *
     * @return Representación en cadena de la cuenta.
     */
    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", type=" + type +
                '}';
    }
}
