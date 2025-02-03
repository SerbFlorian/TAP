package adapter;

/**
 * Clase cliente que representa un reproductor de MP3.
 * Utiliza un cargador USB para cargar su batería.
 */
public class MP3Player {
    private String brand; // Marca del reproductor
    private int storageCapacity; // Capacidad de almacenamiento en GB
    private int batteryLevel = 0;  // Nivel inicial de la batería
    private Usb batteryChargerInterface;  // Interfaz del cargador USB

    /**
     * Constructor de la clase MP3Player.
     * Inicializa el reproductor con su marca, capacidad de almacenamiento y un cargador USB.
     *
     * @param brand           Marca del reproductor.
     * @param storageCapacity Capacidad de almacenamiento en el MP3.
     * @param batteryCharger  Cargador USB para cargar la batería.
     */
    public MP3Player(String brand, int storageCapacity, Usb batteryCharger) {
        this.brand = brand;
        this.storageCapacity = storageCapacity;
        this.batteryChargerInterface = batteryCharger;
    }

    /**
     * Método para cargar la batería del reproductor.
     * Aumenta el nivel de batería utilizando la energía proporcionada por el cargador USB.
     */
    public void charge() {
        System.out.println("--- Battery level before: " + batteryLevel + " ---");
        batteryLevel = batteryLevel + batteryChargerInterface.getPower();  // Aumenta la batería según la potencia del cargador
        System.out.println("--- Battery level after: " + batteryLevel + " ---");
    }

    /**
     * Obtiene la marca del reproductor MP3.
     *
     * @return La marca del reproductor.
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Obtiene la capacidad de almacenamiento del reproductor MP3.
     *
     * @return La capacidad de almacenamiento en GB.
     */
    public int getStorageCapacity() {
        return storageCapacity;
    }
}
