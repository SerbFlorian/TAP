package observer;

/**
 * Clase que implementa el patrón de diseño Observer.
 * Esta clase es un tipo específico de observador que reacciona ante los cambios
 * de estado de un sujeto mostrando el nuevo estado en formato hexadecimal.
 *
 * @author Pedro
 */
public class HexaObserver implements Observer {
    /**
     * Este método es llamado cuando el sujeto notifica un cambio de estado.
     * Recibe el nuevo estado y lo convierte a una cadena en formato hexadecimal,
     * la cual es impresa en la consola.
     *
     * @param newState El nuevo estado del sujeto, representado como un entero.
     */
    @Override
    public void update(int newState) {
        // Convierte el nuevo estado a su representación hexadecimal, lo pasa a mayúsculas
        // y lo imprime en consola
        System.out.println("Hex String: " + Integer.toHexString(newState).toUpperCase());
    }
}
