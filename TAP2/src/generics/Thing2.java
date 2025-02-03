package generics;

/**
 * Clase genérica `Thing2` que almacena un objeto de tipo `T`, donde `T` debe ser
 * una subclase de `Animal`, y proporciona métodos para obtener y establecer el valor de dicho objeto.
 *
 * @param <T> Tipo del objeto que se almacenará, que debe ser una subclase de `Animal`
 * @author Pedro García
 * @see Animal
 */
public class Thing2<T extends Animal> {
    // Atributo privado que almacena el valor del tipo genérico T
    private T name;

    /**
     * Constructor de la clase `Thing2`, que inicializa el atributo `name` con el valor dado.
     *
     * @param name El valor del objeto de tipo T que se almacenará.
     *             Este valor debe ser una subclase de `Animal`.
     */
    public Thing2(T name) {
        this.name = name;
    }

    /**
     * Método que obtiene el valor del objeto almacenado en la clase.
     *
     * @return El objeto almacenado en `name`, que es de tipo `T`, una subclase de `Animal`.
     */
    public T getName() {
        return name;
    }

    /**
     * Método que establece un nuevo valor para el objeto almacenado en la clase.
     *
     * @param name El nuevo valor de tipo `T` que se asignará a `name`.
     *             Este valor debe ser una subclase de `Animal`.
     */
    public void setName(T name) {
        this.name = name;
    }
}
