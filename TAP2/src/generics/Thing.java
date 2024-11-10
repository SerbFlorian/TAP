package generics;

/**
 * Clase genérica `Thing` que almacena un objeto de tipo `T` y proporciona métodos
 * para obtener y establecer el valor de dicho objeto.
 *
 * @param <T> Tipo del objeto que se almacenará en la clase
 * @author Pedro García
 */
public class Thing<T> {
    // Atributo privado que almacena el valor del tipo genérico T
    private T name;

    /**
     * Constructor de la clase `Thing`, que inicializa el atributo `name` con el valor dado.
     *
     * @param name El valor del objeto de tipo T que se almacenará
     */
    public Thing(T name) {
        this.name = name;
    }

    /**
     * Método que obtiene el valor del objeto almacenado en la clase.
     *
     * @return El objeto almacenado en `name`
     */
    public T getName() {
        return name;
    }

    /**
     * Método que establece un nuevo valor para el objeto almacenado en la clase.
     *
     * @param nombre El nuevo valor de tipo `T` que se asignará a `name`
     */
    public void setName(T nombre) {
        this.name = nombre;
    }
}
