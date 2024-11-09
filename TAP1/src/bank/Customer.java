package bank;

/**
 * Clase que representa un cliente de un banco.
 * <p>
 * La clase Customer almacena información básica del cliente, como su
 * identificación, nombre, dirección y número de teléfono.
 *
 * @author Pedro
 * @version 1.0
 * @see Account
 * @see Bank
 * @since 9/14/15
 */
public class Customer {

    /**
     * Identificación del cliente.
     */
    private String id;

    /**
     * Nombre del cliente.
     */
    private String name;

    /**
     * Dirección del cliente.
     */
    private String address;

    /**
     * Número de teléfono del cliente.
     */
    private String phoneNumber;

    /**
     * Constructor de la clase Customer.
     * <p>
     * Inicializa un nuevo cliente con un ID y nombre.
     *
     * @param id   Identificación única del cliente.
     * @param name Nombre del cliente.
     */
    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Devuelve una representación en cadena del cliente, que incluye
     * el nombre y la identificación.
     *
     * @return Una cadena que representa al cliente.
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    /**
     * Obtiene el ID del cliente.
     *
     * @return El ID del cliente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del cliente.
     *
     * @param id El nuevo ID del cliente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return El nombre del cliente.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del cliente.
     *
     * @param name El nuevo nombre del cliente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la dirección del cliente.
     *
     * @return La dirección del cliente.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Establece la dirección del cliente.
     *
     * @param address La nueva dirección del cliente.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     *
     * @return El número de teléfono del cliente.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Establece el número de teléfono del cliente.
     *
     * @param phoneNumber El nuevo número de teléfono del cliente.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
