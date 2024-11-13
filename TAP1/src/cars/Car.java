package cars;

/**
 * Clase que representa un coche.
 * <p>
 * La clase `Car` contiene los atributos de marca y precio, y proporciona
 * métodos para acceder a estos atributos, así como para comparar y clonar objetos
 * de tipo `Car`. También ofrece una representación en forma de cadena de texto
 * para imprimir los detalles del coche.
 *
 * @version 1.0
 * @since 9/14/15
 */
public class Car {
    private String brand; // Marca del coche
    private int price;    // Precio del coche

    /**
     * Constructor de la clase `Car`.
     * <p>
     * Inicializa un coche con una marca y un precio específicos.
     *
     * @param brand Marca del coche.
     * @param price Precio del coche.
     */
    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    /**
     * Obtiene el precio del coche.
     *
     * @return El precio del coche.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Obtiene la marca del coche.
     *
     * @return La marca del coche.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Método para comparar dos coches y determinar si son iguales.
     * Compara el precio y la marca del coche actual con otro coche pasado como parámetro.
     *
     * @param car2 El coche con el cual se va a comparar.
     * @return `true` si los coches tienen la misma marca y precio, `false` en caso contrario.
     */
    public boolean equals(Car car2) {
        return (car2.getPrice() == this.price)
                && (car2.getBrand().equals(this.brand));
    }

    /**
     * Método para crear una copia exacta de un coche.
     * <p>
     * Este método devuelve una nueva instancia de un coche con las mismas
     * características (marca y precio).
     *
     * @return Una nueva instancia de `Car` con los mismos atributos.
     */
    public Car clone() {
        return new Car(brand, price);
    }

    /**
     * Representación en forma de cadena del objeto `Car`.
     *
     * @return Una cadena que representa la marca y el precio del coche.
     */
    public String toString() {
        return "(" + brand + "," + price + ")";
    }

    /**
     * Establece la marca del coche.
     *
     * @param brand La nueva marca del coche.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Establece el precio del coche.
     *
     * @param price El nuevo precio del coche.
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
