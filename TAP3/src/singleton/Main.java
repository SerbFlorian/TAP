package singleton;

/**
 * Clase principal que demuestra el uso del patrón Singleton en la clase {@link Car}.
 * <p>El patrón Singleton asegura que solo haya una instancia de la clase {@link Car}, que se puede acceder globalmente
 * a través del método estático {@link Car#getInstance()}.</p>
 *
 * <p>En este ejemplo, se muestra cómo crear y utilizar la única instancia de la clase {@link Car}, que no puede
 * ser instanciada directamente mediante el constructor.</p>
 *
 * @author Pedro
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        // No se puede crear una nueva instancia con "new" debido al constructor privado de la clase Car
        // Car myCar = new Car(); // Esto causaría un error de compilación

        // Obtener la instancia única de la clase Car
        Car myCar = Car.getInstance();
        myCar.run();  // Ejecuta el coche (nivel de combustible es 0 al inicio)

        // Llenar el tanque de combustible
        myCar.fillUp();
        myCar.run();  // Ejecuta el coche nuevamente (después de llenar el combustible)

        // myCar2 se refiere a la misma instancia que myCar (Singleton en acción)
        Car myCar2 = Car.getInstance();
        myCar2.run();  // Ejecuta el coche nuevamente (se comparte la misma instancia)
    }
}
