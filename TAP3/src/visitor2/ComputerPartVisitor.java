package visitor2;

/**
 * Esta interfaz define los métodos que un visitante debe implementar para poder
 * visitar las diferentes partes de una computadora (como `Computer`, `Mouse`, `Keyboard`, `Monitor`).
 * <p>
 * Cada método `visit()` recibe una instancia de una parte de la computadora y define la acción que se debe realizar
 * sobre esa parte, permitiendo que el comportamiento varíe dependiendo de la parte de la computadora que se esté visitando.
 */
interface ComputerPartVisitor {
    /**
     * Este método es llamado cuando el visitante visita un objeto `Computer`.
     *
     * @param computer El objeto `Computer` que se está visitando.
     */
    void visit(Computer computer);

    /**
     * Este método es llamado cuando el visitante visita un objeto `Mouse`.
     *
     * @param mouse El objeto `Mouse` que se está visitando.
     */
    void visit(Mouse mouse);

    /**
     * Este método es llamado cuando el visitante visita un objeto `Keyboard`.
     *
     * @param keyboard El objeto `Keyboard` que se está visitando.
     */
    void visit(Keyboard keyboard);

    /**
     * Este método es llamado cuando el visitante visita un objeto `Monitor`.
     *
     * @param monitor El objeto `Monitor` que se está visitando.
     */
    void visit(Monitor monitor);
}
