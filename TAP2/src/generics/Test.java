package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Clase de prueba para demostrar el uso de genéricos en colecciones en Java.
 * Se realizan pruebas utilizando colecciones con tipos genéricos y con diferentes
 * parámetros de tipo (como `Object` y `?`).
 *
 * @author Pedro García
 */
public class Test {

    /**
     * Método principal que crea una colección de tipo String y realiza pruebas
     * utilizando los métodos `test`, `test2`, y `test3` para iterar sobre la colección.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String args[]) {
        Collection<String> c;
        String lista[] = {"uno", "dos", "tres", "cuatro", "tres"};

        // Crear una nueva ArrayList de Strings y agregar los elementos del arreglo
        c = new ArrayList<String>();
        for (int i = 0; i < lista.length; i++)
            c.add(lista[i]);

        // Llamada al método test que utiliza un tipo genérico T
        test(c);

        // Llamada a test2 es ilegal porque Collection<Object> no es compatible con Collection<String>
        // test2(c); //ES ILEGAL !!!!

        // Llamada al método test3 que usa un comodín genérico (?)
        test3(c);
    }

    /**
     * Método que acepta una colección de tipo genérico T e imprime todos los elementos de la colección.
     *
     * @param c   Colección de elementos de tipo genérico T
     * @param <T> Tipo genérico
     */
    public static <T> void test(Collection<T> c) {

        // Itera sobre la colección y muestra cada elemento
        for (T elem : c) {
            System.out.println(elem);
        }

        System.out.println("-------------------------");
    }

    /**
     * Método que acepta una colección de tipo Object e imprime todos los elementos de la colección.
     * Este método es ilegal si se pasa una colección de tipo String ya que `Collection<Object>`
     * no es compatible con `Collection<String>`.
     *
     * @param c Colección de elementos de tipo Object
     */
    public static void test2(Collection<Object> c) {
        for (Object elem : c)
            System.out.println(elem);

        System.out.println("-------------------------");
    }

    /**
     * Método que acepta una colección con un tipo desconocido (comodín) y la itera utilizando un Iterator.
     *
     * @param c Colección con tipo comodín (?)
     */
    public static void test3(Collection<?> c) {
        Iterator<?> it = c.iterator();

        // Itera sobre la colección y muestra cada elemento
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("-------------------------");
    }
}
