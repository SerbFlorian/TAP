package factoryAbstract;

/**
 * Clase cliente que utiliza el patrón Abstract Factory para crear coches y motores.
 */
public class Main {
    public static void main(String[] args) {
        // Cliente utiliza una fábrica concreta para crear una familia de productos españoles
        AbstractCarFactory spanishFactory = new SpanishCarFactory();
        AbstractCar spanishCar = spanishFactory.createCar();
        AbstractEngine spanishEngine = spanishFactory.createEngine();

        System.out.println("Spanish car driver side: " + spanishCar.getDriverSide());
        System.out.println("Spanish car engine fuel type: " + spanishEngine.getFuelType());

        // Cliente utiliza una fábrica concreta para crear una familia de productos del Reino Unido
        AbstractCarFactory ukFactory = new UKCarFactory();
        AbstractCar ukCar = ukFactory.createCar();
        AbstractEngine ukEngine = ukFactory.createEngine();

        System.out.println("UK car driver side: " + ukCar.getDriverSide());
        System.out.println("UK car engine fuel type: " + ukEngine.getFuelType());
    }
}
