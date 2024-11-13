package decorator_y_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el sujeto (o fuente de datos) que mantiene la lista de observadores.
 * Los observadores se suscriben a esta clase para recibir notificaciones cuando haya cambios.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    /**
     * Agrega un observador a la lista de observadores.
     * Este observador será notificado cuando el sujeto cambie.
     *
     * @param observer El observador que se va a agregar.
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Elimina un observador de la lista de observadores.
     * Después de eliminarlo, este observador no recibirá más notificaciones.
     *
     * @param observer El observador que se va a eliminar.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifica a todos los observadores registrados con un mensaje.
     * Este método es llamado cuando el sujeto cambia y quiere que todos los
     * observadores sean actualizados.
     *
     * @param message El mensaje que se va a enviar a los observadores.
     */
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
