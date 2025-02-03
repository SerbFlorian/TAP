package observer;

/**
 * Clase que implementa el patrón de diseño Observer.
 * Esta clase es un tipo específico de observador que reacciona ante los cambios
 * de estado de un sujeto mostrando el nuevo estado en formato octal.
 *
 * @author Pedro
 */
public class OctalObserver implements Observer {
    // El contrato implementado por esta clase es el Observer

    /**
     * Este método es llamado cuando el sujeto notifica un cambio de estado.
     * Recibe el nuevo estado y lo convierte a una cadena en formato octal,
     * la cual es impresa en la consola.
     *
     * @param newState El nuevo estado del sujeto, representado como un entero.
     */
    @Override
    public void update(int newState) {
        // Convierte el nuevo estado a su representación octal
        // y lo imprime en consola
        System.out.println("Octal String: " + Integer.toOctalString(newState));
    }
}
