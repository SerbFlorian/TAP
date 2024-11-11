package factoryAbstract;

/**
 * Implementación concreta de AbstractEngine para motores de coches españoles.
 * Representa un motor diseñado para el mercado español que utiliza gasolina como combustible.
 */
public class SpanishEngine implements AbstractEngine {
    /**
     * Devuelve el tipo de combustible utilizado por el motor español.
     *
     * @return "gasolina", indicando que el motor usa gasolina como combustible.
     */
    @Override
    public String getFuelType() {
        return "gasolina";
    }
}
