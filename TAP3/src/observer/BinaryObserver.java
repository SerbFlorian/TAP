package observer;

/**
 * Clase que implementa el patrón de diseño Observer.
 * Esta clase es un tipo específico de observador que reacciona ante los cambios
 * de estado de un sujeto mostrando el nuevo estado en formato binario.
 *
 * @author Pedro
 */
public class BinaryObserver implements Observer {
    /**
     * Este método es llamado cuando el sujeto notifica un cambio de estado.
     * Recibe el nuevo estado y lo convierte a una cadena binaria,
     * la cual es impresa en la consola.
     *
     * @param newState El nuevo estado del sujeto, representado como un entero.
     */
    @Override
    public void update(int newState) {
        // Convierte el nuevo estado a su representación binaria y la imprime en consola
        System.out.println("Binary String: " + Integer.toBinaryString(newState));
    }
}
