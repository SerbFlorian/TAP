package generics;

/**
 * Clase que demuestra el uso de la clase genérica `Thing2` con un tipo específico.
 * En este caso, se utiliza `Cat` como tipo genérico.
 *
 * @author Pedro García
 */
public class UseThing2 {

    /**
     * Método principal que muestra cómo se utiliza la clase genérica `Thing2`
     * con un tipo restringido (`Cat`, que es una subclase de `Animal`).
     *
     * @param args Los argumentos de la línea de comandos, no utilizados en este caso.
     */
    public static void main(String[] args) {

        // Se crea una instancia de `Cat`, que es una subclase de `Animal`.
        Cat g = new Cat(1, 2);

        // Se crea una instancia de `Thing2` con el tipo genérico `Cat`,
        // que almacena un objeto `Cat` en su atributo `name`.
        Thing2<Cat> c = new Thing2<Cat>(g);

        // Se utiliza `setName()` para cambiar el objeto almacenado en `Thing2` por otro `Cat`.
        c.setName(g);

        // Se obtiene el objeto `Cat` usando el método `getName()`.
        Cat g2 = c.getName();

        // Debido a la herencia, también se puede obtener un objeto `Animal` que es
        // la superclase de `Cat` usando `getName()`.
        Animal a = c.getName();

        // Se imprime el mensaje que devuelve el método `talk()` de `Cat`.
        System.out.println(g2.talk());

        // Se imprime el mensaje que devuelve el método `talk()` de `Animal` (el cual es sobreescrito por `Cat`).
        System.out.println(a.talk());

        // La siguiente línea está comentada porque sería ilegal.
        // `Cosa2<String>` no compilaría porque `Thing2` está restringido a aceptar solo tipos
        // que sean subtipos de `Animal`. No puede aceptar un `String`.
        // Cosa2<String> c = new Cosa2<String>("www");  // ILEGAL !!
    }
}
