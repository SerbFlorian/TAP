package visitor;

/**
 * Interfaz que define las operaciones que un visitante (Visitor) puede realizar sobre los
 * diferentes tipos de personas (HastyPerson, LeisurelyPerson) en el contexto de un patrón
 * de diseño **Visitor**.
 * <p>
 * Esta interfaz declara los métodos `visit` para cada tipo de persona, lo que permite
 * aplicar operaciones específicas a cada una de ellas. El patrón **Visitor** permite
 * separar las operaciones de los objetos sobre los que se opera, de manera que se puedan
 * agregar nuevas operaciones sin modificar las clases de los objetos visitados.
 */
interface TaxiVisitor {
    /**
     * Método que define la operación a realizar sobre un objeto de tipo `HastyPerson`.
     * Este método permite al visitante realizar una acción específica sobre la persona
     * apurada (HastyPerson).
     *
     * @param e Persona apurada (HastyPerson) que será visitada.
     */
    void visit(HastyPerson e);

    /**
     * Método que define la operación a realizar sobre un objeto de tipo `LeisurelyPerson`.
     * Este método permite al visitante realizar una acción específica sobre la persona
     * tranquila (LeisurelyPerson).
     *
     * @param e Persona tranquila (LeisurelyPerson) que será visitada.
     */
    void visit(LeisurelyPerson e);
}
