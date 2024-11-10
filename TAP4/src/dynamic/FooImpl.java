package dynamic;

/**
 * Implementación de la interfaz {@link Foo}.
 * Esta clase proporciona implementaciones concretas para los métodos definidos en la interfaz {@link Foo}.
 * Los métodos simplemente imprimen un mensaje en la consola cuando se invocan.
 */
public class FooImpl implements Foo {
    /**
     * Implementación del método doSomething().
     * Este método imprime un mensaje indicando que se está realizando una acción.
     */
    @Override
    public void doSomething() {
        System.out.println("Estoy haciendo algo....");
    }

    /**
     * Implementación del método doAnother().
     * Este método imprime un mensaje indicando que se está realizando otra acción diferente.
     */
    @Override
    public void doAnother() {
        System.out.println("Estoy haciendo otra cosa");
    }
}
