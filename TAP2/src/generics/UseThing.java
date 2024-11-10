package generics;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de la clase genérica `Thing` con un tipo específico.
 * En este caso, se utiliza `String` como tipo genérico.
 *
 * @author Pedro García
 */
class UseThing {

    /**
     * Método principal que crea una instancia de `Thing` con un tipo específico
     * y muestra cómo se obtiene y se manipula el valor almacenado.
     *
     * @param args Los argumentos de la línea de comandos, no utilizados en este caso.
     */
    public static void main(String args[]) {

        // Se crea una instancia de `Thing` con tipo genérico `String` y se inicializa con el valor "pedro".
        Thing<String> cosa = new Thing<String>("pedro");

        // Se obtiene el valor almacenado en `cosa` usando el método `getName()`, que devuelve un objeto de tipo `String`.
        String name = cosa.getName();

        // Se imprime el valor de `name`, que será "pedro".
        out.println(name);

        // La siguiente línea está comentada porque sería ilegal.
        // `cosa.setName(new Integer(7));` no compilaría porque `cosa` es de tipo `Thing<String>`,
        // y `setName` solo acepta objetos de tipo `String`, no `Integer`.
        // cosa.setName(new Integer(7));  // ILEGAL !!
    }
}
