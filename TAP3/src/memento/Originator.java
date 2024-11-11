package memento;

/**
 * Clase Originator que crea y restaura su estado interno utilizando Mementos.
 *
 * <p>El Originator es responsable de crear Mementos con su estado actual y de
 * restaurar su estado a partir de un Memento cuando sea necesario.</p>
 */
public class Originator {
    // Estado interno del Originator que se desea guardar y restaurar
    private String state;

    /**
     * Establece el estado actual del Originator.
     *
     * @param state el nuevo estado del Originator
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Obtiene el estado actual del Originator.
     *
     * @return el estado actual como un String
     */
    public String getState() {
        return state;
    }

    /**
     * Crea un Memento que contiene el estado actual del Originator.
     *
     * @return un nuevo Memento con el estado actual
     */
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    /**
     * Restaura el estado del Originator a partir de un Memento.
     *
     * @param memento el Memento que contiene el estado que se desea restaurar
     */
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
