package defaultmethods;

/**
 * Interfaz que representa el comportamiento básico de una persona.
 * Define un método abstracto para saludar y un método por defecto
 * para mostrar el acceso a una tarjeta especial (black card).
 *
 * <p>Esta interfaz incluye el método {@code sayHello()}, que debe ser
 * implementado por cualquier clase que implemente esta interfaz, y
 * un método por defecto {@code blackCard()} que proporciona una
 * funcionalidad adicional común a todas las implementaciones.</p>
 * <p>
 * Creado por Pedro el 26/10/14.
 */
interface IPerson {
    /**
     * Método abstracto para que la persona diga "Hola".
     * Este método debe ser implementado por todas las clases que
     * implementen esta interfaz, proporcionando una manera personalizada
     * de saludar.
     */
    void sayHello();

    /**
     * Método por defecto que imprime un mensaje indicando que la persona
     * posee una tarjeta de nivel "black card".
     * <p>Este método proporciona una funcionalidad común a todas las
     * implementaciones de la interfaz sin requerir su implementación
     * específica.</p>
     */
    default void blackCard() {
        System.out.println("I have a black card");
    }
}
