package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Caretaker que administra el almacenamiento y recuperación de objetos Memento.
 *
 * <p>El Caretaker no modifica ni accede directamente a los detalles del estado de los Mementos,
 * solo los almacena y los restaura cuando es necesario.</p>
 */
public class Caretaker {
    // Lista de Mementos para almacenar los estados previos de un objeto
    private final List<Memento> mementoList = new ArrayList<>();

    /**
     * Añade un Memento a la lista de estados guardados.
     *
     * @param state el Memento que representa el estado a guardar
     */
    public void add(Memento state) {
        mementoList.add(state);
    }

    /**
     * Recupera un Memento específico por su índice en la lista.
     *
     * @param index el índice del Memento a recuperar
     * @return el Memento correspondiente al índice dado
     */
    public Memento get(int index) {
        return mementoList.get(index);
    }
}
