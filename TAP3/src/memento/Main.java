package memento;

/**
 * Clase Main que demuestra el uso del patrón Memento.
 * <p>
 * El Originator crea estados que son guardados por el Caretaker. Los estados guardados
 * pueden ser restaurados posteriormente.
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        // Crea el Originator y el Caretaker
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        // Cambia el estado del Originator y guarda algunos estados en el Caretaker
        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento()); // Guarda "State #2"

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento()); // Guarda "State #3"

        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        // Restaura estados previos desde el Caretaker
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("First saved State: " + originator.getState());

        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
