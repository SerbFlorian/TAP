package decorator;

/**
 * Esta clase representa un coche con una descripción y un precio.
 * Es una clase base que se utilizará como parte de la implementación del patrón Decorator.
 * Un coche puede ser decorado con características adicionales a través de clases decoradoras.
 */
public class Car {

    // Descripción del coche, por ejemplo, el modelo o características.
    private String description;

    // Precio del coche
    private float price;

    /**
     * Constructor para crear una nueva instancia de un coche con la descripción y el precio proporcionados.
     *
     * @param description Descripción del coche (modelo, tipo, etc.).
     * @param price       Precio del coche.
     */
    public Car(String description, float price) {
        this.description = description;
        this.price = price;
    }

    /**
     * Obtiene la descripción del coche.
     *
     * @return La descripción del coche.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Obtiene el precio del coche.
     *
     * @return El precio del coche.
     */
    public float getPrice() {
        return price;
    }
}
