package observer;

/**
 * Clase que implementa el patrón de diseño Observer. Esta clase es un observador
 * que se suscribe a un objeto sujeto (subject) y actualiza su estado cada vez que
 * el sujeto notifica un cambio. En este caso, la clase imprime el estado del sujeto
 * en formato binario cada vez que se actualiza.
 *
 * @author Pedro
 */
interface Observer {
    /**
     * Método que se ejecuta cuando el sujeto notifica un cambio de estado.
     * Este método recibe el nuevo estado y lo convierte a una representación
     * en cadena binaria, la cual se imprime en la consola.
     *
     * @param newValue El nuevo estado del sujeto que se va a mostrar en formato binario.
     */

    void update(int newValue);
}