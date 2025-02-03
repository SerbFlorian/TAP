package memento;

/**
 * Clase Memento que almacena el estado interno de un objeto Originator.
 *
 * <p>Esta clase es inmutable y solo permite recuperar el estado almacenado,
 * asegurando que el estado no sea alterado desde fuera de la clase.</p>
 */
public class Memento {
    // Estado interno que se desea guardar y restaurar
    private final String state;

    /**
     * Constructor de Memento.
     *
     * @param state el estado que se desea guardar
     */
    public Memento(String state) {
        this.state = state;
    }

    /**
     * Recupera el estado guardado en el Memento.
     *
     * @return el estado almacenado como un String
     */
    public String getState() {
        return state;
    }
}
