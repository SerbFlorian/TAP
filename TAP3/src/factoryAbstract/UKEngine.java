package factoryAbstract;

/**
 * Implementación concreta de AbstractEngine para motores de coches del Reino Unido.
 * Esta clase representa un motor específico para coches del Reino Unido, que utiliza diésel como combustible.
 */
public class UKEngine implements AbstractEngine {
    /**
     * Devuelve el tipo de combustible que utiliza el motor.
     *
     * @return Un String que indica el tipo de combustible utilizado por el motor del Reino Unido (en este caso, "diesel").
     */
    @Override
    public String getFuelType() {
        return "diesel"; // El motor del Reino Unido utiliza diésel como combustible
    }
}
