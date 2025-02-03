package factory; // Paquete donde se encuentra la clase

/**
 * Interfaz AbstractCarFactory que define el contrato para la creación de coches.
 * Se utiliza una interfaz en lugar de una clase abstracta porque no se necesitan atributos ni
 * métodos ya implementados en esta fase, solo un método de creación que las clases concretas
 * deben implementar.
 */
interface AbstractCarFactory {
    /**
     * Método para crear un coche de un tipo específico. Este método debe ser implementado
     * por las fábricas concretas para crear un tipo específico de coche.
     *
     * @return Un objeto de tipo {@link AbstractCar} que representa el coche creado.
     */
    AbstractCar createCar();
}
