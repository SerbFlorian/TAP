package singleton;

/**
 * Clase que implementa el patrón Singleton, asegurando que **SOLO haya <strong>1 INSTANCIA</strong> de la clase {@link Car}**.
 *
 * <p>El patrón Singleton garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a ella.
 * En este caso, la clase {@link Car} simula un coche con un nivel de combustible que se puede llenar y usar.</p>
 *
 * <p>El constructor de la clase es privado, lo que impide que otras clases creen instancias de {@link Car}.
 * La única instancia se proporciona a través del método estático {@link Car#getInstance()}.</p>
 *
 * @author Pedro
 * @version 1.0
 */
public class Car {
    // La única instancia de la clase Car
    private static Car car = new Car();

    // Nivel de combustible inicial (0)
    private int fuelLevel = 0;

    // El constructor privado asegura que no se pueden crear instancias fuera de esta clase
    private Car() {
    }

    /**
     * Método estático para obtener la instancia única de la clase {@link Car}.
     *
     * @return La única instancia de {@link Car}.
     */
    public static Car getInstance() {
        return car;
    }

    /**
     * Método que llena el depósito de combustible del coche.
     * El nivel de combustible se establece en 4.
     */
    public void fillUp() {
        fuelLevel = 4;
    }

    /**
     * Método que simula el funcionamiento del coche.
     * Si el nivel de combustible es 0, se muestra un mensaje indicando que se debe llenar el depósito.
     * Si el nivel de combustible es mayor que 0, se reduce el nivel de combustible y el coche "arranca".
     */
    public void run() {
        if (fuelLevel == 0) {
            System.out.println("Fill up please");
        } else {
            fuelLevel--;
            System.out.println("Ruuuuuun!!");
        }
    }
}
