package factoryAbstract;

/**
 * Implementación concreta de AbstractEngine para motores de coches del Reino Unido.
 */
public class UKEngine implements AbstractEngine {
    @Override
    public String getFuelType() {
        return "diesel";
    }
}
