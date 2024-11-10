package adapter;

/**
 * Clase que representa el cargador USB.
 * Esta clase proporciona un método para obtener la energía que suministra el cargador.
 */
public class Usb {
    /**
     * Método para obtener la potencia del cargador USB.
     *
     * @return El nivel de energía proporcionado por el cargador USB, que en este caso es 1.
     */
    public int getPower() {
        return 1;  // La potencia proporcionada por este cargador es 1 unidad.
    }
}
