package factoryAbstract;
/**
 * CONTRACTE: {@link AbstractCar} and {@link AbstractEngine} and {@link AbstractCarFactory}
 * ASSIGNACIO POLIMORFICA: new SpanishCarFactory() and new UKCarFactory()
 * DYNAMIC BINDING: .getDriverSide() and .getFuelType()
 */

public class Main {
    /**
     * Clase cliente que utiliza el patrón Abstract Factory para crear coches y motores de diferentes regiones.
     * En este ejemplo, el cliente interactúa únicamente con las interfaces abstractas, lo cual permite la creación
     * de diferentes tipos de productos (coche y motor) sin conocer sus implementaciones concretas.
     */
    public static void main(String[] args) {
        // Cliente utiliza una fábrica concreta para crear una familia de productos españoles
        AbstractCarFactory spanishFactory = new SpanishCarFactory();
        AbstractCar spanishCar = spanishFactory.createCar();
        AbstractEngine spanishEngine = spanishFactory.createEngine();

        System.out.println("Lado del conductor del coche español: " + spanishCar.getDriverSide());
        System.out.println("Tipo de combustible del motor del coche español: " + spanishEngine.getFuelType());
        System.out.println("--------------------------------------------------");
        // Cliente utiliza una fábrica concreta para crear una familia de productos del Reino Unido
        AbstractCarFactory ukFactory = new UKCarFactory();
        AbstractCar ukCar = ukFactory.createCar();
        AbstractEngine ukEngine = ukFactory.createEngine();

        System.out.println("Lado del conductor del coche del Reino Unido: " + ukCar.getDriverSide());
        System.out.println("Tipo de combustible del motor del coche del Reino Unido: " + ukEngine.getFuelType());
    }
}
