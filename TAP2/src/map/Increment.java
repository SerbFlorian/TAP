package map;

/**
 * Clase que implementa la interfaz `IMap` y aplica una operación de incremento.
 * Esta clase define una operación que suma 1 al valor recibido como parámetro.
 *
 * @author Pedro García
 */
public class Increment implements IMap {
    /**
     * Aplica una operación de incremento sumando 1 al valor proporcionado.
     *
     * @param elem El número entero al que se le aplicará el incremento.
     * @return El resultado de incrementar `elem` en 1.
     */
    @Override
    public int apply(int elem) {
        return elem + 1;
    }
}
