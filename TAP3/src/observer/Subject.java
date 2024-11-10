package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa el sujeto del patrón de diseño Observer.
 * Esta clase mantiene el estado y notifica a todos los observadores
 * registrados cuando el estado cambia.
 *
 * @author Pedro
 */
public class Subject {
    // DINÁMICO DE VINCULACIÓN -> observer.update(state);
    // Siempre se llama un método del contrato (Observer),
    // que internamente invoca uno de los métodos de las clases hijas (observadores)

    // Lista de observadores que serán notificados cuando el estado cambie
    private List<Observer> observers = new ArrayList<Observer>();

    // El estado que será observado
    private int state;

    /**
     * Obtiene el estado actual del sujeto.
     *
     * @return El estado actual del sujeto.
     */
    public int getState() {
        return state;
    }

    /**
     * Establece el estado del sujeto y notifica a todos los observadores.
     *
     * @param state El nuevo estado que será establecido.
     */
    public void setState(int state) {
        this.state = state;
        // Notificar a todos los observadores del cambio de estado
        notifyAllObservers(state);
    }

    /**
     * Añade un observador a la lista de observadores que serán notificados
     * cuando el estado cambie.
     *
     * @param observer El observador que se añadirá a la lista.
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Notifica a todos los observadores registrados acerca del cambio de estado.
     *
     * @param state El nuevo estado del sujeto.
     */
    public void notifyAllObservers(int state) {
        // Recorre la lista de observadores y les notifica el nuevo estado
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
