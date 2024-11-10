package dynamic;
/**
 * CONTRACTE -> Foo
 * ASSIGNACIO POLIMORFICA -> new FooImpl(),
 * ja que es on espero la classe pare i li assigno la filla
 * DYNAMIC BIDING -> .doSomething() y doAnother()
 */
public class MainProxy {
    /**
     * Método principal que ejecuta el programa.
     * Crea un proxy dinámico para la instancia de {@link FooImpl},
     * invoca los métodos {@link Foo#doSomething()} y {@link Foo#doAnother()}
     * y muestra el comportamiento de los mensajes antes y después de la invocación
     * de los métodos.
     */
    public static void main(String args[]) {
        // Se crea un proxy dinámico para la instancia de FooImpl
        Foo aFoo = (Foo) DynamicProxy.newInstance(new FooImpl());

        // Invoca el primer método en el proxy
        aFoo.doSomething();

        // Invoca el segundo método en el proxy
        aFoo.doAnother();
    }
}
