package state;
// CONTRACTE -> PackageState
// ASSIGNACIO POLIMORFICA -> classe OrderedState -> new DeliveredState(), ja que es on espero la classe pare i li assigno la filla
// DYNAMIC BIDING -> printStatus() y nextStatus()

// Clase principal que demuestra el uso del patrón de diseño State con la clase Package.
// Este ejemplo simula cómo un paquete cambia de estado durante su ciclo de vida (Pedido, Entregado, Recibido).
public class StateDemo {

    /**
     * Método principal que simula el ciclo de vida de un paquete utilizando el patrón State.
     *
     * En este ejemplo, un paquete pasa por tres estados secuenciales:
     * - Estado "Ordered" (Pedido)
     * - Estado "Delivered" (Entregado)
     * - Estado "Received" (Recibido)
     *
     * El método simula el cambio de estado del paquete y muestra el estado de cada uno de estos cambios.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {

        // Crear un nuevo paquete en su estado inicial "OrderedState"
        Package pkg = new Package();

        // Imprimir el estado actual del paquete (Pedido)
        pkg.printStatus();

        // Cambiar el estado al siguiente: de "Ordered" a "Delivered"
        pkg.nextState();
        pkg.printStatus();

        // Cambiar el estado al siguiente: de "Delivered" a "Received"
        pkg.nextState();
        pkg.printStatus();

        // Intentar cambiar el estado una vez más, pero el paquete ya está en el estado "Received"
        pkg.nextState();
        pkg.printStatus();
    }
}
