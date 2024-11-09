package cars;

/**
 * Clase principal para demostrar el uso de la clase `Car`.
 * <p>
 * Esta clase crea varios objetos `Car` y muestra cómo se pueden comparar,
 * clonar y modificar objetos de tipo `Car`. También muestra cómo se pueden
 * manipular las referencias y cómo afecta la modificación de estas.
 *
 * @version 1.0
 * @since 9/14/15
 */
public class UseCar {
    public static void main(String[] args) {

        // Crear coches
        Car myCar = new Car("bmw", 100);    // Coche de marca "bmw" y precio 100
        Car otherCar = new Car("seat", 10);  // Coche de marca "seat" y precio 10
        Car copy = new Car("seat", 10);      // Coche de marca "seat" y precio 10 (igual a otherCar)

        // Comparar direcciones de memoria usando '=='
        if (otherCar == copy)
            // al ser instancias diferentes, su direccion de memroia es diferente, entonces NUNCA se va a cumplir esta condicion
            System.out.println("equals  == otherCar and copy");  // Este bloque no se ejecutará

        // Usar el método equals de la clase Car para comparar atributos
        if (otherCar.equals(copy))
            System.out.println("equals otherCar and copy");  // Este bloque sí se ejecutará

        if (myCar.equals(otherCar))
            System.out.println("equals myCar and otherCar");   // Este bloque no se ejecutará

        // Imprimir la representación del coche 'myCar'
        System.out.println("My car: " + myCar);  // (bmw,100)

        // Crear más coches
        Car peugeot = new Car("peugeot", 900);  // Coche de marca "peugeot" y precio 900
        Car renault;  // Declarar un coche renault
        System.out.println("Peugeot:"+ peugeot);
        // Asignar la referencia de peugeot a renault (ambos apuntan al mismo objeto)
        renault = peugeot;

        // Cambiar la marca del coche peugeot por mercedes
        peugeot.setBrand("mercedes");
        System.out.println("Renault " + renault);  // (mercedes,900)
        System.out.println("Peugeot " + peugeot);  // (mercedes,900)

        // Crear un nuevo coche audi
        Car audi = new Car("audi", 900);  // Coche de marca "audi" y precio 900
        renault = audi.clone();  // Clonar el coche audi a renault
        renault.setBrand("ferrari");  // Cambiar la marca de renault a "ferrari"

        // Imprimir los detalles de los coches renault y audi
        System.out.println("Renault " + renault);  // (ferrari,900)
        System.out.println("Audi: " + audi);      // (audi,900)
    }
}
