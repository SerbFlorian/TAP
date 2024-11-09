package bank;

import java.util.LinkedList;
import java.util.List;

/**
 * Clase que representa un banco.
 * <p>
 * El banco tiene un nombre, una lista de cuentas y una lista de clientes.
 * Permite realizar operaciones para agregar y eliminar cuentas y clientes,
 * mostrar todas las cuentas y realizar una revisión de saldo en cada cuenta.
 *
 * @author Pedro
 * @version 1.0
 * @since 9/14/15
 */
public class Bank {
    /**
     * Nombre del banco.
     */
    private String name;

    /**
     * Lista de cuentas asociadas al banco.
     */
    private List<Account> accounts = new LinkedList<Account>();

    /**
     * Lista de clientes asociados al banco.
     */
    private List<Customer> customers = new LinkedList<Customer>();

    /**
     * Constructor de la clase Bank.
     *
     * @param name Nombre del banco.
     */
    public Bank(String name) {
        this.name = name;
    }

    /**
     * Agrega una nueva cuenta al banco.
     *
     * @param newAccount La nueva cuenta a agregar.
     */
    public void addAccount(Account newAccount) {
        accounts.add(newAccount);
    }

    /**
     * Elimina una cuenta existente del banco.
     *
     * @param oldAccount La cuenta a eliminar.
     */
    public void removeAccount(Account oldAccount) {
        accounts.remove(oldAccount);
    }

    /**
     * Obtiene la lista de todas las cuentas del banco.
     *
     * @return Lista de cuentas del banco.
     */
    public List<Account> getAccounts() {
        return accounts;
    }

    /**
     * Agrega un nuevo cliente al banco.
     *
     * @param newCustomer El nuevo cliente a agregar.
     */
    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }

    /**
     * Elimina un cliente existente del banco.
     *
     * @param oldCustomer El cliente a eliminar.
     */
    public void removeCustomer(Customer oldCustomer) {
        customers.remove(oldCustomer);
    }

    /**
     * Obtiene la lista de todos los clientes del banco.
     *
     * @return Lista de clientes del banco.
     */
    public List<Customer> getCustomers() {
        return customers;
    }

    /**
     * Muestra en consola todas las cuentas del banco.
     */
    public void showAccounts() {
        for (Account a : accounts) {
            System.out.println(a);
        }
    }

    /**
     * Realiza una revisión de saldo en todas las cuentas del banco,
     * aplicando la tasa de interés y restando la comisión correspondiente.
     */
    public void revision() {
        for (Account acc : accounts) {
            acc.revision();
        }
    }
}
