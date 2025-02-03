package structures;

/**
 * Clase que representa a un cliente con su nombre y edad.
 * Esta clase proporciona métodos para obtener la edad y el nombre del cliente.
 */
public class Client {

    // Atributos de la clase Client
    private String name;  // Nombre del cliente
    private int age;      // Edad del cliente

    /**
     * Constructor que inicializa un objeto `Client` con el nombre y la edad proporcionados.
     *
     * @param name Nombre del cliente.
     * @param age  Edad del cliente.
     */
    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Obtiene la edad del cliente.
     *
     * @return Edad del cliente.
     */
    public int getAge() {
        return age;  // Devuelve la edad del cliente
    }

    /**
     * Obtiene el nombre del cliente.
     *
     * @return Nombre del cliente.
     */
    public String getName() {
        return name;  // Devuelve el nombre del cliente
    }
}
