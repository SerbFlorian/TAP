package factory; // Paquete donde se encuentra la clase

/**
 * Fábrica concreta para la creación de coches del Reino Unido.
 * Esta clase implementa la interfaz {@link AbstractCarFactory} y es responsable de crear
 * instancias de la clase {@link UKCar}.
 */
class UKCarFactory implements AbstractCarFactory {
    /**
     * Método que crea una instancia de un coche del Reino Unido.
     *
     * @return Un objeto de tipo {@link UKCar}, que representa un coche con el volante a la derecha.
     */
    public AbstractCar createCar() {
        return new UKCar(); // Devuelve una nueva instancia de UKCar
    }
}
