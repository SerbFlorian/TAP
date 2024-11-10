package adapter;

/**
 * Adaptador que convierte la interfaz de un cargador USB a la interfaz de un encendedor de coche.
 * Se utiliza un patrón de adaptación de objeto porque la clase objetivo no es una interfaz.
 */
public class UsbToCarAdapter extends Usb {
    // Interfaz de encendedor de coche que será adaptada
    private CigaretteLighterReceptacle carInterface;
    /**
     * Constructor que inicializa el adaptador con la interfaz del encendedor de coche.
     *
     * @param carInterface Instancia de CigaretteLighterReceptacle que proporciona energía.
     */
    public UsbToCarAdapter(CigaretteLighterReceptacle carInterface) {
        this.carInterface = carInterface;
    }

    /**
     * Método sobrescrito para obtener la energía del encendedor de coche.
     * Este adaptador permite que el cargador USB pueda usar la energía proporcionada por el encendedor del coche.
     *
     * @return La energía proporcionada por el encendedor de coche, obtenida a través de su método getEnergy().
     */
    public int getPower() {
        return carInterface.getEnergy();  // Se obtiene la energía del encendedor de coche
    }
}
