package adapter;

/**
 * Clase que representa un adaptado, en este caso un receptáculo de encendedor de cigarrillos.
 * Esta clase proporciona una fuente de energía (en este caso un valor fijo) que se utilizará en el patrón Adapter.
 */
public class CigaretteLighterReceptacle {
    /**
     * Método que simula la obtención de energía desde un receptáculo de encendedor de cigarrillos.
     * En este caso, devuelve un valor constante de 2 que representa la cantidad de energía proporcionada.
     *
     * @return int La cantidad de energía disponible (en este caso, 2).
     */
    public int getEnergy() {
        return 2;
    }
}
