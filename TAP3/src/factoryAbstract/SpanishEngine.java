package factoryAbstract;

/**
 * Implementación concreta de AbstractEngine para motores de coches españoles.
 */
public class SpanishEngine implements AbstractEngine {
    @Override
    public String getFuelType() {
        return "gasolina";
    }
}
