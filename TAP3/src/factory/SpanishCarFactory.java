package factory; // Paquete donde se encuentra la clase

/**
 * Fábrica concreta para crear instancias de coches españoles.
 * Implementa la interfaz {@link AbstractCarFactory} y devuelve una instancia de {@link SpanishCar}.
 */
public class SpanishCarFactory implements AbstractCarFactory {
    /**
     * Método para crear un coche español.
     * Este método implementa el contrato definido en la interfaz {@link AbstractCarFactory} para
     * crear y devolver una instancia de {@link SpanishCar}.
     *
     * @return Un objeto de tipo {@link AbstractCar} que es una instancia de {@link SpanishCar}.
     */
    public AbstractCar createCar() {
        return new SpanishCar(); // Crea una nueva instancia de SpanishCar
    }
}
