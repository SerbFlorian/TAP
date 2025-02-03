package decorator;

/**
 * Esta clase es una implementación de un decorador para la clase Car.
 * Agrega la característica de un sistema de óxido nitroso (nitrous oxide system)
 * a un coche, modificando su descripción y precio.
 */
public class NitroDecorator extends Car {
    // Referencia al coche original que se está decorando
    private Car client;

    /**
     * Constructor para crear un nuevo NitroDecorator.
     * Recibe un coche que será decorado con el sistema de óxido nitroso.
     *
     * @param car El coche que se desea decorar con el sistema de óxido nitroso.
     */
    public NitroDecorator(Car car) {
        super("", 0);  // Llamada al constructor de la clase base (Car)
        client = car;  // Asigna el coche original a la variable client
    }

    /**
     * Devuelve la descripción del coche original, añadiendo el sistema de óxido nitroso.
     *
     * @return La descripción del coche con el sistema de óxido nitroso agregado.
     */
    public String getDescription() {
        return (client.getDescription() + " with nitrous oxide system");
    }

    /**
     * Devuelve el precio del coche original, añadiendo el coste del sistema de óxido nitroso.
     *
     * @return El precio del coche con el costo adicional del sistema de óxido nitroso.
     */
    public float getPrice() {
        return (client.getPrice() + 7000);  // Se añade el precio del sistema de óxido nitroso
    }
}
