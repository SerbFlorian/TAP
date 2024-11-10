package adapter;

/**
 * Clase principal que simula la carga de un MP3 utilizando un adaptador
 * que convierte la interfaz del encendedor de coche a un puerto USB.
 */
public class Main {
    // **Contracte**: USB es SEMPRE el PARE, del qual extendeixen els demes
    // **Assignacio Polimorfica**: new UsbToCarAdapter(carLighter)
    // **Dynamic Binding**: classe MP3Player, linea 33 -> .getPower()
    /**
     * Método principal que ejecuta el programa.
     * Crea una instancia del encendedor de coche, adapta su interfaz a USB
     * y carga un reproductor MP3 utilizando esa adaptación.
     *
     * @param args Argumentos de línea de comando (no utilizados en este ejemplo).
     */
    public static void main(String[] args) {
        // Creamos una instancia del encendedor de coche
        CigaretteLighterReceptacle carLighter = new CigaretteLighterReceptacle();

        // Creamos una instancia del reproductor MP3 con una capacidad de almacenamiento de 4GB
        // Usamos el adaptador UsbToCarAdapter para adaptar la interfaz del encendedor de coche a USB
        MP3Player myPlayer = new MP3Player("SanDisk", 4, new UsbToCarAdapter(carLighter));

        // Cargamos el reproductor MP3 usando el método charge()
        myPlayer.charge();
    }
}
