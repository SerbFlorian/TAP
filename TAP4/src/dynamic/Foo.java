package dynamic;

/**
 * Interfaz que define dos métodos: doSomething y doAnother.
 * Estas son las operaciones que cualquier clase que implemente esta interfaz debe proporcionar.
 * <p>
 * Las clases que implementen esta interfaz deben proporcionar implementaciones concretas para los métodos definidos.
 */
interface Foo {
    /**
     * Método que realiza una acción específica.
     * La implementación concreta de este método debe definir qué acción se lleva a cabo.
     */
    void doSomething();

    /**
     * Método que realiza otra acción distinta a la del método doSomething.
     * La implementación concreta de este método debe definir qué otra acción se ejecuta.
     */
    void doAnother();
}
