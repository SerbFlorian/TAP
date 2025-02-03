package factory; // Paquete donde se encuentra la clase

/**
 * Clase cliente que demuestra el uso del patrón de diseño Factory.
 * El cliente utiliza la interfaz {@link AbstractCarFactory} para interactuar con
 * la fábrica sin necesidad de conocer las implementaciones concretas de los coches.
 */
public class Main {
    /**
     * **Contrato:** Las interfaces {@link AbstractCar} y {@link AbstractCarFactory} son la "PADRE"
     * de las implementaciones concretas. El cliente no conoce las clases específicas,
     * solo interactúa con las interfaces.
     * <p>
     * **Asignación Polimórfica:** new SpanishCarFactory()
     * <p>
     * **Dynamic Binding:** car.getDriverSide() -> .getDriverSide()
     */
    public static void main(String args[]) {
        // El cliente utiliza una fábrica concreta para crear un coche
        AbstractCarFactory factory = new SpanishCarFactory();

        // El cliente puede trabajar con la fábrica de manera uniforme, sin importar su tipo concreto.
        // También puede crear un coche y usarlo sin conocer los detalles de su creación ni su tipo específico
        AbstractCar car = factory.createCar();

        // Imprime el lado del volante del coche creado
        System.out.println(car.getDriverSide());

        System.out.println("-------------------------");
        // lo mismo pero con UKCar
        factory = new UKCarFactory();

        car = factory.createCar();

        System.out.println(car.getDriverSide());
    }
}
