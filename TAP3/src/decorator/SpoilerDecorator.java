package decorator;

/**
 * Esta clase es una implementación de un decorador para la clase Car.
 * Agrega la característica de un spoiler al coche, modificando su descripción y precio.
 */
public class SpoilerDecorator extends Car {

    // Referencia al coche original que se está decorando
    private Car client;

    /**
     * Constructor para crear un nuevo SpoilerDecorator.
     * Recibe un coche que será decorado con un spoiler.
     *
     * @param car El coche que se desea decorar con el spoiler.
     */
    public SpoilerDecorator(Car car) {
        super("", 0);  // Llamada al constructor de la clase base (Car)
        client = car;  // Asigna el coche original a la variable client
    }

    /**
     * Devuelve la descripción del coche original, añadiendo la característica del spoiler.
     *
     * @return La descripción del coche con el spoiler agregado.
     */
    public String getDescription() {
        return (client.getDescription() + " with a spoiler");
    }

    /**
     * Devuelve el precio del coche original, añadiendo el costo del spoiler.
     *
     * @return El precio del coche con el costo adicional del spoiler.
     */
    public float getPrice() {
        return (client.getPrice() + 200);  // Se añade el precio del spoiler
    }
}
